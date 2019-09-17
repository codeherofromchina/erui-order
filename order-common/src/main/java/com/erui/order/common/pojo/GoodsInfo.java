package com.erui.order.common.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午3:54
 */
public class GoodsInfo {
    // 主键，根据不同场景，主键可能是不同的实体ID
    private Long id;
    // 订单表
    private Long orderGoodsId;
    // 采购合同表
    private Long purchContractGoodsId;
    // 采购ID
    private Long purchId;
    // 销售合同号
    private String contractNo;
    // 项目号
    private String projectNo;
    // 执行单变更后日期
    private Date exeChgDate;
    // SKU
    private String sku;
    // 外文品名
    private String nameEn;
    // 中文品名
    private String nameZh;
    // 订单合同数量
    private Short contractGoodsNum;
    // 采购合同中预锁定的商品数量
    private Short prePurchContractNum;
    // 采购合同数量
    private Integer purchaseNum;
    // 采购中预锁定的商品数量
    private Integer prePurchasedNum;
    // 采购数量
    private Integer purchasedNum;
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
    // '采购合同采购单价'
    private BigDecimal purchasePrice;
    // 采购中商品的单价
    private BigDecimal purchasedPrice;
    // 采购的商品备注
    private String purchasedRemark;


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

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
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

    public Short getPrePurchContractNum() {
        return prePurchContractNum;
    }

    public void setPrePurchContractNum(Short prePurchContractNum) {
        this.prePurchContractNum = prePurchContractNum;
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Long getPurchContractGoodsId() {
        return purchContractGoodsId;
    }

    public void setPurchContractGoodsId(Long purchContractGoodsId) {
        this.purchContractGoodsId = purchContractGoodsId;
    }

    public Long getPurchId() {
        return purchId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public void setPurchId(Long purchId) {
        this.purchId = purchId;
    }


    public Date getExeChgDate() {
        return exeChgDate;
    }

    public void setExeChgDate(Date exeChgDate) {
        this.exeChgDate = exeChgDate;
    }

    public Integer getPrePurchasedNum() {
        return prePurchasedNum;
    }

    public void setPrePurchasedNum(Integer prePurchasedNum) {
        this.prePurchasedNum = prePurchasedNum;
    }

    public Integer getPurchasedNum() {
        return purchasedNum;
    }

    public void setPurchasedNum(Integer purchasedNum) {
        this.purchasedNum = purchasedNum;
    }

    public BigDecimal getPurchasedPrice() {
        return purchasedPrice;
    }

    public void setPurchasedPrice(BigDecimal purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }

    public String getPurchasedRemark() {
        return purchasedRemark;
    }

    public void setPurchasedRemark(String purchasedRemark) {
        this.purchasedRemark = purchasedRemark;
    }
}
