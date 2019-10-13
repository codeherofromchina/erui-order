package com.erui.order.common.pojo.response;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.GoodsInfo;

import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:31
 */
public class DeliverNoticeDetailResponse {
    private Long id;
    private Long deliverConsignId;
    //下单人
    private Long senderId;
    private String senderName;
    // 项目号
    private String projectNo;
    // 单证操作
    private Long operationSpecialistId;
    private String operationSpecialistName;
    // 下单日期
    private Date sendDate;
    // 业务项目简述及中英货物名称
    private String businessSketch;
    // 货物存放地
    private String goodsDepositPlace;
    // 贸易术语
    private String tradeTerms;
    // 目的国
    private String toCountry;
    private String toCountryName;
    // 目的地
    private String toPlace;
    // 产品件数
    private Integer numbers;
    // 事业部项目负责人
    private Long technicalId;
    private String technicalUserName;
    // 运输方式
    private String transportType;
    private String transportTypeName;
    // 项目约定交付日期
    private String deliveryDate;
    // 订单紧急程度 1:一般（成本优先） 2:紧急 3:异常紧急（交期优先）
    private Integer orderEmergency;
    // 其他要求
    private String otherReq;
    // '包装要求'
    private String packageReq;
    // '备货要求'
    private String prepareReq;
    // 看货通知单状态
    private Short deliverNoticeStatus;
    // 附件内容
    private List<AttachmentInfo> attachments;
    // 商品信息
    private List<GoodsInfo> goodsInfos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getDeliverNoticeStatus() {
        return deliverNoticeStatus;
    }

    public void setDeliverNoticeStatus(Short DeliverNoticeStatus) {
        this.deliverNoticeStatus = DeliverNoticeStatus;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }

    public List<GoodsInfo> getGoodsInfos() {
        return goodsInfos;
    }

    public void setGoodsInfos(List<GoodsInfo> goodsInfos) {
        this.goodsInfos = goodsInfos;
    }

    public Long getDeliverConsignId() {
        return deliverConsignId;
    }

    public void setDeliverConsignId(Long deliverConsignId) {
        this.deliverConsignId = deliverConsignId;
    }

    public String getOtherReq() {
        return otherReq;
    }

    public void setOtherReq(String otherReq) {
        this.otherReq = otherReq;
    }

    public String getPackageReq() {
        return packageReq;
    }

    public void setPackageReq(String packageReq) {
        this.packageReq = packageReq;
    }

    public String getPrepareReq() {
        return prepareReq;
    }

    public void setPrepareReq(String prepareReq) {
        this.prepareReq = prepareReq;
    }


    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public Long getOperationSpecialistId() {
        return operationSpecialistId;
    }

    public void setOperationSpecialistId(Long operationSpecialistId) {
        this.operationSpecialistId = operationSpecialistId;
    }

    public String getOperationSpecialistName() {
        return operationSpecialistName;
    }

    public void setOperationSpecialistName(String operationSpecialistName) {
        this.operationSpecialistName = operationSpecialistName;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getBusinessSketch() {
        return businessSketch;
    }

    public void setBusinessSketch(String businessSketch) {
        this.businessSketch = businessSketch;
    }

    public String getGoodsDepositPlace() {
        return goodsDepositPlace;
    }

    public void setGoodsDepositPlace(String goodsDepositPlace) {
        this.goodsDepositPlace = goodsDepositPlace;
    }

    public String getTradeTerms() {
        return tradeTerms;
    }

    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public String getToCountryName() {
        return toCountryName;
    }

    public void setToCountryName(String toCountryName) {
        this.toCountryName = toCountryName;
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public Long getTechnicalId() {
        return technicalId;
    }

    public void setTechnicalId(Long technicalId) {
        this.technicalId = technicalId;
    }

    public String getTechnicalUserName() {
        return technicalUserName;
    }

    public void setTechnicalUserName(String technicalUserName) {
        this.technicalUserName = technicalUserName;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getTransportTypeName() {
        return transportTypeName;
    }

    public void setTransportTypeName(String transportTypeName) {
        this.transportTypeName = transportTypeName;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getOrderEmergency() {
        // 订单紧急程度 1:一般（成本优先） 2:紧急 3:异常紧急（交期优先）
        if (orderEmergency != null) {
            switch (orderEmergency) {
                case 1:
                    return "一般（成本优先）";
                case 2:
                    return "紧急";
                case 3:
                    return "异常紧急（交期优先）";
                default:
                    return String.valueOf(orderEmergency);
            }
        }
        return null;
    }

    public void setOrderEmergency(Integer orderEmergency) {
        this.orderEmergency = orderEmergency;
    }
}

