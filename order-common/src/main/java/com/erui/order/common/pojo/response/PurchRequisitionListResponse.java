package com.erui.order.common.pojo.response;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午4:56
 */
public class PurchRequisitionListResponse {
    private Long id;

    private Long projectId;
    private String contractNo;
    private String projectNo;
    private String projectName;
    private Long pmUid;
    private String pmUserName;
    private Date startDate;

    // 下发采购日期
    private Date submitDate;
    // 要求采购到货日期
    private Date requirePurchaseDate;
    // 采购状态
    private Short purchStatus;
    private String purchStatusName;


    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getPmUid() {
        return pmUid;
    }

    public void setPmUid(Long pmUid) {
        this.pmUid = pmUid;
    }

    public String getPmUserName() {
        return pmUserName;
    }

    public void setPmUserName(String pmUserName) {
        this.pmUserName = pmUserName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
