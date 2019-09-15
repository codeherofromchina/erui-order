package com.erui.order.service;

import com.erui.order.common.pojo.GoodsInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/15 下午2:18
 */
public interface GoodsService {
    /**
     * 查询所有可以新增采购合同的商品列表
     * @param projectIds
     * @return
     */
    List<GoodsInfo> purchContractGoodsList(List<Long> projectIds);

    void updateOrderGoodsPurchContractNum(Long orderGoodsId, boolean pre, Integer purchaseNum);
}
