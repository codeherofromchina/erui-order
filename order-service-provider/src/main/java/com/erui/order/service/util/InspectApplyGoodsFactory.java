package com.erui.order.service.util;

import com.erui.order.common.pojo.InspectApplyGoodsInfo;
import com.erui.order.model.entity.InspectApplyGoods;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/9 上午12:27
 */
public class InspectApplyGoodsFactory {
    public static InspectApplyGoods InspectApplyGoods(InspectApplyGoodsInfo InspectApplyGoodsInfo) {
        if (InspectApplyGoodsInfo == null) {
            return null;
        }
        InspectApplyGoods InspectApplyGoods = new InspectApplyGoods();
        InspectApplyGoods.setOrderGoodsId(InspectApplyGoodsInfo.getOrderGoodsId());

        return InspectApplyGoods;
    }

    public static List<InspectApplyGoodsInfo> InspectApplyGoodsInfo(List<InspectApplyGoods> InspectApplyGoodsList) {
        if (InspectApplyGoodsList == null) {
            return null;
        }
        List<InspectApplyGoodsInfo> InspectApplyGoodsInfos = new ArrayList<>();
        for (InspectApplyGoods InspectApplyGoods : InspectApplyGoodsList) {

            InspectApplyGoodsInfos.add(InspectApplyGoodsInfo(InspectApplyGoods));
        }
        return InspectApplyGoodsInfos;
    }


    public static InspectApplyGoodsInfo InspectApplyGoodsInfo(InspectApplyGoods InspectApplyGoods) {
        if (InspectApplyGoods == null) {
            return null;
        }
        InspectApplyGoodsInfo InspectApplyGoodsInfo = new InspectApplyGoodsInfo();
        InspectApplyGoodsInfo.setOrderGoodsId(InspectApplyGoods.getOrderGoodsId());

        return InspectApplyGoodsInfo;
    }
}

