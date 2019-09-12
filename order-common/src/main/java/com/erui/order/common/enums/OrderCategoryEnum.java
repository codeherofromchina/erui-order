package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * 订单类别枚举类
 * @Date 2019/7/29 下午3:23
 */
public enum OrderCategoryEnum {
    ONE(1, "预投"), TWO(2, "售后"), THREE(3, "试用"), FOUR(4, "现货（出库）"), FIVE(5, "订单"), SIX(6, "国内订单");

    private int value;
    private String name;

    OrderCategoryEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }


    public static OrderCategoryEnum valueOf(Integer code) {
        if (code != null) {
            for (OrderCategoryEnum statusEnum : OrderCategoryEnum.values()) {
                if (statusEnum.getValue() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}
