package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PurchContractGoods {
    private Long id;

    private Long purchContractId;

    private Long purchRequisitionGoodsId;

    private String purchContractBrand;

    private Integer purchaseNum;

    private BigDecimal nonTaxPrice;

    private BigDecimal purchasePrice;

    private BigDecimal purchaseTotalPrice;

    private Integer prePurchasedNum;

    private Integer purchasedNum;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

    private Boolean deleteFlag;

    private Date deleteTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPurchContractId() {
        return purchContractId;
    }

    public void setPurchContractId(Long purchContractId) {
        this.purchContractId = purchContractId;
    }

    public Long getPurchRequisitionGoodsId() {
        return purchRequisitionGoodsId;
    }

    public void setPurchRequisitionGoodsId(Long purchRequisitionGoodsId) {
        this.purchRequisitionGoodsId = purchRequisitionGoodsId;
    }

    public String getPurchContractBrand() {
        return purchContractBrand;
    }

    public void setPurchContractBrand(String purchContractBrand) {
        this.purchContractBrand = purchContractBrand;
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

    public BigDecimal getPurchaseTotalPrice() {
        return purchaseTotalPrice;
    }

    public void setPurchaseTotalPrice(BigDecimal purchaseTotalPrice) {
        this.purchaseTotalPrice = purchaseTotalPrice;
    }

    public Integer getPrePurchasedNum() {
        return prePurchasedNum;
    }

    public void setPrePurchasedNum(Integer prePurchasedNum) {
        this.prePurchasedNum = prePurchasedNum;
    }

    public Integer getPurchasedNum() {
        return purchasedNum;
    }

    public void setPurchasedNum(Integer purchasedNum) {
        this.purchasedNum = purchasedNum;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}