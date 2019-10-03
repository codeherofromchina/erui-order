package com.erui.order.common.pojo;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:28
 */
public class InspectApplyGoodsInfo {
    // 主键
    private Long id;
    // 采购单商品ID
    private Long purchGoodsId;
    // 报检数量
    private Integer inspectNum;
    // 重量
    private String height;
    // 长宽高
    private String lwh;
    // 抽样数
    private Integer samples;
    // 不合格数量
    private Integer unqualified;
    // 不合格描述
    private String unqualifiedDesc;
    // 不合格类型
    private Short unqualifiedType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getPurchGoodsId() {
        return purchGoodsId;
    }

    public void setPurchGoodsId(Long purchGoodsId) {
        this.purchGoodsId = purchGoodsId;
    }

    public Integer getInspectNum() {
        return inspectNum;
    }

    public void setInspectNum(Integer inspectNum) {
        this.inspectNum = inspectNum;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getLwh() {
        return lwh;
    }

    public void setLwh(String lwh) {
        this.lwh = lwh;
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

