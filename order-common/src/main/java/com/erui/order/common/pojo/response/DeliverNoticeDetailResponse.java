package com.erui.order.common.pojo.response;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.GoodsInfo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:31
 */
public class DeliverNoticeDetailResponse {
    private Long id;
    private Long deliverConsignId;


    // 其他要求
    private String otherReq;
    // '包装要求'
    private String packageReq;
    // '备货要求'
    private String prepareReq;

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
}

