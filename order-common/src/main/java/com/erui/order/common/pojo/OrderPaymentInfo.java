package com.erui.order.common.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午12:01
 */
public class OrderPaymentInfo {
    private Long id;
    private Short paymentType;
    private BigDecimal money;
    private Date receiptDate;
    private Short receiptDays;

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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Short getReceiptDays() {
        return receiptDays;
    }

    public void setReceiptDays(Short receiptDays) {
        this.receiptDays = receiptDays;
    }
}
