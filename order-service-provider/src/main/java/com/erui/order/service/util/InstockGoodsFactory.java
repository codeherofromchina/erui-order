package com.erui.order.service.util;

import com.erui.order.common.pojo.InstockGoodsInfo;
import com.erui.order.model.entity.InstockGoods;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/9 上午12:27
 */
public class InstockGoodsFactory {
    public static InstockGoods InstockGoods(InstockGoodsInfo InstockGoodsInfo) {
        if (InstockGoodsInfo == null) {
            return null;
        }
        InstockGoods InstockGoods = new InstockGoods();
        InstockGoods.setOrderGoodsId(InstockGoodsInfo.getOrderGoodsId());

        return InstockGoods;
    }

    public static List<InstockGoodsInfo> InstockGoodsInfo(List<InstockGoods> InstockGoodsList) {
        if (InstockGoodsList == null) {
            return null;
        }
        List<InstockGoodsInfo> InstockGoodsInfos = new ArrayList<>();
        for (InstockGoods InstockGoods : InstockGoodsList) {

            InstockGoodsInfos.add(InstockGoodsInfo(InstockGoods));
        }
        return InstockGoodsInfos;
    }


    public static InstockGoodsInfo InstockGoodsInfo(InstockGoods InstockGoods) {
        if (InstockGoods == null) {
            return null;
        }
        InstockGoodsInfo InstockGoodsInfo = new InstockGoodsInfo();
        InstockGoodsInfo.setOrderGoodsId(InstockGoods.getOrderGoodsId());

        return InstockGoodsInfo;
    }
}

