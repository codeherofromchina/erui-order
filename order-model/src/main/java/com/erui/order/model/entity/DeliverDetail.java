package com.erui.order.model.entity;

import java.util.Date;

public class DeliverDetail {
    private Long id;

    private String deliverDetailNo;

    private Long deliverNoticeId;

    private Date billingDate;

    private String carrierCo;

    private String driver;

    private String plateNo;

    private String pickupDate;

    private String contactTel;

    private String handleDepartment;

    private Long wareHouseman;

    private String wareHousemanName;

    private Date sendDate;

    private Long sender;

    private String senderName;

    private Long reviewer;

    private String reviewerName;

    private String goodsChkStatus;

    private String billsChkStatus;

    private Long checkerUid;

    private String checkerName;

    private String checkDept;

    private Date checkDate;

    private Date releaseDate;

    private String releaseName;

    private Long releaseUid;

    private Long qualityLeaderId;

    private String qualityLeaderName;

    private Long applicant;

    private String applicantName;

    private Date applicantDate;

    private Long approver;

    private String approverName;

    private Date approvalDate;

    private String reason;

    private String opinion;

    private Date leaveDate;

    private Short deliverDetailStatus;

    private Short packTotal;

    private Boolean outCheck;

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

    public String getDeliverDetailNo() {
        return deliverDetailNo;
    }

    public void setDeliverDetailNo(String deliverDetailNo) {
        this.deliverDetailNo = deliverDetailNo;
    }

    public Long getDeliverNoticeId() {
        return deliverNoticeId;
    }

    public void setDeliverNoticeId(Long deliverNoticeId) {
        this.deliverNoticeId = deliverNoticeId;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public String getCarrierCo() {
        return carrierCo;
    }

    public void setCarrierCo(String carrierCo) {
        this.carrierCo = carrierCo;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getHandleDepartment() {
        return handleDepartment;
    }

    public void setHandleDepartment(String handleDepartment) {
        this.handleDepartment = handleDepartment;
    }

    public Long getWareHouseman() {
        return wareHouseman;
    }

    public void setWareHouseman(Long wareHouseman) {
        this.wareHouseman = wareHouseman;
    }

    public String getWareHousemanName() {
        return wareHousemanName;
    }

    public void setWareHousemanName(String wareHousemanName) {
        this.wareHousemanName = wareHousemanName;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Long getSender() {
        return sender;
    }

    public void setSender(Long sender) {
        this.sender = sender;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public Long getReviewer() {
        return reviewer;
    }

    public void setReviewer(Long reviewer) {
        this.reviewer = reviewer;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getGoodsChkStatus() {
        return goodsChkStatus;
    }

    public void setGoodsChkStatus(String goodsChkStatus) {
        this.goodsChkStatus = goodsChkStatus;
    }

    public String getBillsChkStatus() {
        return billsChkStatus;
    }

    public void setBillsChkStatus(String billsChkStatus) {
        this.billsChkStatus = billsChkStatus;
    }

    public Long getCheckerUid() {
        return checkerUid;
    }

    public void setCheckerUid(Long checkerUid) {
        this.checkerUid = checkerUid;
    }

    public String getCheckerName() {
        return checkerName;
    }

    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName;
    }

    public String getCheckDept() {
        return checkDept;
    }

    public void setCheckDept(String checkDept) {
        this.checkDept = checkDept;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseName() {
        return releaseName;
    }

    public void setReleaseName(String releaseName) {
        this.releaseName = releaseName;
    }

    public Long getReleaseUid() {
        return releaseUid;
    }

    public void setReleaseUid(Long releaseUid) {
        this.releaseUid = releaseUid;
    }

    public Long getQualityLeaderId() {
        return qualityLeaderId;
    }

    public void setQualityLeaderId(Long qualityLeaderId) {
        this.qualityLeaderId = qualityLeaderId;
    }

    public String getQualityLeaderName() {
        return qualityLeaderName;
    }

    public void setQualityLeaderName(String qualityLeaderName) {
        this.qualityLeaderName = qualityLeaderName;
    }

    public Long getApplicant() {
        return applicant;
    }

    public void setApplicant(Long applicant) {
        this.applicant = applicant;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public Date getApplicantDate() {
        return applicantDate;
    }

    public void setApplicantDate(Date applicantDate) {
        this.applicantDate = applicantDate;
    }

    public Long getApprover() {
        return approver;
    }

    public void setApprover(Long approver) {
        this.approver = approver;
    }

    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Short getDeliverDetailStatus() {
        return deliverDetailStatus;
    }

    public void setDeliverDetailStatus(Short deliverDetailStatus) {
        this.deliverDetailStatus = deliverDetailStatus;
    }

    public Short getPackTotal() {
        return packTotal;
    }

    public void setPackTotal(Short packTotal) {
        this.packTotal = packTotal;
    }

    public Boolean getOutCheck() {
        return outCheck;
    }

    public void setOutCheck(Boolean outCheck) {
        this.outCheck = outCheck;
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