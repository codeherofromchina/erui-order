package com.erui.order.common.pojo;

import java.math.BigDecimal;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午6:37
 * 项目利润业务类
 */
public class ProjectProfitInfo {
    private Long id;
    // 国家
    private String countryBn;
    private String countryName;
    // 贸易术语
    private String tradeTerm;
    // 项目类型
    private Short projectType;
    private String projectTypeName;
    //合同金额（美元）
    private BigDecimal contractAmountUsd;
    // 合同金额（人民币）
    private BigDecimal contractAmount;
    //汇率
    private BigDecimal exchangeRate;
    // 退税
    private BigDecimal taxRefund;
    // 陆运费
    private BigDecimal landFreight;
    // 陆运险
    private BigDecimal landInsurance;
    // 港杂费
    private BigDecimal portCharges;
    // 商检险
    private BigDecimal inspectionFee;
    // 国际运输
    private BigDecimal internationalTransport;
    //关税
    private BigDecimal tariff;
    //增值税
    private BigDecimal vat;
    //清关杂税
    private BigDecimal customsClearFee;
    //清关代理费
    private BigDecimal customsAgentFee;
    //货物运输保险
    private BigDecimal transportionInsurance;
    // 物流成本总计
    //出口信用险
    private BigDecimal exportCreditInsurance;
    //其他信用
    private BigDecimal otherCredit;
    //差旅费、业务费等
    private BigDecimal travelExpenses;
    //项目成本小计
    private BigDecimal projectCost;
    //毛利润
    private BigDecimal grossProfit;
    //毛利率
    private BigDecimal grossProfitMargin;
    // 项目佣金
    private BigDecimal agentFee;
    // 提点费用
    private BigDecimal raiseFee;
    //信用证，保函费
    private BigDecimal guaranceFee;
    //融资利息
    private BigDecimal financingInterest;
    // 银行手续费
    private BigDecimal bankFees;
    // 国内税费
    private BigDecimal domesticTaxs;
    // 国外税费
    private BigDecimal foreignTaxes;
    // 管理费用
    private BigDecimal manageFee;
    //市场提点后报价利润
    private BigDecimal afterProfit;
    //市场提点前报价利润
    private BigDecimal beforeProfit;
    //报价利润率
    private BigDecimal quotationProfit;
    //采购成本-国内
    private BigDecimal purchasingCostsD;
    //采购成本-国外
    private BigDecimal purchasingCostsF;
    //项目核算利润提点比例
    private BigDecimal raiseRate;
    //项目成本总计
    private BigDecimal totalProjectCost;
    //后方提点费用
    private BigDecimal rearFee;
    //平台代理费用
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
