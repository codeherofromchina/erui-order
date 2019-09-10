package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Long id;

    private String contractNo;

    private String frameworkNo;

    private String contractNoOs;

    private String poNo;

    private Long inquiryId;

    private String inquiryNo;

    private String projectNo;

    private Short orderSource;

    private Date signingDate;

    private String deliveryDate;

    private String signingCo;

    private Long agentId;

    private String execCoCode;

    private String region;

    private String country;

    private Long buyerId;

    private String crmCode;

    private Short customerType;

    private Long perLiableRepayId;

    private Long businessUnitId;

    private Long technicalId;

    private Short grantType;

    private Short financing;

    private String tradeTerms;

    private String transportType;

    private String fromCountry;

    private String fromPort;

    private String fromPlace;

    private String toCountry;

    private String toPort;

    private String toPlace;

    private BigDecimal totalPrice;

    private BigDecimal totalPriceUsd;

    private BigDecimal exchangeRate;

    private String currencyBn;

    private Short taxBearing;

    private Short paymentModeBn;

    private BigDecimal qualityFunds;

    private String deliveryRequires;

    private String customerContext;

    private Short payStatus;

    private Short orderStatus;

    private BigDecimal receivableAccountRemaining;

    private Long acquireId;

    private String processProgress;

    private Short deliverConsignHas;

    private Short orderBelongs;

    private Short orderCategory;

    private Short overseasSales;

    private BigDecimal shipmentsMoney;

    private BigDecimal alreadyGatheringMoney;

    private Short purchReqCreate;

    private BigDecimal advanceMoney;

    private Short auditingStatus;

    private String auditingProcess;

    private String processId;

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

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getFrameworkNo() {
        return frameworkNo;
    }

    public void setFrameworkNo(String frameworkNo) {
        this.frameworkNo = frameworkNo;
    }

    public String getContractNoOs() {
        return contractNoOs;
    }

    public void setContractNoOs(String contractNoOs) {
        this.contractNoOs = contractNoOs;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public Long getInquiryId() {
        return inquiryId;
    }

    public void setInquiryId(Long inquiryId) {
        this.inquiryId = inquiryId;
    }

    public String getInquiryNo() {
        return inquiryNo;
    }

    public void setInquiryNo(String inquiryNo) {
        this.inquiryNo = inquiryNo;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public Short getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Short orderSource) {
        this.orderSource = orderSource;
    }

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getSigningCo() {
        return signingCo;
    }

    public void setSigningCo(String signingCo) {
        this.signingCo = signingCo;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getExecCoCode() {
        return execCoCode;
    }

    public void setExecCoCode(String execCoCode) {
        this.execCoCode = execCoCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public Short getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Short customerType) {
        this.customerType = customerType;
    }

    public Long getPerLiableRepayId() {
        return perLiableRepayId;
    }

    public void setPerLiableRepayId(Long perLiableRepayId) {
        this.perLiableRepayId = perLiableRepayId;
    }

    public Long getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(Long businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public Long getTechnicalId() {
        return technicalId;
    }

    public void setTechnicalId(Long technicalId) {
        this.technicalId = technicalId;
    }

    public Short getGrantType() {
        return grantType;
    }

    public void setGrantType(Short grantType) {
        this.grantType = grantType;
    }

    public Short getFinancing() {
        return financing;
    }

    public void setFinancing(Short financing) {
        this.financing = financing;
    }

    public String getTradeTerms() {
        return tradeTerms;
    }

    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getFromPort() {
        return fromPort;
    }

    public void setFromPort(String fromPort) {
        this.fromPort = fromPort;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public String getToPort() {
        return toPort;
    }

    public void setToPort(String toPort) {
        this.toPort = toPort;
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPriceUsd() {
        return totalPriceUsd;
    }

    public void setTotalPriceUsd(BigDecimal totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }

    public Short getTaxBearing() {
        return taxBearing;
    }

    public void setTaxBearing(Short taxBearing) {
        this.taxBearing = taxBearing;
    }

    public Short getPaymentModeBn() {
        return paymentModeBn;
    }

    public void setPaymentModeBn(Short paymentModeBn) {
        this.paymentModeBn = paymentModeBn;
    }

    public BigDecimal getQualityFunds() {
        return qualityFunds;
    }

    public void setQualityFunds(BigDecimal qualityFunds) {
        this.qualityFunds = qualityFunds;
    }

    public String getDeliveryRequires() {
        return deliveryRequires;
    }

    public void setDeliveryRequires(String deliveryRequires) {
        this.deliveryRequires = deliveryRequires;
    }

    public String getCustomerContext() {
        return customerContext;
    }

    public void setCustomerContext(String customerContext) {
        this.customerContext = customerContext;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }

    public Short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getReceivableAccountRemaining() {
        return receivableAccountRemaining;
    }

    public void setReceivableAccountRemaining(BigDecimal receivableAccountRemaining) {
        this.receivableAccountRemaining = receivableAccountRemaining;
    }

    public Long getAcquireId() {
        return acquireId;
    }

    public void setAcquireId(Long acquireId) {
        this.acquireId = acquireId;
    }

    public String getProcessProgress() {
        return processProgress;
    }

    public void setProcessProgress(String processProgress) {
        this.processProgress = processProgress;
    }

    public Short getDeliverConsignHas() {
        return deliverConsignHas;
    }

    public void setDeliverConsignHas(Short deliverConsignHas) {
        this.deliverConsignHas = deliverConsignHas;
    }

    public Short getOrderBelongs() {
        return orderBelongs;
    }

    public void setOrderBelongs(Short orderBelongs) {
        this.orderBelongs = orderBelongs;
    }

    public Short getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(Short orderCategory) {
        this.orderCategory = orderCategory;
    }

    public Short getOverseasSales() {
        return overseasSales;
    }

    public void setOverseasSales(Short overseasSales) {
        this.overseasSales = overseasSales;
    }

    public BigDecimal getShipmentsMoney() {
        return shipmentsMoney;
    }

    public void setShipmentsMoney(BigDecimal shipmentsMoney) {
        this.shipmentsMoney = shipmentsMoney;
    }

    public BigDecimal getAlreadyGatheringMoney() {
        return alreadyGatheringMoney;
    }

    public void setAlreadyGatheringMoney(BigDecimal alreadyGatheringMoney) {
        this.alreadyGatheringMoney = alreadyGatheringMoney;
    }

    public Short getPurchReqCreate() {
        return purchReqCreate;
    }

    public void setPurchReqCreate(Short purchReqCreate) {
        this.purchReqCreate = purchReqCreate;
    }

    public BigDecimal getAdvanceMoney() {
        return advanceMoney;
    }

    public void setAdvanceMoney(BigDecimal advanceMoney) {
        this.advanceMoney = advanceMoney;
    }

    public Short getAuditingStatus() {
        return auditingStatus;
    }

    public void setAuditingStatus(Short auditingStatus) {
        this.auditingStatus = auditingStatus;
    }

    public String getAuditingProcess() {
        return auditingProcess;
    }

    public void setAuditingProcess(String auditingProcess) {
        this.auditingProcess = auditingProcess;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
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