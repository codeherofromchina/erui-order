package com.erui.order.service;

import com.erui.order.common.pojo.PurchGoodsInfo;

import java.util.List;

public interface PurchGoodsService {


    /**
     * 不存在就插入，存在则更新操作
     *
     * @param purchId
     * @param PurchGoodsList
     * @return
     * @throws Exception
     */
    int insertOnDuplicateIdUpdate(Long purchId, List<PurchGoodsInfo> PurchGoodsList) throws Exception;

    /**
     * 插入信息
     *
     * @param purchId
     * @param PurchGoodsList
     * @return
     */
    int insert(Long purchId, List<PurchGoodsInfo> PurchGoodsList) throws Exception;

    int insert(Long purchId, PurchGoodsInfo PurchGoodsInfo) throws Exception;

    void delete(Long... ids) throws Exception;

    int updateById(Long id, PurchGoodsInfo PurchGoodsInfo) throws Exception;

    List<PurchGoodsInfo> listByPurchId(Long purchId);

    PurchGoodsInfo findById(Long id);
}

