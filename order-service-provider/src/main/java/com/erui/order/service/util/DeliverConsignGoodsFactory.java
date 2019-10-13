package com.erui.order.service.util;

import com.erui.order.common.pojo.DeliverConsignGoodsInfo;
import com.erui.order.model.entity.DeliverConsignGoods;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/9 上午12:27
 */
public class DeliverConsignGoodsFactory {
    public static DeliverConsignGoods deliverConsignGoods(DeliverConsignGoodsInfo deliverConsignGoodsInfo) {
        if (deliverConsignGoodsInfo == null) {
            return null;
        }
        DeliverConsignGoods deliverConsignGoods = new DeliverConsignGoods();
        deliverConsignGoods.setId(deliverConsignGoodsInfo.getId());
        deliverConsignGoods.setOrderGoodsId(deliverConsignGoodsInfo.getOrderGoodsId());
        deliverConsignGoods.setSendNum(deliverConsignGoodsInfo.getSendNum());

        return deliverConsignGoods;
    }

    public static List<DeliverConsignGoodsInfo> deliverConsignGoodsInfo(List<DeliverConsignGoods> deliverConsignGoodsList) {
        if (deliverConsignGoodsList == null) {
            return null;
        }
        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos = new ArrayList<>();
        for (DeliverConsignGoods deliverConsignGoods : deliverConsignGoodsList) {

            deliverConsignGoodsInfos.add(deliverConsignGoodsInfo(deliverConsignGoods));
        }
        return deliverConsignGoodsInfos;
    }


    public static DeliverConsignGoodsInfo deliverConsignGoodsInfo(DeliverConsignGoods deliverConsignGoods) {
        if (deliverConsignGoods == null) {
            return null;
        }
        DeliverConsignGoodsInfo deliverConsignGoodsInfo = new DeliverConsignGoodsInfo();
        deliverConsignGoodsInfo.setId(deliverConsignGoods.getId());
        deliverConsignGoodsInfo.setSendNum(deliverConsignGoods.getSendNum());
        deliverConsignGoodsInfo.setOrderGoodsId(deliverConsignGoods.getOrderGoodsId());

        return deliverConsignGoodsInfo;
    }
}

