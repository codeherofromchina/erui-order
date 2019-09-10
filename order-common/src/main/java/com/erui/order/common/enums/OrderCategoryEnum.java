package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * 订单类别枚举类
 * @Date 2019/7/29 下午3:23
 */
public enum OrderCategoryEnum {
    ONE(1, "预投"), TWO(2, "售后"), THREE(3, "试用"), FOUR(4, "现货（出库）"), FIVE(5, "订单"), SIX(6, "国内订单");

    private int value;
    private String msg;

    OrderCategoryEnum(int value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getValue() {
        return value;
    }
}
