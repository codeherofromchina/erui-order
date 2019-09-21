package com.erui.order.service;

import com.erui.order.common.pojo.DeliverConsignGoodsInfo;
import com.erui.order.common.pojo.DeliverDetailGoodsInfo;

import java.util.List;

public interface DeliverDetailGoodsService {


    /**
     * 更新操作
     *
     * @param deliverDetailId
     * @param DeliverDetailGoodsList
     * @return
     * @throws Exception
     */
    void update(Long deliverDetailId, List<DeliverDetailGoodsInfo> DeliverDetailGoodsList) throws Exception;

    /**
     * 插入信息
     *
     * @param deliverDetailId
     * @param deliverConsignGoodsInfos
     * @return
     */
    void insert(Long deliverDetailId, List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos);


    int updateById(Long id, DeliverDetailGoodsInfo DeliverDetailGoodsInfo) throws Exception;

    List<DeliverDetailGoodsInfo> listByDeliverDetailId(Long deliverDetailId);
}

