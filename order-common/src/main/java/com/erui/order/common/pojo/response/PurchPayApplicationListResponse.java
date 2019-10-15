package com.erui.order.common.pojo.response;

import java.math.BigDecimal;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class PurchPayApplicationListResponse {
    private Long id;
    // 付款单号
    private String payNo;
    // 采购合同号
    private String purchContractNo;
    // 供应商名称
    private Long supplierId;
    private String supplierName;
    // 采购总金额
    private BigDecimal contractAmount;
    // 申请金额
    private BigDecimal applicantAmount;
    private String currencyBn;
    // 状态
    private Short payStatus;
    private String payStatusName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayStatusName() {
        return payStatusName;
    }

    public void setPayStatusName(String payStatusName) {
        this.payStatusName = payStatusName;
    }

    public String getPurchContractNo() {
        return purchContractNo;
    }

    public void setPurchContractNo(String purchContractNo) {
        this.purchContractNo = purchContractNo;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    public BigDecimal getApplicantAmount() {
        return applicantAmount;
    }

    public void setApplicantAmount(BigDecimal applicantAmount) {
        this.applicantAmount = applicantAmount;
    }

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }
}

