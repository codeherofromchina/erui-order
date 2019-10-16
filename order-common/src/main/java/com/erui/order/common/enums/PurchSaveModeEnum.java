package com.erui.order.common.enums;

/**
 * 采购单节约方式
 */
public enum PurchSaveModeEnum {
    ONE(1, "对比投标"), TWO(2, "对比项目交付"), THREE(3, "对比预算"), FOUR(4, "对比历史（含历史对比返点）") ;

    public short code;
    public String name;

    PurchSaveModeEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static PurchSaveModeEnum valueOf(Short code) {
        if (code != null) {
            for (PurchSaveModeEnum statusEnum : PurchSaveModeEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}