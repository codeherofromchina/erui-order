package com.erui.order.service.util;

import com.erui.order.common.pojo.PurchContractGoodsInfo;
import com.erui.order.model.entity.PurchContractGoods;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/9 上午12:27
 */
public class PurchContractGoodsFactory {
    public static PurchContractGoods purchContractGoods(PurchContractGoodsInfo purchContractGoodsInfo) {
        if (purchContractGoodsInfo == null) {
            return null;
        }
        PurchContractGoods purchContractGoods = new PurchContractGoods();
        purchContractGoods.setOrderGoodsId(purchContractGoodsInfo.getOrderGoodsId());
        purchContractGoods.setPurchaseNum(purchContractGoodsInfo.getPurchaseNum());
        purchContractGoods.setNonTaxPrice(purchContractGoodsInfo.getNonTaxPrice());
        purchContractGoods.setPurchasePrice(purchContractGoodsInfo.getPurchasePrice());
        purchContractGoods.setPurchaseTotalPrice(purchContractGoodsInfo.getPurchasePrice());
        purchContractGoods.setBrand(purchContractGoodsInfo.getBrand());

        return purchContractGoods;
    }

    public static List<PurchContractGoodsInfo> purchContractGoodsInfo(List<PurchContractGoods> purchContractGoodsList) {
        if (purchContractGoodsList == null) {
            return null;
        }
        List<PurchContractGoodsInfo> purchContractGoodsInfos = new ArrayList<>();
        for (PurchContractGoods purchContractGoods : purchContractGoodsList) {

            purchContractGoodsInfos.add(purchContractGoodsInfo(purchContractGoods));
        }
        return purchContractGoodsInfos;
    }


    public static PurchContractGoodsInfo purchContractGoodsInfo(PurchContractGoods purchContractGoods) {
        if (purchContractGoods == null) {
            return null;
        }
        PurchContractGoodsInfo purchContractGoodsInfo = new PurchContractGoodsInfo();
        purchContractGoodsInfo.setId(purchContractGoods.getId());
        purchContractGoodsInfo.setOrderGoodsId(purchContractGoods.getOrderGoodsId());
        purchContractGoodsInfo.setPurchaseNum(purchContractGoods.getPurchaseNum());
        purchContractGoodsInfo.setNonTaxPrice(purchContractGoods.getNonTaxPrice());
        purchContractGoodsInfo.setPurchasePrice(purchContractGoods.getPurchasePrice());
        purchContractGoodsInfo.setBrand(purchContractGoods.getBrand());

        return purchContractGoodsInfo;
    }
}
