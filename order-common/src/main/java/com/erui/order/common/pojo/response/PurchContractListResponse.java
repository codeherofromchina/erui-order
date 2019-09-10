package com.erui.order.common.pojo.response;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午9:25
 */
public class PurchContractListResponse {
    private Long id;
    // 采购合同号
    private String purchContractNo;
    // 采购合同签订日期
    private Date signingDate;
    // 采购经办人
    private Long agentId;
    private String agentName;
    // 供应商名称
    private Long supplierId;
    private String supplierName;
    // 采购总金额
    private BigDecimal lowercasePrice;
    private String currencyBn;
    // 合同状态
    private Short contractStatus;
    // 合同类型
    private Short contractType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPurchContractNo() {
        return purchContractNo;
    }

    public void setPurchContractNo(String purchContractNo) {
        this.purchContractNo = purchContractNo;
    }

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
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

    public BigDecimal getLowercasePrice() {
        return lowercasePrice;
    }

    public void setLowercasePrice(BigDecimal lowercasePrice) {
        this.lowercasePrice = lowercasePrice;
    }

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }

    public Short getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Short contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Short getContractType() {
        return contractType;
    }

    public void setContractType(Short contractType) {
        this.contractType = contractType;
    }
}
