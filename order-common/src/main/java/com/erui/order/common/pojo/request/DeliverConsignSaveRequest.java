package com.erui.order.common.pojo.request;

import com.erui.order.common.pojo.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/10 下午1:59
 */
public class DeliverConsignSaveRequest {
    // 主键
    private Long id;
    // 订单ID
    private Long orderId;
    // 发货申请部门
    private String execCoName;
    // 报关主体
    private String coId;
    // 提报人

    //填表日期
    private Date writeDate;
    // 销售合同号
    private String contractNo;
    // 费用承担主体及发票抬头
    private String invoiceRise;
    // 业务项目性质
    private short businessNature;
    private String businessNatureName;
    // 汇率
    private BigDecimal exchangeRate;
    // 业务项目简述及中英货物名称
    private String businessSketch;
    // 客户合同金额(usd)：
    private short totalPriceUsd;
    // 预收金额：
    private BigDecimal advanceMoney;
    // 市场要求订舱日期：
    private Date bookingDate;
    // 本批次发货金额：
    private BigDecimal thisShipmentsMoney;
    // 报关金额：
    private BigDecimal declareCustomsMoney;
    // 清关金额：
    private BigDecimal clearCustomsMoney;
    // 加工贸易金额：
    private BigDecimal tradeMoney;
    // 直接转口金额：
    private BigDecimal directTransferMoney;
    // 间接转口金额：
    private BigDecimal indirectTransferMoney;
    // 发运批次：
    private String shippingBatch;
    // 付款方式：
    private short payMethod;
    // 多次发运需注明每批次金额及币种：
    private String moreBatchExplain;
    // 应收账款金额：
    // 回款责任人：
    private long perLiableRepayId;
    private String perLiableRepayUsername;
    // 是否为危险品：1:否 2：是
    private short isDangerous;
    // 货物存放地：
    private String goodsDepositPlace;
    // 贸易术语：
    private String tradeTerms;
    // 运输方式：
    private String transporttype;
    // 是否投出口信用保险：
    private short hasInsurance;
    // 起运国/港：
    private String fromCountry;
    private String fromPort;
    // 目的国/港：
    private String toCountry;
    private String toPort;

    // 预收货款时间
    private Date advanceMoneyDate;

    private Long bookingOfficerId; // 订舱专员
    private String bookingOfficerName;
    private Long operationSpecialistId; // 操作专员
    private String operationSpecialistName;
    // 备注
    private String remarks;
    // 订舱状态
    private Short deliverConsignStatus;

    // 订舱信息
    private DeliverConsignBookingSpaceInfo deliverConsignBookingSpaceInfo;
    // 收款信息
    private List<DeliverConsignPaymentInfo> deliverConsignPaymentInfoList;
    // 商品信息
    private List<DeliverConsignGoodsInfo> deliverConsignGoodsInfoList;
    // 附件内容
    private List<AttachmentInfo> attachments;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExecCoName() {
        return execCoName;
    }

    public void setExecCoName(String execCoName) {
        this.execCoName = execCoName;
    }

    public String getCoId() {
        return coId;
    }

