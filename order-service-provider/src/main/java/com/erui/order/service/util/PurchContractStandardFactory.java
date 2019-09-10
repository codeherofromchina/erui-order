package com.erui.order.service.util;

import com.erui.order.common.pojo.PurchContractAdditionStandardInfo;
import com.erui.order.model.entity.PurchContractStandard;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午11:24
 */
public class PurchContractStandardFactory {
    public static PurchContractStandard purchContractStandard(PurchContractAdditionStandardInfo purchContractAdditionStandardInfo) {
        if (purchContractAdditionStandardInfo == null) {
            return null;
        }

        PurchContractStandard purchContractStandard = new PurchContractStandard();
        purchContractStandard.setUsedForBuyer(purchContractAdditionStandardInfo.getUsedForBuyer());
        purchContractStandard.setStandardAndRequire(purchContractAdditionStandardInfo.getStandardAndRequire());
        purchContractStandard.setMeetRequire(purchContractAdditionStandardInfo.getMeetRequire());
        purchContractStandard.setWarrantyPeriod(purchContractAdditionStandardInfo.getWarrantyPeriod());
        purchContractStandard.setDeliveryDate(purchContractAdditionStandardInfo.getDeliveryDate());
        purchContractStandard.setDeliveryPlace(purchContractAdditionStandardInfo.getDeliveryPlace());
        purchContractStandard.setInspectionPeriod(purchContractAdditionStandardInfo.getInspectionPeriod());
        purchContractStandard.setDataVersion(purchContractAdditionStandardInfo.getDataVersion());
        purchContractStandard.setMethodAndTime(purchContractAdditionStandardInfo.getMethodAndTime());
        purchContractStandard.setInsideAddressS(purchContractAdditionStandardInfo.getInsideAddressS());
        purchContractStandard.setAddresseeS(purchContractAdditionStandardInfo.getAddresseeS());
        purchContractStandard.setTelephoneS(purchContractAdditionStandardInfo.getTelephoneS());
        purchContractStandard.setInboxAddressS(purchContractAdditionStandardInfo.getInboxAddressS());
        purchContractStandard.setInsideAddressB(purchContractAdditionStandardInfo.getInsideAddressB());
        purchContractStandard.setAddresseeB(purchContractAdditionStandardInfo.getAddresseeB());
        purchContractStandard.setTelephoneB(purchContractAdditionStandardInfo.getTelephoneB());
        purchContractStandard.setInboxAddressB(purchContractAdditionStandardInfo.getInboxAddressB());
        purchContractStandard.setSolution(purchContractAdditionStandardInfo.getSolution());
        purchContractStandard.setBoardArbitration(purchContractAdditionStandardInfo.getBoardArbitration());
        purchContractStandard.setFewCopies(purchContractAdditionStandardInfo.getFewCopies());
        purchContractStandard.setSellerFewCopies(purchContractAdditionStandardInfo.getSellerFewCopies());
        purchContractStandard.setBuyerFewCopies(purchContractAdditionStandardInfo.getBuyerFewCopies());
        purchContractStandard.setAppendicesName1(purchContractAdditionStandardInfo.getAppendicesName1());
        purchContractStandard.setAppendicesName2(purchContractAdditionStandardInfo.getAppendicesName2());


        return purchContractStandard;
    }

    public static PurchContractAdditionStandardInfo purchContractAdditionStandardInfo(PurchContractStandard purchContractStandard) {
        if (purchContractStandard == null) {
            return null;
        }

        PurchContractAdditionStandardInfo purchContractAdditionStandardInfo = new PurchContractAdditionStandardInfo();
        purchContractAdditionStandardInfo.setUsedForBuyer(purchContractStandard.getUsedForBuyer());
        purchContractAdditionStandardInfo.setStandardAndRequire(purchContractStandard.getStandardAndRequire());
        purchContractAdditionStandardInfo.setMeetRequire(purchContractStandard.getMeetRequire());
        purchContractAdditionStandardInfo.setWarrantyPeriod(purchContractStandard.getWarrantyPeriod());
        purchContractAdditionStandardInfo.setDeliveryDate(purchContractStandard.getDeliveryDate());
        purchContractAdditionStandardInfo.setDeliveryPlace(purchContractStandard.getDeliveryPlace());
        purchContractAdditionStandardInfo.setInspectionPeriod(purchContractStandard.getInspectionPeriod());
        purchContractAdditionStandardInfo.setDataVersion(purchContractStandard.getDataVersion());
        purchContractAdditionStandardInfo.setMethodAndTime(purchContractStandard.getMethodAndTime());
        purchContractAdditionStandardInfo.setInsideAddressS(purchContractStandard.getInsideAddressS());
        purchContractAdditionStandardInfo.setAddresseeS(purchContractStandard.getAddresseeS());
        purchContractAdditionStandardInfo.setTelephoneS(purchContractStandard.getTelephoneS());
        purchContractAdditionStandardInfo.setInboxAddressS(purchContractStandard.getInboxAddressS());
        purchContractAdditionStandardInfo.setInsideAddressB(purchContractStandard.getInsideAddressB());
        purchContractAdditionStandardInfo.setAddresseeB(purchContractStandard.getAddresseeB());
        purchContractAdditionStandardInfo.setTelephoneB(purchContractStandard.getTelephoneB());
        purchContractAdditionStandardInfo.setInboxAddressB(purchContractStandard.getInboxAddressB());
        purchContractAdditionStandardInfo.setSolution(purchContractStandard.getSolution());
        purchContractAdditionStandardInfo.setBoardArbitration(purchContractStandard.getBoardArbitration());
        purchContractAdditionStandardInfo.setFewCopies(purchContractStandard.getFewCopies());
        purchContractAdditionStandardInfo.setSellerFewCopies(purchContractStandard.getSellerFewCopies());
        purchContractAdditionStandardInfo.setBuyerFewCopies(purchContractStandard.getBuyerFewCopies());
        purchContractAdditionStandardInfo.setAppendicesName1(purchContractStandard.getAppendicesName1());
        purchContractAdditionStandardInfo.setAppendicesName2(purchContractStandard.getAppendicesName2());


        return purchContractAdditionStandardInfo;
    }
}
