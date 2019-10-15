package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.*;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.PurchContractSignatoriesInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.PayAblePurchQueryRequest;
import com.erui.order.common.pojo.request.PurchPayApplicationQueryRequest;
import com.erui.order.common.pojo.request.PurchPayApplicationSaveRequest;
import com.erui.order.common.pojo.response.PayAblePurchListResponse;
import com.erui.order.common.pojo.response.PurchPayApplicationDetailResponse;
import com.erui.order.common.pojo.response.PurchPayApplicationListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.PurchMapper;
import com.erui.order.mapper.PurchPayApplicationMapper;
import com.erui.order.model.entity.Purch;
import com.erui.order.model.entity.PurchExample;
import com.erui.order.model.entity.PurchPayApplication;
import com.erui.order.model.entity.PurchPayApplicationExample;
import com.erui.order.service.*;
import com.erui.order.service.util.PurchPayApplicationFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PurchPayApplicationServiceImpl implements PurchPayApplicationService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchPayApplicationServiceImpl.class);
    @Autowired
    private PurchPayApplicationMapper purchPayApplicationMapper;
    @Autowired
    private PurchMapper purchMapper;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private PurchContractSignatoriesService purchContractSignatoriesService;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private UserService userService;

    @Override
    public Long insert(PurchPayApplicationSaveRequest insertRequest) throws Exception {
        Long purchId = insertRequest.getPurchId();
        Purch purch = purchMapper.selectByPrimaryKey(purchId);
        if (purch == null) {
            throw new Exception("采购不存在");
        }
        PurchContractSignatoriesInfo purchContractSignatoriesInfo = purchContractSignatoriesService.findByPurchContractId(purch.getPurchContractId(), PurchContractSignatoriesTypeEnum.BUYER);
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        PurchPayApplication purchPayApplication = PurchPayApplicationFactory.purchPayApplication(insertRequest);
        purchPayApplication.setPurchContractNo(purch.getPurchNo());
        purchPayApplication.setExchangeRate(purch.getExchangeRate());
        purchPayApplication.setContractAmount(purch.getTotalPrice());
        purchPayApplication.setCurrencyBn(purch.getCurrencyBn());
        purchPayApplication.setSupplierId(purch.getSupplierId());
        purchPayApplication.setSupplierName(supplierService.findNameById(purch.getSupplierId()));
        if (purchContractSignatoriesInfo != null) {
            purchPayApplication.setOpeningBank(purchContractSignatoriesInfo.getOpeningBank());
        }
        purchPayApplication.setCreateTime(new Date());
        purchPayApplication.setCreateUserId(userInfo.getId());
        purchPayApplication.setDeleteFlag(Boolean.FALSE);
        int insertNum = purchPayApplicationMapper.insert(purchPayApplication);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long purchPayApplicationId = purchPayApplication.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.PURCH_PAY_APPLICATION, purchPayApplicationId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("付款附件数据操作失败");
            }
        }
        return purchPayApplicationId;
    }

    @Override
    public void update(Long id, PurchPayApplicationSaveRequest updateRequest) throws Exception {
        Long purchId = updateRequest.getPurchId();
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        PurchPayApplication purchPayApplication = purchPayApplicationMapper.selectByPrimaryKey(id);
        if (purchPayApplication == null) {
            throw new Exception("对象唯一标识错误");
        }
        PurchPayApplicationStatusEnum requestStatusEnum = PurchPayApplicationStatusEnum.valueOf(updateRequest.getPayStatus());
        if (requestStatusEnum != PurchPayApplicationStatusEnum.SAVED && requestStatusEnum != PurchPayApplicationStatusEnum.SUBMITED) {
            throw new Exception("请求对象的状态错误");
        }

        PurchPayApplicationStatusEnum statusEnum = PurchPayApplicationStatusEnum.valueOf(purchPayApplication.getPayStatus());
        if (statusEnum != PurchPayApplicationStatusEnum.SAVED) {
            throw new Exception("对象当前状态错误");
        }

        if (updateRequest.getPurchId() == null) {
            throw new Exception("采购合同错误");
        }

        Long purchPayApplicationId = purchPayApplication.getId();
        // 修改基本信息
        PurchPayApplication purchPayApplicationSelective = PurchPayApplicationFactory.purchPayApplication(updateRequest);
        //修改采购合同信息
        if (updateRequest.getPurchId() != purchPayApplication.getPurchId().longValue()) {
            Purch purch = purchMapper.selectByPrimaryKey(purchId);
            if (purch == null) {
                throw new Exception("采购不存在");
            }
            PurchContractSignatoriesInfo purchContractSignatoriesInfo = purchContractSignatoriesService.findByPurchContractId(purch.getPurchContractId(), PurchContractSignatoriesTypeEnum.BUYER);
            purchPayApplication.setPurchContractNo(purch.getPurchNo());
            purchPayApplication.setExchangeRate(purch.getExchangeRate());
            purchPayApplication.setContractAmount(purch.getTotalPrice());
            purchPayApplication.setCurrencyBn(purch.getCurrencyBn());
            purchPayApplication.setSupplierId(purch.getSupplierId());
            purchPayApplication.setSupplierName(supplierService.findNameById(purch.getSupplierId()));
            if (purchContractSignatoriesInfo != null) {
                purchPayApplication.setOpeningBank(purchContractSignatoriesInfo.getOpeningBank());
            }
        }

        purchPayApplicationSelective.setId(purchPayApplicationId);
        purchPayApplicationSelective.setUpdateTime(new Date());
        purchPayApplicationSelective.setUpdateUserId(userInfo.getId());

        purchPayApplicationMapper.updateByPrimaryKeySelective(purchPayApplicationSelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.PURCH_PAY_APPLICATION, purchPayApplicationId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<PurchPayApplicationListResponse> list(PurchPayApplicationQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        PurchPayApplicationExample example = new PurchPayApplicationExample();
        example.setOrderByClause("id desc");
        PurchPayApplicationExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        if (StringUtils.isNotBlank(queryRequest.getPurchContractNo())) {
            criteria.andPurchContractNoLike("%" + queryRequest.getPurchContractNo() + "%");

        }

        if (StringUtils.isNotBlank(queryRequest.getSupplierName())) {
            criteria.andSupplierNameLike("%" + queryRequest.getSupplierName() + "%");
        }

        PurchPayApplicationStatusEnum purchPayApplicationStatusEnum = PurchPayApplicationStatusEnum.valueOf(queryRequest.getPayStatus());
        // 订单状态 1:待确认 2:未执行 3:执行中 4：完成
        if (purchPayApplicationStatusEnum != null) {
            criteria.andPayStatusEqualTo(purchPayApplicationStatusEnum.getCode());
        }
        List<PurchPayApplication> purchPayApplications = purchPayApplicationMapper.selectByExample(example);

        List<PurchPayApplicationListResponse> PurchPayApplicationListResponses = new ArrayList<>();
        for (PurchPayApplication purchPayApplication : purchPayApplications) {
            PurchPayApplicationListResponse purchPayApplicationListResponse = PurchPayApplicationFactory.purchPayApplicationListResponse(purchPayApplication);
            PurchPayApplicationListResponses.add(purchPayApplicationListResponse);
        }
        // 输出
        Page<PurchPayApplication> page = (Page) purchPayApplications;
        Pager<PurchPayApplicationListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), PurchPayApplicationListResponses);
        return pager;
    }

    @Override
    public PurchPayApplicationDetailResponse detail(Long id) throws Exception {
        // 准备数据
        PurchPayApplication purchPayApplication = purchPayApplicationMapper.selectByPrimaryKey(id);
        if (purchPayApplication == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.PURCH_PAY_APPLICATION, id);
        // 组织数据
        PurchPayApplicationDetailResponse detail = PurchPayApplicationFactory.purchPayApplicationDetailResponse(purchPayApplication);
        purchPayApplication.setApplicantDeptName(userService.findNameById(detail.getApplicantId()));
        detail.setAttachments(attachmentInfos);
        return detail;
    }


    @Override
    public Pager<PayAblePurchListResponse> payAblePurchList(PayAblePurchQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        PurchExample example = new PurchExample();
        example.setOrderByClause("id desc");
        PurchExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE)
                .andPayStatusEqualTo(PurchPayStatusEnum.UNPAID.getCode())
                .andPurchStatusGreaterThanOrEqualTo(PurchStatusEnum.SUBMIT.getCode());


        if (StringUtils.isNotBlank(queryRequest.getPurchNo())) {
            criteria.andPurchNoLike("%" + queryRequest.getPurchNo() + "%");
        }
        if (StringUtils.isNotBlank(queryRequest.getSupplierName())) {
            criteria.andSupplierNameLike("%" + queryRequest.getSupplierName() + "%");
        }

        List<Purch> purchList = purchMapper.selectByExample(example);

        List<PayAblePurchListResponse> payAblePurchListResponses = new ArrayList<>();
        for (Purch purch : purchList) {
            PayAblePurchListResponse response = new PayAblePurchListResponse();
            response.setPurchId(purch.getId());
            response.setPurchNo(purch.getPurchNo());
            response.setSupplierName(supplierService.findNameById(purch.getSupplierId()));
            PurchContractSignatoriesInfo purchContractSignatoriesInfo = purchContractSignatoriesService.findByPurchContractId(purch.getPurchContractId(), PurchContractSignatoriesTypeEnum.BUYER);
            if (purchContractSignatoriesInfo != null) {
                response.setOpeningBank(purchContractSignatoriesInfo.getOpeningBank());
                response.setAccountNumber(purchContractSignatoriesInfo.getAccountNumber());
            }
            response.setExchangeRate(purch.getExchangeRate());
            response.setTotalPrice(purch.getTotalPrice());
            response.setCurrencyBn(purch.getCurrencyBn());
            payAblePurchListResponses.add(response);
        }
        // 输出
        Page<PurchPayApplication> page = (Page) purchList;
        Pager<PayAblePurchListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), payAblePurchListResponses);
        return pager;
    }
}

