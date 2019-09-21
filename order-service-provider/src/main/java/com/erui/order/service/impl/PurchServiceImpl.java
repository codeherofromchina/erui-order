package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.PurchStatusEnum;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.PurchQueryRequest;
import com.erui.order.common.pojo.request.PurchSaveRequest;
import com.erui.order.common.pojo.response.PurchDetailResponse;
import com.erui.order.common.pojo.response.PurchListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.PurchContractMapper;
import com.erui.order.mapper.PurchMapper;
import com.erui.order.model.entity.Purch;
import com.erui.order.model.entity.PurchContract;
import com.erui.order.model.entity.PurchExample;
import com.erui.order.service.*;
import com.erui.order.service.util.PurchFactory;
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
public class PurchServiceImpl implements PurchService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchServiceImpl.class);
    @Autowired
    private PurchMapper purchMapper;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private PurchContractService purchContractService;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private PurchContractMapper purchContractMapper;
    @Autowired
    private PurchPaymentService purchPaymentService;
    @Autowired
    private PurchGoodsService purchGoodsService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UserService userService;


    @Override
    public Long insert(PurchSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        Purch purch = PurchFactory.purch(insertRequest);
        PurchContract purchContract = purchContractMapper.selectByPrimaryKey(purch.getPurchContractId());
        if (purchContract == null) {
            throw new Exception("采购合同不存在");
        }
        purch.setSigningDate(purchContract.getSigningDate());
        purch.setCurrencyBn(purchContract.getCurrencyBn());
        purch.setPurchNo(purchContract.getPurchContractNo());
        purch.setSupplierId(purchContract.getSupplierId());
        purch.setCreateTime(new Date());
        purch.setInspected(Boolean.FALSE);
        purch.setCreateUserId(userInfo.getId());
        purch.setDeleteFlag(Boolean.FALSE);
        int insertNum = purchMapper.insert(purch);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long purchId = purch.getId();

        // 商品信息
        List<PurchGoodsInfo> purchGoodsList = insertRequest.getPurchGoodsList();
        purchGoodsService.insert(purchId, purchGoodsList);


        // 付款信息
        List<PurchPaymentInfo> purchPayments = insertRequest.getPurchPayments();
        if (purchPayments != null && purchPayments.size() > 0) {
            int purchPaymentInsertNum = purchPaymentService.insert(purchId, purchPayments);
            if (purchPayments.size() != purchPaymentInsertNum) {
                LOGGER.info("purchPaymentInsertNum : {} - {}", purchPaymentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("采购单付款信息数据操作失败");
            }
        }


        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.PURCH, purchId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return purchId;
    }

    @Override
    public void update(Long id, PurchSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        Purch Purch = purchMapper.selectByPrimaryKey(id);
        if (Purch == null) {
            throw new Exception("对象唯一标识错误");
        }
        PurchStatusEnum requestStatusEnum = PurchStatusEnum.valueOf(updateRequest.getPurchStatus());
        if (requestStatusEnum == PurchStatusEnum.SAVE) {
            throw new Exception("请求对象的状态错误");
        }

        PurchStatusEnum statusEnum = PurchStatusEnum.valueOf(Purch.getPurchStatus());
        if (statusEnum != PurchStatusEnum.SAVE && statusEnum != PurchStatusEnum.SUBMIT) {
            throw new Exception("对象当前状态错误");
        }

        Long purchId = Purch.getId();
        // 修改基本信息
        Purch PurchSelective = PurchFactory.purch(updateRequest);
        PurchSelective.setId(purchId);
        PurchSelective.setUpdateTime(new Date());
        PurchSelective.setUpdateUserId(userInfo.getId());

        purchMapper.updateByPrimaryKeySelective(PurchSelective);

        // 商品信息
        List<PurchGoodsInfo> purchGoodsList = updateRequest.getPurchGoodsList();
        purchGoodsService.insertOnDuplicateIdUpdate(purchId, purchGoodsList);


        // 付款信息
        List<PurchPaymentInfo> purchPayments = updateRequest.getPurchPayments();
        if (purchPayments != null && purchPayments.size() > 0) {
            int purchPaymentInsertNum = purchPaymentService.insertOnDuplicateIdUpdate(purchId, purchPayments);
            if (purchPayments.size() != purchPaymentInsertNum) {
                LOGGER.info("purchPaymentInsertNum : {} - {}", purchPaymentInsertNum, JSON.toJSONString(purchPayments));
                throw new Exception("采购单付款信息数据操作失败");
            }
        }

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.PURCH, purchId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }


    @Override
    public Pager<PurchListResponse> list(PurchQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        PurchExample example = new PurchExample();
        example.setOrderByClause("id desc");
        PurchExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        List<Long> purchContractIds = null;
        if (StringUtils.isNotBlank(queryRequest.getProjectNo())) {
            purchContractIds = purchContractService.purchContractIdsByProjectNo(queryRequest.getProjectNo());
        }

        if (purchContractIds != null) {
            if (purchContractIds.size() == 0) {
                criteria.andIdEqualTo(-1L);
            } else {
                criteria.andPurchContractIdIn(purchContractIds);
            }
        }
        if (StringUtils.isNotBlank(queryRequest.getPurchNo())) {
            criteria.andPurchNoLike("%" + queryRequest.getPurchNo() + "%");
        }
        if (queryRequest.getSigningDate() != null) {
            criteria.andSigningDateEqualTo(queryRequest.getSigningDate());
        }

        if (queryRequest.getSupplierId() != null) {
            criteria.andSupplierIdEqualTo(queryRequest.getSupplierId());
        }
        PurchStatusEnum purchStatusEnum = PurchStatusEnum.valueOf(queryRequest.getPurchStatus());
        if (purchStatusEnum != null) {
            criteria.andPurchStatusEqualTo(purchStatusEnum.getCode());
        }
        List<Purch> purches = purchMapper.selectByExample(example);

        List<PurchListResponse> purchListResponses = new ArrayList<>();
        for (Purch purch : purches) {
            PurchListResponse purchListResponse = PurchFactory.PurchListResponse(purch);
            PurchContract purchContract = purchContractMapper.selectByPrimaryKey(purch.getPurchContractId());
            if (purchContract != null) {
                purchListResponse.setContractNo(purchContract.getProjectNo());
                purchListResponse.setProjectNo(purchContract.getProjectNo());
            }
            purchListResponse.setSupplierName(supplierService.findNameById(purch.getSupplierId()));

            purchListResponses.add(purchListResponse);
        }
        // 输出
        Page<Purch> page = (Page) purches;
        Pager<PurchListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), purchListResponses);
        return pager;
    }

    @Override
    public PurchDetailResponse detail(Long id) throws Exception {
        // 准备数据
        Purch purch = purchMapper.selectByPrimaryKey(id);
        if (purch == null) {
            throw new Exception("对象信息不存在");
        }
        // 商品信息
        List<PurchGoodsInfo> purchGoodsInfos = purchGoodsService.listByPurchId(purch.getId());
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByPurchGoods(purchGoodsInfos);


        // 付款信息
        List<PurchPaymentInfo> purchPaymentInfos = purchPaymentService.list(purch.getId());

        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.PURCH, id);

        // 组织数据
        PurchDetailResponse detail = PurchFactory.purchDetailResponse(purch);

        detail.setSupplierName(supplierService.findNameById(detail.getSupplierId()));
        detail.setAgentName(userService.findNameById(detail.getAgentId()));


        detail.setAttachments(attachmentInfos);
        detail.setPurchPayments(purchPaymentInfos);
        detail.setPurchGoodsList(goodsInfoList);

        return detail;
    }
}

