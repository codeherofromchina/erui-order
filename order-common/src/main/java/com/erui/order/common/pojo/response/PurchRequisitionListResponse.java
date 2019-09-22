package com.erui.order.common.pojo.response;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午4:56
 */
public class PurchRequisitionListResponse {
    private Long id;
    // 项目ID
    private Long projectId;
    // 销售合同号
    private String contractNo;
    // 项目号
    private String projectNo;
    // 合同标的物
    private String projectName;
    // 事业部项目负责人
    private Long businessUid;
    private String businessUserName;
    // 项目开始日期
    private Date projectStartDate;
    // 下发采购日期
    private Date submitDate;
    // 要求采购到货日期
    private Date requirePurchaseDate;
    // 采购状态
    private Short purchStatus;
    private String purchStatusName;

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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Long getBusinessUid() {
        return businessUid;
    }

    public void setBusinessUid(Long businessUid) {
        this.businessUid = businessUid;
    }

    public String getBusinessUserName() {
        return businessUserName;
    }

    public void setBusinessUserName(String businessUserName) {
        this.businessUserName = businessUserName;
    }

    public Date getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Date getRequirePurchaseDate() {
        return requirePurchaseDate;
    }

    public void setRequirePurchaseDate(Date requirePurchaseDate) {
        this.requirePurchaseDate = requirePurchaseDate;
    }

    public Short getPurchStatus() {
        return purchStatus;
    }

    public void setPurchStatus(Short purchStatus) {
        this.purchStatus = purchStatus;
    }

    public String getPurchStatusName() {
        return purchStatusName;
    }

    public void setPurchStatusName(String purchStatusName) {
        this.purchStatusName = purchStatusName;
    }
}
