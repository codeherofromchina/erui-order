package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class DeliverNoticeQueryRequest extends PagingRequest {
    // 销售合同号
    private String contractNo;
    private String crmCode;
    // 状态
    private Short deliverNoticeStatus;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getCrmCode() {
        return crmCode;
    }

    public void setCrmCode(String crmCode) {
        this.crmCode = crmCode;
    }

    public Short getDeliverNoticeStatus() {
        return deliverNoticeStatus;
    }

    public void setDeliverNoticeStatus(Short deliverNoticeStatus) {
        this.deliverNoticeStatus = deliverNoticeStatus;
    }
}

