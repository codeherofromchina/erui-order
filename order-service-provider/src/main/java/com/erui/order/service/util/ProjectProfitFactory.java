package com.erui.order.service.util;

import com.erui.order.common.enums.ProjectTypeEnum;
import com.erui.order.common.pojo.ProjectProfitInfo;
import com.erui.order.model.entity.ProjectProfit;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午6:48
 */
public class ProjectProfitFactory {
    public static ProjectProfitInfo projectProfitInfo(ProjectProfit projectProfit) {
        if (projectProfit == null) {
            return null;
        }
        ProjectProfitInfo projectProfitInfo = new ProjectProfitInfo();
        projectProfitInfo.setId(projectProfit.getId());
        projectProfitInfo.setCountryBn(projectProfit.getCountryBn());
        projectProfitInfo.setTradeTerm(projectProfit.getTradeTerm());
        projectProfitInfo.setProjectType(projectProfit.getProjectType());
        ProjectTypeEnum projectTypeEnum = ProjectTypeEnum.valueOf(projectProfit.getProjectType());
        if (projectTypeEnum != null) {
            projectProfitInfo.setProjectTypeName(projectTypeEnum.getName());
        }
        projectProfitInfo.setContractAmountUsd(projectProfit.getContractAmountUsd());
        projectProfitInfo.setContractAmount(projectProfit.getContractAmount());
        projectProfitInfo.setExchangeRate(projectProfit.getExchangeRate());
        projectProfitInfo.setTaxRefund(projectProfit.getTaxRefund());
        projectProfitInfo.setLandFreight(projectProfit.getLandFreight());
        projectProfitInfo.setLandInsurance(projectProfit.getLandInsurance());
        projectProfitInfo.setPortCharges(projectProfit.getPortCharges());
        projectProfitInfo.setInspectionFee(projectProfit.getInspectionFee());
        projectProfitInfo.setInternationalTransport(projectProfit.getInternationalTransport());
        projectProfitInfo.setTariff(projectProfit.getTariff());
        projectProfitInfo.setVat(projectProfit.getVat());
        projectProfitInfo.setCustomsClearFee(projectProfit.getCustomsClearFee());
        projectProfitInfo.setCustomsAgentFee(projectProfit.getCustomsAgentFee());
        projectProfitInfo.setTransportionInsurance(projectProfit.getTransportionInsurance());
        projectProfitInfo.setExportCreditInsurance(projectProfit.getExportCreditInsurance());
        projectProfitInfo.setOtherCredit(projectProfit.getOtherCredit());
        projectProfitInfo.setTravelExpenses(projectProfit.getTravelExpenses());
        projectProfitInfo.setProjectCost(projectProfit.getProjectCost());
        projectProfitInfo.setGrossProfit(projectProfit.getGrossProfit());
        projectProfitInfo.setGrossProfitMargin(projectProfit.getGrossProfitMargin());
        projectProfitInfo.setAgentFee(projectProfit.getAgentFee());
        projectProfitInfo.setRaiseFee(projectProfit.getRaiseFee());
        projectProfitInfo.setGuaranceFee(projectProfit.getGuaranceFee());
        projectProfitInfo.setFinancingInterest(projectProfit.getFinancingInterest());
        projectProfitInfo.setBankFees(projectProfit.getBankFees());
        projectProfitInfo.setDomesticTaxs(projectProfit.getDomesticTaxs());
        projectProfitInfo.setForeignTaxes(projectProfit.getForeignTaxes());
        projectProfitInfo.setManageFee(projectProfit.getManageFee());
        projectProfitInfo.setAfterProfit(projectProfit.getAfterProfit());
        projectProfitInfo.setBeforeProfit(projectProfit.getBeforeProfit());
        projectProfitInfo.setQuotationProfit(projectProfit.getQuotationProfit());
        projectProfitInfo.setPurchasingCostsD(projectProfit.getPurchasingCostsD());
        projectProfitInfo.setPurchasingCostsF(projectProfit.getPurchasingCostsF());
        projectProfitInfo.setRaiseRate(projectProfit.getRaiseRate());
        projectProfitInfo.setTotalProjectCost(projectProfit.getTotalProjectCost());
        projectProfitInfo.setRearFee(projectProfit.getRearFee());
        projectProfitInfo.setPlatformAgentCost(projectProfit.getPlatformAgentCost());

        return projectProfitInfo;
    }

