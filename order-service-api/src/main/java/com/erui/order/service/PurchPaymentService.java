package com.erui.order.service;

import com.erui.order.common.pojo.PurchPaymentInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/17 下午3:22
 */
public interface PurchPaymentService {
    int insert(Long purchId, List<PurchPaymentInfo> purchPayments);

    int insert(Long purchId, PurchPaymentInfo purchPaymentInfo);
}
