package com.erui.order.model.entity;

import java.util.Date;

public class Instock {
    private Long id;

    private Long inspectReportId;

    private Long uid;

    private Date instockDate;

    private String remarks;

    private Short instockStatus;

    private String inspectApplyNo;

    private String contractNo;

    private String projectNo;

    private String purchNo;

    private String supplierName;

    private Boolean enterEruiWarehouse;

    private Long submenuId;

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

    public Long getInspectReportId() {
        return inspectReportId;
    }

    public void setInspectReportId(Long inspectReportId) {
        this.inspectReportId = inspectReportId;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Date getInstockDate() {
        return instockDate;
    }

    public void setInstockDate(Date instockDate) {
        this.instockDate = instockDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Short getInstockStatus() {
        return instockStatus;
    }

    public void setInstockStatus(Short instockStatus) {
        this.instockStatus = instockStatus;
    }

    public String getInspectApplyNo() {
        return inspectApplyNo;
    }

    public void setInspectApplyNo(String inspectApplyNo) {
        this.inspectApplyNo = inspectApplyNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getPurchNo() {
        return purchNo;
    }

    public void setPurchNo(String purchNo) {
        this.purchNo = purchNo;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Boolean getEnterEruiWarehouse() {
        return enterEruiWarehouse;
    }

    public void setEnterEruiWarehouse(Boolean enterEruiWarehouse) {
        this.enterEruiWarehouse = enterEruiWarehouse;
    }

    public Long getSubmenuId() {
        return submenuId;
    }

    public void setSubmenuId(Long submenuId) {
        this.submenuId = submenuId;
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