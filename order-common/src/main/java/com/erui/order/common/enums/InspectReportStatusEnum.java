package com.erui.order.common.enums;

/**
 * 质检报告状态 1:未编辑 2:进行中可办理 3:质检完成 4:进行中不可办理
 * @Auther 王晓丹
 * @Date 2019/9/10 下午10:45
 */
public enum InspectReportStatusEnum {
    INIT(1, "未编辑"), SAVED(2, "质检中"), SUBMITED(3, "质检完成"), DONE(4, "进行中");

    private short code;
    private String name;

    InspectReportStatusEnum(int code, String name) {
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
    public static InspectReportStatusEnum valueOf(Short code) {
        if (code != null) {
            short code02 = code.shortValue(); // 拆箱一次
            for (InspectReportStatusEnum statusEnum : InspectReportStatusEnum.values()) {
                if (code02 == statusEnum.code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}

