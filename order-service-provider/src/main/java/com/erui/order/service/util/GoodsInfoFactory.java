package com.erui.order.service.util;

import com.erui.order.common.pojo.GoodsInfo;
import com.erui.order.common.pojo.OrderGoodsInfo;
import com.erui.order.common.pojo.PurchRequisitionGoodsInfo;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午6:05
 */
public class GoodsInfoFactory {


    public static GoodsInfo goodsInfo(OrderGoodsInfo orderGoodsInfo) {
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo(goodsInfo, orderGoodsInfo);


        return goodsInfo;
    }


    public static GoodsInfo goodsInfo(OrderGoodsInfo orderGoodsInfo, PurchRequisitionGoodsInfo purchRequisitionGoodsInfo) {
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo(goodsInfo, orderGoodsInfo);
        goodsInfo(goodsInfo, purchRequisitionGoodsInfo);
        return goodsInfo;
    }


    private static void goodsInfo(GoodsInfo goodsInfo, OrderGoodsInfo orderGoodsInfo) {
        if (orderGoodsInfo != null) {
            // TODO 各种set方法
        }
    }

    private static void goodsInfo(GoodsInfo goodsInfo, PurchRequisitionGoodsInfo purchRequisitionGoodsInfo) {
        if (purchRequisitionGoodsInfo != null) {
            // TODO 各种set方法
        }
    }
}
