package com.erui.order.common.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单收款发货信息记录
 *
 * @Auther 王晓丹
 * @Date 2019/10/8 下午3:10
 */
public class OrderAccountInfo {
    private Long id;
    // 订单ID
    private Long orderId;
    //1:收款 2：付款
    private Short accountType;
    //描述
    private String accDesc;
    //收款金额
    private BigDecimal money;
    //其他扣款金额
    private BigDecimal discount;
    //回款时间
    private Date paymentDate;
    // 发货金额
    private BigDecimal goodsPrice;
    //发货时间
    private Date deliverDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getAccDesc() {
        return accDesc;
    }

    public void setAccDesc(String accDesc) {
        this.accDesc = accDesc;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Date getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(Date deliverDate) {
        this.deliverDate = deliverDate;
    }


}
