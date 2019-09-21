package com.erui.order.common.pojo.request;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.PurchGoodsInfo;
import com.erui.order.common.pojo.PurchPaymentInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/10 下午1:59
 */
public class PurchSaveRequest {
    // 主键
    private Long id;
    // 采购合同ID
    private Long purchContractId;
    // 采购合同号
    private String purchNo;
    // 合同约定到货日期
    private Date arrivalDate;

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
    // 定价方式
    private Short priceMode;
    // 采购经办人
    private Long agentId;
    // 下发部门
    private String department;
    // 采购总金额
    private BigDecimal totalPrice;
    private BigDecimal totalPriceUsd;
    // 是否含税
    private Boolean taxBearing;
    // 汇率
    private BigDecimal exchangeRate;
    // 利润率%
    private BigDecimal profitPercent;
    // 备注
    private String remarks;

    // 状态
    private Short purchStatus;
    // 结算信息
    private List<PurchPaymentInfo> purchPayments;
    // 商品信息
    private List<PurchGoodsInfo> purchGoodsList;

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


    public Boolean getTaxBearing() {
        return taxBearing;
    }

    public void setTaxBearing(String taxBearing) {
        this.taxBearing = false;
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

    public Short getPurchStatus() {
        return purchStatus;
    }

    public void setPurchStatus(Short purchStatus) {
        this.purchStatus = purchStatus;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {

        this.attachments = attachments;
    }

    public BigDecimal getTotalPriceUsd() {
        return totalPriceUsd;
    }

    public void setTotalPriceUsd(BigDecimal totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
    }

    public List<PurchPaymentInfo> getPurchPayments() {
        return purchPayments;
    }

    public void setPurchPayments(List<PurchPaymentInfo> purchPayments) {
        this.purchPayments = purchPayments;
    }

    public List<PurchGoodsInfo> getPurchGoodsList() {
        return purchGoodsList;
    }

    public void setPurchGoodsList(List<PurchGoodsInfo> purchGoodsList) {
        this.purchGoodsList = purchGoodsList;
    }
}

