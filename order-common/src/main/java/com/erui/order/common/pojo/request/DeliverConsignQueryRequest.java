package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class DeliverConsignQueryRequest extends PagingRequest {
    // 出口通知单号
    private String deliverConsignNo;
    // 销售合同号
    private String contractNo;
    // 客户代码
    private String crmCode;
    // 发货申请部门
    private String execCoName;
    // 订舱提交日期
    private Date submitTimeStart;
    private Date submitTimeEnd;

    public String getDeliverConsignNo() {
        return deliverConsignNo;
    }

    public void setDeliverConsignNo(String deliverConsignNo) {
        this.deliverConsignNo = deliverConsignNo;
    }

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

    public String getExecCoName() {
        return execCoName;
    }

    public void setExecCoName(String execCoName) {
        this.execCoName = execCoName;
    }

    public Date getSubmitTimeStart() {
        return submitTimeStart;
    }

    public void setSubmitTimeStart(Date submitTimeStart) {
        this.submitTimeStart = submitTimeStart;
    }

    public Date getSubmitTimeEnd() {
        return submitTimeEnd;
    }

    public void setSubmitTimeEnd(Date submitTimeEnd) {
        this.submitTimeEnd = submitTimeEnd;
    }
}

