package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午9:12
 * 采购合同状态
 */
public enum PurchContractTypeEnum {
    SIMPLE(1, "简易合同"), STANDARD(2, "标准合同"), NON_STANDARD(3, "非标准合同");

    private short code;
    private String name;

    PurchContractTypeEnum(int code, String name) {
        this.code = (short) code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    /**
     * 通过code码获取采购状态信息
     *
     * @param code
     * @return
     */
    public static PurchContractTypeEnum fromCode(Short code) {
        if (code != null) {
            short code02 = code.shortValue(); // 拆箱一次
            for (PurchContractTypeEnum statusEnum : PurchContractTypeEnum.values()) {
                if (code02 == statusEnum.code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}
