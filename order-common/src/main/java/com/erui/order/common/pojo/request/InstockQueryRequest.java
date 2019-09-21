package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class InstockQueryRequest extends PagingRequest {
    // 到货报检单号
    private String inspectApplyNo;
    // 销售合同号
    private String contractNo;
    // 项目号
    private String projectNo;
    // 供应商名称
    private String supplierName;
    // 入库状态
    private Short instockStatus;

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

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Short getInstockStatus() {
        return instockStatus;
    }

    public void setInstockStatus(Short instockStatus) {
        this.instockStatus = instockStatus;
    }
}

