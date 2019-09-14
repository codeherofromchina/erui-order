package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.*;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.PurchContractQueryRequest;
import com.erui.order.common.pojo.request.PurchContractSaveRequest;
import com.erui.order.common.pojo.response.PurchContractDetailResponse;
import com.erui.order.common.pojo.response.PurchContractListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.model.entity.*;
import com.erui.order.service.*;
import com.erui.order.service.util.PurchContractFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.erui.order.mapper.PurchContractMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class PurchContractServiceImpl implements PurchContractService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchContractServiceImpl.class);
    @Autowired
    private PurchContractMapper purchContractMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private PurchContractSimpleService purchContractSimpleService;
    @Autowired
    private PurchContractStandardService purchContractStandardService;
    @Autowired
    private PurchContractSignatoriesService purchContractSignatoriesService;
    @Autowired
    private PurchContractGoodsService purchContractGoodsService;
    @Autowired
    private AttachmentService attachmentService;


    @Override
    public Long insert(PurchContractSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织采购合同数据
        PurchContract purchContract = PurchContractFactory.purchContract(insertRequest);
        purchContract.setPurchContractNo("YRC-" + DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.format(new Date()) + UUID.randomUUID().toString().substring(0, 8)); // TODO
        purchContract.setCreateTime(new Date());
        purchContract.setCreateUserId(userInfo.getId());
        int insertNum = purchContractMapper.insert(purchContract);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long purchContractId = purchContract.getId();
        // 采购合同附加信息
        PurchContractTypeEnum purchContractTypeEnum = PurchContractTypeEnum.fromCode(insertRequest.getContractType());
        if (purchContractTypeEnum == null) {
            throw new Exception("采购合同类型错误");
        }
        if (purchContractTypeEnum == PurchContractTypeEnum.SIMPLE) {
            // 采购合同简易合同附加信息
            PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo = insertRequest.getPurchContractAdditionSimpleInfo();
            purchContractSimpleService.insert(purchContractId, purchContractAdditionSimpleInfo);
        } else if (purchContractTypeEnum == PurchContractTypeEnum.SIMPLE) {
            PurchContractAdditionStandardInfo purchContractAdditionStandardInfo = insertRequest.getPurchContractAdditionStandardInfo();
            purchContractStandardService.insert(purchContractId, purchContractAdditionStandardInfo);
        }
        // 合同双方信息
        PurchContractSignatoriesInfo buyerSignatories = insertRequest.getBuyerSignatories();
        PurchContractSignatoriesInfo sellerSignatories = insertRequest.getSellerSignatories();
        purchContractSignatoriesService.insert(purchContractId, PurchContractSignatoriesTypeEnum.SELLER, sellerSignatories);
        purchContractSignatoriesService.insert(purchContractId, PurchContractSignatoriesTypeEnum.BUYER, buyerSignatories);

        // 合同商品信息
        List<PurchContractGoodsInfo> purchContractGoodsList = insertRequest.getPurchContractGoodsList();
        purchContractGoodsService.insert(purchContractId, purchContractGoodsList);


        // 合同附件
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.PURCH_CONTRACT, purchContractId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return purchContractId;
    }

    @Override
    public void update(Long id, PurchContractSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();

        PurchContract purchContract = purchContractMapper.selectByPrimaryKey(id);
        if (purchContract == null) {
            throw new Exception("采购合同唯一标识错误");
        }
        if (PurchContractStatusEnum.valueOf(purchContract.getPurchContractStatus()) != PurchContractStatusEnum.READY) {
            throw new Exception("采购合同当前状态错误");
        }

        Long purchContractId = purchContract.getId();
        // 修改基本信息
        PurchContract purchContract02 = PurchContractFactory.purchContract(updateRequest);
        purchContract02.setId(purchContractId);
        purchContract02.setUpdateTime(new Date());
        purchContract02.setUpdateUserId(userInfo.getId());

        purchContractMapper.updateByPrimaryKeySelective(purchContract02);

        // 采购合同附加信息
        PurchContractTypeEnum purchContractTypeEnum = PurchContractTypeEnum.fromCode(updateRequest.getContractType());
        if (purchContractTypeEnum == null) {
            throw new Exception("采购合同类型错误");
        }
        if (purchContractTypeEnum == PurchContractTypeEnum.SIMPLE) {
            // 采购合同简易合同附加信息
            PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo = updateRequest.getPurchContractAdditionSimpleInfo();
            purchContractSimpleService.insertOnDuplicatePurchContractIdUpdate(purchContractId, purchContractAdditionSimpleInfo);
        } else if (purchContractTypeEnum == PurchContractTypeEnum.SIMPLE) {
            PurchContractAdditionStandardInfo purchContractAdditionStandardInfo = updateRequest.getPurchContractAdditionStandardInfo();
            purchContractStandardService.insertOnDuplicatePurchContractIdUpdate(purchContractId, purchContractAdditionStandardInfo);
        }

        // 合同双方信息
        PurchContractSignatoriesInfo buyerSignatories = updateRequest.getBuyerSignatories();
        PurchContractSignatoriesInfo sellerSignatories = updateRequest.getSellerSignatories();
        purchContractSignatoriesService.insertOnDuplicatePurchContractIdUpdate(purchContractId, PurchContractSignatoriesTypeEnum.SELLER, sellerSignatories);
        purchContractSignatoriesService.insertOnDuplicatePurchContractIdUpdate(purchContractId, PurchContractSignatoriesTypeEnum.BUYER, buyerSignatories);


        // 合同商品信息
        List<PurchContractGoodsInfo> purchContractGoodsList = updateRequest.getPurchContractGoodsList();
        purchContractGoodsService.insertOnDuplicateIdUpdate(purchContractId, purchContractGoodsList);

        // 合同附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.PURCH_CONTRACT, purchContractId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(updateRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }
    }

    @Override
    public Pager<PurchContractListResponse> list(PurchContractQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        PurchContractExample example = new PurchContractExample();
        example.setOrderByClause("id desc");
        PurchContractExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);
        // 采购合同号
        if (StringUtils.isNotBlank(queryRequest.getPurchContractNo())) {
            criteria.andPurchContractNoLike("%" + queryRequest.getPurchContractNo() + "%");
        }
        // 采购合同状态
        if (queryRequest.getContractStatus() != null) {
            criteria.andPurchContractStatusEqualTo(queryRequest.getContractStatus());
        }
        // 采购合同类型
        if (queryRequest.getContractType() != null) {
            criteria.andContractTypeEqualTo(queryRequest.getContractType());
        }
        // 供应商
        if (queryRequest.getSupplierId() != null) {
            criteria.andSupplierIdEqualTo(queryRequest.getSupplierId());
        }
        List<PurchContract> purchContracts = purchContractMapper.selectByExample(example);

        List<PurchContractListResponse> purchContractListResponses = new ArrayList<>();
        for (PurchContract purchContract : purchContracts) {
            PurchContractListResponse purchContractListResponse = PurchContractFactory.purchContractListResponse(purchContract);
            try {
                UserInfo userInfo = userService.findById(purchContract.getAgentId());
                if (userInfo != null) {
                    purchContractListResponse.setAgentName(userInfo.getUserName());
                }
            } catch (Exception e) {
                LOGGER.error("用户不存在 - {} - {}", purchContract.getId(), purchContract.getAgentId());
            }
            purchContractListResponses.add(purchContractListResponse);
        }

        // 输出
        Page<PurchContract> page = (Page) purchContracts;
        Pager<PurchContractListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize(),
                page.getPages(), page.getTotal(), purchContractListResponses);
        return pager;
    }


    @Override
    public PurchContractDetailResponse detail(Long id) throws Exception {
        // 准备数据
        PurchContract purchContract = purchContractMapper.selectByPrimaryKey(id);
        if (purchContract == null) {
            throw new Exception("采购合同不存在");
        }
        // 买卖双方信息
        // 买方
        PurchContractSignatoriesInfo buyerSignatoriesInfo = purchContractSignatoriesService.findByPurchContractId(id, PurchContractSignatoriesTypeEnum.BUYER);
        // 卖方
        PurchContractSignatoriesInfo sellerSignatoriesInfo = purchContractSignatoriesService.findByPurchContractId(id, PurchContractSignatoriesTypeEnum.SELLER);
        // 采购合同商品信息
        List<PurchContractGoodsInfo> purchContractGoodsInfos = purchContractGoodsService.listByPurchContractId(id);

        // 采购合同附加信息
        PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo = null;
        PurchContractAdditionStandardInfo purchContractAdditionStandardInfo = null;
        PurchContractTypeEnum purchContractTypeEnum = PurchContractTypeEnum.fromCode(purchContract.getContractType());
        if (purchContractTypeEnum == PurchContractTypeEnum.SIMPLE) {
            // 采购合同简易合同附加信息
            purchContractAdditionSimpleInfo = purchContractSimpleService.findByPurchContractId(id);
        } else if (purchContractTypeEnum == PurchContractTypeEnum.SIMPLE) {
            purchContractAdditionStandardInfo = purchContractStandardService.findByPurchContractId(id);
        }
        // 附件内容
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.PURCH_CONTRACT, id);

        // 组织数据
        PurchContractDetailResponse detail = PurchContractFactory.purchContractDetailResponse(purchContract);
        detail.setBuyerSignatories(buyerSignatoriesInfo);
        detail.setSellerSignatories(sellerSignatoriesInfo);
//        detail.setPurchContractGoodsList(purchContractGoodsInfos); // TODO
        detail.setPurchContractAdditionSimpleInfo(purchContractAdditionSimpleInfo);
        detail.setPurchContractAdditionStandardInfo(purchContractAdditionStandardInfo);
        detail.setAttachments(attachmentInfos);

        return detail;
    }
}
