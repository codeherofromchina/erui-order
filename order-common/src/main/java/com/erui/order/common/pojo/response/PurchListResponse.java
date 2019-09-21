package com.erui.order.common.pojo.response;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class PurchListResponse {
    private Long id;
    // 采购合同号
    private String purchNo;
    // 采购合同签订日期
    private Date signingDate;
    // 合同约定到货日期
    private Date arrivalDate;
    // 销售合同号
    private String contractNo;
    // 项目号
    private String projectNo;
    // 供应商名称
    private Long supplierId;
    private String supplierName;
    // 采购总金额
    private BigDecimal totalPrice;
    private String currencyBn; // 货币类型
    // 付款状态
    private short payStatus;
    private String payStatusName;
    // 报检是否完成
    private Boolean inspected;

    // 采购状态
    private Short purchStatus;
    private String purchStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
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

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }


    public short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(short payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayStatusName() {
        return payStatusName;
    }


    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }

    public void setPayStatusName(String payStatusName) {
        this.payStatusName = payStatusName;
    }

    public Boolean getInspected() {
        return inspected;
    }

    public void setInspected(Boolean inspected) {
        this.inspected = inspected;
    }
}

