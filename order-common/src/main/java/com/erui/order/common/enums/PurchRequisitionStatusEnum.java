package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午5:11
 */
public enum PurchRequisitionStatusEnum {
    SAVE(1, "已保存"), SUBMIT(2, "已提交"), transfer(3, "已转交经办人");

    public short code;
    public String name;

    PurchRequisitionStatusEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static PurchRequisitionStatusEnum valueOf(Short code) {
        if (code != null) {
            for (PurchRequisitionStatusEnum statusEnum : PurchRequisitionStatusEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }

}
