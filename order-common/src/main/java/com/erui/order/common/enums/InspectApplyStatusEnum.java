package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/9/10 下午10:45
 */
public enum InspectApplyStatusEnum {
    INIT(1, "未编辑"), SAVED(2, "已保存"), SUBMITED(3, "已提交"), QUALIFIED(4, "合格"), UNQUALIFIED(5, "不合格");

    private short code;
    private String name;

    InspectApplyStatusEnum(int code, String name) {
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
    public static InspectApplyStatusEnum valueOf(Short code) {
        if (code != null) {
            short code02 = code.shortValue(); // 拆箱一次
            for (InspectApplyStatusEnum statusEnum : InspectApplyStatusEnum.values()) {
                if (code02 == statusEnum.code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}

