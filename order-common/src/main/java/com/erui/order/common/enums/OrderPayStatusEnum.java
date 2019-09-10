package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午8:14
 * 收款状态 1:未付款 2:部分付款 3:收款完成
 */
public enum OrderPayStatusEnum {

    UNPAID(1, "未收款"), PARTIAL_COLLECTION(2, "部分收款"), PAYMENT_COMPLETION(3, "收款完成");

    public short code;
    public String name;

    OrderPayStatusEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static OrderPayStatusEnum valueOf(Short code) {
        if (code != null) {
            for (OrderPayStatusEnum statusEnum : OrderPayStatusEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}
