package com.erui.order.common.enums;

public enum OrderPaymentTypeEnum {
    ONE(1, "预收货款"),
    FOUR(4, "发货后"),
    FIVE(5, "货到后"),
    SIX(6, "提单日后"),
    SEVEN(7, "交货后"),
    EIGHT(8, "验收后"),
    NINE(9, "工厂交货后"),
    TEN(10, "装船后"),
    ELEVEN(11, "到港后");

    public short code;
    public String name;

    OrderPaymentTypeEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static OrderPaymentTypeEnum valueOf(Short code) {
        if (code != null) {
            for (OrderPaymentTypeEnum statusEnum : OrderPaymentTypeEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}