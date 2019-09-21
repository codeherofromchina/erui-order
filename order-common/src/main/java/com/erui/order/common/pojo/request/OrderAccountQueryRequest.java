package com.erui.order.common.pojo.request;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class OrderAccountQueryRequest {
    private Long orderId;
    // 1 ： 收款  2：发货
    private Short accountType;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Short getAccountType() {
        return accountType;
    }

    public void setAccountType(Short accountType) {
        this.accountType = accountType;
    }
}

