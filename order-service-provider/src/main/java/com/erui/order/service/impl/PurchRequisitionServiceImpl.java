package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.PurchRequisitionStatusEnum;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.PurchRequisitionQueryRequest;
import com.erui.order.common.pojo.request.PurchRequisitionSaveRequest;
import com.erui.order.common.pojo.response.PurchRequisitionDetailResponse;
import com.erui.order.common.pojo.response.PurchRequisitionListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.PurchRequisitionMapper;
import com.erui.order.model.entity.PurchRequisition;
import com.erui.order.model.entity.PurchRequisitionExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.OrderGoodsService;
import com.erui.order.service.PurchRequisitionGoodsService;
import com.erui.order.service.PurchRequisitionService;
import com.erui.order.service.util.GoodsInfoFactory;
import com.erui.order.service.util.PurchRequisitionFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
public class PurchRequisitionServiceImpl implements PurchRequisitionService {
    private static Logger LOGGER = LoggerFactory.getLogger(PurchRequisitionServiceImpl.class);
    @Autowired
    private PurchRequisitionMapper purchRequisitionMapper;
    @Autowired
    private PurchRequisitionGoodsService purchRequisitionGoodsService;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private OrderGoodsService orderGoodsService;


    @Override
    public void update(Long id, PurchRequisitionSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        PurchRequisition purchRequisition = purchRequisitionMapper.selectByPrimaryKey(id);
        if (purchRequisition == null) {
            throw new Exception("采购申请唯一标识错误");
        }
        if (PurchRequisitionStatusEnum.valueOf(purchRequisition.getPurchRequisitionStatus()) != PurchRequisitionStatusEnum.SAVE) {
            throw new Exception("采购申请当前状态错误");
        }

        Long purchRequisitionId = purchRequisition.getId();
        // 修改基本信息
        PurchRequisition purchRequisitionSelective = PurchRequisitionFactory.purchRequisition(updateRequest);
        purchRequisitionSelective.setId(purchRequisitionId);
        purchRequisitionSelective.setUpdateTime(new Date());
        purchRequisitionSelective.setUpdateUserId(userInfo.getId());

        purchRequisitionMapper.updateByPrimaryKeySelective(purchRequisitionSelective);

        // 采购申请商品
        List<PurchRequisitionGoodsInfo> purchRequisitionGoods = updateRequest.getPurchRequisitionGoods();
        purchRequisitionGoodsService.update(purchRequisitionId, purchRequisitionGoods);

        // 采购申请附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.PURCH_REQUISITION, purchRequisitionId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("采购申请附件数据操作失败");
        }
    }

    @Override
    public Long insert(PurchRequisitionSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织采购申请数据
        PurchRequisition PurchRequisition = PurchRequisitionFactory.purchRequisition(insertRequest);
        PurchRequisition.setCreateTime(new Date());
        PurchRequisition.setCreateUserId(userInfo.getId());
        int insertNum = purchRequisitionMapper.insert(PurchRequisition);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long purchRequisitionId = PurchRequisition.getId();

        // 采购申请商品
        List<PurchRequisitionGoodsInfo> purchRequisitionGoods = insertRequest.getPurchRequisitionGoods();
        if (purchRequisitionGoods != null && purchRequisitionGoods.size() > 0) {
            int purchRequisitionGoodsInsertNum = purchRequisitionGoodsService.insert(purchRequisitionId, purchRequisitionGoods);
            if (purchRequisitionGoods.size() != purchRequisitionGoodsInsertNum) {
                LOGGER.info("purchRequisitionGoodsInsertNum : {} - {}", purchRequisitionGoodsInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("采购申请商品数据操作失败");
            }
        }
        // 采购申请附件
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.PURCH_REQUISITION, purchRequisitionId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("采购申请附件数据操作失败");
            }
        }
        return purchRequisitionId;
    }

    @Override
    public Pager<PurchRequisitionListResponse> list(PurchRequisitionQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        PurchRequisitionExample example = new PurchRequisitionExample();
        example.setOrderByClause("id desc");
        PurchRequisitionExample.Criteria criteria = example.createCriteria();
        // 未删除,且已提交
        criteria.andDeleteFlagEqualTo(Boolean.FALSE).andPurchRequisitionStatusEqualTo(PurchRequisitionStatusEnum.SUBMIT.getCode());
        // TODO
        // 销售合同号
        // 项目号
        // 标的物
        // 要求采购到货日期
        // 下发日期
        if (queryRequest.getSubmitDate() != null) {
            criteria.andSubmitDateEqualTo(queryRequest.getSubmitDate());
        }

        List<PurchRequisition> purchRequisitions = purchRequisitionMapper.selectByExample(example);

        List<PurchRequisitionListResponse> purchRequisitionListResponses = new ArrayList<>();
        for (PurchRequisition purchRequisition : purchRequisitions) {
            PurchRequisitionListResponse purchRequisitionListResponse = PurchRequisitionFactory.purchRequisitionListResponse(purchRequisition);
            purchRequisitionListResponses.add(purchRequisitionListResponse);
        }

        // 输出
        Page<PurchRequisition> page = (Page) purchRequisitions;
        Pager<PurchRequisitionListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), purchRequisitionListResponses);
        return pager;
    }

    @Override
    public PurchRequisitionDetailResponse detail(Long id) throws Exception {
        // 准备数据
        PurchRequisition purchRequisition = purchRequisitionMapper.selectByPrimaryKey(id);
        if (purchRequisition == null) {
            throw new Exception("采购申请不存在");
        }
        // 商品
        List<PurchRequisitionGoodsInfo> purchRequisitionGoodsInfos = purchRequisitionGoodsService.list(id);
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.PURCH_REQUISITION, id);

        // 组织数据
        PurchRequisitionDetailResponse detail = PurchRequisitionFactory.purchRequisitionDetailResponse(purchRequisition);
        List<GoodsInfo> goodsInfos = new ArrayList<>();
        for (PurchRequisitionGoodsInfo purchRequisitionGoodsInfo : purchRequisitionGoodsInfos) {
            OrderGoodsInfo orderGoodsInfo = orderGoodsService.findById(purchRequisitionGoodsInfo.getOrderGoodsId());
            GoodsInfo goodsInfo = GoodsInfoFactory.goodsInfo(orderGoodsInfo, purchRequisitionGoodsInfo);
            goodsInfos.add(goodsInfo);
        }
        detail.setGoodsInfos(goodsInfos);
        detail.setAttachments(attachmentInfos);

        return detail;
    }
}
