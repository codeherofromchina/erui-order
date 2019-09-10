package com.erui.order.model.entity;

import java.util.Date;

public class PurchContractSimple {
    private Long id;

    private Long purchContractId;

    private String productRequirement;

    private String warrantyPeriod;

    private Date shippingDate;

    private String designatedLocation;

    private String costBurden;

    private String inspectionAt;

    private String withinDays;

    private String methodAndTime;

    private String agreementName;

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

    public String getProductRequirement() {
        return productRequirement;
    }

    public void setProductRequirement(String productRequirement) {
        this.productRequirement = productRequirement;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getDesignatedLocation() {
        return designatedLocation;
    }

    public void setDesignatedLocation(String designatedLocation) {
        this.designatedLocation = designatedLocation;
    }

    public String getCostBurden() {
        return costBurden;
    }

    public void setCostBurden(String costBurden) {
        this.costBurden = costBurden;
    }

    public String getInspectionAt() {
        return inspectionAt;
    }

    public void setInspectionAt(String inspectionAt) {
        this.inspectionAt = inspectionAt;
    }

    public String getWithinDays() {
        return withinDays;
    }

    public void setWithinDays(String withinDays) {
        this.withinDays = withinDays;
    }

    public String getMethodAndTime() {
        return methodAndTime;
    }

    public void setMethodAndTime(String methodAndTime) {
        this.methodAndTime = methodAndTime;
    }

    public String getAgreementName() {
        return agreementName;
    }

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
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