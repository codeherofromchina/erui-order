package com.erui.order.service.util;

import com.erui.order.common.pojo.PurchContractAdditionSimpleInfo;
import com.erui.order.common.pojo.PurchContractSignatoriesInfo;
import com.erui.order.model.entity.PurchContractSimple;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午11:14
 */
public class PurchContractSimpleFactory {


    public static PurchContractSimple purchContractSimple(PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo) {
        if (purchContractAdditionSimpleInfo == null) {
            return null;
        }
        PurchContractSimple purchContractSimple = new PurchContractSimple();
        purchContractSimple.setProductRequirement(purchContractAdditionSimpleInfo.getProductRequirement());
        purchContractSimple.setWarrantyPeriod(purchContractAdditionSimpleInfo.getWarrantyPeriod());
        purchContractSimple.setShippingDate(purchContractAdditionSimpleInfo.getShippingDate());
        purchContractSimple.setDesignatedLocation(purchContractAdditionSimpleInfo.getDesignatedLocation());
        purchContractSimple.setCostBurden(purchContractAdditionSimpleInfo.getCostBurden());
        purchContractSimple.setInspectionAt(purchContractAdditionSimpleInfo.getInspectionAt());
        purchContractSimple.setWithinDays(purchContractAdditionSimpleInfo.getWithinDays());
        purchContractSimple.setMethodAndTime(purchContractAdditionSimpleInfo.getMethodAndTime());
        purchContractSimple.setAgreementName(purchContractAdditionSimpleInfo.getAgreementName());

        return purchContractSimple;


    }

    public static PurchContractAdditionSimpleInfo purchContractSignatoriesInfo(PurchContractSimple purchContractSimple) {
        if (purchContractSimple == null) {
            return null;
        }
        PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo = new PurchContractAdditionSimpleInfo();
        purchContractAdditionSimpleInfo.setProductRequirement(purchContractSimple.getProductRequirement());
        purchContractAdditionSimpleInfo.setWarrantyPeriod(purchContractSimple.getWarrantyPeriod());
        purchContractAdditionSimpleInfo.setShippingDate(purchContractSimple.getShippingDate());
        purchContractAdditionSimpleInfo.setDesignatedLocation(purchContractSimple.getDesignatedLocation());
        purchContractAdditionSimpleInfo.setCostBurden(purchContractSimple.getCostBurden());
        purchContractAdditionSimpleInfo.setInspectionAt(purchContractSimple.getInspectionAt());
        purchContractAdditionSimpleInfo.setWithinDays(purchContractSimple.getWithinDays());
        purchContractAdditionSimpleInfo.setMethodAndTime(purchContractSimple.getMethodAndTime());
        purchContractAdditionSimpleInfo.setAgreementName(purchContractSimple.getAgreementName());

        return purchContractAdditionSimpleInfo;
    }
}
