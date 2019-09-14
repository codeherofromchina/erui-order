package com.erui.order.service.util;

import com.erui.order.common.enums.OrderPaymentTypeEnum;
import com.erui.order.common.pojo.OrderPaymentInfo;
import com.erui.order.model.entity.OrderPayment;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午2:57
 */
public class OrderPaymentFactory {
    public static List<OrderPaymentInfo> orderPaymentInfos(List<OrderPayment> orderPayments) {
        if (orderPayments != null) {
            return orderPayments.stream()
                    .map(orderPayment -> orderPaymentInfo(orderPayment))
                    .collect(Collectors.toList());
        }
        return null;
    }

    public static OrderPaymentInfo orderPaymentInfo(OrderPayment orderPayment) {
        if (orderPayment == null) {
            return null;
        }
        OrderPaymentInfo orderPaymentInfo = new OrderPaymentInfo();
        orderPaymentInfo.setId(orderPayment.getId());
        orderPaymentInfo.setPaymentType(orderPayment.getPaymentType());
        OrderPaymentTypeEnum orderPaymentTypeEnum = OrderPaymentTypeEnum.valueOf(orderPayment.getPaymentType());
        if (orderPaymentTypeEnum != null) {
            orderPaymentInfo.setPaymentTypeName(orderPaymentTypeEnum.getName());
        }
        orderPaymentInfo.setMoney(orderPayment.getMoney());
        orderPaymentInfo.setReceiptDate(orderPayment.getReceiptDate());
        orderPaymentInfo.setReceiptDays(orderPayment.getReceiptDays());

        return orderPaymentInfo;
    }

    public static OrderPayment orderPayment(Long orderId, OrderPaymentInfo orderPaymentInfo) {
        OrderPayment orderPayment = new OrderPayment();
        orderPayment.setOrderId(orderId);
        orderPayment.setPaymentType(orderPaymentInfo.getPaymentType());
        orderPayment.setMoney(orderPaymentInfo.getMoney());
        orderPayment.setReceiptDate(orderPaymentInfo.getReceiptDate());
        orderPayment.setReceiptDays(orderPaymentInfo.getReceiptDays());
        return orderPayment;
    }
}
