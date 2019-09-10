package com.erui.order.common.pojo.response;

import com.erui.order.common.pojo.AttachmentInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:31
 */
public class DeliverDetailDetailResponse {
    private Long id;

    private Short DeliverDetailStatus;

    // 附件内容
    private List<AttachmentInfo> attachments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getDeliverDetailStatus() {
        return DeliverDetailStatus;
    }

    public void setDeliverDetailStatus(Short DeliverDetailStatus) {
        this.DeliverDetailStatus = DeliverDetailStatus;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }
}

