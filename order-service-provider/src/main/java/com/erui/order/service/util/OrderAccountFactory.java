package com.erui.order.service.util;

import com.erui.order.common.pojo.OrderAccountInfo;
import com.erui.order.common.pojo.request.OrderAccountSaveRequest;
import com.erui.order.common.pojo.response.OrderAccountDetailResponse;
import com.erui.order.model.entity.OrderAccount;

import java.util.ArrayList;
import java.util.List;

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

    public static List<OrderAccountInfo> orderAccountInfo(List<OrderAccount> orderAccounts) {
        if (orderAccounts == null) {
            return null;
        }
        List<OrderAccountInfo> result = new ArrayList<>();
        for (OrderAccount orderAccount : orderAccounts) {
            result.add(orderAccountInfo(orderAccount));
        }
        return result;
    }

    public static OrderAccountInfo orderAccountInfo(OrderAccount orderAccount) {
        if (orderAccount == null) {
            return null;
        }
        OrderAccountInfo orderAccountInfo = new OrderAccountInfo();
        orderAccountInfo.setId(orderAccount.getId());
        orderAccountInfo.setOrderId(orderAccount.getOrderId());
        orderAccountInfo.setAccountType(orderAccount.getAccountType());
        orderAccountInfo.setAccDesc(orderAccount.getAccDesc());
        orderAccountInfo.setMoney(orderAccount.getMoney());
        orderAccountInfo.setDiscount(orderAccount.getDiscount());
        orderAccountInfo.setPaymentDate(orderAccount.getPaymentDate());
        orderAccountInfo.setGoodsPrice(orderAccount.getGoodsPrice());
        orderAccountInfo.setDeliverDate(orderAccount.getDeliverDate());
        return orderAccountInfo;
    }

}

