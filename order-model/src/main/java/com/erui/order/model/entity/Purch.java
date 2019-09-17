package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Purch {
    private Long id;

    private String purchNo;

    private Long purchContractId;

    private Long agentId;

    private String department;

    private Date signingDate;

    private Date arrivalDate;

    private Date purChgDate;

    private Long supplierId;

    private BigDecimal totalPrice;

    private String currencyBn;

    private String remarks;

    private Short purchStatus;

    private Boolean inspected;

    private String supplyArea;

    private BigDecimal goalCost;

    private BigDecimal saveAmount;

    private Short saveMode;

    private Short priceMode;

    private BigDecimal profitPercent;

    private String contractTag;

    private Boolean taxBearing;

    private BigDecimal exchangeRate;

    private Short payStatus;

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

    public String getPurchNo() {
        return purchNo;
    }

    public void setPurchNo(String purchNo) {
        this.purchNo = purchNo;
    }

    public Long getPurchContractId() {
        return purchContractId;
    }

    public void setPurchContractId(Long purchContractId) {
        this.purchContractId = purchContractId;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getPurChgDate() {
        return purChgDate;
    }

    public void setPurChgDate(Date purChgDate) {
        this.purChgDate = purChgDate;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Short getPurchStatus() {
        return purchStatus;
    }

    public void setPurchStatus(Short purchStatus) {
        this.purchStatus = purchStatus;
    }

    public Boolean getInspected() {
        return inspected;
    }

    public void setInspected(Boolean inspected) {
        this.inspected = inspected;
    }

    public String getSupplyArea() {
        return supplyArea;
    }

    public void setSupplyArea(String supplyArea) {
        this.supplyArea = supplyArea;
    }

    public BigDecimal getGoalCost() {
        return goalCost;
    }

    public void setGoalCost(BigDecimal goalCost) {
        this.goalCost = goalCost;
    }

    public BigDecimal getSaveAmount() {
        return saveAmount;
    }

    public void setSaveAmount(BigDecimal saveAmount) {
        this.saveAmount = saveAmount;
    }

    public Short getSaveMode() {
        return saveMode;
    }

    public void setSaveMode(Short saveMode) {
        this.saveMode = saveMode;
    }

    public Short getPriceMode() {
        return priceMode;
    }

    public void setPriceMode(Short priceMode) {
        this.priceMode = priceMode;
    }

    public BigDecimal getProfitPercent() {
        return profitPercent;
    }

    public void setProfitPercent(BigDecimal profitPercent) {
        this.profitPercent = profitPercent;
    }

    public String getContractTag() {
        return contractTag;
    }

    public void setContractTag(String contractTag) {
        this.contractTag = contractTag;
    }

    public Boolean getTaxBearing() {
        return taxBearing;
    }

    public void setTaxBearing(Boolean taxBearing) {
        this.taxBearing = taxBearing;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
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