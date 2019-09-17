package com.erui.order.common.pojo;

import java.math.BigDecimal;

/**
 * 采购合同的付款记录内容
 * @Auther 王晓丹
 * @Date 2019/9/17 下午1:33
 */
public class PurchPaymentInfo {
    private Long id;
    private Short paymentType;
    private Short days;
    private BigDecimal money;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Short paymentType) {
        this.paymentType = paymentType;
    }

    public Short getDays() {
        return days;
    }

    public void setDays(Short days) {
        this.days = days;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
