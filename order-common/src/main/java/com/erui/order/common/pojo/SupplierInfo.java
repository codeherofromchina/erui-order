package com.erui.order.common.pojo;

/**
 * @Auther 王晓丹
 * @Date 2019/9/15 下午12:07
 */
public class SupplierInfo {
    private Long id;
    // 供应商类型
    private String supplierType;
    private String supplierTypeName;
    // 供应商名称
    private String supplierName;
    // 供应商编码
    private String supplierNo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public String getSupplierTypeName() {
        return supplierTypeName;
    }

    public void setSupplierTypeName(String supplierTypeName) {
        this.supplierTypeName = supplierTypeName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierNo() {
        return supplierNo;
    }

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo;
    }
}
