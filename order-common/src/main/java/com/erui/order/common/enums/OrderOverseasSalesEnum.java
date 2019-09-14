package com.erui.order.common.enums;

public enum OrderOverseasSalesEnum {
    ERUI_PURCHASE(1, "易瑞海外销（易瑞采购）"), LOCAL_PURCHASE(2, "易瑞海外销（当地采购）"), ERUI_SALE(3, "易瑞销");

    public short code;
    public String name;

    OrderOverseasSalesEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static OrderOverseasSalesEnum valueOf(Short code) {
        if (code != null) {
            for (OrderOverseasSalesEnum statusEnum : OrderOverseasSalesEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}