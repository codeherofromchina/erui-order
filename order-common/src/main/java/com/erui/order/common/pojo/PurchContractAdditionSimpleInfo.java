package com.erui.order.common.pojo;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:36
 * 采购合同附加简单内容
 */
public class PurchContractAdditionSimpleInfo {
    private Long id;

    //  '1、货物皆为符合__的合格产品',
    private String productRequirement;
    //  '1、质保期自__   。',
    private String warrantyPeriod;
    //  '3、将货物于__前运送至',
    private Date shippingDate;
    //  '3、指定的地点：__。',
    private String designatedLocation;
    //  '4、费用负担：__运',
    private String costBurden;
    //  '5、合同第1条在__处检验',
    private String inspectionAt;
    //  '5、并在__日内提出异议',
    private String withinDays;
    //  '6、结算方式及时间：__。',
    private String methodAndTime;
    //  '9、附《__技术协议》',
    private String agreementName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductRequirement() {
        return productRequirement;
    }

    public void setProductRequirement(String productRequirement) {
        this.productRequirement = productRequirement;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getDesignatedLocation() {
        return designatedLocation;
    }

    public void setDesignatedLocation(String designatedLocation) {
        this.designatedLocation = designatedLocation;
    }

    public String getCostBurden() {
        return costBurden;
    }

    public void setCostBurden(String costBurden) {
        this.costBurden = costBurden;
    }

    public String getInspectionAt() {
        return inspectionAt;
    }

    public void setInspectionAt(String inspectionAt) {
        this.inspectionAt = inspectionAt;
    }

    public String getWithinDays() {
        return withinDays;
    }

    public void setWithinDays(String withinDays) {
        this.withinDays = withinDays;
    }

    public String getMethodAndTime() {
        return methodAndTime;
    }

    public void setMethodAndTime(String methodAndTime) {
        this.methodAndTime = methodAndTime;
    }

    public String getAgreementName() {
        return agreementName;
    }

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
    }
}
