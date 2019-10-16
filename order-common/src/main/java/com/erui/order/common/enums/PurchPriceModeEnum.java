package com.erui.order.common.enums;

/**
 * 采购单定价方式
 */
public enum PurchPriceModeEnum {
    ONE(1, "招标"), TWO(2, "招标转竞争性谈判"), THREE(3, "小额采购谈判"), FOUR(4, "询比价"), FIVE(5, "执行集中谈判（框架协议）价格"), SIX(6, "参考历史价格");


    public short code;
    public String name;

    PurchPriceModeEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static PurchPriceModeEnum valueOf(Short code) {
        if (code != null) {
            for (PurchPriceModeEnum statusEnum : PurchPriceModeEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}