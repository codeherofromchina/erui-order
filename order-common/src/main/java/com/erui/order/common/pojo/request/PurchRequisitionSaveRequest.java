package com.erui.order.common.pojo.request;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.PurchRequisitionGoodsInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午4:49
 */
public class PurchRequisitionSaveRequest {
    private Long id;

    List<PurchRequisitionGoodsInfo> purchRequisitionGoods;
    List<AttachmentInfo> attachments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PurchRequisitionGoodsInfo> getPurchRequisitionGoods() {
        return purchRequisitionGoods;
    }

    public void setPurchRequisitionGoods(List<PurchRequisitionGoodsInfo> purchRequisitionGoods) {
        this.purchRequisitionGoods = purchRequisitionGoods;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }
}
