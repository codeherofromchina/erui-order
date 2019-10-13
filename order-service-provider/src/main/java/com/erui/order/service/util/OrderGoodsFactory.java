package com.erui.order.service.util;

import com.erui.order.common.pojo.OrderGoodsInfo;
import com.erui.order.model.entity.OrderGoods;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午4:01
 */
public class OrderGoodsFactory {
    public static List<OrderGoodsInfo> orderGoodsInfos(List<OrderGoods> orderGoodsList) {

        if (orderGoodsList != null) {
            return orderGoodsList.stream()
                    .map(orderPayment -> orderGoodsInfo(orderPayment))
                    .collect(Collectors.toList());
        }
        return null;
    }


    public static OrderGoodsInfo orderGoodsInfo(OrderGoods orderGoods) {
        if (orderGoods == null) {
            return null;
        }
        OrderGoodsInfo orderGoodsInfo = new OrderGoodsInfo();
        orderGoodsInfo.setId(orderGoods.getId());
        orderGoodsInfo.setSku(orderGoods.getSku());
        orderGoodsInfo.setMeteType(orderGoods.getMeteType());
        orderGoodsInfo.setMeteTypeName(orderGoods.getMeteTypeName());
        orderGoodsInfo.setTplNo(orderGoods.getTplNo());
        orderGoodsInfo.setTplName(orderGoods.getTplName());
        orderGoodsInfo.setDepartmentId(orderGoods.getDepartmentId());
        orderGoodsInfo.setNameEn(orderGoods.getNameEn());
        orderGoodsInfo.setNameZh(orderGoods.getNameZh());
        orderGoodsInfo.setContractGoodsNum(orderGoods.getContractGoodsNum());
        orderGoodsInfo.setPreOutstockedNum(orderGoods.getPreOutstockedNum().intValue());
        orderGoodsInfo.setUnit(orderGoods.getUnit());
        orderGoodsInfo.setPrice(orderGoods.getPrice());
        orderGoodsInfo.setEruiPrice(orderGoods.getEruiPrice());
        orderGoodsInfo.setTotalPrice(orderGoods.getTotalPrice());
        orderGoodsInfo.setBrand(orderGoods.getBrand());
        orderGoodsInfo.setAttrs(orderGoods.getAttrs());

        return orderGoodsInfo;
    }

    public static OrderGoods orderGoods(Long orderId, OrderGoodsInfo orderGoodsInfo) {
        OrderGoods orderGoods = new OrderGoods();
        orderGoods.setId(orderGoodsInfo.getId());
        orderGoods.setOrderId(orderId);
        orderGoods.setSku(orderGoodsInfo.getSku());
        orderGoods.setMeteType(orderGoodsInfo.getMeteType());
        orderGoods.setMeteTypeName(orderGoodsInfo.getMeteTypeName());
        orderGoods.setTplNo(orderGoodsInfo.getTplNo());
        orderGoods.setTplName(orderGoodsInfo.getTplName());
        orderGoods.setDepartmentId(orderGoodsInfo.getDepartmentId());
        orderGoods.setNameEn(orderGoodsInfo.getNameEn());
        orderGoods.setNameZh(orderGoodsInfo.getNameZh());
        orderGoods.setContractGoodsNum(orderGoodsInfo.getContractGoodsNum());
        orderGoods.setUnit(orderGoodsInfo.getUnit());
        orderGoods.setPrice(orderGoodsInfo.getPrice());
        orderGoods.setEruiPrice(orderGoodsInfo.getEruiPrice());
        orderGoods.setTotalPrice(orderGoodsInfo.getTotalPrice());
        orderGoods.setBrand(orderGoodsInfo.getBrand());
        orderGoods.setAttrs(orderGoodsInfo.getAttrs());

        return orderGoods;
    }
}
