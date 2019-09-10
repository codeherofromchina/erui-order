package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/7/29 下午6:18
 */
public enum AttachmentTargetObjEnum {
    ORDER("ORDER", "订单"), PROJECT("PROJECT", "项目"), PURCH_REQUISITION("PURCH_REQUISITION", "采购申请"),
    PURCH_CONTRACT("PURCH_CONTRACT", "采购合同");

    private String code;
    private String msg;

    AttachmentTargetObjEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
