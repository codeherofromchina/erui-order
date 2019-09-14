package com.erui.order.common.enums;

public enum OrderCustomerTypeEnum {
    OIL(1, "油气"), NON_OIL(0, "非油气");

    public short code;
    public String name;

    OrderCustomerTypeEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static OrderCustomerTypeEnum valueOf(Short code) {
        if (code != null) {
            for (OrderCustomerTypeEnum statusEnum : OrderCustomerTypeEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}