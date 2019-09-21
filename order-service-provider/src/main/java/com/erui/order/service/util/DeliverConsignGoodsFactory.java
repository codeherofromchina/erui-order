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

    public static List<DeliverConsignGoodsInfo> DeliverConsignGoodsInfo(List<DeliverConsignGoods> DeliverConsignGoodsList) {
        if (DeliverConsignGoodsList == null) {
            return null;
        }
        List<DeliverConsignGoodsInfo> DeliverConsignGoodsInfos = new ArrayList<>();
        for (DeliverConsignGoods DeliverConsignGoods : DeliverConsignGoodsList) {

            DeliverConsignGoodsInfos.add(DeliverConsignGoodsInfo(DeliverConsignGoods));
        }
        return DeliverConsignGoodsInfos;
    }


    public static DeliverConsignGoodsInfo DeliverConsignGoodsInfo(DeliverConsignGoods DeliverConsignGoods) {
        if (DeliverConsignGoods == null) {
            return null;
        }
        DeliverConsignGoodsInfo DeliverConsignGoodsInfo = new DeliverConsignGoodsInfo();
        DeliverConsignGoodsInfo.setOrderGoodsId(DeliverConsignGoods.getOrderGoodsId());

        return DeliverConsignGoodsInfo;
    }
}

