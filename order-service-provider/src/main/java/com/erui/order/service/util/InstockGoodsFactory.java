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
    public static InstockGoods instockGoods(InstockGoodsInfo instockGoodsInfo) {
        if (instockGoodsInfo == null) {
            return null;
        }
        InstockGoods instockGoods = new InstockGoods();
        instockGoods.setInspectApplyGoodsId(instockGoodsInfo.getInspectApplyGoodsId());
        instockGoods.setInstockNum(instockGoodsInfo.getInstockNum());
        instockGoods.setInstockStock(instockGoodsInfo.getInstockStock());

        return instockGoods;
    }

    public static List<InstockGoodsInfo> instockGoodsInfo(List<InstockGoods> instockGoodsList) {
        if (instockGoodsList == null) {
            return null;
        }
        List<InstockGoodsInfo> instockGoodsInfos = new ArrayList<>();
        for (InstockGoods InstockGoods : instockGoodsList) {
            instockGoodsInfos.add(instockGoodsInfo(InstockGoods));
        }
        return instockGoodsInfos;
    }


    public static InstockGoodsInfo instockGoodsInfo(InstockGoods instockGoods) {
        if (instockGoods == null) {
            return null;
        }
        InstockGoodsInfo instockGoodsInfo = new InstockGoodsInfo();
        instockGoodsInfo.setId(instockGoods.getId());
        instockGoodsInfo.setInspectApplyGoodsId(instockGoods.getInspectApplyGoodsId());
        instockGoodsInfo.setInstockNum(instockGoods.getInstockNum());
        instockGoodsInfo.setInstockStock(instockGoods.getInstockStock());
        return instockGoodsInfo;
    }
}

