package com.erui.order.common.enums;

/**
 * @Auther 王晓丹
 * @Date 2019/7/29 下午6:18
 */
public enum AttachmentTargetObjEnum {
    ORDER("ORDER", "订单"), PROJECT("PROJECT", "项目"), PURCH_REQUISITION("PURCH_REQUISITION", "采购申请"),
    PURCH_CONTRACT("PURCH_CONTRACT", "采购合同"), PURCH("PURCH", "采购"),INSPECT_APPLY("INSPECT_APPLY","报检"),
    DELIVER_CONSIGN("DELIVER_CONSIGN","xxxx"), ORDER_ACCOUNT("ORDER_ACCOUNT","xxxx"),
    DELIVER_DETAIL("DELIVER_DETAIL","xxxx"),
    INSPECT_REPORT("INSPECT_REPORT","xxxx"),
    LOGISTICS_DATA("LOGISTICS_DATA","xxxx"),
    LOGISTICS_DATA_INFO("LOGISTICS_DATA_INFO","xxxx"),
    DELIVER_NOTICE("DELIVER_NOTICE","xxxx"),
    ORDER_ACCOUNT_DELIVER("ORDER_ACCOUNT_DELIVER","xxxx"),
    INSTOCK("INSTOCK","xxxx"),
    PURCH_PAY_APPLICATION("PURCH_PAY_APPLICATION","xxxx");

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
