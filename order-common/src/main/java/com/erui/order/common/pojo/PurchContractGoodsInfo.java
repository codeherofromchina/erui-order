package com.erui.order.common.pojo;

import java.math.BigDecimal;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午10:28
 */
public class PurchContractGoodsInfo {
    private Long id;
    // 采购申请ID
    private Long purchRequisitionGoodsId;
    // '本次采购数量'
    private Integer purchaseNum;
    // '不含税单价'
    private BigDecimal nonTaxPrice;
    // '采购单价'
    private BigDecimal purchasePrice;
    // '品牌'
    private String purchContractBrand;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }


    public BigDecimal getNonTaxPrice() {
        return nonTaxPrice;
    }

    public void setNonTaxPrice(BigDecimal nonTaxPrice) {
        this.nonTaxPrice = nonTaxPrice;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchContractBrand() {
        return purchContractBrand;
    }

    public void setPurchContractBrand(String purchContractBrand) {
        this.purchContractBrand = purchContractBrand;
    }

    public Long getPurchRequisitionGoodsId() {
        return purchRequisitionGoodsId;
    }

    public void setPurchRequisitionGoodsId(Long purchRequisitionGoodsId) {
        this.purchRequisitionGoodsId = purchRequisitionGoodsId;
    }
}
