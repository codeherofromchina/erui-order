package com.erui.order.service.util;

import com.erui.order.common.pojo.PurchContractSignatoriesInfo;
import com.erui.order.model.entity.PurchContractSignatories;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:04
 */
public class PurchContractSignatoriesFactory {

    public static PurchContractSignatoriesInfo purchContractSignatoriesInfo(PurchContractSignatories purchContractSignatories) {
        if (purchContractSignatories == null) {
            return null;
        }

        PurchContractSignatoriesInfo signatoriesInfo = new PurchContractSignatoriesInfo();
        signatoriesInfo.setId(purchContractSignatories.getId());
        signatoriesInfo.setPurchContractId(purchContractSignatories.getPurchContractId());
        // 公司名称
        signatoriesInfo.setSellerBuyer(purchContractSignatories.getSellerBuyer());
        // 邮政编码
        signatoriesInfo.setPostalCode(purchContractSignatories.getPostalCode());
        // '法定代表人或授权代表'
        signatoriesInfo.setLegalRepresentative(purchContractSignatories.getLegalRepresentative());
        // '委托代理人'
        signatoriesInfo.setAgent(purchContractSignatories.getAgent());
        // '单位地址
        signatoriesInfo.setAddress(purchContractSignatories.getAddress());
        // '开户银行'
        signatoriesInfo.setOpeningBank(purchContractSignatories.getOpeningBank());
        // '账号'
        signatoriesInfo.setAccountNumber(purchContractSignatories.getAccountNumber());
        // '统一社会信用代码证
        signatoriesInfo.setCreditCode(purchContractSignatories.getCreditCode());
        // 电话/传真
        signatoriesInfo.setTelephoneFax(purchContractSignatories.getTelephoneFax());
        // 税号
        signatoriesInfo.setDutyParagraph(purchContractSignatories.getDutyParagraph());

        return signatoriesInfo;
    }


    public static PurchContractSignatories purchContractSignatories(PurchContractSignatoriesInfo purchContractSignatoriesInfo) {
        if (purchContractSignatoriesInfo == null) {
            return null;
        }

        PurchContractSignatories purchContractSignatories = new PurchContractSignatories();
        purchContractSignatories.setId(purchContractSignatoriesInfo.getId());
        purchContractSignatories.setPurchContractId(purchContractSignatoriesInfo.getPurchContractId());
        // 公司名
        purchContractSignatories.setSellerBuyer(purchContractSignatoriesInfo.getSellerBuyer());
        // 邮政编码
        purchContractSignatories.setPostalCode(purchContractSignatoriesInfo.getPostalCode());
        // '法定代表人或授权代表'
        purchContractSignatories.setLegalRepresentative(purchContractSignatoriesInfo.getLegalRepresentative());
        // '委托代理人'
        purchContractSignatories.setAgent(purchContractSignatoriesInfo.getAgent());
        // '单位地址
        purchContractSignatories.setAddress(purchContractSignatoriesInfo.getAddress());
        // '开户银行'
        purchContractSignatories.setOpeningBank(purchContractSignatoriesInfo.getOpeningBank());
        // '账号'
        purchContractSignatories.setAccountNumber(purchContractSignatoriesInfo.getAccountNumber());
        // '统一社会信用代码证
        purchContractSignatories.setCreditCode(purchContractSignatoriesInfo.getCreditCode());
        // 电话/传真
        purchContractSignatories.setTelephoneFax(purchContractSignatoriesInfo.getTelephoneFax());
        // 税号
        purchContractSignatories.setDutyParagraph(purchContractSignatoriesInfo.getDutyParagraph());

        return purchContractSignatories;
    }


}
