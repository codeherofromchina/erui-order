package com.erui.order.common.pojo.request;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.InstockGoodsInfo;

import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/10 下午1:59
 */
public class InstockSaveRequest {
    // 主键
    private Long id;
    // 入库日期
    private Date instockDate;
    // 备注内容
    private String remarks;
    // 入库状态
    private Short instockStatus;
    // 商品信息
    private List<InstockGoodsInfo> instockGoodsInfos;
    // 附件内容
    private List<AttachmentInfo> attachments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }


    public Date getInstockDate() {
        return instockDate;
    }

    public void setInstockDate(Date instockDate) {
        this.instockDate = instockDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Short getInstockStatus() {
        return instockStatus;
    }

    public void setInstockStatus(Short instockStatus) {
        this.instockStatus = instockStatus;
    }

    public List<InstockGoodsInfo> getInstockGoodsInfos() {
        return instockGoodsInfos;
    }

    public void setInstockGoodsInfos(List<InstockGoodsInfo> instockGoodsInfos) {
        this.instockGoodsInfos = instockGoodsInfos;
    }
}

