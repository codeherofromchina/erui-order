package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class InspectReportQueryRequest extends PagingRequest {
    // 到货报检单号
    private String inspectApplyNo;
    // 采购合同号
    private String purchNo;
    // 项目号
    private String projectNo;
    // 供应商名称
    private String supplierName;
    // 质检状态
    private Short inspectReportStatus;
    // 报检日期
    private Date checkDate;
    // 报检次数
    private Short checkTimes;

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

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
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
}

