package com.erui.order.common.pojo.response;

import com.erui.order.common.pojo.OrderAccountInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:31
 */
public class OrderAccountDetailResponse {
    // 订单ID
    private Long id;
    // 销售合同号
    private String contractNo;
    // 订单签约日期
    private Date signingDate;
    // 客户签约主体公司
    private String signingCo;
    private String signingCoName;
    // 市场经办人
    private Long agentUserId;
    private String agentUserName;
    // CRM客户代码
    private String crmCode;
    // 订单状态
    private Short orderStatus;
    private String orderStatusName;
    // 收款状态
    private Short payStatus;
    private String payStatusName;
    // 订单结算币种
    private String currencyBn;
    // 客户合同金额
    private BigDecimal totalPrice;
    // 已发货总金额
    private BigDecimal shipmentsMoney;
    // 已收款总金额
    private BigDecimal alreadyGatheringMoney;
    // 应收账款余额
    private BigDecimal receivableBalance;
    // 汇率
    private BigDecimal exchangeRate;
    // 已收款总金额（USD）
    private BigDecimal alreadyGatheringMoneyUsd;
    // 发货信息
    private List<OrderAccountInfo> sendInfos;
    // 收款信息
    private List<OrderAccountInfo> receiveInfos;


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

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
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

    public Long getAgentUserId() {
        return agentUserId;
    }

    public void setAgentUserId(Long agentUserId) {
        this.agentUserId = agentUserId;
    }

    public String getAgentUserName() {
        return agentUserName;
    }

    public void setAgentUserName(String agentUserName) {
        this.agentUserName = agentUserName;
    }

    public String getCrmCode() {
        return crmCode;
    }

    public void setCrmCode(String crmCode) {
        this.crmCode = crmCode;
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

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice.setScale(2);
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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

    public BigDecimal getReceivableBalance() {
        return receivableBalance;
    }

    public void setReceivableBalance(BigDecimal receivableBalance) {
        this.receivableBalance = receivableBalance;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal getAlreadyGatheringMoneyUsd() {
        return alreadyGatheringMoneyUsd;
    }

    public void setAlreadyGatheringMoneyUsd(BigDecimal alreadyGatheringMoneyUsd) {
        this.alreadyGatheringMoneyUsd = alreadyGatheringMoneyUsd;
    }

    public List<OrderAccountInfo> getSendInfos() {
        return sendInfos;
    }

    public void setSendInfos(List<OrderAccountInfo> sendInfos) {
        this.sendInfos = sendInfos;
    }

    public List<OrderAccountInfo> getReceiveInfos() {
        return receiveInfos;
    }

    public void setReceiveInfos(List<OrderAccountInfo> receiveInfos) {
        this.receiveInfos = receiveInfos;
    }
}

