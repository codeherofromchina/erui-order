package com.erui.order.common.pojo;

import java.math.BigDecimal;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:28
 */
public class PurchGoodsInfo {
    // 主键
    private Long id;
    private Long purchContractGoodsId;

    private Long orderGoodsId;

    private Integer purchaseNum;

    private BigDecimal purchasePrice;

    private String purchaseRemark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPurchContractGoodsId() {
        return purchContractGoodsId;
    }

    public void setPurchContractGoodsId(Long purchContractGoodsId) {
        this.purchContractGoodsId = purchContractGoodsId;
    }

    public Long getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Long orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseRemark() {
        return purchaseRemark;
    }

    public void setPurchaseRemark(String purchaseRemark) {
        this.purchaseRemark = purchaseRemark;
    }
}

