package com.erui.order.common.pojo;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:28
 */
public class DeliverConsignBookingSpaceInfo {
    private Long id;
    private Long deliverConsignId;
    // 货物备好日期
    private Date readyDate;
    // 要求运抵目的地日期
    private Date arrivalDate;
    // 订单紧急程度 1:一般（成本优先） 2:紧急 3:异常紧急（交期优先）
    private Integer orderEmergency;
    // 船舶要求以及合同是否有规定延期到货的罚金规定
    private String penaltyProvision;
    // 所需单据，逗号分隔多个 1:提单 2:箱单 3:发票 4:原产地证
    private String requiredDoc;
    // 提单-正
    private Integer billOfPositive;
    // 提单-副
    private Integer billOfVice;
    // 箱单-正
    private Integer boxListPositive;
    // 箱单-副
    private Integer boxListVice;
    // 发票-正
    private Integer invoicePositive;
    // 发票-副
    private Integer invoiceVice;
    // 原产地证 1:完全中国原产 2:含进口成分
    private Integer primaryOrigin;
    // 其他单证
    private String otherDoc;
    // 单证具体要求
    private String specificRequire;
    // 提单货描（英文）
    private String billOfLading;
    //唛头
    private String shippingMarks;
    //包装、箱贴要求
    private String packageRequire;
    //公司名称
    private String corporateName;
    //地址
    private String address;
    // 联系人
    private String contacts;
    // 联系方式
    private String contactInformation;
    // 税号
    private String dutyParagraph;
    // 邮编
    private String zipCode;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeliverConsignId() {
        return deliverConsignId;
    }

    public void setDeliverConsignId(Long deliverConsignId) {
        this.deliverConsignId = deliverConsignId;
    }

    public Date getReadyDate() {
        return readyDate;
    }

    public void setReadyDate(Date readyDate) {
        this.readyDate = readyDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Integer getOrderEmergency() {
        return orderEmergency;
    }

    public void setOrderEmergency(Integer orderEmergency) {
        this.orderEmergency = orderEmergency;
    }

    public String getPenaltyProvision() {
        return penaltyProvision;
    }

    public void setPenaltyProvision(String penaltyProvision) {
        this.penaltyProvision = penaltyProvision;
    }

    public String getRequiredDoc() {
        return requiredDoc;
    }

    public void setRequiredDoc(String requiredDoc) {
        this.requiredDoc = requiredDoc;
    }

    public Integer getBillOfPositive() {
        return billOfPositive;
    }

    public void setBillOfPositive(Integer billOfPositive) {
        this.billOfPositive = billOfPositive;
    }

    public Integer getBillOfVice() {
        return billOfVice;
    }

    public void setBillOfVice(Integer billOfVice) {
        this.billOfVice = billOfVice;
    }

    public Integer getBoxListPositive() {
        return boxListPositive;
    }

    public void setBoxListPositive(Integer boxListPositive) {
        this.boxListPositive = boxListPositive;
    }

    public Integer getBoxListVice() {
        return boxListVice;
    }

    public void setBoxListVice(Integer boxListVice) {
        this.boxListVice = boxListVice;
    }

    public Integer getInvoicePositive() {
        return invoicePositive;
    }

    public void setInvoicePositive(Integer invoicePositive) {
        this.invoicePositive = invoicePositive;
    }

    public Integer getInvoiceVice() {
        return invoiceVice;
    }

    public void setInvoiceVice(Integer invoiceVice) {
        this.invoiceVice = invoiceVice;
    }

    public Integer getPrimaryOrigin() {
        return primaryOrigin;
    }

    public void setPrimaryOrigin(Integer primaryOrigin) {
        this.primaryOrigin = primaryOrigin;
    }

    public String getOtherDoc() {
        return otherDoc;
    }

    public void setOtherDoc(String otherDoc) {
        this.otherDoc = otherDoc;
    }

    public String getSpecificRequire() {
        return specificRequire;
    }

    public void setSpecificRequire(String specificRequire) {
        this.specificRequire = specificRequire;
    }

    public String getBillOfLading() {
        return billOfLading;
    }

    public void setBillOfLading(String billOfLading) {
        this.billOfLading = billOfLading;
    }

    public String getShippingMarks() {
        return shippingMarks;
    }

    public void setShippingMarks(String shippingMarks) {
        this.shippingMarks = shippingMarks;
    }

    public String getPackageRequire() {
        return packageRequire;
    }

    public void setPackageRequire(String packageRequire) {
        this.packageRequire = packageRequire;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getDutyParagraph() {
        return dutyParagraph;
    }

    public void setDutyParagraph(String dutyParagraph) {
        this.dutyParagraph = dutyParagraph;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

