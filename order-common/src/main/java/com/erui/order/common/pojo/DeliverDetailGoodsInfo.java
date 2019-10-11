package com.erui.order.common.pojo;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:28
 */
public class DeliverDetailGoodsInfo {
    // 主键
    private Long id;
    // 订舱商品ID
    private Long deliverConsignGoodsId;
    // 出库数量
    private Short outboundNum;
    // 厂家直发数量
    private Short straightNum;
    // 备注
    private String detailGoodsRemarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}

