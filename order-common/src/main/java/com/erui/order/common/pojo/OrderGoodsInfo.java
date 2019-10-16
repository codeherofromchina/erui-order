package com.erui.order.common.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午3:29
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderGoodsInfo {
    private Long id;

    private String sku;

    private String meteType;

    private String meteTypeName;

    private String tplNo;

    private String tplName;

    private Long departmentId;

    private String departmentName;

    private String nameEn;

    private String nameZh;

    private Short contractGoodsNum;
    // 预备采购数量
    private Short prePurchContractNum;
    // 预发货数量
    private Integer preOutstockedNum;

    private String unit;

    private String unitName;

    private BigDecimal price;

    private BigDecimal eruiPrice;

    private BigDecimal totalPrice;

    private String brand;

    private String attrs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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


    public Short getPrePurchContractNum() {
        return prePurchContractNum;
    }

    public void setPrePurchContractNum(Short prePurchContractNum) {
        this.prePurchContractNum = prePurchContractNum;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
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
        return this.totalPrice;
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

    public String getAttrs() {
        return attrs;
    }

    public void setAttrs(String attrs) {
        this.attrs = attrs;
    }

    public Integer getPreOutstockedNum() {
        return preOutstockedNum;
    }

    public void setPreOutstockedNum(Integer preOutstockedNum) {
        this.preOutstockedNum = preOutstockedNum;
    }
}
