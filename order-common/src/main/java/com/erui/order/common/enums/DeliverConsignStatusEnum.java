package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/9/10 下午10:45
 */
public enum DeliverConsignStatusEnum {
    INIT(1, "未编辑"), SAVED(2, "已保存"), SUBMITED(3, "已提交"), DONE(4, "上传货物签收单");

    private short code;
    private String name;

    DeliverConsignStatusEnum(int code, String name) {
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
    public static DeliverConsignStatusEnum valueOf(Short code) {
        if (code != null) {
            short code02 = code.shortValue(); // 拆箱一次
            for (DeliverConsignStatusEnum statusEnum : DeliverConsignStatusEnum.values()) {
                if (code02 == statusEnum.code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}

