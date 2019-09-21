package com.erui.order.common.pojo;

import java.math.BigDecimal;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:28
 */
public class DeliverConsignPaymentInfo {
    // 主键
    private Long id;
    private Short paymentType;
    private BigDecimal money;
    private Short receiptTime;

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

    public Short getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Short receiptTime) {
        this.receiptTime = receiptTime;
    }
}

