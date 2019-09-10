package com.erui.order.model.entity;

import java.util.Date;

public class PurchRequisition {
    private Long id;

    private Long projectId;

    private Long pmUid;

    private Long department;

    private Date submitDate;

    private Short tradeMethod;

    private String transModeBn;

    private Short factorySend;

    private String deliveryPlace;

    private String requirements;

    private String remarks;

    private Short purchRequisitionStatus;

    private Short purchStatus;

    private Long purchaseUid;

    private Long singlePersonId;

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

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getPmUid() {
        return pmUid;
    }

    public void setPmUid(Long pmUid) {
        this.pmUid = pmUid;
    }

    public Long getDepartment() {
        return department;
    }

    public void setDepartment(Long department) {
        this.department = department;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Short getTradeMethod() {
        return tradeMethod;
    }

    public void setTradeMethod(Short tradeMethod) {
        this.tradeMethod = tradeMethod;
    }

    public String getTransModeBn() {
        return transModeBn;
    }

    public void setTransModeBn(String transModeBn) {
        this.transModeBn = transModeBn;
    }

    public Short getFactorySend() {
        return factorySend;
    }

    public void setFactorySend(Short factorySend) {
        this.factorySend = factorySend;
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Short getPurchRequisitionStatus() {
        return purchRequisitionStatus;
    }

    public void setPurchRequisitionStatus(Short purchRequisitionStatus) {
        this.purchRequisitionStatus = purchRequisitionStatus;
    }

    public Short getPurchStatus() {
        return purchStatus;
    }

    public void setPurchStatus(Short purchStatus) {
        this.purchStatus = purchStatus;
    }

    public Long getPurchaseUid() {
        return purchaseUid;
    }

    public void setPurchaseUid(Long purchaseUid) {
        this.purchaseUid = purchaseUid;
    }

    public Long getSinglePersonId() {
        return singlePersonId;
    }

    public void setSinglePersonId(Long singlePersonId) {
        this.singlePersonId = singlePersonId;
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