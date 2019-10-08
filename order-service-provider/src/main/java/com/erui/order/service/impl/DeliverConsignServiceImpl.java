package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.DeliverConsignStatusEnum;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.DeliverConsignQueryRequest;
import com.erui.order.common.pojo.request.DeliverConsignSaveRequest;
import com.erui.order.common.pojo.response.DeliverConsignDetailResponse;
import com.erui.order.common.pojo.response.DeliverConsignListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.DeliverConsignMapper;
import com.erui.order.mapper.OrderMapper;
import com.erui.order.model.entity.DeliverConsign;
import com.erui.order.model.entity.DeliverConsignExample;
import com.erui.order.model.entity.Order;
import com.erui.order.service.*;
import com.erui.order.service.util.DeliverConsignFactory;
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
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class DeliverConsignServiceImpl implements DeliverConsignService {
    private static Logger LOGGER = LoggerFactory.getLogger(DeliverConsignServiceImpl.class);
    @Autowired
    private DeliverConsignMapper deliverConsignMapper;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private DeliverConsignGoodsService deliverConsignGoodsService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UserService userService;
    @Autowired
    private DeliverConsignBookingSpaceService deliverConsignBookingSpaceService;
    @Autowired
    private DeliverConsignPaymentService deliverConsignPaymentService;
    @Autowired
    private OrderGoodsService orderGoodsService;

    @Override
    public Long insert(DeliverConsignSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        DeliverConsign deliverConsign = DeliverConsignFactory.deliverConsign(insertRequest);
        deliverConsign.setDeliverConsignNo(UUID.randomUUID().toString().substring(0,14));
        deliverConsign.setCreateTime(new Date());
        deliverConsign.setCreateUserId(userInfo.getId());
        deliverConsign.setDeleteFlag(Boolean.FALSE);
        int insertNum = deliverConsignMapper.insert(deliverConsign);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long DeliverConsignId = deliverConsign.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.DELIVER_CONSIGN, DeliverConsignId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return DeliverConsignId;
    }

    @Override
    public void update(Long id, DeliverConsignSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        DeliverConsign deliverConsign = deliverConsignMapper.selectByPrimaryKey(id);
        if (deliverConsign == null) {
            throw new Exception("对象唯一标识错误");
        }
        DeliverConsignStatusEnum deliverConsignStatusEnum = DeliverConsignStatusEnum.valueOf(updateRequest.getDeliverConsignStatus());
        if (deliverConsignStatusEnum != DeliverConsignStatusEnum.SUBMITED && deliverConsignStatusEnum != DeliverConsignStatusEnum.SAVED) {
            throw new Exception("请求对象的状态错误");
        }

        DeliverConsignStatusEnum statusEnum = DeliverConsignStatusEnum.valueOf(deliverConsign.getDeliverConsignStatus());
        if (statusEnum != DeliverConsignStatusEnum.SAVED) {
            throw new Exception("订舱当前状态错误");
        }

        Long deliverConsignId = deliverConsign.getId();
        // 修改基本信息
        DeliverConsign deliverConsignSelective = DeliverConsignFactory.deliverConsign(updateRequest);
        deliverConsignSelective.setId(deliverConsignId);
        deliverConsignSelective.setUpdateTime(new Date());
        deliverConsignSelective.setUpdateUserId(userInfo.getId());

        deliverConsignMapper.updateByPrimaryKeySelective(deliverConsignSelective);

        // 商品信息
        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfoList = updateRequest.getDeliverConsignGoodsInfoList();
        deliverConsignGoodsService.insertOnDuplicateIdUpdate(deliverConsignId, deliverConsignGoodsInfoList);

        // 订舱信息
        DeliverConsignBookingSpaceInfo deliverConsignBookingSpaceInfo = updateRequest.getDeliverConsignBookingSpaceInfo();
        deliverConsignBookingSpaceService.insertOnDuplicateIdUpdate(deliverConsignId, deliverConsignBookingSpaceInfo);

        // 收款信息
        List<DeliverConsignPaymentInfo> deliverConsignPaymentInfoList = updateRequest.getDeliverConsignPaymentInfoList();
        deliverConsignPaymentService.insertOnDuplicateIdUpdate(deliverConsignId, deliverConsignPaymentInfoList);


        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.DELIVER_CONSIGN, deliverConsignId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<DeliverConsignListResponse> list(DeliverConsignQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        DeliverConsignExample example = new DeliverConsignExample();
        example.setOrderByClause("id desc");
        DeliverConsignExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        if (StringUtils.isNotBlank(queryRequest.getDeliverConsignNo())) {
            criteria.andDeliverConsignNoLike("%" + queryRequest.getDeliverConsignNo() + "%");
        }
        if (StringUtils.isNotBlank(queryRequest.getContractNo())) {
            criteria.andContractNoLike("%" + queryRequest.getContractNo() + "%");
        }
        if (StringUtils.isNotBlank(queryRequest.getCrmCode())) {
            criteria.andCrmCodeLike("%" + queryRequest.getCrmCode() + "%");
        }
        if (StringUtils.isNotBlank(queryRequest.getExecCoName())) {
            criteria.andExecCoNameLike("%" + queryRequest.getExecCoName() + "%");
        }
        if (queryRequest.getSubmitTimeStart() != null) {
            criteria.andSubmitTimeGreaterThanOrEqualTo(queryRequest.getSubmitTimeStart());
        }
        if (queryRequest.getSubmitTimeEnd() != null) {
            criteria.andSubmitTimeLessThanOrEqualTo(queryRequest.getSubmitTimeEnd());
        }

        List<DeliverConsign> deliverConsigns = deliverConsignMapper.selectByExample(example);

        List<DeliverConsignListResponse> deliverConsignListResponses = new ArrayList<>();
        for (DeliverConsign deliverConsign : deliverConsigns) {
            DeliverConsignListResponse deliverConsignListResponse = DeliverConsignFactory.deliverConsignListResponse(deliverConsign);
            deliverConsignListResponses.add(deliverConsignListResponse);
        }
        // 输出
        Page<DeliverConsign> page = (Page) deliverConsigns;
        Pager<DeliverConsignListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), deliverConsignListResponses);
        return pager;
    }

    @Override
    public DeliverConsignDetailResponse detail(Long id) throws Exception {
        // 准备数据
        DeliverConsign deliverConsign = deliverConsignMapper.selectByPrimaryKey(id);
        if (deliverConsign == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.DELIVER_CONSIGN, id);
        // 查询商品
        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos = deliverConsignGoodsService.listByDeliverConsignId(id);
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByDeliverConsignGoods(deliverConsignGoodsInfos);
        // 查询订舱信息
        DeliverConsignBookingSpaceInfo deliverConsignBookingSpaceInfo = deliverConsignBookingSpaceService.selectByDeliverConsignId(id);


        // 组织数据
        DeliverConsignDetailResponse detail = DeliverConsignFactory.deliverConsignDetailResponse(deliverConsign);
        detail.setAttachments(attachmentInfos);
        detail.setGoodsInfos(goodsInfoList);
        detail.setDeliverConsignBookingSpaceInfo(deliverConsignBookingSpaceInfo);

        return detail;
    }


    @Override
    public List<DeliverConsignListResponse> listByOrderid(Long orderId) {
        DeliverConsignExample example = new DeliverConsignExample();
        example.setOrderByClause("id asc");
        DeliverConsignExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteFlagEqualTo(Boolean.FALSE).andOrderIdEqualTo(orderId);

        List<DeliverConsign> deliverConsigns = deliverConsignMapper.selectByExample(example);

        return deliverConsigns.stream().map(deliverConsign -> DeliverConsignFactory.deliverConsignListResponse(deliverConsign)).collect(Collectors.toList());
    }

    @Override
    public DeliverConsignDetailResponse detailByOrderId(Long orderId) throws Exception {
        // 准备数据
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if (order == null) {
            throw new Exception("销售订单不存在");
        }
        // 查询商品的采购数量是否都已经和预报检数量数量相同，如果相同，返回null，否则返回预显示内容
        List<OrderGoodsInfo> orderGoodsInfos = orderGoodsService.listByOrderId(orderId);
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByOrderGoods(orderGoodsInfos);
        // 组装数据
        DeliverConsignDetailResponse detailResponse = new DeliverConsignDetailResponse();
        detailResponse.setOrderId(orderId);
        detailResponse.setFromCountry(order.getFromCountry());
        detailResponse.setToCountry(order.getToCountry());
        detailResponse.setFromPort(order.getFromPort());
        detailResponse.setToPort(order.getToPort());
        detailResponse.setTotalPriceUsd(order.getTotalPriceUsd());
        // 商品
        detailResponse.setGoodsInfos(goodsInfoList);

        return detailResponse;


    }
}

