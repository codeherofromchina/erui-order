package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午9:09
 */
public class PurchContractQueryRequest extends PagingRequest {
    // 采购合同号
    private String purchContractNo;
    // 采购合同状态
    private Short contractStatus;
    // 采购合同类型
    private Short contractType;
    // 供应商
    private Long supplierId;


    public String getPurchContractNo() {
        return purchContractNo;
    }

    public void setPurchContractNo(String purchContractNo) {
        this.purchContractNo = purchContractNo;
    }

    public Short getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(Short contractStatus) {
        this.contractStatus = contractStatus;
    }

    public Short getContractType() {
        return contractType;
    }

    public void setContractType(Short contractType) {
        this.contractType = contractType;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
}
