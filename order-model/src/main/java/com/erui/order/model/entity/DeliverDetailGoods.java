package com.erui.order.model.entity;

import java.util.Date;

public class DeliverDetailGoods {
    private Long id;

    private Long deliverDetailId;

    private Long deliverConsignGoodsId;

    private Short outboundNum;

    private Short straightNum;

    private String detailGoodsRemarks;

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

    public Long getDeliverDetailId() {
        return deliverDetailId;
    }

    public void setDeliverDetailId(Long deliverDetailId) {
        this.deliverDetailId = deliverDetailId;
    }

    public Long getDeliverConsignGoodsId() {
        return deliverConsignGoodsId;
    }

    public void setDeliverConsignGoodsId(Long deliverConsignGoodsId) {
        this.deliverConsignGoodsId = deliverConsignGoodsId;
    }

    public Short getOutboundNum() {
        return outboundNum;
    }

    public void setOutboundNum(Short outboundNum) {
        this.outboundNum = outboundNum;
    }

    public Short getStraightNum() {
        return straightNum;
    }

    public void setStraightNum(Short straightNum) {
        this.straightNum = straightNum;
    }

    public String getDetailGoodsRemarks() {
        return detailGoodsRemarks;
    }

    public void setDetailGoodsRemarks(String detailGoodsRemarks) {
        this.detailGoodsRemarks = detailGoodsRemarks;
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