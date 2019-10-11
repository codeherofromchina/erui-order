package com.erui.order.service.util;

import com.erui.order.common.pojo.DeliverDetailGoodsInfo;
import com.erui.order.model.entity.DeliverDetailGoods;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/9 上午12:27
 */
public class DeliverDetailGoodsFactory {

    public static DeliverDetailGoods deliverDetailGoods(DeliverDetailGoodsInfo deliverDetailGoodsInfo) {
        if (deliverDetailGoodsInfo == null) {
            return null;
        }
        DeliverDetailGoods deliverDetailGoods = new DeliverDetailGoods();
        deliverDetailGoods.setId(deliverDetailGoodsInfo.getId());
        deliverDetailGoods.setDeliverConsignGoodsId(deliverDetailGoodsInfo.getDeliverConsignGoodsId());
        deliverDetailGoods.setOutboundNum(deliverDetailGoodsInfo.getOutboundNum());
        deliverDetailGoods.setStraightNum(deliverDetailGoodsInfo.getStraightNum());
        deliverDetailGoods.setDetailGoodsRemarks(deliverDetailGoodsInfo.getDetailGoodsRemarks());
        return deliverDetailGoods;
    }

    public static List<DeliverDetailGoodsInfo> deliverDetailGoodsInfo(List<DeliverDetailGoods> deliverDetailGoodsList) {
        if (deliverDetailGoodsList == null) {
            return null;
        }
        List<DeliverDetailGoodsInfo> deliverDetailGoodsInfos = new ArrayList<>();
        for (DeliverDetailGoods deliverDetailGoods : deliverDetailGoodsList) {
            deliverDetailGoodsInfos.add(deliverDetailGoodsInfo(deliverDetailGoods));
        }
        return deliverDetailGoodsInfos;
    }


    public static DeliverDetailGoodsInfo deliverDetailGoodsInfo(DeliverDetailGoods deliverDetailGoods) {
        if (deliverDetailGoods == null) {
            return null;
        }
        DeliverDetailGoodsInfo deliverDetailGoodsInfo = new DeliverDetailGoodsInfo();
        deliverDetailGoodsInfo.setId(deliverDetailGoods.getId());
        deliverDetailGoodsInfo.setDeliverConsignGoodsId(deliverDetailGoods.getDeliverConsignGoodsId());
        deliverDetailGoodsInfo.setOutboundNum(deliverDetailGoods.getOutboundNum());
        deliverDetailGoodsInfo.setStraightNum(deliverDetailGoods.getStraightNum());
        deliverDetailGoodsInfo.setDetailGoodsRemarks(deliverDetailGoods.getDetailGoodsRemarks());
        return deliverDetailGoodsInfo;
    }
}

