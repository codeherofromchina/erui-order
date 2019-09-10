package com.erui.order.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午8:29
 */
public enum ProcessProgressEnum {
    SUBMIT("SUBMIT", "未执行", 1), EXECUTING("EXECUTING", "正常执行", 2),
    BUYING("BUYING", "已采购", 3), QUARANTINE("DONE", "已报检", 4), CHECKING("CHECKING", "已入库质检", 5),
    IN_STORAGE("IN_STORAGE", "已入库", 6), QUALITY_INSPECTION("QUALITY_INSPECTION", "已出库质检", 7),
    OUTSTORAGE("DELAYED_UNSHIPPED", "已出库", 8), SHIPED("SHIPED", "已发运", 9);

    public String code;
    public String name;
    public Integer order;

    ProcessProgressEnum(String code, String name, Integer order) {
        this.code = code;
        this.name = name;
        this.order = order;
    }

    public String getCode() {
        return code;
    }

    public Integer getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    public static ProcessProgressEnum fromCode(String code) {
        if (code != null) {
            for (ProcessProgressEnum statusEnum : ProcessProgressEnum.values()) {
                if (StringUtils.equals(statusEnum.getCode(), code)) {
                    return statusEnum;
                }
            }
        }
        return null;
    }

}
