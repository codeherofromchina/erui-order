package com.erui.order.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderGoods {
    private Long id;

    private Long orderId;

    private String contractNo;

    private String sku;

    private String meteType;

    private String meteTypeName;

    private String tplNo;

    private String tplName;

    private Long departmentId;

    private String nameEn;

    private String nameZh;

    private Short contractGoodsNum;

    private String unit;

    private BigDecimal price;

    private BigDecimal eruiPrice;

    private BigDecimal totalPrice;

    private String brand;

    private Short prePurchContractNum;

    private Short purchContractNum;

    private Short preOutstockedNum;

    private Short outstockedNum;

    private Short instockedNum;

    private Date exeChgDate;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

    private Boolean deleteFlag;

    private Date deleteTime;

    private String attrs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getMeteType() {
        return meteType;
    }

    public void setMeteType(String meteType) {
        this.meteType = meteType;
    }

    public String getMeteTypeName() {
        return meteTypeName;
    }

    public void setMeteTypeName(String meteTypeName) {
        this.meteTypeName = meteTypeName;
    }

    public String getTplNo() {
        return tplNo;
    }

    public void setTplNo(String tplNo) {
        this.tplNo = tplNo;
    }

    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public Short getContractGoodsNum() {
        return contractGoodsNum;
    }

    public void setContractGoodsNum(Short contractGoodsNum) {
        this.contractGoodsNum = contractGoodsNum;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getEruiPrice() {
        return eruiPrice;
    }

    public void setEruiPrice(BigDecimal eruiPrice) {
        this.eruiPrice = eruiPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Short getPrePurchContractNum() {
        return prePurchContractNum;
    }

    public void setPrePurchContractNum(Short prePurchContractNum) {
        this.prePurchContractNum = prePurchContractNum;
    }

    public Short getPurchContractNum() {
        return purchContractNum;
    }

    public void setPurchContractNum(Short purchContractNum) {
        this.purchContractNum = purchContractNum;
    }

    public Short getPreOutstockedNum() {
        return preOutstockedNum;
    }

    public void setPreOutstockedNum(Short preOutstockedNum) {
        this.preOutstockedNum = preOutstockedNum;
    }

    public Short getOutstockedNum() {
        return outstockedNum;
    }

    public void setOutstockedNum(Short outstockedNum) {
        this.outstockedNum = outstockedNum;
    }

    public Short getInstockedNum() {
        return instockedNum;
    }

    public void setInstockedNum(Short instockedNum) {
        this.instockedNum = instockedNum;
    }

    public Date getExeChgDate() {
        return exeChgDate;
    }

    public void setExeChgDate(Date exeChgDate) {
        this.exeChgDate = exeChgDate;
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

    public String getAttrs() {
        return attrs;
    }

    public void setAttrs(String attrs) {
        this.attrs = attrs;
    }
}