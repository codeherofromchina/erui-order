package com.erui.order.service.util;

import com.erui.order.common.pojo.PurchGoodsInfo;
import com.erui.order.model.entity.PurchGoods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/9 上午12:27
 */
public class PurchGoodsFactory {
    public static PurchGoods purchGoods(PurchGoodsInfo purchGoodsInfo) {
        if (purchGoodsInfo == null) {
            return null;
        }
        PurchGoods purchGoods = new PurchGoods();
        purchGoods.setId(purchGoodsInfo.getId());
        purchGoods.setPurchContractGoodsId(purchGoodsInfo.getPurchContractGoodsId());
        purchGoods.setOrderGoodsId(purchGoodsInfo.getOrderGoodsId());
        purchGoods.setPurchaseNum(purchGoodsInfo.getPurchaseNum());
        purchGoods.setPurchasePrice(purchGoodsInfo.getPurchasePrice());
        purchGoods.setPurchaseRemark(purchGoodsInfo.getPurchaseRemark());
        purchGoods.setNonTaxPrice(purchGoodsInfo.getNonTaxPrice());
        if (purchGoods.getPurchaseNum() != null && purchGoods.getPurchasePrice() != null) {
            purchGoods.setPurchaseTotalPrice(purchGoods.getPurchasePrice().multiply(new BigDecimal(purchGoods.getPurchaseNum())));
        }

        return purchGoods;
    }

    public static List<PurchGoodsInfo> purchGoodsInfo(List<PurchGoods> PurchGoodsList) {
        if (PurchGoodsList == null) {
            return null;
        }
        List<PurchGoodsInfo> purchGoodsInfos = new ArrayList<>();
        for (PurchGoods purchGoods : PurchGoodsList) {
            purchGoodsInfos.add(purchGoodsInfo(purchGoods));
        }
        return purchGoodsInfos;
    }


    public static PurchGoodsInfo purchGoodsInfo(PurchGoods purchGoods) {
        if (purchGoods == null) {
            return null;
        }
        PurchGoodsInfo purchGoodsInfo = new PurchGoodsInfo();
        purchGoodsInfo.setId(purchGoods.getId());
        purchGoodsInfo.setPurchContractGoodsId(purchGoods.getPurchContractGoodsId());
        purchGoodsInfo.setOrderGoodsId(purchGoods.getOrderGoodsId());
        purchGoodsInfo.setPurchaseNum(purchGoods.getPurchaseNum());
        purchGoodsInfo.setPurchasePrice(purchGoods.getPurchasePrice());
        purchGoodsInfo.setNonTaxPrice(purchGoods.getNonTaxPrice());
        purchGoodsInfo.setPurchaseRemark(purchGoods.getPurchaseRemark());
        purchGoodsInfo.setPurchaseRemark(purchGoods.getPurchaseRemark());
        purchGoodsInfo.setPreInspectNum(purchGoods.getPreInspectNum());

        return purchGoodsInfo;
    }
}

