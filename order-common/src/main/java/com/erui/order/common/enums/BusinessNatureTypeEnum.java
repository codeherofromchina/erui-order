package com.erui.order.common.enums;

public enum BusinessNatureTypeEnum {
    ONE(1, "一般贸易"), TWO(2, "加工贸易"), THREE(3, "转口贸易"), FOUR(4, "展会物资") ,
    FIVE(5, "免费赠送"), SIX(6, "对外承包工程"), SEVEN(7, "其他");

    public short code;
    public String name;

    BusinessNatureTypeEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static BusinessNatureTypeEnum valueOf(Short code) {
        if (code != null) {
            for (BusinessNatureTypeEnum statusEnum : BusinessNatureTypeEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}