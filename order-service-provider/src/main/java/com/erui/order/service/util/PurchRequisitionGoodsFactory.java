package com.erui.order.service.util;

import com.erui.order.common.pojo.PurchRequisitionGoodsInfo;
import com.erui.order.model.entity.PurchRequisitionGoods;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午6:21
 */
public class PurchRequisitionGoodsFactory {
    public static List<PurchRequisitionGoodsInfo> purchRequisitionGoodsInfos(List<PurchRequisitionGoods> purchRequisitionGoodsList) {
        if (purchRequisitionGoodsList == null) {
            return null;
        }
        List<PurchRequisitionGoodsInfo> list = new ArrayList<>();
        for (PurchRequisitionGoods purchRequisitionGoods : purchRequisitionGoodsList) {
            list.add(purchRequisitionGoodsInfo(purchRequisitionGoods));
        }
        return list;
    }

    public static PurchRequisitionGoodsInfo purchRequisitionGoodsInfo(PurchRequisitionGoods purchRequisitionGoods) {
        if (purchRequisitionGoods == null) {
            return null;
        }
        PurchRequisitionGoodsInfo goodsInfo = new PurchRequisitionGoodsInfo();
        goodsInfo.setId(purchRequisitionGoods.getId());
        goodsInfo.setProjectNo(purchRequisitionGoods.getProjectNo());
        goodsInfo.setOrderGoodsId(purchRequisitionGoods.getOrderGoodsId());
        goodsInfo.setRequirePurchaseDate(purchRequisitionGoods.getRequirePurchaseDate());
        goodsInfo.setTechRequire(purchRequisitionGoods.getTechRequire());
        goodsInfo.setCheckType(purchRequisitionGoods.getCheckType());
        goodsInfo.setCheckMethod(purchRequisitionGoods.getCheckMethod());
        goodsInfo.setCertificate(purchRequisitionGoods.getCertificate());
        goodsInfo.setTechAudit(purchRequisitionGoods.getTechAudit());

        return goodsInfo;
    }

    public static PurchRequisitionGoods purchRequisitionGoods(PurchRequisitionGoodsInfo purchRequisitionGoodsInfo) {
        if (purchRequisitionGoodsInfo == null) {
            return null;
        }

        PurchRequisitionGoods purchRequisitionGoods = new PurchRequisitionGoods();
        purchRequisitionGoods.setId(purchRequisitionGoodsInfo.getId());
        purchRequisitionGoods.setOrderGoodsId(purchRequisitionGoodsInfo.getOrderGoodsId());
        purchRequisitionGoods.setRequirePurchaseDate(purchRequisitionGoodsInfo.getRequirePurchaseDate());
        purchRequisitionGoods.setTechRequire(purchRequisitionGoodsInfo.getTechRequire());
        purchRequisitionGoods.setCheckType(purchRequisitionGoodsInfo.getCheckType());
        purchRequisitionGoods.setCheckMethod(purchRequisitionGoodsInfo.getCheckMethod());
        purchRequisitionGoods.setCertificate(purchRequisitionGoodsInfo.getCertificate());
        purchRequisitionGoods.setTechAudit(purchRequisitionGoodsInfo.getTechAudit());

        return purchRequisitionGoods;
    }
}
