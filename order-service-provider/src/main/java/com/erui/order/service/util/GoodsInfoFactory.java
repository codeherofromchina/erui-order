package com.erui.order.service.util;

import com.erui.order.common.pojo.GoodsInfo;
import com.erui.order.common.pojo.OrderGoodsInfo;
import com.erui.order.common.pojo.PurchRequisitionGoodsInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午6:05
 */
public class GoodsInfoFactory {

    public static List<GoodsInfo> goodsInfo(List<OrderGoodsInfo> orderGoodsInfoList) {
        List<GoodsInfo> goodsInfoList = new ArrayList<>();
        for (OrderGoodsInfo orderGoodsInfo : orderGoodsInfoList) {
            goodsInfoList.add(goodsInfo(orderGoodsInfo));
        }
        return goodsInfoList;
    }

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
            goodsInfo.setOrderGoodsId(orderGoodsInfo.getId());
            goodsInfo.setSku(orderGoodsInfo.getSku());
            goodsInfo.setNameEn(orderGoodsInfo.getNameEn());
            goodsInfo.setNameZh(orderGoodsInfo.getNameZh());
            goodsInfo.setContractGoodsNum(orderGoodsInfo.getContractGoodsNum());
            goodsInfo.setUnit(orderGoodsInfo.getUnit());
            goodsInfo.setUnitName(orderGoodsInfo.getUnitName());
            goodsInfo.setBrand(orderGoodsInfo.getBrand());
        }
    }

    private static void goodsInfo(GoodsInfo goodsInfo, PurchRequisitionGoodsInfo purchRequisitionGoodsInfo) {
        if (purchRequisitionGoodsInfo != null) {
            goodsInfo.setRequirePurchaseDate(purchRequisitionGoodsInfo.getRequirePurchaseDate());
            goodsInfo.setTechRequire(purchRequisitionGoodsInfo.getTechRequire());
            goodsInfo.setCheckType(purchRequisitionGoodsInfo.getCheckType());
            goodsInfo.setCheckMethod(purchRequisitionGoodsInfo.getCheckMethod());
            goodsInfo.setCertificate(purchRequisitionGoodsInfo.getCertificate());
            goodsInfo.setTechAudit(purchRequisitionGoodsInfo.getTechAudit());
        }
    }


}
