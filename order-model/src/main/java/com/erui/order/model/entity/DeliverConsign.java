package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DeliverConsign {
    private Long id;

    private String deliverConsignNo;

    private Long orderId;

    private String coId;

    private String execCoName;

    private Date writeDate;

    private Date bookingDate;

    private String remarks;

    private Short deliverConsignStatus;

    private Short deliverYn;

    private BigDecimal advanceMoney;

    private BigDecimal thisShipmentsMoney;

    private String currencyBn;

    private String invoiceRise;

    private Short businessNature;

    private String businessSketch;

    private BigDecimal declareCustomsMoney;

    private BigDecimal tradeMoney;

    private BigDecimal directTransferMoney;

    private BigDecimal indirectTransferMoney;

    private BigDecimal clearCustomsMoney;

    private Short payMethod;

    private String shippingBatch;

    private String moreBatchExplain;

    private Short isDangerous;

    private String goodsDepositPlace;

    private Short hasInsurance;

    private Long businessLeaderId;

    private String businessLeader;

    private String crmCode;

    private String deptName;

    private String contractNo;

    private Long bookingOfficerId;

    private Long operationSpecialistId;

    private Short deliverNoticeStatus;

    private Date submitTime;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

    private Boolean deleteFlag;

    private Date deleteTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeliverConsignNo() {
        return deliverConsignNo;
    }

    public void setDeliverConsignNo(String deliverConsignNo) {
        this.deliverConsignNo = deliverConsignNo;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCoId() {
        return coId;
    }

    public void setCoId(String coId) {
        this.coId = coId;
    }

    public String getExecCoName() {
        return execCoName;
    }

    public void setExecCoName(String execCoName) {
        this.execCoName = execCoName;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Short getDeliverConsignStatus() {
        return deliverConsignStatus;
    }

    public void setDeliverConsignStatus(Short deliverConsignStatus) {
        this.deliverConsignStatus = deliverConsignStatus;
    }

    public Short getDeliverYn() {
        return deliverYn;
    }

    public void setDeliverYn(Short deliverYn) {
        this.deliverYn = deliverYn;
    }

    public BigDecimal getAdvanceMoney() {
        return advanceMoney;
    }

    public void setAdvanceMoney(BigDecimal advanceMoney) {
        this.advanceMoney = advanceMoney;
    }

    public BigDecimal getThisShipmentsMoney() {
        return thisShipmentsMoney;
    }

    public void setThisShipmentsMoney(BigDecimal thisShipmentsMoney) {
        this.thisShipmentsMoney = thisShipmentsMoney;
    }

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }

    public String getInvoiceRise() {
        return invoiceRise;
    }

    public void setInvoiceRise(String invoiceRise) {
        this.invoiceRise = invoiceRise;
    }

    public Short getBusinessNature() {
        return businessNature;
    }

    public void setBusinessNature(Short businessNature) {
        this.businessNature = businessNature;
    }

    public String getBusinessSketch() {
        return businessSketch;
    }

    public void setBusinessSketch(String businessSketch) {
        this.businessSketch = businessSketch;
    }

    public BigDecimal getDeclareCustomsMoney() {
        return declareCustomsMoney;
    }

    public void setDeclareCustomsMoney(BigDecimal declareCustomsMoney) {
        this.declareCustomsMoney = declareCustomsMoney;
    }

    public BigDecimal getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(BigDecimal tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public BigDecimal getDirectTransferMoney() {
        return directTransferMoney;
    }

    public void setDirectTransferMoney(BigDecimal directTransferMoney) {
        this.directTransferMoney = directTransferMoney;
    }

    public BigDecimal getIndirectTransferMoney() {
        return indirectTransferMoney;
    }

    public void setIndirectTransferMoney(BigDecimal indirectTransferMoney) {
        this.indirectTransferMoney = indirectTransferMoney;
    }

    public BigDecimal getClearCustomsMoney() {
        return clearCustomsMoney;
    }

    public void setClearCustomsMoney(BigDecimal clearCustomsMoney) {
        this.clearCustomsMoney = clearCustomsMoney;
    }

    public Short getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Short payMethod) {
        this.payMethod = payMethod;
    }

    public String getShippingBatch() {
        return shippingBatch;
    }

    public void setShippingBatch(String shippingBatch) {
        this.shippingBatch = shippingBatch;
    }

    public String getMoreBatchExplain() {
        return moreBatchExplain;
    }

    public void setMoreBatchExplain(String moreBatchExplain) {
        this.moreBatchExplain = moreBatchExplain;
    }

    public Short getIsDangerous() {
        return isDangerous;
    }

    public void setIsDangerous(Short isDangerous) {
        this.isDangerous = isDangerous;
    }

    public String getGoodsDepositPlace() {
        return goodsDepositPlace;
    }

    public void setGoodsDepositPlace(String goodsDepositPlace) {
        this.goodsDepositPlace = goodsDepositPlace;
    }

    public Short getHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(Short hasInsurance) {
        this.hasInsurance = hasInsurance;
    }

    public Long getBusinessLeaderId() {
        return businessLeaderId;
    }

    public void setBusinessLeaderId(Long businessLeaderId) {
        this.businessLeaderId = businessLeaderId;
    }

    public String getBusinessLeader() {
        return businessLeader;
    }

    public void setBusinessLeader(String businessLeader) {
        this.businessLeader = businessLeader;
    }

    public String getCrmCode() {
        return crmCode;
    }

    public void setCrmCode(String crmCode) {
        this.crmCode = crmCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Long getBookingOfficerId() {
        return bookingOfficerId;
    }

    public void setBookingOfficerId(Long bookingOfficerId) {
        this.bookingOfficerId = bookingOfficerId;
    }

    public Long getOperationSpecialistId() {
        return operationSpecialistId;
    }

    public void setOperationSpecialistId(Long operationSpecialistId) {
        this.operationSpecialistId = operationSpecialistId;
    }

    public Short getDeliverNoticeStatus() {
        return deliverNoticeStatus;
    }

    public void setDeliverNoticeStatus(Short deliverNoticeStatus) {
        this.deliverNoticeStatus = deliverNoticeStatus;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}