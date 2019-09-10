package com.erui.order.service;

import com.erui.order.common.pojo.OrderGoodsInfo;

import java.util.List;

public interface OrderGoodsService {


    /**
     * 不存在就插入，存在则更新操作
     *
     * @param orderId
     * @param orderGoodsInfos
     * @return
     * @throws Exception
     */
    int insertOnDuplicateIdUpdate(Long orderId, List<OrderGoodsInfo> orderGoodsInfos) throws Exception;

    int insert(Long orderId, List<OrderGoodsInfo> orderGoodsInfos);

    int insert(Long orderId, OrderGoodsInfo orderGoodsInfo);

    /**
     * 删除商品
     *
     * @param ids
     */
    void delete(Long... ids);


    int updateById(Long id, OrderGoodsInfo orderGoodsInfo) throws Exception;

    /**
     * 查找订单的商品
     *
     * @param orderId
     * @return
     */
    List<OrderGoodsInfo> list(Long orderId);

    /**
     * 查找订单商品信息
     * @param id
     * @return
     */
    OrderGoodsInfo findById(Long id);
}

