package com.erui.order.common.pojo.response;

import java.math.BigDecimal;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class OrderListResponse {
    private Long id;
    // 销售合同号
    private String contractNo;
    // 项目号
    private String projectNo;
    // 易瑞海外销售合同号
    private String contractNoOs;
    // 询单号

    // 事业部项目负责人
    private Long technicalId;
    private String technicalName;

    // 执行事业部
    private Long businessUnitId;
    private String businessUnitName;

    // 合同交货日期
    private String deliveryDate;
    // CRM客户代码
    private Long buyerId;
    private String crmCode;

    // 客户合同金额(USD)
    private BigDecimal totalPriceUsd;

    // 款项状态
    private Short payStatus;
    private String payStatusName;

    // 订单状态
    private Short orderStatus;
    private String orderStatusName;

    // 流程进度
    private String processProgress;
    private String processProgressName;


    // 审核进度
    private String auditingProcess;
    private String auditingProcessName;

    // 审核状态
    private Short auditingStatus;
    private String auditingStatusName;

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

    public String getContractNoOs() {
        return contractNoOs;
    }

    public void setContractNoOs(String contractNoOs) {
        this.contractNoOs = contractNoOs;
    }

    public Long getTechnicalId() {
        return technicalId;
    }

    public void setTechnicalId(Long technicalId) {
        this.technicalId = technicalId;
    }

    public String getTechnicalName() {
        return technicalName;
    }

    public void setTechnicalName(String technicalName) {
        this.technicalName = technicalName;
    }

    public Long getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(Long businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public String getBusinessUnitName() {
        return businessUnitName;
    }

    public void setBusinessUnitName(String businessUnitName) {
        this.businessUnitName = businessUnitName;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public String getCrmCode() {
        return crmCode;
    }

    public void setCrmCode(String crmCode) {
        this.crmCode = crmCode;
    }

    public BigDecimal getTotalPriceUsd() {
        return totalPriceUsd;
    }

    public void setTotalPriceUsd(BigDecimal totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
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

    public Short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatusName() {
        return orderStatusName;
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }

    public String getProcessProgress() {
        return processProgress;
    }

    public void setProcessProgress(String processProgress) {
        this.processProgress = processProgress;
    }

    public String getProcessProgressName() {
        return processProgressName;
    }

    public void setProcessProgressName(String processProgressName) {
        this.processProgressName = processProgressName;
    }

    public String getAuditingProcess() {
        return auditingProcess;
    }

    public void setAuditingProcess(String auditingProcess) {
        this.auditingProcess = auditingProcess;
    }

    public String getAuditingProcessName() {
        return auditingProcessName;
    }

    public void setAuditingProcessName(String auditingProcessName) {
        this.auditingProcessName = auditingProcessName;
    }

    public Short getAuditingStatus() {
        return auditingStatus;
    }

    public void setAuditingStatus(Short auditingStatus) {
        this.auditingStatus = auditingStatus;
    }

    public String getAuditingStatusName() {
        return auditingStatusName;
    }

    public void setAuditingStatusName(String auditingStatusName) {
        this.auditingStatusName = auditingStatusName;
    }
}
