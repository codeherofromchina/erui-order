package com.erui.order.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午8:29
 */
public enum SupplierTypeEnum {
    AGENCY("AGENCY", "代理商"),
    DISTRIBUTOR("DISTRIBUTOR", "经销商"),
    LOGISTICS_PROVIDER("LOGISTICS_PROVIDER", "物流商"),
    MANUFACTURER("MANUFACTURER", "制造商"),
    SERVICE_PROVIDER("SERVICE_PROVIDER", "服务商");

    private String code;
    private String name;

    SupplierTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static SupplierTypeEnum fromCode(String code) {
        if (code != null) {
            for (SupplierTypeEnum statusEnum : SupplierTypeEnum.values()) {
                if (StringUtils.equals(statusEnum.getCode(), code)) {
                    return statusEnum;
                }
            }
        }
        return null;
    }

}
