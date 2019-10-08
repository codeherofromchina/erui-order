package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class PurchPayApplicationQueryRequest extends PagingRequest {
    private String purchContractNo;
    private String supplierName;
    // 状态
    private Short payStatus;
    private Short payStatusName;

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

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }
}

