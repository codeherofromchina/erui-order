package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午6:42
 * 项目类型
 */
public enum ProjectTypeEnum {
    GENERAL_TRADE(1, "一般贸易"),
    IMPROVEMENT_TRADE(2, "加工贸易"),
    ENTREPOT_TRADE(3, "转口贸易");

    public short code;
    public String name;

    ProjectTypeEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public short getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static ProjectTypeEnum valueOf(Short code) {
        if (code != null) {
            for (ProjectTypeEnum statusEnum : ProjectTypeEnum.values()) {
                if (statusEnum.getCode() == code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }




}
