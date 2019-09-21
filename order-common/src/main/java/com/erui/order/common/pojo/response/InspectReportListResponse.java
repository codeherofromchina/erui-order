package com.erui.order.common.pojo.response;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class InspectReportListResponse {
    private Long id;
    // 到货报检单号
    private String inspectApplyNo;
    // 销售合同号
    private String contractNo;
    // 项目号
    private String projectNo;
    // 采购合同号
    private String purchNo;
    // 供应商名称
    private String supplierName;
    // 报检日期
    private Date checkDate;
    // 报检次数
    private Short checkTimes;
    // 质检状态
    private Short inspectReportStatus;
    private String inspectReportStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Short getCheckTimes() {
        return checkTimes;
    }

    public void setCheckTimes(Short checkTimes) {
        this.checkTimes = checkTimes;
    }

    public Short getInspectReportStatus() {
        return inspectReportStatus;
    }

    public void setInspectReportStatus(Short inspectReportStatus) {
        this.inspectReportStatus = inspectReportStatus;
    }

    public String getInspectReportStatusName() {
        return inspectReportStatusName;
    }

    public void setInspectReportStatusName(String inspectReportStatusName) {
        this.inspectReportStatusName = inspectReportStatusName;
    }
}

