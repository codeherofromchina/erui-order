package com.erui.order.service;

import com.erui.order.common.pojo.PurchContractGoodsInfo;

import java.util.List;

public interface PurchContractGoodsService {


    /**
     * 不存在就插入，存在则更新操作
     *
     * @param purchContractId
     * @param purchContractGoodsList
     * @return
     * @throws Exception
     */
    int insertOnDuplicateIdUpdate(Long purchContractId, List<PurchContractGoodsInfo> purchContractGoodsList) throws Exception;
    /**
     * 插入采购合同的商品信息
     *
     * @param purchContractId
     * @param purchContractGoodsList
     * @return
     */
    int insert(Long purchContractId, List<PurchContractGoodsInfo> purchContractGoodsList);

    int insert(Long purchContractId, PurchContractGoodsInfo purchContractGoodsInfo);

    void delete(Long... ids);

    int updateById(Long id, PurchContractGoodsInfo purchContractGoodsInfo) throws Exception ;

    List<PurchContractGoodsInfo> listByPurchContractId(Long purchContractId);
}