package com.erui.order.common.pojo.response;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class InstockListResponse {
    private Long id;
    // 到货报检单号
    private String inspectApplyNo;
    // 销售合同号
    private String contractNo;
    // 项目号
    private String projectNo;
    // 采购合同号
    private String purchNo;
    // 供应商名称
    private String supplierName;
    // 是否入易瑞仓库
    private Boolean enterEruiWarehouse;
    // 入库时间
    private Date instockDate;

    // 入库状态
    private Short instockStatus;
    private String instockStatusName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getInspectApplyNo() {
        return inspectApplyNo;
    }

    public void setInspectApplyNo(String inspectApplyNo) {
        this.inspectApplyNo = inspectApplyNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getPurchNo() {
        return purchNo;
    }

    public void setPurchNo(String purchNo) {
        this.purchNo = purchNo;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Boolean getEnterEruiWarehouse() {
        return enterEruiWarehouse;
    }

    public void setEnterEruiWarehouse(Boolean enterEruiWarehouse) {
        this.enterEruiWarehouse = enterEruiWarehouse;
    }

    public Date getInstockDate() {
        return instockDate;
    }

    public void setInstockDate(Date instockDate) {
        this.instockDate = instockDate;
    }

    public Short getInstockStatus() {
        return instockStatus;
    }

    public void setInstockStatus(Short instockStatus) {
        this.instockStatus = instockStatus;
    }

    public String getInstockStatusName() {
        return instockStatusName;
    }

    public void setInstockStatusName(String instockStatusName) {
        this.instockStatusName = instockStatusName;
    }
}

