package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/9/10 下午10:45
 */
public enum DeliverDetailStatusEnum {
    INIT(1, "未编辑"),
    SAVED_OUTSTOCK(2, "出库保存"),
    SUBMITED_OUTSTOCK(3, "出库提交"),
    SAVED_OUT_INSPECT(4, "出库质检保存"),
    SUBMITED_OUT_INSPECT(5, "质检完成"),
    PROCESS_LOGI_PERSON(6, "已出库"),
    PROCESS_LOGI(7, "完善物流状态中"),
    DONE_PROJECT(8, "项目完结");

    private short code;
    private String name;

    DeliverDetailStatusEnum(int code, String name) {
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
    public static DeliverDetailStatusEnum valueOf(Short code) {
        if (code != null) {
            short code02 = code.shortValue(); // 拆箱一次
            for (DeliverDetailStatusEnum statusEnum : DeliverDetailStatusEnum.values()) {
                if (code02 == statusEnum.code) {
                    return statusEnum;
                }
            }
        }
        return null;
    }
}

