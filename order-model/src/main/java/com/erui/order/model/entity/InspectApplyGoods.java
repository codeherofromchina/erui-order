package com.erui.order.model.entity;

import java.util.Date;

public class InspectApplyGoods {
    private Long id;

    private Long inspectApplyId;

    private Long inspectReportId;

    private Long purchGoodsId;

    private Integer purchaseNum;

    private Integer inspectNum;

    private String height;

    private String lwh;

    private String remarks;

    private Integer samples;

    private Integer unqualified;

    private String unqualifiedDesc;

    private Integer instockNum;

    private Short unqualifiedType;

    private String qualityInspectType;

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

    public Long getInspectApplyId() {
        return inspectApplyId;
    }

    public void setInspectApplyId(Long inspectApplyId) {
        this.inspectApplyId = inspectApplyId;
    }

    public Long getInspectReportId() {
        return inspectReportId;
    }

    public void setInspectReportId(Long inspectReportId) {
        this.inspectReportId = inspectReportId;
    }

    public Long getPurchGoodsId() {
        return purchGoodsId;
    }

    public void setPurchGoodsId(Long purchGoodsId) {
        this.purchGoodsId = purchGoodsId;
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public Integer getInstockNum() {
        return instockNum;
    }

    public void setInstockNum(Integer instockNum) {
        this.instockNum = instockNum;
    }

    public Short getUnqualifiedType() {
        return unqualifiedType;
    }

    public void setUnqualifiedType(Short unqualifiedType) {
        this.unqualifiedType = unqualifiedType;
    }

    public String getQualityInspectType() {
        return qualityInspectType;
    }

    public void setQualityInspectType(String qualityInspectType) {
        this.qualityInspectType = qualityInspectType;
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