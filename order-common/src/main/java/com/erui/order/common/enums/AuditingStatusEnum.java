package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * 审核状态枚举类型
 * 1:待审核 2：审核中 3：驳回 4：通过
 * @Date 2019/7/29 上午10:40
 */
public enum AuditingStatusEnum {
    WAIT(1, "待审核"), PROCESSING(2, "审核中"), REJECT(3, "驳回"), THROUGH(4, "通过");

    private short code;
    private String name;

    AuditingStatusEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }


    public static AuditingStatusEnum valueOf(Short code) {
        if (code != null) {
            for (AuditingStatusEnum statusEnum : AuditingStatusEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}
