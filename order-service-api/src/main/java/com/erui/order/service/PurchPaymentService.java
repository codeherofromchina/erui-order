package com.erui.order.service;

import com.erui.order.common.pojo.OrderGoodsInfo;
import com.erui.order.common.pojo.PurchPaymentInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/17 下午3:22
 */
public interface PurchPaymentService {
    int insert(Long purchId, List<PurchPaymentInfo> purchPayments);

    int insert(Long purchId, PurchPaymentInfo purchPaymentInfo);

    int insertOnDuplicateIdUpdate(Long purchId, List<PurchPaymentInfo> purchPayments) throws Exception;

    public void delete(Long... ids);


    /**
     * 查找采购的付款
     *
     * @param purchId
     * @return
     */
    List<PurchPaymentInfo> list(Long purchId);
}
