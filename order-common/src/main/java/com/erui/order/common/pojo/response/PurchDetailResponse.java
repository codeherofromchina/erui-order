package com.erui.order.common.pojo.response;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.GoodsInfo;
import com.erui.order.common.pojo.PurchGoodsInfo;
import com.erui.order.common.pojo.PurchPaymentInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:31
 */
public class PurchDetailResponse {
    // 主键
    private Long id;
    // 采购合同ID
    private Long purchContractId;
    // 采购合同号
    private String purchNo;
    // 合同约定到货日期
    private Date arrivalDate;
    // 合同签订日期
    private Date signingDate;
    // 供应商
    private Long supplierId;
    private String supplierName;

    // 合同标的物
    private String contractTag;
    // 合同变更后到货日期
    private Date purChgDate;
    // 目标成本（人民币）
    private BigDecimal goalCost;
    // 节约资金（人民币）
    private BigDecimal saveAmount;
    // 节约方式
    private Short saveNode;
    private String saveNodeName;
    // 定价方式
    private Short priceMode;
    private String priceModeName;
    // 采购经办人
    private Long agentId;
    private String agentName;
    // 下发部门
    private String department;
    // 采购总金额
    private BigDecimal totalPrice;
    private String currencyBn;
    private BigDecimal totalPriceUsd;
    // 是否含税
    private Boolean taxBearing;
    // 汇率
    private BigDecimal exchangeRate;
    // 利润率%
    private BigDecimal profitPercent;
    // 备注
    private String remarks;

    // 结算信息
    private List<PurchPaymentInfo> purchPayments;
    // 商品信息
    private List<GoodsInfo> purchGoodsList;
    // 附件内容
    private List<AttachmentInfo> attachments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPurchContractId() {
        return purchContractId;
    }

    public void setPurchContractId(Long purchContractId) {
        this.purchContractId = purchContractId;
    }

    public String getPurchNo() {
        return purchNo;
    }

    public void setPurchNo(String purchNo) {
        this.purchNo = purchNo;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContractTag() {
        return contractTag;
    }

    public void setContractTag(String contractTag) {
        this.contractTag = contractTag;
    }

    public Date getPurChgDate() {
        return purChgDate;
    }

    public void setPurChgDate(Date purChgDate) {
        this.purChgDate = purChgDate;
    }

    public BigDecimal getGoalCost() {
        return goalCost;
    }

    public void setGoalCost(BigDecimal goalCost) {
        this.goalCost = goalCost;
    }

    public BigDecimal getSaveAmount() {
        return saveAmount;
    }

    public void setSaveAmount(BigDecimal saveAmount) {
        this.saveAmount = saveAmount;
    }

    public Short getSaveNode() {
        return saveNode;
    }

    public void setSaveNode(Short saveNode) {
        this.saveNode = saveNode;
    }

    public Short getPriceMode() {
        return priceMode;
    }

    public void setPriceMode(Short priceMode) {
        this.priceMode = priceMode;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public Boolean getTaxBearing() {
        return taxBearing;
    }

    public void setTaxBearing(Boolean taxBearing) {
        this.taxBearing = taxBearing;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal getProfitPercent() {
        return profitPercent;
    }

    public void setProfitPercent(BigDecimal profitPercent) {
        this.profitPercent = profitPercent;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<PurchPaymentInfo> getPurchPayments() {
        return purchPayments;
    }

    public void setPurchPayments(List<PurchPaymentInfo> purchPayments) {
        this.purchPayments = purchPayments;
    }

    public List<GoodsInfo> getPurchGoodsList() {
        return purchGoodsList;
    }

    public void setPurchGoodsList(List<GoodsInfo> purchGoodsList) {
        this.purchGoodsList = purchGoodsList;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }

    public String getSaveNodeName() {
        return saveNodeName;
    }

    public void setSaveNodeName(String saveNodeName) {
        this.saveNodeName = saveNodeName;
    }

    public String getPriceModeName() {
        return priceModeName;
    }

    public void setPriceModeName(String priceModeName) {
        this.priceModeName = priceModeName;
    }
}

