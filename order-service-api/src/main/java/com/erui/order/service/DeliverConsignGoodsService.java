package com.erui.order.service;

import com.erui.order.common.pojo.DeliverConsignGoodsInfo;

import java.util.List;

public interface DeliverConsignGoodsService {


    /**
     * 不存在就插入，存在则更新操作
     *
     * @param deliverConsignId
     * @param deliverConsignGoodsInfoList
     * @return
     * @throws Exception
     */
    int insertOnDuplicateIdUpdate(Long deliverConsignId, List<DeliverConsignGoodsInfo> deliverConsignGoodsInfoList) throws Exception;

    /**
     * 插入信息
     *
     * @param purchId
     * @param DeliverConsignGoodsList
     * @return
     */
    int insert(Long purchId, List<DeliverConsignGoodsInfo> DeliverConsignGoodsList);

    int insert(Long purchId, DeliverConsignGoodsInfo DeliverConsignGoodsInfo);

    void delete(Long... ids);

    int updateById(Long id, DeliverConsignGoodsInfo DeliverConsignGoodsInfo) throws Exception;

    List<DeliverConsignGoodsInfo> listByDeliverConsignId(Long deliverConsignId);

    DeliverConsignGoodsInfo findById(Long deliverConsignGoodsId);
}

