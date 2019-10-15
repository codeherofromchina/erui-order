package com.erui.order.common.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午12:01
 */
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderPaymentInfo {
    private Long id;
    private Short paymentType;
    private String paymentTypeName;
    private BigDecimal money;
    //@JsonFormat(pattern = "yyyy年MM月dd日 HH时mm分ss秒", timezone = "GMT+8")
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


    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
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
