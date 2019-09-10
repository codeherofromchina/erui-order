package com.erui.order.common.enums;

import org.apache.commons.lang3.StringUtils;

public enum ProjectStatusEnum {
    INIT("SUBMIT", "未执行", 1),
    EXECUTING("EXECUTING", "正常执行", 2), DONE("DONE", "正常完成", 3), DELAYED_EXECUTION("DELAYED_EXECUTION", "延期执行", 4),
    DELAYED_COMPLETE("DELAYED_COMPLETE", "延期完成", 5), UNSHIPPED("UNSHIPPED", "正常待发运", 6),
    DELAYED_UNSHIPPED("DELAYED_UNSHIPPED", "延期待发运", 7), PAUSE("PAUSE", "项目暂停", 8),
    CANCEL("CANCEL", "项目取消", 9), ORDERCANCEL("ORDERCANCEL", "订单取消", 10);
    private String code;
    private String name;
    private Integer num;

    ProjectStatusEnum(String code, String name, Integer num) {
        this.code = code;
        this.name = name;
        this.num = num;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    public static ProjectStatusEnum fromCode(String code) {
        if (StringUtils.isNotBlank(code)) {
            for (ProjectStatusEnum statusEnum : ProjectStatusEnum.values()) {
                if (statusEnum.getCode().equals(code)) {
                    return statusEnum;

                }
            }
        }
        return null;
    }
}