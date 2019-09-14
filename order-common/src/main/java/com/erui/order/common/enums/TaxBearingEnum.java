package com.erui.order.common.enums;

public enum TaxBearingEnum {
    OIL(1, "含税"), NON_OIL(2, "不含税");

    public short code;
    public String name;

    TaxBearingEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static TaxBearingEnum valueOf(Short code) {
        if (code != null) {
            for (TaxBearingEnum statusEnum : TaxBearingEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}