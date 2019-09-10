package com.erui.order.common.pojo;

import java.math.BigDecimal;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午6:37
 * 项目利润业务类
 */
public class ProjectProfitInfo {
    private Long id;

    private String countryBn;
    private String countryName;

    private String tradeTerm;

    private Short projectType;
    private String projectTypeName;

    private BigDecimal contractAmountUsd;

    private BigDecimal contractAmount;

    private BigDecimal exchangeRate;

    private BigDecimal taxRefund;

    private BigDecimal landFreight;

    private BigDecimal landInsurance;

    private BigDecimal portCharges;

    private BigDecimal inspectionFee;

    private BigDecimal internationalTransport;

    private BigDecimal tariff;

    private BigDecimal vat;

    private BigDecimal customsClearFee;

    private BigDecimal customsAgentFee;

    private BigDecimal transportionInsurance;

    private BigDecimal exportCreditInsurance;

    private BigDecimal otherCredit;

    private BigDecimal travelExpenses;

    private BigDecimal projectCost;

    private BigDecimal grossProfit;

    private BigDecimal grossProfitMargin;

    private BigDecimal agentFee;

    private BigDecimal raiseFee;

    private BigDecimal guaranceFee;

    private BigDecimal financingInterest;

    private BigDecimal bankFees;

    private BigDecimal domesticTaxs;

    private BigDecimal foreignTaxes;

    private BigDecimal manageFee;

    private BigDecimal afterProfit;

    private BigDecimal beforeProfit;

    private BigDecimal quotationProfit;

    private BigDecimal purchasingCostsD;

    private BigDecimal purchasingCostsF;

    private BigDecimal raiseRate;

    private BigDecimal totalProjectCost;

    private BigDecimal rearFee;

    private BigDecimal platformAgentCost;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryBn() {
        return countryBn;
    }

