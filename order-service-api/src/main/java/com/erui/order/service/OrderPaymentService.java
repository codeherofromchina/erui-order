package com.erui.order.service;

import com.erui.order.common.pojo.OrderPaymentInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午12:06
 */
public interface OrderPaymentService {
    /**
     * 不存在就插入，存在则更新操作
     *
     * @param orderId
     * @param orderPaymentInfos
     * @return
     * @throws Exception
     */
    int insertOnDuplicateIdUpdate(Long orderId, List<OrderPaymentInfo> orderPaymentInfos) throws Exception;
    int insert(Long orderId, List<OrderPaymentInfo> orderPaymentInfos);
    int insert(Long orderId, OrderPaymentInfo orderPaymentInfo);

    /**
     * 删除订单付款
     *
     * @param ids
     */
    void delete(Long... ids);


    int updateById(Long id, OrderPaymentInfo orderPaymentInfo) throws Exception;

    /**
     * 查找订单的付款类型
     *
     * @param orderId
     * @return
     */
    List<OrderPaymentInfo> list(Long orderId);
}
