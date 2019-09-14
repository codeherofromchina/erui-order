package com.erui.order.common.enums;

public enum OrderGrantTypeEnum {
    CITIC(1, "中信保"), KERUI(2, "集团授信"), NONE(3, "无");

    public short code;
    public String name;

    OrderGrantTypeEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static OrderGrantTypeEnum valueOf(Short code) {
        if (code != null) {
            for (OrderGrantTypeEnum statusEnum : OrderGrantTypeEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}