package com.erui.order.common.pojo;

import java.math.BigDecimal;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:28
 */
public class PurchContractGoodsInfo {
    private Long id;
    // '商品ID'
    private Long orderGoodsId;
    // 采购申请商品
    private Long purchRequisitionGoodsId;
    // '本次采购数量'
    private Integer purchaseNum;
    // '不含税单价'
    private BigDecimal nonTaxPrice;
    // '采购单价'
    private BigDecimal purchasePrice;
    // '品牌'
    private String brand;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderGoodsId() {
        return orderGoodsId;
    }

    public Long getPurchRequisitionGoodsId() {
        return purchRequisitionGoodsId;
    }

    public void setPurchRequisitionGoodsId(Long purchRequisitionGoodsId) {
        this.purchRequisitionGoodsId = purchRequisitionGoodsId;
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


    public BigDecimal getNonTaxPrice() {
        return nonTaxPrice;
    }

    public void setNonTaxPrice(BigDecimal nonTaxPrice) {
        this.nonTaxPrice = nonTaxPrice;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