    public static ProjectProfit projectProfit(ProjectProfitInfo projectProfitInfo) {
        if (projectProfitInfo == null) {
            return null;
        }

        ProjectProfit projectProfit = new ProjectProfit();
        projectProfit.setId(projectProfitInfo.getId());
        projectProfit.setCountryBn(projectProfitInfo.getCountryBn());
        projectProfit.setTradeTerm(projectProfitInfo.getTradeTerm());
        projectProfit.setProjectType(projectProfitInfo.getProjectType());
        projectProfit.setContractAmountUsd(projectProfitInfo.getContractAmountUsd());
        projectProfit.setContractAmount(projectProfitInfo.getContractAmount());
        projectProfit.setExchangeRate(projectProfitInfo.getExchangeRate());
        projectProfit.setTaxRefund(projectProfitInfo.getTaxRefund());
        projectProfit.setLandFreight(projectProfitInfo.getLandFreight());
        projectProfit.setLandInsurance(projectProfitInfo.getLandInsurance());
        projectProfit.setPortCharges(projectProfitInfo.getPortCharges());
        projectProfit.setInspectionFee(projectProfitInfo.getInspectionFee());
        projectProfit.setInternationalTransport(projectProfitInfo.getInternationalTransport());
        projectProfit.setTariff(projectProfitInfo.getTariff());
        projectProfit.setVat(projectProfitInfo.getVat());
        projectProfit.setCustomsClearFee(projectProfitInfo.getCustomsClearFee());
        projectProfit.setCustomsAgentFee(projectProfitInfo.getCustomsAgentFee());
        projectProfit.setTransportionInsurance(projectProfitInfo.getTransportionInsurance());
        projectProfit.setExportCreditInsurance(projectProfitInfo.getExportCreditInsurance());
        projectProfit.setOtherCredit(projectProfitInfo.getOtherCredit());
        projectProfit.setTravelExpenses(projectProfitInfo.getTravelExpenses());
        projectProfit.setProjectCost(projectProfitInfo.getProjectCost());
        projectProfit.setGrossProfit(projectProfitInfo.getGrossProfit());
        projectProfit.setGrossProfitMargin(projectProfitInfo.getGrossProfitMargin());
        projectProfit.setAgentFee(projectProfitInfo.getAgentFee());
        projectProfit.setRaiseFee(projectProfitInfo.getRaiseFee());
        projectProfit.setGuaranceFee(projectProfitInfo.getGuaranceFee());
        projectProfit.setFinancingInterest(projectProfitInfo.getFinancingInterest());
        projectProfit.setBankFees(projectProfitInfo.getBankFees());
        projectProfit.setDomesticTaxs(projectProfitInfo.getDomesticTaxs());
        projectProfit.setForeignTaxes(projectProfitInfo.getForeignTaxes());
        projectProfit.setManageFee(projectProfitInfo.getManageFee());
        projectProfit.setAfterProfit(projectProfitInfo.getAfterProfit());
        projectProfit.setBeforeProfit(projectProfitInfo.getBeforeProfit());
        projectProfit.setQuotationProfit(projectProfitInfo.getQuotationProfit());
        projectProfit.setPurchasingCostsD(projectProfitInfo.getPurchasingCostsD());
        projectProfit.setPurchasingCostsF(projectProfitInfo.getPurchasingCostsF());
        projectProfit.setRaiseRate(projectProfitInfo.getRaiseRate());
        projectProfit.setTotalProjectCost(projectProfitInfo.getTotalProjectCost());
        projectProfit.setRearFee(projectProfitInfo.getRearFee());
        projectProfit.setPlatformAgentCost(projectProfitInfo.getPlatformAgentCost());

        return projectProfit;
    }
}
