package com.erui.order.service.util;

import com.erui.order.common.pojo.DeliverConsignPaymentInfo;
import com.erui.order.model.entity.DeliverConsignPayment;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/9 上午12:27
 */
public class DeliverConsignPaymentFactory {

    public static DeliverConsignPayment deliverConsignPayment(DeliverConsignPaymentInfo deliverConsignPaymentInfo) {
        if (deliverConsignPaymentInfo == null) {
            return null;
        }
        DeliverConsignPayment deliverConsignPayment = new DeliverConsignPayment();
        deliverConsignPayment.setId(deliverConsignPaymentInfo.getId());
        deliverConsignPayment.setMoney(deliverConsignPaymentInfo.getMoney());
        deliverConsignPayment.setPaymentType(deliverConsignPaymentInfo.getPaymentType());
        deliverConsignPayment.setReceiptTime(deliverConsignPaymentInfo.getReceiptTime());

        return deliverConsignPayment;
    }

    public static List<DeliverConsignPaymentInfo> deliverConsignPaymentInfo(List<DeliverConsignPayment> deliverConsignPaymentList) {
        if (deliverConsignPaymentList == null) {
            return null;
        }
        List<DeliverConsignPaymentInfo> deliverConsignPaymentInfos = new ArrayList<>();
        for (DeliverConsignPayment deliverConsignPayment : deliverConsignPaymentList) {
            deliverConsignPaymentInfos.add(deliverConsignPaymentInfo(deliverConsignPayment));
        }
        return deliverConsignPaymentInfos;
    }


    public static DeliverConsignPaymentInfo deliverConsignPaymentInfo(DeliverConsignPayment deliverConsignPayment) {
        if (deliverConsignPayment == null) {
            return null;
        }
        DeliverConsignPaymentInfo deliverConsignPaymentInfo = new DeliverConsignPaymentInfo();
        deliverConsignPaymentInfo.setId(deliverConsignPayment.getId());
        deliverConsignPaymentInfo.setMoney(deliverConsignPayment.getMoney());
        deliverConsignPaymentInfo.setPaymentType(deliverConsignPayment.getPaymentType());
        deliverConsignPaymentInfo.setReceiptTime(deliverConsignPayment.getReceiptTime());

        return deliverConsignPaymentInfo;
    }
}

