package com.erui.order.common.pojo.request;

import com.erui.order.common.pojo.AttachmentInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/10 下午1:59
 */
public class DeliverConsignSaveRequest {
    // 主键
    private Long id;

    // 状态
    private Short DeliverConsignStatus;

    // 附件内容
    private List<AttachmentInfo> attachments;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public Short getDeliverConsignStatus() {
        return DeliverConsignStatus;
    }

    public void setDeliverConsignStatus(Short DeliverConsignStatus) {
        this.DeliverConsignStatus = DeliverConsignStatus;
    }

    public List<AttachmentInfo> getAttachments() {return attachments;}

    public void setAttachments(List<AttachmentInfo> attachments) {this.attachments = attachments;}
}

