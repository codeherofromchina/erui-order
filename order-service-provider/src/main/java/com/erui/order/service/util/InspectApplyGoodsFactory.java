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
    public static InspectApplyGoods inspectApplyGoods(InspectApplyGoodsInfo inspectApplyGoodsInfo) {
        if (inspectApplyGoodsInfo == null) {
            return null;
        }
        InspectApplyGoods inspectApplyGoods = new InspectApplyGoods();
        inspectApplyGoods.setId(inspectApplyGoodsInfo.getId());
        inspectApplyGoods.setOrderGoodsId(inspectApplyGoodsInfo.getOrderGoodsId());
        inspectApplyGoods.setPurchGoodsId(inspectApplyGoodsInfo.getPurchGoodsId());
        inspectApplyGoods.setInspectNum(inspectApplyGoodsInfo.getInspectNum());
        inspectApplyGoods.setHeight(inspectApplyGoodsInfo.getHeight());
        inspectApplyGoods.setLwh(inspectApplyGoodsInfo.getLwh());

        return inspectApplyGoods;
    }

    public static List<InspectApplyGoodsInfo> inspectApplyGoodsInfo(List<InspectApplyGoods> inspectApplyGoodsList) {
        if (inspectApplyGoodsList == null) {
            return null;
        }
        List<InspectApplyGoodsInfo> inspectApplyGoodsInfos = new ArrayList<>();
        for (InspectApplyGoods inspectApplyGoods : inspectApplyGoodsList) {
            inspectApplyGoodsInfos.add(inspectApplyGoodsInfo(inspectApplyGoods));
        }
        return inspectApplyGoodsInfos;
    }


    public static InspectApplyGoodsInfo inspectApplyGoodsInfo(InspectApplyGoods inspectApplyGoods) {
        if (inspectApplyGoods == null) {
            return null;
        }
        InspectApplyGoodsInfo inspectApplyGoodsInfo = new InspectApplyGoodsInfo();
        inspectApplyGoodsInfo.setId(inspectApplyGoods.getId());
        inspectApplyGoodsInfo.setOrderGoodsId(inspectApplyGoods.getOrderGoodsId());
        inspectApplyGoodsInfo.setPurchGoodsId(inspectApplyGoods.getPurchGoodsId());
        inspectApplyGoodsInfo.setInspectNum(inspectApplyGoods.getInspectNum());
        inspectApplyGoodsInfo.setHeight(inspectApplyGoods.getHeight());
        inspectApplyGoodsInfo.setLwh(inspectApplyGoods.getLwh());
        inspectApplyGoodsInfo.setUnqualified(inspectApplyGoods.getUnqualified());
        inspectApplyGoodsInfo.setUnqualifiedDesc(inspectApplyGoods.getUnqualifiedDesc());
        inspectApplyGoodsInfo.setUnqualifiedType(inspectApplyGoods.getUnqualifiedType());

        return inspectApplyGoodsInfo;
    }
}

