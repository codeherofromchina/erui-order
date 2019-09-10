package com.erui.order.common.enums;

public enum OrderStatusEnum {
    INIT(1, "待确认"), UNEXECUTED(2, "未执行"), EXECUTING(3, "执行中"), DONE(4, "完成") ;

    public short code;
    public String name;

    OrderStatusEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static OrderStatusEnum valueOf(Short code) {
        if (code != null) {
            for (OrderStatusEnum statusEnum : OrderStatusEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}