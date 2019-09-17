package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/9/10 下午10:45
 */
public enum PurchStatusEnum {
    SAVE(1, "未进行"), SUBMIT(2, "进行中"), DONE(3, "已完成");

    private short code;
    private String name;

    PurchStatusEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    /**
     * 通过code码获取状态信息
     *
     * @param code
     * @return
     */
    public static PurchStatusEnum valueOf(Short code) {
        if (code != null) {
            short code02 = code.shortValue(); // 拆箱一次
            for (PurchStatusEnum statusEnum : PurchStatusEnum.values()) {
                if (code02 == statusEnum.code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}

