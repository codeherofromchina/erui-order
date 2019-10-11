package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Project {
    private Long id;

    private Long orderId;

    private String projectNo;

    private String projectName;

    private Date startDate;

    private String deliveryDate;

    private BigDecimal profit;

    private BigDecimal profitPercent;

    private String projectStatus;

    private Short purchReqCreate;

    private Boolean purchDone;

    private Date exeChgDate;

    private Date requirePurchaseDate;

    private Long qualityUid;

    private Long businessUid;

    private Long sendDeptId;

    private String remarks;

    private BigDecimal totalPriceUsd;

    private String processProgress;

    private Boolean deliverConsignHas;

    private String qualityInspectType;

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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public BigDecimal getProfitPercent() {
        return profitPercent;
    }

    public void setProfitPercent(BigDecimal profitPercent) {
        this.profitPercent = profitPercent;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public Short getPurchReqCreate() {
        return purchReqCreate;
    }

    public void setPurchReqCreate(Short purchReqCreate) {
        this.purchReqCreate = purchReqCreate;
    }

    public Boolean getPurchDone() {
        return purchDone;
    }

    public void setPurchDone(Boolean purchDone) {
        this.purchDone = purchDone;
    }

    public Date getExeChgDate() {
        return exeChgDate;
    }

    public void setExeChgDate(Date exeChgDate) {
        this.exeChgDate = exeChgDate;
    }

    public Date getRequirePurchaseDate() {
        return requirePurchaseDate;
    }

    public void setRequirePurchaseDate(Date requirePurchaseDate) {
        this.requirePurchaseDate = requirePurchaseDate;
    }

    public Long getQualityUid() {
        return qualityUid;
    }

    public void setQualityUid(Long qualityUid) {
        this.qualityUid = qualityUid;
    }

    public Long getBusinessUid() {
        return businessUid;
    }

    public void setBusinessUid(Long businessUid) {
        this.businessUid = businessUid;
    }

    public Long getSendDeptId() {
        return sendDeptId;
    }

    public void setSendDeptId(Long sendDeptId) {
        this.sendDeptId = sendDeptId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getTotalPriceUsd() {
        return totalPriceUsd;
    }

    public void setTotalPriceUsd(BigDecimal totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
    }

    public String getProcessProgress() {
        return processProgress;
    }

    public void setProcessProgress(String processProgress) {
        this.processProgress = processProgress;
    }

    public Boolean getDeliverConsignHas() {
        return deliverConsignHas;
    }

    public void setDeliverConsignHas(Boolean deliverConsignHas) {
        this.deliverConsignHas = deliverConsignHas;
    }

    public String getQualityInspectType() {
        return qualityInspectType;
    }

    public void setQualityInspectType(String qualityInspectType) {
        this.qualityInspectType = qualityInspectType;
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