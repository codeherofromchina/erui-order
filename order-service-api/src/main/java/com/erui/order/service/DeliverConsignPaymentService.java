package com.erui.order.service;

import com.erui.order.common.pojo.DeliverConsignPaymentInfo;

import java.util.List;

public interface DeliverConsignPaymentService {


    /**
     * 不存在就插入，存在则更新操作
     *
     * @param deliverConsignId
     * @param deliverConsignPaymentInfos
     * @return
     * @throws Exception
     */
    int insertOnDuplicateIdUpdate(Long deliverConsignId, List<DeliverConsignPaymentInfo> deliverConsignPaymentInfos) throws Exception;

    /**
     * 插入信息
     *
     * @param purchId
     * @param DeliverConsignPaymentList
     * @return
     */
    int insert(Long purchId, List<DeliverConsignPaymentInfo> DeliverConsignPaymentList);

    int insert(Long purchId, DeliverConsignPaymentInfo DeliverConsignPaymentInfo);

    void delete(Long... ids);

    int updateById(Long id, DeliverConsignPaymentInfo DeliverConsignPaymentInfo) throws Exception;

    List<DeliverConsignPaymentInfo> listByDeliverConsignId(Long deliverConsignId);
}

