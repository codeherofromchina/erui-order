package com.erui.order.service;

import com.erui.order.common.pojo.DeliverConsignBookingSpaceInfo;

import java.util.List;

public interface DeliverConsignBookingSpaceService {


    /**
     * 不存在就插入，存在则更新操作
     *
     * @param purchId
     * @param DeliverConsignBookingSpaceList
     * @return
     * @throws Exception
     */
    int insertOnDuplicateIdUpdate(Long purchId, List<DeliverConsignBookingSpaceInfo> DeliverConsignBookingSpaceList) throws Exception;

    /**
     * 插入信息
     *
     * @param purchId
     * @param DeliverConsignBookingSpaceList
     * @return
     */
    int insert(Long purchId, List<DeliverConsignBookingSpaceInfo> DeliverConsignBookingSpaceList);

    int insert(Long purchId, DeliverConsignBookingSpaceInfo DeliverConsignBookingSpaceInfo);

    void delete(Long... ids);

    int updateById(Long id, DeliverConsignBookingSpaceInfo DeliverConsignBookingSpaceInfo) throws Exception;

    List<DeliverConsignBookingSpaceInfo> listByDeliverConsignId(Long deliverConsignId);
}

