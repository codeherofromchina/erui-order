package com.erui.order.common.enums;

public enum OrderFinancingEnum {
    FINANCING(1, "融资"), NON_FINANCING(0, "不融资");

    private short code;
    private String name;

    OrderFinancingEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static OrderFinancingEnum valueOf(Short code) {
        if (code != null) {
            for (OrderFinancingEnum statusEnum : OrderFinancingEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}