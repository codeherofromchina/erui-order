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
    // 采购申请商品表ID
    private Long purchRequisitionGoodsId;
    // 采购合同表
    private Long purchContractGoodsId;
    // 采购表
    private Long purchGoodsId;
    // 报检表
    private Long inspectApplyGoodsId;
    // 入库商品ID
    private Long instockGoodsId;
    // 订舱商品ID
    private Long deliverConsignGoodsId;
    // 出库商品ID
    private Long deliverDetailGoodsId;
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
    // 预报检数量
    private Integer preInspectNum;
    // 单位
    private String unit;
    private String unitName;
    // 品牌
    private String brand;
    // 采购中的商品品牌
    private String purchContractBrand;
    // 采购需用日期
    private Date requirePurchaseDate;
    // 技术要求和使用条件
    private String techRequire;
    // 质检类型
    private String checkType;
    // 质检方法
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
    // 入库数量
    private Integer instockNum;
    // 货物存放地
    private String instockStock;
    // 订舱本次发货数量
    private Short sendNum;
    // 出库数量
    private Short outboundNum;
    // 厂家直发数量
    private Short straightNum;
    // 备注
    private String detailGoodsRemarks;
    // 预发货数量
    private Integer preOutstockedNum;


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

    public Long getPurchRequisitionGoodsId() {
        return purchRequisitionGoodsId;
    }

    public void setPurchRequisitionGoodsId(Long purchRequisitionGoodsId) {
        this.purchRequisitionGoodsId = purchRequisitionGoodsId;
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

    public String getPurchContractBrand() {
        return purchContractBrand;
    }

    public void setPurchContractBrand(String purchContractBrand) {
        this.purchContractBrand = purchContractBrand;
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

    public Integer getPreInspectNum() {
        return preInspectNum;
    }

    public void setPreInspectNum(Integer preInspectNum) {
        this.preInspectNum = preInspectNum;
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

    public Long getPurchGoodsId() {
        return purchGoodsId;
    }

    public void setPurchGoodsId(Long purchGoodsId) {
        this.purchGoodsId = purchGoodsId;
    }

    public Long getInspectApplyGoodsId() {
        return inspectApplyGoodsId;
    }

    public void setInspectApplyGoodsId(Long inspectApplyGoodsId) {
        this.inspectApplyGoodsId = inspectApplyGoodsId;
    }

    public Long getInstockGoodsId() {
        return instockGoodsId;
    }

    public void setInstockGoodsId(Long instockGoodsId) {
        this.instockGoodsId = instockGoodsId;
    }

    public Long getDeliverConsignGoodsId() {
        return deliverConsignGoodsId;
    }

    public void setDeliverConsignGoodsId(Long deliverConsignGoodsId) {
        this.deliverConsignGoodsId = deliverConsignGoodsId;
    }

    public Long getDeliverDetailGoodsId() {
        return deliverDetailGoodsId;
    }

    public void setDeliverDetailGoodsId(Long deliverDetailGoodsId) {
        this.deliverDetailGoodsId = deliverDetailGoodsId;
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

    public Integer getInstockNum() {
        return instockNum;
    }

    public String getInstockStock() {
        return instockStock;
    }

    public void setInstockNum(Integer instockNum) {
        this.instockNum = instockNum;
    }

    public void setInstockStock(String instockStock) {
        this.instockStock = instockStock;
    }

    public Short getSendNum() {
        return sendNum;
    }

    public void setSendNum(Short sendNum) {
        this.sendNum = sendNum;
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

    public Integer getPreOutstockedNum() {
        return preOutstockedNum;
    }

    public void setPreOutstockedNum(Integer preOutstockedNum) {
        this.preOutstockedNum = preOutstockedNum;
    }
}
