package com.erui.order.common.pojo;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午3:54
 */
public class GoodsInfo {
    private Long id;
    private Long orderGoodsId;
    // SKU
    private String sku;
    // 外文品名
    private String nameEn;
    // 中文品名
    private String nameZh;
    // 合同数量
    private Short contractGoodsNum;
    // 单位
    private String unit;
    private String unitName;
    // 品牌
    private String brand;
    // 采购需用日期
    private Date requirePurchaseDate;

    // 技术要求和使用条件
    private String techRequire;

    // 质检类型 和 质检方法
    private String checkType;

    private String checkMethod;

    // 合格证
    private String certificate;

    // 技术审核
    private String techAudit;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Long orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
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

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getRequirePurchaseDate() {
        return requirePurchaseDate;
    }

    public void setRequirePurchaseDate(Date requirePurchaseDate) {
        this.requirePurchaseDate = requirePurchaseDate;
    }

    public String getTechRequire() {
        return techRequire;
    }

    public void setTechRequire(String techRequire) {
        this.techRequire = techRequire;
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public String getCheckMethod() {
        return checkMethod;
    }

    public void setCheckMethod(String checkMethod) {
        this.checkMethod = checkMethod;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getTechAudit() {
        return techAudit;
    }

    public void setTechAudit(String techAudit) {
        this.techAudit = techAudit;
    }
}
