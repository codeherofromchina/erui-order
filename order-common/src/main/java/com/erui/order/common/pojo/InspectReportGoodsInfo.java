package com.erui.order.common.pojo;

/**
 * @Auther 王晓丹
 * @Date 2019/9/20 下午3:55
 */
public class InspectReportGoodsInfo {
    private Long id;
    // 订单商品数量
    private Long orderGoodsId;
    // 抽样数量
    private Integer samples;
    // 不合格数量
    private Integer unqualified;
    // 不合格描述
    private String unqualifiedDesc;
    // 不合格类型
    private Short unqualifiedType;

    public Long getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Long orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSamples() {
        return samples;
    }

    public void setSamples(Integer samples) {
        this.samples = samples;
    }

    public Integer getUnqualified() {
        return unqualified;
    }

    public void setUnqualified(Integer unqualified) {
        this.unqualified = unqualified;
    }

    public String getUnqualifiedDesc() {
        return unqualifiedDesc;
    }

    public void setUnqualifiedDesc(String unqualifiedDesc) {
        this.unqualifiedDesc = unqualifiedDesc;
    }

    public Short getUnqualifiedType() {
        return unqualifiedType;
    }

    public void setUnqualifiedType(Short unqualifiedType) {
        this.unqualifiedType = unqualifiedType;
    }
}
