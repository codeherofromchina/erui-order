package com.erui.order.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午10:08
 */
public enum CompanyEnum {
    CHINA("Erui International Electronic Commerce Co., Ltd.", "易瑞国际电子商务有限公司"),
    USA("Erui International USA, LLC", "易瑞国际（美国）有限公司"),
    CANADA("Erui International (Canada) Co., Ltd.", "易瑞国际（加拿大）有限公司"),
    HK("Erui Intemational Electronic Commerce (HK) Co., Lirnited", "易瑞國際電子商務（香港）有限公司"),
    INDONESIA("PT ERUI INTERNATIONAL INDONESIA", "易瑞国际印尼有限公司"),
    PERU("Erui Intemational Electronic Commerce (Peru) S.A.C", "易瑞国际电子商务（秘鲁）有限公司"),
    COLUMBIA("ERUI INTERNATIONAL SAS", "易瑞国际（哥伦比亚）子公司"),
    MIDDLE_EAST("Erui International Middle East Co., Ltd.", "易瑞国际中东有限责任公司");

    public String code;
    public String name;

    CompanyEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static CompanyEnum fromCode(String code) {
        if (code != null) {
            for (CompanyEnum statusEnum : CompanyEnum.values()) {
                if (StringUtils.equals(statusEnum.getCode(), code)) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}
