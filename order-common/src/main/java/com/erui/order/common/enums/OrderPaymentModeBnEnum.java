package com.erui.order.common.enums;

public enum OrderPaymentModeBnEnum {
    CREDIT_LETTER(1, "信用证"),
    COLLECTION(2, "托收"),
    TELEGRAPHIC_TRANSFER(3, "电汇"),
    MAIL_TRANSFER(4, "信汇"),
    DRAFT(5, "票汇"),
    CASH(6, "现金");

    private short code;
    private String name;

    OrderPaymentModeBnEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static OrderPaymentModeBnEnum valueOf(Short code) {
        if (code != null) {
            for (OrderPaymentModeBnEnum statusEnum : OrderPaymentModeBnEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}