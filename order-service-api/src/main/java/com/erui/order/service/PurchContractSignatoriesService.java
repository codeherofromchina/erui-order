package com.erui.order.service;

import com.erui.order.common.enums.PurchContractSignatoriesTypeEnum;
import com.erui.order.common.pojo.PurchContractSignatoriesInfo;

public interface PurchContractSignatoriesService {

    Long insertOnDuplicatePurchContractIdUpdate(Long purchContractId, PurchContractSignatoriesTypeEnum signatoriesType,
                                                PurchContractSignatoriesInfo contractSignatoriesInfo) throws Exception;

    Long insert(Long purchContractId, PurchContractSignatoriesTypeEnum signatoriesType, PurchContractSignatoriesInfo contractSignatoriesInfo) throws Exception;


    int updateByPurchContractId(Long purchContractId, PurchContractSignatoriesTypeEnum signatoriesType,
                                PurchContractSignatoriesInfo contractSignatoriesInfo) throws Exception;


    PurchContractSignatoriesInfo findByPurchContractId(Long purchContractId, PurchContractSignatoriesTypeEnum signatoriesType);
}

