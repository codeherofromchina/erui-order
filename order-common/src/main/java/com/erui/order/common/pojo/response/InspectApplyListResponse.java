package com.erui.order.common.pojo.response;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class InspectApplyListResponse {
    private Long id;
    // 采购合同号
    private String purchNo;
    //    到货报检单号
    private String inspectApplyNo;
    //    下发部门
    private String department;
    //    采购经办人
    private Long purchaseNameId;
    private String purchaseName;
    //    供应商名称
    private String supplierName;
    //    报检日期
    private Date inspectDate;
    //    报检次数
    private Short num;
    //    全局质检结果
    private Short pubStatus;
    private String pubStatusName;
    // 当前报检单质检结果
    private Short inspectApplyStatus;
    private String inspectApplyStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getPurchNo() {
        return purchNo;
    }

    public void setPurchNo(String purchNo) {
        this.purchNo = purchNo;
    }

    public String getInspectApplyNo() {
        return inspectApplyNo;
    }

    public void setInspectApplyNo(String inspectApplyNo) {
        this.inspectApplyNo = inspectApplyNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getPurchaseNameId() {
        return purchaseNameId;
    }

    public void setPurchaseNameId(Long purchaseNameId) {
        this.purchaseNameId = purchaseNameId;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Date getInspectDate() {
        return inspectDate;
    }

    public void setInspectDate(Date inspectDate) {
        this.inspectDate = inspectDate;
    }

    public Short getNum() {
        return num;
    }

    public void setNum(Short num) {
        this.num = num;
    }

    public Short getPubStatus() {
        return pubStatus;
    }

    public void setPubStatus(Short pubStatus) {
        this.pubStatus = pubStatus;
    }

    public String getPubStatusName() {
        return pubStatusName;
    }

    public void setPubStatusName(String pubStatusName) {
        this.pubStatusName = pubStatusName;
    }

    public Short getInspectApplyStatus() {
        return inspectApplyStatus;
    }

    public void setInspectApplyStatus(Short inspectApplyStatus) {
        this.inspectApplyStatus = inspectApplyStatus;
    }

    public String getInspectApplyStatusName() {
        return inspectApplyStatusName;
    }

    public void setInspectApplyStatusName(String inspectApplyStatusName) {
        this.inspectApplyStatusName = inspectApplyStatusName;
    }
}

