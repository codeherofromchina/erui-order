package com.erui.order.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午8:29
 */
public enum OrderTransportTypeEnum {
    OCEAN("Ocean", "海运"),
    AIR("Air", "空运"),
    MULTIMODAL("Multimodal", "多式联运"),
    ROAD("Road", "公路"),
    RAILWAY_CONTAINERS("Railway Containers", "铁路"),
    INTERNATIONAL_EXPRESS("International Express", "国际快递");

    private String code;
    private String name;

    OrderTransportTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }


    public String getName() {
        return name;
    }

    public static OrderTransportTypeEnum fromCode(String code) {
        if (code != null) {
            for (OrderTransportTypeEnum statusEnum : OrderTransportTypeEnum.values()) {
                if (StringUtils.equals(statusEnum.getCode(), code)) {
                    return statusEnum;
                }
            }
        }
        return null;
    }

}
