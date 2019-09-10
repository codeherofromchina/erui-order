package com.erui.order.common.pojo;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:37
 * 采购合同附加标准信息
 */
public class PurchContractAdditionStandardInfo {
    private Long id;
    //  '基础信息、用于买受人__，且出卖人',
    private String usedForBuyer;
    //  '第二条、质量标准及要求__',
    private String standardAndRequire;
    //  '第四条、产品包装标准、包装费用与包装物回收__',
    private String meetRequire;
    //  '第五条、质保与售后__',
    private String warrantyPeriod;
    //  '第六条、出卖人负责于__（前）',
    private Date deliveryDate;
    //  '第六条、交货地点:__。',
    private String deliveryPlace;
    //  '第七条、检验期为__天(月)',
    private String inspectionPeriod;
    //  '第七条、技术资料包括__版本',
    private String dataVersion;
    //  '第八条、结算方式及时间__',
    private String methodAndTime;
    //  '第十二条、收信地址为__',
    private String insideAddressS;
    //  '第十二条、收信人为__',
    private String addresseeS;
    //  '第十二条、电话为__',
    private String telephoneS;
    //  '第十二条、电子邮件收件邮箱地址为__',
    private String inboxAddressS;
    //  '第十二条、收信地址为__',
    private String insideAddressB;
    //  '第十二条、收信人为__',
    private String addresseeB;
    //  '第十二条、电话为__',
    private String telephoneB;
    //  '第十二条、电子邮件收件邮箱地址为__',
    private String inboxAddressB;
    //  '第十五条、按下列第__种方式解决',
    private String solution;
    //  '第十五条、提交__仲裁委员会仲裁',
    private String boardArbitration;
    //  '第十六条、本合同一式__份',
    private String fewCopies;
    //  '第十六条、出卖人执__份',
    private String sellerFewCopies;
    //  '第十六条、买受人执__份',
    private String buyerFewCopies;
    //  '第十六条、合同附件：1.__',
    private String appendicesName1;
    //  '第十六条、合同附件：2.__',
    private String appendicesName2;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsedForBuyer() {
        return usedForBuyer;
    }

    public void setUsedForBuyer(String usedForBuyer) {
        this.usedForBuyer = usedForBuyer;
    }

    public String getStandardAndRequire() {
        return standardAndRequire;
    }

    public void setStandardAndRequire(String standardAndRequire) {
        this.standardAndRequire = standardAndRequire;
    }

    public String getMeetRequire() {
        return meetRequire;
    }

    public void setMeetRequire(String meetRequire) {
        this.meetRequire = meetRequire;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public String getInspectionPeriod() {
        return inspectionPeriod;
    }

    public void setInspectionPeriod(String inspectionPeriod) {
        this.inspectionPeriod = inspectionPeriod;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getMethodAndTime() {
        return methodAndTime;
    }

    public void setMethodAndTime(String methodAndTime) {
        this.methodAndTime = methodAndTime;
    }

    public String getInsideAddressS() {
        return insideAddressS;
    }

    public void setInsideAddressS(String insideAddressS) {
        this.insideAddressS = insideAddressS;
    }

    public String getAddresseeS() {
        return addresseeS;
    }

    public void setAddresseeS(String addresseeS) {
        this.addresseeS = addresseeS;
    }

    public String getTelephoneS() {
        return telephoneS;
    }

    public void setTelephoneS(String telephoneS) {
        this.telephoneS = telephoneS;
    }

    public String getInboxAddressS() {
        return inboxAddressS;
    }

    public void setInboxAddressS(String inboxAddressS) {
        this.inboxAddressS = inboxAddressS;
    }

    public String getInsideAddressB() {
        return insideAddressB;
    }

    public void setInsideAddressB(String insideAddressB) {
        this.insideAddressB = insideAddressB;
    }

    public String getAddresseeB() {
        return addresseeB;
    }

    public void setAddresseeB(String addresseeB) {
        this.addresseeB = addresseeB;
    }

    public String getTelephoneB() {
        return telephoneB;
    }

    public void setTelephoneB(String telephoneB) {
        this.telephoneB = telephoneB;
    }

    public String getInboxAddressB() {
        return inboxAddressB;
    }

    public void setInboxAddressB(String inboxAddressB) {
        this.inboxAddressB = inboxAddressB;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getBoardArbitration() {
        return boardArbitration;
    }

    public void setBoardArbitration(String boardArbitration) {
        this.boardArbitration = boardArbitration;
    }

    public String getFewCopies() {
        return fewCopies;
    }

    public void setFewCopies(String fewCopies) {
        this.fewCopies = fewCopies;
    }

    public String getSellerFewCopies() {
        return sellerFewCopies;
    }

    public void setSellerFewCopies(String sellerFewCopies) {
        this.sellerFewCopies = sellerFewCopies;
    }

    public String getBuyerFewCopies() {
        return buyerFewCopies;
    }

    public void setBuyerFewCopies(String buyerFewCopies) {
        this.buyerFewCopies = buyerFewCopies;
    }

    public String getAppendicesName1() {
        return appendicesName1;
    }

    public void setAppendicesName1(String appendicesName1) {
        this.appendicesName1 = appendicesName1;
    }

    public String getAppendicesName2() {
        return appendicesName2;
    }

    public void setAppendicesName2(String appendicesName2) {
        this.appendicesName2 = appendicesName2;
    }
}
