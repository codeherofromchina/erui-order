package com.erui.order.common.pojo.request;

import com.erui.order.common.pojo.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午9:57
 * 采购合同保存请求业务实体
 */
public class PurchContractSaveRequest {
    private Long id;
    // 合同类型 1:简易合同 2:标准合同 3:非标合同
    private Short contractType;
    // 状态 1:待确认 2:未执行 3:已执行 4:已完成 5:已删除
    private Short contractStatus;
    // 合同签订日期
    private Date signingDate;
    // 供应商
    private Long supplierId;
    private String supplierName;

    // *合同签订地点
    private String signingPlace;
    // 采购经办人
    private Long agentId;
    // 税点%,0到100数字
    private Short taxPoint;
    // 采购总金额（大写）
    private String capitalizedPrice;
    // 采购总金额（小写）
    private BigDecimal lowercasePrice;
    // 货币类型
    private String currencyBn;
    // 商品备注
    private String goodsRemarks;
    // 买卖双方信息
    // 买方
    private PurchContractSignatoriesInfo buyerSignatories;
    // 卖方
    private PurchContractSignatoriesInfo sellerSignatories;
    // 采购合同商品信息
    private List<PurchContractGoodsInfo> purchContractGoodsList;
    // 采购合同附加内容
    private PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo;
    private PurchContractAdditionStandardInfo purchContractAdditionStandardInfo;
    // 附件内容
    private List<AttachmentInfo> attachments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getContractType() {
        return contractType;
    }

    public void setContractType(Short contractType) {
        this.contractType = contractType;
    }

    public Short getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Short contractStatus) {
        this.contractStatus = contractStatus;
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

    public String getSigningPlace() {
        return signingPlace;
    }

    public void setSigningPlace(String signingPlace) {
        this.signingPlace = signingPlace;
    }

    public Long getAgentId() {
        return agentId;
    }

    public void setAgentId(Long agentId) {
        this.agentId = agentId;
    }

    public Short getTaxPoint() {
        return taxPoint;
    }

    public void setTaxPoint(Short taxPoint) {
        this.taxPoint = taxPoint;
    }

    public String getCapitalizedPrice() {
        return capitalizedPrice;
    }

    public void setCapitalizedPrice(String capitalizedPrice) {
        this.capitalizedPrice = capitalizedPrice;
    }

    public BigDecimal getLowercasePrice() {
        return lowercasePrice;
    }

    public void setLowercasePrice(BigDecimal lowercasePrice) {
        this.lowercasePrice = lowercasePrice;
    }

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }

    public String getGoodsRemarks() {
        return goodsRemarks;
    }

    public void setGoodsRemarks(String goodsRemarks) {
        this.goodsRemarks = goodsRemarks;
    }

    public PurchContractSignatoriesInfo getBuyerSignatories() {
        return buyerSignatories;
    }

    public void setBuyerSignatories(PurchContractSignatoriesInfo buyerSignatories) {
        this.buyerSignatories = buyerSignatories;
    }

    public PurchContractSignatoriesInfo getSellerSignatories() {
        return sellerSignatories;
    }

    public void setSellerSignatories(PurchContractSignatoriesInfo sellerSignatories) {
        this.sellerSignatories = sellerSignatories;
    }

    public List<PurchContractGoodsInfo> getPurchContractGoodsList() {
        return purchContractGoodsList;
    }

    public void setPurchContractGoodsList(List<PurchContractGoodsInfo> purchContractGoodsList) {
        this.purchContractGoodsList = purchContractGoodsList;
    }

    public PurchContractAdditionSimpleInfo getPurchContractAdditionSimpleInfo() {
        return purchContractAdditionSimpleInfo;
    }

    public void setPurchContractAdditionSimpleInfo(PurchContractAdditionSimpleInfo purchContractAdditionSimpleInfo) {
        this.purchContractAdditionSimpleInfo = purchContractAdditionSimpleInfo;
    }

    public PurchContractAdditionStandardInfo getPurchContractAdditionStandardInfo() {
        return purchContractAdditionStandardInfo;
    }

    public void setPurchContractAdditionStandardInfo(PurchContractAdditionStandardInfo purchContractAdditionStandardInfo) {
        this.purchContractAdditionStandardInfo = purchContractAdditionStandardInfo;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }
}
