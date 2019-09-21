package com.erui.order.common.pojo;

import java.math.BigDecimal;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:28
 */
public class PurchGoodsInfo {
    // 主键
    private Long id;
    // 采购合同商品ID
    private Long purchContractGoodsId;
    // 订单商品ID
    private Long orderGoodsId;
    // 采购数量
    private Integer purchaseNum;
    // 采购单价
    private BigDecimal purchasePrice;
    // 不含税采购单价
    private BigDecimal nonTaxPrice;
    // 采购备注
    private String purchaseRemark;
    // 预报检数量
    private Integer preInspectNum;

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

    public BigDecimal getNonTaxPrice() {
        return nonTaxPrice;
    }

    public void setNonTaxPrice(BigDecimal nonTaxPrice) {
        this.nonTaxPrice = nonTaxPrice;
    }

    public Integer getPreInspectNum() {
        return preInspectNum;
    }

    public void setPreInspectNum(Integer preInspectNum) {
        this.preInspectNum = preInspectNum;
    }
}

