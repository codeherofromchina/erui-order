package com.erui.order.service.impl;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.OrderPaymentInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.model.entity.Attachment;
import com.erui.order.model.entity.AttachmentExample;
import com.erui.order.model.entity.OrderPayment;
import com.erui.order.model.entity.OrderPaymentExample;
import com.erui.order.service.OrderPaymentService;
import com.erui.order.service.util.OrderPaymentFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.erui.order.mapper.OrderPaymentMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@Transactional
public class OrderPaymentServiceImpl implements OrderPaymentService {
    private static Logger LOGGER = LoggerFactory.getLogger(OrderPaymentServiceImpl.class);
    @Autowired
    private OrderPaymentMapper orderPaymentMapper;

    @Override
    public int insertOnDuplicateIdUpdate(Long orderId, List<OrderPaymentInfo> orderPaymentInfos) throws Exception {
        if (orderId == null) {
            throw new Exception("订单ID错误");
        }
        List<OrderPayment> orderPayments = listByOrderId(orderId);
        Set<Long> orderPaymentIds = orderPayments.stream().map(OrderPayment::getId).collect(Collectors.toSet());

        int updateNum = 0;
        for (OrderPaymentInfo orderPaymentInfo : orderPaymentInfos) {
            Long id = orderPaymentInfo.getId();
            if (id == null) {
                updateNum += insert(orderId, orderPaymentInfo);
            } else if (orderPaymentIds.remove(id)) {
                // 更新操作
                updateNum += updateById(id, orderPaymentInfo);
            } else {
                // 抛出异常，不是给定业务附件
                throw new Exception("订单收款错误");
            }
        }

        if (orderPaymentIds.size() > 0) {
            delete(orderPaymentIds.toArray(new Long[orderPaymentIds.size()]));
        }
        return updateNum;
    }

    @Override
    public int insert(Long orderId, List<OrderPaymentInfo> orderPaymentInfos) {
        int insertNum = 0;
        for (OrderPaymentInfo orderPaymentInfo : orderPaymentInfos) {
            insertNum += insert(orderId, orderPaymentInfo);
        }
        return insertNum;
    }

    @Override
    public int insert(Long orderId, OrderPaymentInfo orderPaymentInfo) {
        OrderPayment orderPayment = OrderPaymentFactory.orderPayment(orderId, orderPaymentInfo);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            orderPayment.setCreateUserId(userInfo.getId());
        }
        orderPayment.setCreateTime(new Date());
        orderPayment.setDeleteFlag(Boolean.FALSE);
        return orderPaymentMapper.insert(orderPayment);
    }


    /**
     * 删除附件
     * 设置附件的删除标志位为true
     *
     * @param ids
     */
    @Override
    public void delete(Long... ids) {
        if (ids == null || ids.length == 0) {
            return;
        }
        List<Long> idList = Arrays.asList(ids);
        OrderPaymentExample example = new OrderPaymentExample();
        example.createCriteria().andIdIn(idList);

        OrderPayment orderPaymentSelective = new OrderPayment();
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            orderPaymentSelective.setUpdateUserId(userInfo.getId());
        }
        orderPaymentSelective.setDeleteFlag(Boolean.TRUE);
        orderPaymentSelective.setDeleteTime(new Date());
        orderPaymentMapper.updateByExampleSelective(orderPaymentSelective, example);
    }


    @Override
    public int updateById(Long id, OrderPaymentInfo orderPaymentInfo) throws Exception {
        OrderPayment orderPayment = orderPaymentMapper.selectByPrimaryKey(id);
        if (orderPayment == null) {
            throw new Exception("订单付款信息不存在");
        }

        OrderPayment orderPaymentSelective = OrderPaymentFactory.orderPayment(orderPayment.getOrderId(), orderPaymentInfo);
        orderPaymentSelective.setId(id);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            orderPayment.setUpdateUserId(userInfo.getId());
        }
        orderPayment.setUpdateTime(new Date());

        return orderPaymentMapper.updateByPrimaryKeySelective(orderPayment);
    }

    @Override
    public List<OrderPaymentInfo> list(Long orderId) {
        List<OrderPayment> orderPayments = listByOrderId(orderId);

        List<OrderPaymentInfo> orderPaymentInfos = OrderPaymentFactory.orderPaymentInfos(orderPayments);
        if (orderPaymentInfos == null) {
            orderPaymentInfos = new ArrayList<>();
        }
        return orderPaymentInfos;
    }


    private List<OrderPayment> listByOrderId(Long orderId) {
        OrderPaymentExample example = new OrderPaymentExample();
        example.createCriteria().andOrderIdEqualTo(orderId)
                .andDeleteFlagEqualTo(Boolean.FALSE);
        List<OrderPayment> orderPayments = orderPaymentMapper.selectByExample(example);
        if (orderPayments == null) {
            orderPayments = new ArrayList<>();
        }
        return orderPayments;
    }
}
