package com.erui.order.service.util;

import com.erui.order.common.pojo.PurchGoodsInfo;
import com.erui.order.model.entity.PurchGoods;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/9 上午12:27
 */
public class PurchGoodsFactory {
    public static PurchGoods PurchGoods(PurchGoodsInfo PurchGoodsInfo) {
        if (PurchGoodsInfo == null) {
            return null;
        }
        PurchGoods PurchGoods = new PurchGoods();
        PurchGoods.setOrderGoodsId(PurchGoodsInfo.getOrderGoodsId());

        return PurchGoods;
    }

    public static List<PurchGoodsInfo> PurchGoodsInfo(List<PurchGoods> PurchGoodsList) {
        if (PurchGoodsList == null) {
            return null;
        }
        List<PurchGoodsInfo> PurchGoodsInfos = new ArrayList<>();
        for (PurchGoods PurchGoods : PurchGoodsList) {

            PurchGoodsInfos.add(PurchGoodsInfo(PurchGoods));
        }
        return PurchGoodsInfos;
    }


    public static PurchGoodsInfo PurchGoodsInfo(PurchGoods PurchGoods) {
        if (PurchGoods == null) {
            return null;
        }
        PurchGoodsInfo PurchGoodsInfo = new PurchGoodsInfo();
        PurchGoodsInfo.setOrderGoodsId(PurchGoods.getOrderGoodsId());

        return PurchGoodsInfo;
    }
}