    public void setCountryBn(String countryBn) {
        this.countryBn = countryBn;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getTradeTerm() {
        return tradeTerm;
    }

    public void setTradeTerm(String tradeTerm) {
        this.tradeTerm = tradeTerm;
    }

    public Short getProjectType() {
        return projectType;
    }

    public void setProjectType(Short projectType) {
        this.projectType = projectType;
    }

    public String getProjectTypeName() {
        return projectTypeName;
    }

    public void setProjectTypeName(String projectTypeName) {
        this.projectTypeName = projectTypeName;
    }

    public BigDecimal getContractAmountUsd() {
        return contractAmountUsd;
    }

    public void setContractAmountUsd(BigDecimal contractAmountUsd) {
        this.contractAmountUsd = contractAmountUsd;
    }

    public BigDecimal getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(BigDecimal contractAmount) {
        this.contractAmount = contractAmount;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal getTaxRefund() {
        return taxRefund;
    }

    public void setTaxRefund(BigDecimal taxRefund) {
        this.taxRefund = taxRefund;
    }

    public BigDecimal getLandFreight() {
        return landFreight;
    }

    public void setLandFreight(BigDecimal landFreight) {
        this.landFreight = landFreight;
    }

    public BigDecimal getLandInsurance() {
        return landInsurance;
    }

    public void setLandInsurance(BigDecimal landInsurance) {
        this.landInsurance = landInsurance;
    }

    public BigDecimal getPortCharges() {
        return portCharges;
    }

    public void setPortCharges(BigDecimal portCharges) {
        this.portCharges = portCharges;
    }

    public BigDecimal getInspectionFee() {
        return inspectionFee;
    }

    public void setInspectionFee(BigDecimal inspectionFee) {
        this.inspectionFee = inspectionFee;
    }

    public BigDecimal getInternationalTransport() {
        return internationalTransport;
    }

    public void setInternationalTransport(BigDecimal internationalTransport) {
        this.internationalTransport = internationalTransport;
    }

    public BigDecimal getTariff() {
        return tariff;
    }

    public void setTariff(BigDecimal tariff) {
        this.tariff = tariff;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getCustomsClearFee() {
        return customsClearFee;
    }

    public void setCustomsClearFee(BigDecimal customsClearFee) {
        this.customsClearFee = customsClearFee;
    }

    public BigDecimal getCustomsAgentFee() {
        return customsAgentFee;
    }

    public void setCustomsAgentFee(BigDecimal customsAgentFee) {
        this.customsAgentFee = customsAgentFee;
    }

    public BigDecimal getTransportionInsurance() {
        return transportionInsurance;
    }

    public void setTransportionInsurance(BigDecimal transportionInsurance) {
        this.transportionInsurance = transportionInsurance;
    }

    public BigDecimal getExportCreditInsurance() {
        return exportCreditInsurance;
    }

    public void setExportCreditInsurance(BigDecimal exportCreditInsurance) {
        this.exportCreditInsurance = exportCreditInsurance;
    }

    public BigDecimal getOtherCredit() {
        return otherCredit;
    }

    public void setOtherCredit(BigDecimal otherCredit) {
        this.otherCredit = otherCredit;
    }

    public BigDecimal getTravelExpenses() {
        return travelExpenses;
    }

    public void setTravelExpenses(BigDecimal travelExpenses) {
        this.travelExpenses = travelExpenses;
    }

    public BigDecimal getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(BigDecimal projectCost) {
        this.projectCost = projectCost;
    }

    public BigDecimal getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(BigDecimal grossProfit) {
        this.grossProfit = grossProfit;
    }

    public BigDecimal getGrossProfitMargin() {
        return grossProfitMargin;
    }

    public void setGrossProfitMargin(BigDecimal grossProfitMargin) {
        this.grossProfitMargin = grossProfitMargin;
    }

    public BigDecimal getAgentFee() {
        return agentFee;
    }

    public void setAgentFee(BigDecimal agentFee) {
        this.agentFee = agentFee;
    }

    public BigDecimal getRaiseFee() {
        return raiseFee;
    }

    public void setRaiseFee(BigDecimal raiseFee) {
        this.raiseFee = raiseFee;
    }

    public BigDecimal getGuaranceFee() {
        return guaranceFee;
    }

    public void setGuaranceFee(BigDecimal guaranceFee) {
        this.guaranceFee = guaranceFee;
    }

    public BigDecimal getFinancingInterest() {
        return financingInterest;
    }

    public void setFinancingInterest(BigDecimal financingInterest) {
        this.financingInterest = financingInterest;
    }

    public BigDecimal getBankFees() {
        return bankFees;
    }

    public void setBankFees(BigDecimal bankFees) {
        this.bankFees = bankFees;
    }

    public BigDecimal getDomesticTaxs() {
        return domesticTaxs;
    }

    public void setDomesticTaxs(BigDecimal domesticTaxs) {
        this.domesticTaxs = domesticTaxs;
    }

    public BigDecimal getForeignTaxes() {
        return foreignTaxes;
    }

    public void setForeignTaxes(BigDecimal foreignTaxes) {
        this.foreignTaxes = foreignTaxes;
    }

    public BigDecimal getManageFee() {
        return manageFee;
    }

    public void setManageFee(BigDecimal manageFee) {
        this.manageFee = manageFee;
    }

    public BigDecimal getAfterProfit() {
        return afterProfit;
    }

    public void setAfterProfit(BigDecimal afterProfit) {
        this.afterProfit = afterProfit;
    }

    public BigDecimal getBeforeProfit() {
        return beforeProfit;
    }

    public void setBeforeProfit(BigDecimal beforeProfit) {
        this.beforeProfit = beforeProfit;
    }

    public BigDecimal getQuotationProfit() {
        return quotationProfit;
    }

    public void setQuotationProfit(BigDecimal quotationProfit) {
        this.quotationProfit = quotationProfit;
    }

    public BigDecimal getPurchasingCostsD() {
        return purchasingCostsD;
    }

    public void setPurchasingCostsD(BigDecimal purchasingCostsD) {
        this.purchasingCostsD = purchasingCostsD;
    }

    public BigDecimal getPurchasingCostsF() {
        return purchasingCostsF;
    }

    public void setPurchasingCostsF(BigDecimal purchasingCostsF) {
        this.purchasingCostsF = purchasingCostsF;
    }

    public BigDecimal getRaiseRate() {
        return raiseRate;
    }

    public void setRaiseRate(BigDecimal raiseRate) {
        this.raiseRate = raiseRate;
    }

    public BigDecimal getTotalProjectCost() {
        return totalProjectCost;
    }

    public void setTotalProjectCost(BigDecimal totalProjectCost) {
        this.totalProjectCost = totalProjectCost;
    }

    public BigDecimal getRearFee() {
        return rearFee;
    }

    public void setRearFee(BigDecimal rearFee) {
        this.rearFee = rearFee;
    }

    public BigDecimal getPlatformAgentCost() {
        return platformAgentCost;
    }

    public void setPlatformAgentCost(BigDecimal platformAgentCost) {
        this.platformAgentCost = platformAgentCost;
    }
}
