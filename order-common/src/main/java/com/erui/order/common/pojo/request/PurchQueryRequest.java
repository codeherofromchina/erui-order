package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class PurchQueryRequest extends PagingRequest {
    // 项目号
    private String projectNo;
    // 采购合同号
    private String purchNo;
    // 采购合同签订日期
    private Date signingDate;
    // 供应商
    private Long supplierId;
    // 采购状态
    private Short purchStatus;

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

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Short getPurchStatus() {
        return purchStatus;
    }

    public void setPurchStatus(Short purchStatus) {
        this.purchStatus = purchStatus;
    }
}

