package com.erui.order.model.entity;

import java.util.Date;

public class InspectReport {
    private Long id;

    private Long inspectApplyId;

    private String inspectApplyNo;

    private String purchNo;

    private String contractNo;

    private String projectNo;

    private String ncrNo;

    private Short checkTimes;

    private Date checkDate;

    private Boolean reportFirst;

    private Long checkDeptId;

    private String checkDeptName;

    private Long checkUserId;

    private Date doneDate;

    private String msg;

    private Boolean reportProcess;

    private String reportRemarks;

    private String supplierName;

    private Short inspectReportStatus;

    private Date lastDoneDate;

    private Boolean isShow;

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

    public Long getInspectApplyId() {
        return inspectApplyId;
    }

    public void setInspectApplyId(Long inspectApplyId) {
        this.inspectApplyId = inspectApplyId;
    }

    public String getInspectApplyNo() {
        return inspectApplyNo;
    }

    public void setInspectApplyNo(String inspectApplyNo) {
        this.inspectApplyNo = inspectApplyNo;
    }

    public String getPurchNo() {
        return purchNo;
    }

    public void setPurchNo(String purchNo) {
        this.purchNo = purchNo;
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

    public String getNcrNo() {
        return ncrNo;
    }

    public void setNcrNo(String ncrNo) {
        this.ncrNo = ncrNo;
    }

    public Short getCheckTimes() {
        return checkTimes;
    }

    public void setCheckTimes(Short checkTimes) {
        this.checkTimes = checkTimes;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Boolean getReportFirst() {
        return reportFirst;
    }

    public void setReportFirst(Boolean reportFirst) {
        this.reportFirst = reportFirst;
    }

    public Long getCheckDeptId() {
        return checkDeptId;
    }

    public void setCheckDeptId(Long checkDeptId) {
        this.checkDeptId = checkDeptId;
    }

    public String getCheckDeptName() {
        return checkDeptName;
    }

    public void setCheckDeptName(String checkDeptName) {
        this.checkDeptName = checkDeptName;
    }

    public Long getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Long checkUserId) {
        this.checkUserId = checkUserId;
    }

    public Date getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(Date doneDate) {
        this.doneDate = doneDate;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getReportProcess() {
        return reportProcess;
    }

    public void setReportProcess(Boolean reportProcess) {
        this.reportProcess = reportProcess;
    }

    public String getReportRemarks() {
        return reportRemarks;
    }

    public void setReportRemarks(String reportRemarks) {
        this.reportRemarks = reportRemarks;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Short getInspectReportStatus() {
        return inspectReportStatus;
    }

    public void setInspectReportStatus(Short inspectReportStatus) {
        this.inspectReportStatus = inspectReportStatus;
    }

    public Date getLastDoneDate() {
        return lastDoneDate;
    }

    public void setLastDoneDate(Date lastDoneDate) {
        this.lastDoneDate = lastDoneDate;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
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