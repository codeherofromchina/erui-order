package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PurchContract {
    private Long id;

    private String purchContractNo;

    private Short contractType;

    private Short contractStatus;

    private Date signingDate;

    private Long supplierId;

    private String supplierName;

    private String signingPlace;

    private Long agentId;

    private Short taxPoint;

    private String capitalizedPrice;

    private BigDecimal lowercasePrice;

    private String goodsRemarks;

    private String currencyBn;

    private String countryBn;

    private String regionBn;

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

    public String getPurchContractNo() {
        return purchContractNo;
    }

    public void setPurchContractNo(String purchContractNo) {
        this.purchContractNo = purchContractNo;
    }

    public Short getContractType() {
        return contractType;
    }

    public void setContractType(Short contractType) {
        this.contractType = contractType;
    }

    public Short getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Short contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSigningPlace() {
        return signingPlace;
    }

    public void setSigningPlace(String signingPlace) {
        this.signingPlace = signingPlace;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Short getTaxPoint() {
        return taxPoint;
    }

    public void setTaxPoint(Short taxPoint) {
        this.taxPoint = taxPoint;
    }

    public String getCapitalizedPrice() {
        return capitalizedPrice;
    }

    public void setCapitalizedPrice(String capitalizedPrice) {
        this.capitalizedPrice = capitalizedPrice;
    }

    public BigDecimal getLowercasePrice() {
        return lowercasePrice;
    }

    public void setLowercasePrice(BigDecimal lowercasePrice) {
        this.lowercasePrice = lowercasePrice;
    }

    public String getGoodsRemarks() {
        return goodsRemarks;
    }

    public void setGoodsRemarks(String goodsRemarks) {
        this.goodsRemarks = goodsRemarks;
    }

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }

    public String getCountryBn() {
        return countryBn;
    }

    public void setCountryBn(String countryBn) {
        this.countryBn = countryBn;
    }

    public String getRegionBn() {
        return regionBn;
    }

    public void setRegionBn(String regionBn) {
        this.regionBn = regionBn;
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