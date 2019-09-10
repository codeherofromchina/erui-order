package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/9/9 上午12:02
 */
public enum PurchContractSignatoriesTypeEnum {
    SELLER(1, "出卖人"), BUYER(2, "买受人");

    public short code;
    public String name;

    PurchContractSignatoriesTypeEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static PurchContractSignatoriesTypeEnum valueOf(Short code) {
        if (code != null) {
            for (PurchContractSignatoriesTypeEnum statusEnum : PurchContractSignatoriesTypeEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}
