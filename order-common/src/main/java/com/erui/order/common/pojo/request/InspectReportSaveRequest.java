package com.erui.order.common.pojo.request;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.InspectReportGoodsInfo;

import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/10 下午1:59
 */
public class InspectReportSaveRequest {
    // 主键
    private Long id;
    // 检验日期
    private Date checkDate;
    // 检验完成日期
    private Date doneDate;
    // 备注
    private String reportRemarks;
    // 状态
    private Short inspectReportStatus;
    // 商品信息
    private List<InspectReportGoodsInfo> inspectReportGoodsInfos;
    // 附件内容
    private List<AttachmentInfo> attachments;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public Short getInspectReportStatus() {
        return inspectReportStatus;
    }

    public void setInspectReportStatus(Short InspectReportStatus) {
        this.inspectReportStatus = InspectReportStatus;
    }

    public List<AttachmentInfo> getAttachments() {return attachments;}

    public void setAttachments(List<AttachmentInfo> attachments) {this.attachments = attachments;}

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

    public String getReportRemarks() {
        return reportRemarks;
    }

    public void setReportRemarks(String reportRemarks) {
        this.reportRemarks = reportRemarks;
    }

    public List<InspectReportGoodsInfo> getInspectReportGoodsInfos() {
        return inspectReportGoodsInfos;
    }

    public void setInspectReportGoodsInfos(List<InspectReportGoodsInfo> inspectReportGoodsInfos) {
        this.inspectReportGoodsInfos = inspectReportGoodsInfos;
    }
}

