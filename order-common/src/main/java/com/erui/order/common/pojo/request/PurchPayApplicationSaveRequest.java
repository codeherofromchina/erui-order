package com.erui.order.common.pojo.request;

import com.erui.order.common.pojo.AttachmentInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/10 下午1:59
 */
public class PurchPayApplicationSaveRequest {
    private Long id;
    // 付款单号
    private String payNo;
    // 采购订单id
    private Long purchId;
    // 采购合同号
    private String purchContractNo;
    // 采购状态
    private Short payStatus;
    // 申请人
    private Long applicantId;
    // 申请人部门
    private String applicantDeptId;
    private String applicantDeptName;
    // 申请日期
    private Date applicantDate;
    // 供应商
    private Long supplierId;
    private String supplierName;
    // 开户行
    private String openingBank;
    // 开户账号
    private String accountNum;
    // 项目内容
    private String projectComment;
    // 货币类型（币种）
    private String currencyBn;
    // 汇率
    private BigDecimal exchangeRate;
    // 采购合同金额
    private BigDecimal contractAmount;
    // 申请金额
    private BigDecimal applicantAmount;
    // 手续费
    private BigDecimal handlingFee;
    // 付款人
    private Long payerId;
    private String payerName;
    // 付款日期
    private Date payDate;
    // 付款方式
    private String payMode;
    // 备注
    private String remark;
    // 附件内容
    private List<AttachmentInfo> attachments;

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

    public Long getPurchId() {
        return purchId;
    }

    public void setPurchId(Long purchId) {
        this.purchId = purchId;
    }

    public String getPurchContractNo() {
        return purchContractNo;
    }

    public void setPurchContractNo(String purchContractNo) {
        this.purchContractNo = purchContractNo;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }

    public Long getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicantDeptId() {
        return applicantDeptId;
    }

    public void setApplicantDeptId(String applicantDeptId) {
        this.applicantDeptId = applicantDeptId;
    }

    public String getApplicantDeptName() {
        return applicantDeptName;
    }

    public void setApplicantDeptName(String applicantDeptName) {
        this.applicantDeptName = applicantDeptName;
    }

    public Date getApplicantDate() {
        return applicantDate;
    }

    public void setApplicantDate(Date applicantDate) {
        this.applicantDate = applicantDate;
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

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getProjectComment() {
        return projectComment;
    }

    public void setProjectComment(String projectComment) {
        this.projectComment = projectComment;
    }

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
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

    public BigDecimal getHandlingFee() {
        return handlingFee;
    }

    public void setHandlingFee(BigDecimal handlingFee) {
        this.handlingFee = handlingFee;
    }

    public Long getPayerId() {
        return payerId;
    }

    public void setPayerId(Long payerId) {
        this.payerId = payerId;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }
}

