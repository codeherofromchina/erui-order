package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/10/8 下午3:46
 */
public enum OrderAccountTypeEnum {
    RECEIVE((short) 1, "收款"), SEND((short) 2, "发货");


    private Short value;
    private String name;

    OrderAccountTypeEnum(Short value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Short getValue() {
        return value;
    }
}
