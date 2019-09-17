package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午8:14
 * 收款状态 1:未付款 2:部分付款 3:收款完成
 */
public enum PurchPayStatusEnum {
    UNPAID(1, "未付款"), PARTIAL_COLLECTION(2, "部分付款"), PAYMENT_COMPLETION(3, "付款完成");

    public short code;
    public String name;

    PurchPayStatusEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static PurchPayStatusEnum valueOf(Short code) {
        if (code != null) {
            for (PurchPayStatusEnum statusEnum : PurchPayStatusEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}
