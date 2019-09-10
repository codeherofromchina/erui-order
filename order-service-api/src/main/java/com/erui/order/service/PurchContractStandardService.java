package com.erui.order.service;

import com.erui.order.common.pojo.PurchContractAdditionStandardInfo;

public interface PurchContractStandardService {

    Long insertOnDuplicatePurchContractIdUpdate(Long purchContractId, PurchContractAdditionStandardInfo purchContractAdditionStandardInfo) throws Exception;

    /**
     * 插入采购合同附加的标准内容
     *
     * @param purchContractAdditionStandardInfo
     * @return 新插入内容的ID
     */
    Long insert(Long purchContractId, PurchContractAdditionStandardInfo purchContractAdditionStandardInfo) throws Exception;


    int updateByPurchContractId(Long purchContractId, PurchContractAdditionStandardInfo purchContractAdditionStandardInfo) throws Exception;

    PurchContractAdditionStandardInfo findByPurchContractId(Long purchContractId);
}

