package com.erui.order.common.pojo.response;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.GoodsInfo;

import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:31
 */
public class InspectReportDetailResponse {
    private Long id;
    // 检验员
    private Long checkUserId;
    private String checkUserName;
    // 质检部门
    private Long checkDeptId;
    private String checkDeptName;
    // NCR编号
    private String ncrNo;
    // 采购合同号
    private String purchNo;
    // 检验日期
    private Date checkDate;
    // 检验完成日期
    private Date doneDate;
    // 状态
    private Short inspectReportStatus;
    // 整改信息
    private String msg;
    // 备注信息
    private String reportRemarks;
    // 商品信息
    private List<GoodsInfo> goodsInfos;
    // 附件内容
    private List<AttachmentInfo> attachments;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Long checkUserId) {
        this.checkUserId = checkUserId;
    }

    public String getCheckUserName() {
        return checkUserName;
    }

    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

    public Long getCheckDeptId() {
        return checkDeptId;
    }

    public void setCheckDeptId(Long checkDeptId) {
        this.checkDeptId = checkDeptId;
    }

    public String getCheckDeptName() {
        return checkDeptName;
    }

    public void setCheckDeptName(String checkDeptName) {
        this.checkDeptName = checkDeptName;
    }

    public String getNcrNo() {
        return ncrNo;
    }

    public void setNcrNo(String ncrNo) {
        this.ncrNo = ncrNo;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public Date getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(Date doneDate) {
        this.doneDate = doneDate;
    }

    public Short getInspectReportStatus() {
        return inspectReportStatus;
    }

    public void setInspectReportStatus(Short inspectReportStatus) {
        this.inspectReportStatus = inspectReportStatus;
    }

    public String getReportRemarks() {
        return reportRemarks;
    }

    public void setReportRemarks(String reportRemarks) {
        this.reportRemarks = reportRemarks;
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }

    public String getPurchNo() {
        return purchNo;
    }

    public void setPurchNo(String purchNo) {
        this.purchNo = purchNo;
    }
}

