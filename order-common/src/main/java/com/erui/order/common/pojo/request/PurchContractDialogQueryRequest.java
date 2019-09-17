package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午9:09
 */
public class PurchContractDialogQueryRequest extends PagingRequest {
    // 采购合同号
    private String purchContractNo;
    // 供应商名称
    private String supplierName;


    public String getPurchContractNo() {
        return purchContractNo;
    }

    public void setPurchContractNo(String purchContractNo) {
        this.purchContractNo = purchContractNo;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
}
