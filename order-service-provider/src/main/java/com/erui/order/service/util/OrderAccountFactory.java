package com.erui.order.service.util;

import com.erui.order.common.pojo.request.OrderAccountSaveRequest;
import com.erui.order.common.pojo.response.OrderAccountDetailResponse;
import com.erui.order.model.entity.OrderAccount;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class OrderAccountFactory {

    public static OrderAccount orderAccount(OrderAccountSaveRequest orderAccountSaveRequest) {
        if (orderAccountSaveRequest == null) {
            return null;
        }
        OrderAccount orderAccount = new OrderAccount();
        orderAccount.setId(orderAccountSaveRequest.getId());
        orderAccount.setOrderId(orderAccountSaveRequest.getOrderId());
        orderAccount.setAccountType(orderAccountSaveRequest.getAccountType());
        orderAccount.setAccDesc(orderAccountSaveRequest.getAccDesc());
        orderAccount.setMoney(orderAccountSaveRequest.getMoney());
        orderAccount.setDiscount(orderAccountSaveRequest.getDiscount());
        orderAccount.setPaymentDate(orderAccountSaveRequest.getPaymentDate());
        orderAccount.setGoodsPrice(orderAccountSaveRequest.getGoodsPrice());
        orderAccount.setDeliverDate(orderAccountSaveRequest.getDeliverDate());

        return orderAccount;
    }

    public static OrderAccountDetailResponse orderAccountDetailResponse(OrderAccount orderAccount) {
        if (orderAccount == null) {
            return null;
        }

        OrderAccountDetailResponse orderAccountDetailResponse = new OrderAccountDetailResponse();
        orderAccountDetailResponse.setId(orderAccount.getId());
        orderAccountDetailResponse.setOrderId(orderAccount.getOrderId());
        orderAccountDetailResponse.setAccountType(orderAccount.getAccountType());
        orderAccountDetailResponse.setAccDesc(orderAccount.getAccDesc());
        orderAccountDetailResponse.setMoney(orderAccount.getMoney());
        orderAccountDetailResponse.setDiscount(orderAccount.getDiscount());
        orderAccountDetailResponse.setPaymentDate(orderAccount.getPaymentDate());
        orderAccountDetailResponse.setGoodsPrice(orderAccount.getGoodsPrice());
        orderAccountDetailResponse.setDeliverDate(orderAccount.getDeliverDate());

        return orderAccountDetailResponse;
    }

}

