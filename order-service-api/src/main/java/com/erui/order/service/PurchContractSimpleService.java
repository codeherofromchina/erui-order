package com.erui.order.service;

import com.erui.order.common.pojo.PurchContractAdditionSimpleInfo;
import com.erui.order.common.pojo.PurchContractAdditionStandardInfo;
import com.erui.order.common.pojo.PurchContractSignatoriesInfo;

public interface PurchContractSimpleService {

    Long insertOnDuplicatePurchContractIdUpdate(Long purchContractId, PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo) throws Exception;


    /**
     * 插入采购合同附加的简易内容
     *
     * @param purchContractAdditionSimpleInfo
     * @return 新插入内容的ID
     */
    Long insert(Long purchContractId, PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo) throws Exception;


    int updateByPurchContractId(Long purchContractId, PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo) throws Exception;

    PurchContractAdditionSimpleInfo findByPurchContractId(Long purchContractId);
}