    public void setCoId(String coId) {
        this.coId = coId;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getInvoiceRise() {
        return invoiceRise;
    }

    public void setInvoiceRise(String invoiceRise) {
        this.invoiceRise = invoiceRise;
    }

    public short getBusinessNature() {
        return businessNature;
    }

    public void setBusinessNature(short businessNature) {
        this.businessNature = businessNature;
    }

    public String getBusinessNatureName() {
        return businessNatureName;
    }

    public void setBusinessNatureName(String businessNatureName) {
        this.businessNatureName = businessNatureName;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getBusinessSketch() {
        return businessSketch;
    }

    public void setBusinessSketch(String businessSketch) {
        this.businessSketch = businessSketch;
    }

    public short getTotalPriceUsd() {
        return totalPriceUsd;
    }

    public void setTotalPriceUsd(short totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
    }

    public BigDecimal getAdvanceMoney() {
        return advanceMoney;
    }

    public void setAdvanceMoney(BigDecimal advanceMoney) {
        this.advanceMoney = advanceMoney;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public BigDecimal getThisShipmentsMoney() {
        return thisShipmentsMoney;
    }

    public void setThisShipmentsMoney(BigDecimal thisShipmentsMoney) {
        this.thisShipmentsMoney = thisShipmentsMoney;
    }

    public BigDecimal getDeclareCustomsMoney() {
        return declareCustomsMoney;
    }

    public void setDeclareCustomsMoney(BigDecimal declareCustomsMoney) {
        this.declareCustomsMoney = declareCustomsMoney;
    }

    public BigDecimal getClearCustomsMoney() {
        return clearCustomsMoney;
    }

    public void setClearCustomsMoney(BigDecimal clearCustomsMoney) {
        this.clearCustomsMoney = clearCustomsMoney;
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

    public String getShippingBatch() {
        return shippingBatch;
    }

    public void setShippingBatch(String shippingBatch) {
        this.shippingBatch = shippingBatch;
    }

    public short getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(short payMethod) {
        this.payMethod = payMethod;
    }

    public String getMoreBatchExplain() {
        return moreBatchExplain;
    }

    public void setMoreBatchExplain(String moreBatchExplain) {
        this.moreBatchExplain = moreBatchExplain;
    }

    public long getPerLiableRepayId() {
        return perLiableRepayId;
    }

    public void setPerLiableRepayId(long perLiableRepayId) {
        this.perLiableRepayId = perLiableRepayId;
    }

    public String getPerLiableRepayUsername() {
        return perLiableRepayUsername;
    }

    public void setPerLiableRepayUsername(String perLiableRepayUsername) {
        this.perLiableRepayUsername = perLiableRepayUsername;
    }

    public short getIsDangerous() {
        return isDangerous;
    }

    public void setIsDangerous(short isDangerous) {
        this.isDangerous = isDangerous;
    }

    public String getGoodsDepositPlace() {
        return goodsDepositPlace;
    }

    public void setGoodsDepositPlace(String goodsDepositPlace) {
        this.goodsDepositPlace = goodsDepositPlace;
    }

    public String getTradeTerms() {
        return tradeTerms;
    }

    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    public String getTransporttype() {
        return transporttype;
    }

    public void setTransporttype(String transporttype) {
        this.transporttype = transporttype;
    }

    public short getHasInsurance() {
        return hasInsurance;
    }

    public void setHasInsurance(short hasInsurance) {
        this.hasInsurance = hasInsurance;
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

    public Date getAdvanceMoneyDate() {
        return advanceMoneyDate;
    }

    public void setAdvanceMoneyDate(Date advanceMoneyDate) {
        this.advanceMoneyDate = advanceMoneyDate;
    }

    public Long getBookingOfficerId() {
        return bookingOfficerId;
    }

    public void setBookingOfficerId(Long bookingOfficerId) {
        this.bookingOfficerId = bookingOfficerId;
    }

    public String getBookingOfficerName() {
        return bookingOfficerName;
    }

    public void setBookingOfficerName(String bookingOfficerName) {
        this.bookingOfficerName = bookingOfficerName;
    }

    public Long getOperationSpecialistId() {
        return operationSpecialistId;
    }

    public void setOperationSpecialistId(Long operationSpecialistId) {
        this.operationSpecialistId = operationSpecialistId;
    }

    public String getOperationSpecialistName() {
        return operationSpecialistName;
    }

    public void setOperationSpecialistName(String operationSpecialistName) {
        this.operationSpecialistName = operationSpecialistName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public DeliverConsignBookingSpaceInfo getDeliverConsignBookingSpaceInfo() {
        return deliverConsignBookingSpaceInfo;
    }

    public void setDeliverConsignBookingSpaceInfo(DeliverConsignBookingSpaceInfo deliverConsignBookingSpaceInfo) {
        this.deliverConsignBookingSpaceInfo = deliverConsignBookingSpaceInfo;
    }

    public List<DeliverConsignPaymentInfo> getDeliverConsignPaymentInfoList() {
        if (deliverConsignPaymentInfoList == null) {
            return new ArrayList<>();
        }
        return deliverConsignPaymentInfoList;
    }

    public void setDeliverConsignPaymentInfoList(List<DeliverConsignPaymentInfo> deliverConsignPaymentInfoList) {
        this.deliverConsignPaymentInfoList = deliverConsignPaymentInfoList;
    }

    public List<DeliverConsignGoodsInfo> getDeliverConsignGoodsInfoList() {
        return deliverConsignGoodsInfoList;
    }

    public void setDeliverConsignGoodsInfoList(List<DeliverConsignGoodsInfo> deliverConsignGoodsInfoList) {
        this.deliverConsignGoodsInfoList = deliverConsignGoodsInfoList;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Short getDeliverConsignStatus() {
        return deliverConsignStatus;
    }

    public void setDeliverConsignStatus(Short deliverConsignStatus) {
        this.deliverConsignStatus = deliverConsignStatus;
    }
}

