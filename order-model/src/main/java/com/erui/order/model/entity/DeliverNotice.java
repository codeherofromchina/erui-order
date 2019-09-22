package com.erui.order.model.entity;

import java.util.Date;

public class DeliverNotice {
    private Long id;

    private String deliverNoticeNo;

    private String contractNo;

    private String crmCode;

    private Long deliverConsignId;

    private Long senderId;

    private Long operationSpecialistId;

    private Long wareHouseman;

    private String deliveryDate;

    private String execCoName;

    private Date sendDate;

    private Integer numbers;

    private String otherReq;

    private String packageReq;

    private String prepareReq;

    private Short deliverNoticeStatus;

    private Short handleStatus;

    private Date packingTime;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

    private Boolean deleteFlag;

    private Date deleteTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeliverNoticeNo() {
        return deliverNoticeNo;
    }

    public void setDeliverNoticeNo(String deliverNoticeNo) {
        this.deliverNoticeNo = deliverNoticeNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getCrmCode() {
        return crmCode;
    }

    public void setCrmCode(String crmCode) {
        this.crmCode = crmCode;
    }

    public Long getDeliverConsignId() {
        return deliverConsignId;
    }

    public void setDeliverConsignId(Long deliverConsignId) {
        this.deliverConsignId = deliverConsignId;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public Long getOperationSpecialistId() {
        return operationSpecialistId;
    }

    public void setOperationSpecialistId(Long operationSpecialistId) {
        this.operationSpecialistId = operationSpecialistId;
    }

    public Long getWareHouseman() {
        return wareHouseman;
    }

    public void setWareHouseman(Long wareHouseman) {
        this.wareHouseman = wareHouseman;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getExecCoName() {
        return execCoName;
    }

    public void setExecCoName(String execCoName) {
        this.execCoName = execCoName;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
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

    public Short getDeliverNoticeStatus() {
        return deliverNoticeStatus;
    }

    public void setDeliverNoticeStatus(Short deliverNoticeStatus) {
        this.deliverNoticeStatus = deliverNoticeStatus;
    }

    public Short getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Short handleStatus) {
        this.handleStatus = handleStatus;
    }

    public Date getPackingTime() {
        return packingTime;
    }

    public void setPackingTime(Date packingTime) {
        this.packingTime = packingTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}