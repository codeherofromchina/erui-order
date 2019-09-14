package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.OrderAccountDeliverStatusEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.OrderAccountDeliverQueryRequest;
import com.erui.order.common.pojo.request.OrderAccountDeliverSaveRequest;
import com.erui.order.common.pojo.response.OrderAccountDeliverDetailResponse;
import com.erui.order.common.pojo.response.OrderAccountDeliverListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.OrderAccountDeliverMapper;
import com.erui.order.model.entity.OrderAccountDeliver;
import com.erui.order.model.entity.OrderAccountDeliverExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.OrderAccountDeliverService;
import com.erui.order.service.util.OrderAccountDeliverFactory;
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
public class OrderAccountDeliverServiceImpl implements OrderAccountDeliverService {
    private static Logger LOGGER = LoggerFactory.getLogger(OrderAccountDeliverServiceImpl.class);
    @Autowired
    private OrderAccountDeliverMapper orderAccountDeliverMapper;
    @Autowired
    private AttachmentService attachmentService;

    @Override
    public Long insert(OrderAccountDeliverSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        OrderAccountDeliver OrderAccountDeliver = OrderAccountDeliverFactory.OrderAccountDeliver(insertRequest);
        OrderAccountDeliver.setCreateTime(new Date());
        OrderAccountDeliver.setCreateUserId(userInfo.getId());
        int insertNum = orderAccountDeliverMapper.insert(OrderAccountDeliver);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long OrderAccountDeliverId = OrderAccountDeliver.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.ORDER_ACCOUNT_DELIVER, OrderAccountDeliverId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return OrderAccountDeliverId;
    }

    @Override
    public void update(Long id, OrderAccountDeliverSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        OrderAccountDeliver OrderAccountDeliver = orderAccountDeliverMapper.selectByPrimaryKey(id);
        if (OrderAccountDeliver == null) {
            throw new Exception("对象唯一标识错误");
        }
        OrderAccountDeliverStatusEnum requestStatusEnum = OrderAccountDeliverStatusEnum.valueOf(updateRequest.getOrderAccountDeliverStatus());
        if (requestStatusEnum == OrderAccountDeliverStatusEnum.INIT) {
            throw new Exception("请求对象的状态错误");
        }


        Long OrderAccountDeliverId = OrderAccountDeliver.getId();
        // 修改基本信息
        OrderAccountDeliver OrderAccountDeliverSelective = OrderAccountDeliverFactory.OrderAccountDeliver(updateRequest);
        OrderAccountDeliverSelective.setId(OrderAccountDeliverId);
        OrderAccountDeliverSelective.setUpdateTime(new Date());
        OrderAccountDeliverSelective.setUpdateUserId(userInfo.getId());

        orderAccountDeliverMapper.updateByPrimaryKeySelective(OrderAccountDeliverSelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.ORDER_ACCOUNT_DELIVER, OrderAccountDeliverId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<OrderAccountDeliverListResponse> list(OrderAccountDeliverQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        OrderAccountDeliverExample example = new OrderAccountDeliverExample();
        example.setOrderByClause("id desc");
        OrderAccountDeliverExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        List<OrderAccountDeliver> OrderAccountDelivers = orderAccountDeliverMapper.selectByExample(example);

        List<OrderAccountDeliverListResponse> OrderAccountDeliverListResponses = new ArrayList<>();
        for (OrderAccountDeliver OrderAccountDeliver : OrderAccountDelivers) {
            OrderAccountDeliverListResponse OrderAccountDeliverListResponse = OrderAccountDeliverFactory.OrderAccountDeliverListResponse(OrderAccountDeliver);
            OrderAccountDeliverListResponses.add(OrderAccountDeliverListResponse);
        }
        // 输出
        Page<OrderAccountDeliver> page = (Page) OrderAccountDelivers;
        Pager<OrderAccountDeliverListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), OrderAccountDeliverListResponses);
        return pager;
    }

    @Override
    public OrderAccountDeliverDetailResponse detail(Long id) throws Exception {
        // 准备数据
        OrderAccountDeliver OrderAccountDeliver = orderAccountDeliverMapper.selectByPrimaryKey(id);
        if (OrderAccountDeliver == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.ORDER_ACCOUNT_DELIVER, id);

        // 组织数据
        OrderAccountDeliverDetailResponse detail = OrderAccountDeliverFactory.OrderAccountDeliverDetailResponse(OrderAccountDeliver);
        detail.setAttachments(attachmentInfos);

        return detail;
    }
}

