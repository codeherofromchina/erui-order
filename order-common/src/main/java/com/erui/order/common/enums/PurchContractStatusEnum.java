package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午9:12
 * 采购合同状态
 */
public enum PurchContractStatusEnum {
    READY(1, "未执行/保存"), BEING(2, "执行中/提交"), EXECUTED(3, "已执行"), DONE(4, "已完成"), DELETE(5, "已删除");

    private short code;
    private String name;

    PurchContractStatusEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    /**
     * 通过code码获取采购状态信息
     *
     * @param code
     * @return
     */
    public static PurchContractStatusEnum valueOf(Short code) {
        if (code != null) {
            short code02 = code.shortValue(); // 拆箱一次
            for (PurchContractStatusEnum statusEnum : PurchContractStatusEnum.values()) {
                if (code02 == statusEnum.code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}
