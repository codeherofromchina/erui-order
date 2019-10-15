package com.erui.order.common.pojo.response;

import java.math.BigDecimal;

/**
 * @Auther 王晓丹
 * @Date 2019/10/15 上午1:12
 */
public class PayAblePurchListResponse {
    private Long purchId;
    // 采购合同号
    private String purchNo;
    // 供应商名称
    private String supplierName;
    // 开户行
    private String openingBank;
    // 账号
    private String accountNumber;
    // 汇率
    private BigDecimal exchangeRate;
    // 合同金额
    private BigDecimal totalPrice;
    // 币种
    private String currencyBn;


    public Long getPurchId() {
        return purchId;
    }

    public void setPurchId(Long purchId) {
        this.purchId = purchId;
    }

    public String getPurchNo() {
        return purchNo;
    }

    public void setPurchNo(String purchNo) {
        this.purchNo = purchNo;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
