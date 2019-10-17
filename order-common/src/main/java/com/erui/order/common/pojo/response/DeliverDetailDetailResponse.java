package com.erui.order.common.pojo.response;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.DeliverDetailGoodsInfo;
import com.erui.order.common.pojo.GoodsInfo;

import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:31
 */
public class DeliverDetailDetailResponse {
    // 主键
    private Long id;
    // 看货通知单ID
    private Long deliverNoticeId;
    // 开单日期
    private Date billingDate;
    // 贸易术语
    private String tradeTerms;
    // 目的港
    private String toPort;
    private String toPortName;
    // 总包装件数
    private Short packTotal;
    // 承运单位名称
    private String carrierCo;
    // 司机姓名
    private String driver;
    // 车牌号码
    private String plateNo;
    // 提货日期
    private String pickupDate;
    // 联系电话
    private String contactTel;
    // 仓储经办人
    private String wareHousemanName;
    // 经办部门
    private String handleDepartment;
    // 发运人员
    private Long senderUserId;
    private String senderUserName;
    // 发运日期
    private Date sendDate;
    // 协办/复核人
    private Long reviewerUserId;
    private String reviewerUserName;
    // 实物检验结论
    private String goodsChkStatus;
    // 资料检验结论
    private String billsChkStatus;
    // 检验员
    private Long checkUserId;
    private String checkUserName;
    // 质检部门
    private String checkDept;
    // 检验日期
    private Date checkDate;
    // 最终放行人
    private Long releaseUserId;
    private String releaseUserName;
    // 放行日期
    private Date releaseDate;
    // 质量分管领导
    private Long qualityLeaderUserId;
    private String qualityLeaderUserName;
    // 申请人
    private Long applicantUserId;
    private String applicantUserName;
    // 申请日期
    private Date applicantDate;
    // 批准人
    private Long approverUserId;
    private String approverUserName;
    // 批准日期
    private Date approvalDate;
    // 特殊情况产品放行原因
    private String reason;
    // 审核意见
    private String opinion;

    // 状态
    private Short deliverDetailStatus;
    // 商品
    private List<GoodsInfo> goodsInfos;
    // 附件内容
    private List<AttachmentInfo> attachments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Short getPackTotal() {
        return packTotal;
    }

    public void setPackTotal(Short packTotal) {
        this.packTotal = packTotal;
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

    public Long getSenderUserId() {
        return senderUserId;
    }

    public void setSenderUserId(Long senderUserId) {
        this.senderUserId = senderUserId;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Long getReviewerUserId() {
        return reviewerUserId;
    }

    public void setReviewerUserId(Long reviewerUserId) {
        this.reviewerUserId = reviewerUserId;
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

    public Long getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Long checkUserId) {
        this.checkUserId = checkUserId;
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

    public Long getReleaseUserId() {
        return releaseUserId;
    }

    public void setReleaseUserId(Long releaseUserId) {
        this.releaseUserId = releaseUserId;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Long getQualityLeaderUserId() {
        return qualityLeaderUserId;
    }

    public void setQualityLeaderUserId(Long qualityLeaderUserId) {
        this.qualityLeaderUserId = qualityLeaderUserId;
    }

    public Long getApplicantUserId() {
        return applicantUserId;
    }

    public void setApplicantUserId(Long applicantUserId) {
        this.applicantUserId = applicantUserId;
    }

    public Date getApplicantDate() {
        return applicantDate;
    }

    public void setApplicantDate(Date applicantDate) {
        this.applicantDate = applicantDate;
    }

    public Long getApproverUserId() {
        return approverUserId;
    }

    public void setApproverUserId(Long approverUserId) {
        this.approverUserId = approverUserId;
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

    public Short getDeliverDetailStatus() {
        return deliverDetailStatus;
    }

    public void setDeliverDetailStatus(Short deliverDetailStatus) {
        this.deliverDetailStatus = deliverDetailStatus;
    }

    public List<GoodsInfo> getGoodsInfos() {
        return goodsInfos;
    }

    public void setGoodsInfos(List<GoodsInfo> goodsInfos) {
        this.goodsInfos = goodsInfos;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }

    public String getToPort() {
        return toPort;
    }

    public String getTradeTerms() {
        return tradeTerms;
    }

    public void setTradeTerms(String tradeTerms) {
        this.tradeTerms = tradeTerms;
    }

    public void setToPort(String toPort) {
        this.toPort = toPort;
    }

    public String getToPortName() {
        return toPortName;
    }

    public void setToPortName(String toPortName) {
        this.toPortName = toPortName;
    }


    public String getWareHousemanName() {
        return wareHousemanName;
    }

    public void setWareHousemanName(String wareHousemanName) {
        this.wareHousemanName = wareHousemanName;
    }

    public String getHandleDepartment() {
        return handleDepartment;
    }

    public void setHandleDepartment(String handleDepartment) {
        this.handleDepartment = handleDepartment;
    }

    public String getSenderUserName() {
        return senderUserName;
    }

    public void setSenderUserName(String senderUserName) {
        this.senderUserName = senderUserName;
    }

    public String getReviewerUserName() {
        return reviewerUserName;
    }

    public void setReviewerUserName(String reviewerUserName) {
        this.reviewerUserName = reviewerUserName;
    }

    public String getCheckUserName() {
        return checkUserName;
    }

    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

    public String getReleaseUserName() {
        return releaseUserName;
    }

    public void setReleaseUserName(String releaseUserName) {
        this.releaseUserName = releaseUserName;
    }

    public String getQualityLeaderUserName() {
        return qualityLeaderUserName;
    }

    public void setQualityLeaderUserName(String qualityLeaderUserName) {
        this.qualityLeaderUserName = qualityLeaderUserName;
    }

    public String getApplicantUserName() {
        return applicantUserName;
    }

    public void setApplicantUserName(String applicantUserName) {
        this.applicantUserName = applicantUserName;
    }

    public String getApproverUserName() {
        return approverUserName;
    }

    public void setApproverUserName(String approverUserName) {
        this.approverUserName = approverUserName;
    }
}

