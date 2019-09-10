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
    public static DeliverConsignPayment DeliverConsignPayment(DeliverConsignPaymentInfo DeliverConsignPaymentInfo) {
        if (DeliverConsignPaymentInfo == null) {
            return null;
        }
        DeliverConsignPayment DeliverConsignPayment = new DeliverConsignPayment();

        return DeliverConsignPayment;
    }

    public static List<DeliverConsignPaymentInfo> DeliverConsignPaymentInfo(List<DeliverConsignPayment> DeliverConsignPaymentList) {
        if (DeliverConsignPaymentList == null) {
            return null;
        }
        List<DeliverConsignPaymentInfo> DeliverConsignPaymentInfos = new ArrayList<>();
        for (DeliverConsignPayment DeliverConsignPayment : DeliverConsignPaymentList) {

            DeliverConsignPaymentInfos.add(DeliverConsignPaymentInfo(DeliverConsignPayment));
        }
        return DeliverConsignPaymentInfos;
    }


    public static DeliverConsignPaymentInfo DeliverConsignPaymentInfo(DeliverConsignPayment DeliverConsignPayment) {
        if (DeliverConsignPayment == null) {
            return null;
        }
        DeliverConsignPaymentInfo DeliverConsignPaymentInfo = new DeliverConsignPaymentInfo();

        return DeliverConsignPaymentInfo;
    }
}

