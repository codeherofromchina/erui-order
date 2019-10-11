package com.erui.order.common.pojo.response;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.OrderGoodsInfo;
import com.erui.order.common.pojo.OrderPaymentInfo;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:31
 */
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDetailResponse {
    private Long id;
    // 订单类别
    private Short orderCategory;
    private String orderCategoryName;
    // 海外销类型
    private Short overseasSales;
    private String overseasSalesName;
    // 框架协议号
    private String frameworkNo;
    // PO号
    private String poNo;
    // 询单ID
    private Long inquiryId;
    // 询单号
    private String inquiryNo;
    // 销售合同号
    private String contractNo;
    // 海外销售合同号
    private String contractNoOs;
    // 订单签约日期
    private Date signingDate;
    // 合同交货日期
    private String deliveryDate;
    // 市场经办人
    private Long agentId;
    private String agentUserName;
    // 获取人
    private Long acquireId;
    private String acquireUserName;
    // 客户签约主体公司
    private String signingCo;
    private String signingCoName;
    // 执行事业部
    private Long businessUnitId;
    private String businessUnitName;
    // 执行分公司
    private String execCoName;
    private String execCoCode;
    // 大区
    private String region;
    private String regionName;
    // 国家
    private String country;
    private String countryName;
    // CRM客户代码
    private String crmCode;
    private Long buyerId;
    // 客户类型
    private Short customerType;
    private String customerTypeName;
    // 回款负责人
    private Long perLiableRepayId;
    private String perLiableRepayUserName;
    // 事业部项目负责人
    private Long technicalId;
    private String technicalUserName;
    // 是否融资项目
    private Short financing;
    private String financingName;
    // 授信情况
    private Short grantType;
    private String grantTypeName;
    // 贸易术语
    private String tradeTerms;
    // 运输方式
    private String transportType;
    private String transportTypeName;
    // 起运国
    private String fromCountry;
    private String fromCountryName;
    // 起运港
    private String fromPort;
    private String fromPortName;
    // 发运起始地
    private String fromPlace;
    // 目的国
    private String toCountry;
    private String toCountryName;
    // 目的港
    private String toPort;
    private String toPortName;
    // 目的地
    private String toPlace;
    // 合同金额美元
    private BigDecimal totalPriceUsd;
    // 客户合同总价
    private BigDecimal totalPrice;
    // 易瑞合同总价
    private BigDecimal eruiTotalPrice;
    // 客户合同币种
    private String currencyBn;
    // 客户合同金额兑美金汇率
    private BigDecimal exchangeRate;
    // 是否含税
    private Short taxBearing;
    private String taxBearingName;
    // 质保金
    private BigDecimal qualityFunds;
    // 收款方式
    private Short paymentModeBn;
    private String paymentModeBnName;
    // 交货要求描述
    private String deliveryRequires;
    // 客户及项目背景描述
    private String customerContext;

    // 合同金额（预收货款）
    private List<OrderPaymentInfo> orderPayments;
    // 商品内容
    private List<OrderGoodsInfo> orderGoods;
    // 附件内容
    private List<AttachmentInfo> attachments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(Short orderCategory) {
        this.orderCategory = orderCategory;
    }

    public String getOrderCategoryName() {
        return orderCategoryName;
    }

    public void setOrderCategoryName(String orderCategoryName) {
        this.orderCategoryName = orderCategoryName;
    }

    public Short getOverseasSales() {
        return overseasSales;
    }

    public void setOverseasSales(Short overseasSales) {
        this.overseasSales = overseasSales;
    }

    public String getOverseasSalesName() {
        return overseasSalesName;
    }

    public void setOverseasSalesName(String overseasSalesName) {
        this.overseasSalesName = overseasSalesName;
    }

    public String getFrameworkNo() {
        return frameworkNo;
    }

    public void setFrameworkNo(String frameworkNo) {
        this.frameworkNo = frameworkNo;
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

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getContractNoOs() {
        return contractNoOs;
    }

    public void setContractNoOs(String contractNoOs) {
        this.contractNoOs = contractNoOs;
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

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Long getAcquireId() {
        return acquireId;
    }

    public void setAcquireId(Long acquireId) {
        this.acquireId = acquireId;
    }

    public String getSigningCo() {
        return signingCo;
    }

    public void setSigningCo(String signingCo) {
        this.signingCo = signingCo;
    }

    public String getSigningCoName() {
        return signingCoName;
    }

    public void setSigningCoName(String signingCoName) {
        this.signingCoName = signingCoName;
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

    public String getExecCoName() {
        return execCoName;
    }

    public void setExecCoName(String execCoName) {
        this.execCoName = execCoName;
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

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {

        this.country = country;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public Long getPerLiableRepayId() {
        return perLiableRepayId;
    }

    public void setPerLiableRepayId(Long perLiableRepayId) {
        this.perLiableRepayId = perLiableRepayId;
    }

    public Long getTechnicalId() {
        return technicalId;
    }

    public void setTechnicalId(Long technicalId) {
        this.technicalId = technicalId;
    }

    public Short getFinancing() {
        return financing;
    }

    public void setFinancing(Short financing) {
        this.financing = financing;
    }

    public void setFinancingName(String financingName) {
        this.financingName = financingName;
    }

    public String getFinancingName() {
        return financingName;
    }

    public Short getGrantType() {
        return grantType;
    }

    public void setGrantType(Short grantType) {
        this.grantType = grantType;
    }

    public String getGrantTypeName() {
        return grantTypeName;
    }

    public void setGrantTypeName(String grantTypeName) {
        this.grantTypeName = grantTypeName;
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

    public String getTransportTypeName() {
        return transportTypeName;
    }

    public void setTransportTypeName(String transportTypeName) {
        this.transportTypeName = transportTypeName;
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

    public BigDecimal getTotalPriceUsd() {
        return totalPriceUsd;
    }

    public BigDecimal getEruiTotalPrice() {
        return eruiTotalPrice;
    }

    public void setEruiTotalPrice(BigDecimal eruiTotalPrice) {
        this.eruiTotalPrice = eruiTotalPrice;
    }

    public void setTotalPriceUsd(BigDecimal totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
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

    public BigDecimal getExchangeRate() {
        if (exchangeRate != null) {
            return exchangeRate.setScale(4);
        }
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Short getTaxBearing() {
        return taxBearing;
    }

    public void setTaxBearing(Short taxBearing) {
        this.taxBearing = taxBearing;
    }

    public void setTaxBearingName(String taxBearingName) {
        this.taxBearingName = taxBearingName;
    }

    public String getTaxBearingName() {
        return taxBearingName;
    }

    public BigDecimal getQualityFunds() {
        return qualityFunds;
    }

    public void setQualityFunds(BigDecimal qualityFunds) {
        this.qualityFunds = qualityFunds;
    }

    public Short getPaymentModeBn() {
        return paymentModeBn;
    }

    public void setPaymentModeBn(Short paymentModeBn) {
        this.paymentModeBn = paymentModeBn;
    }

    public String getPaymentModeBnName() {
        return paymentModeBnName;
    }

    public void setPaymentModeBnName(String paymentModeBnName) {
        this.paymentModeBnName = paymentModeBnName;
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


    public List<OrderPaymentInfo> getOrderPayments() {
        return orderPayments;
    }

    public void setOrderPayments(List<OrderPaymentInfo> orderPayments) {
        this.orderPayments = orderPayments;
    }

    public List<OrderGoodsInfo> getOrderGoods() {
        return orderGoods;
    }

    public void setOrderGoods(List<OrderGoodsInfo> orderGoods) {
        this.orderGoods = orderGoods;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }


    public String getAgentUserName() {
        return agentUserName;
    }

    public void setAgentUserName(String agentUserName) {
        this.agentUserName = agentUserName;
    }

    public String getAcquireUserName() {
        return acquireUserName;
    }

    public void setAcquireUserName(String acquireUserName) {
        this.acquireUserName = acquireUserName;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public String getPerLiableRepayUserName() {
        return perLiableRepayUserName;
    }

    public void setPerLiableRepayUserName(String perLiableRepayUserName) {
        this.perLiableRepayUserName = perLiableRepayUserName;
    }

    public String getTechnicalUserName() {
        return technicalUserName;
    }

    public void setTechnicalUserName(String technicalUserName) {
        this.technicalUserName = technicalUserName;
    }

    public String getFromCountryName() {
        return fromCountryName;
    }

    public void setFromCountryName(String fromCountryName) {
        this.fromCountryName = fromCountryName;
    }

    public String getFromPortName() {
        return fromPortName;
    }

    public void setFromPortName(String fromPortName) {
        this.fromPortName = fromPortName;
    }

    public String getToCountryName() {
        return toCountryName;
    }

    public void setToCountryName(String toCountryName) {
        this.toCountryName = toCountryName;
    }

    public String getToPortName() {
        return toPortName;
    }

    public void setToPortName(String toPortName) {
        this.toPortName = toPortName;
    }
}
