package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class OrderQueryRequest extends PagingRequest {

    // 销售合同号
    private String contractNo;

    // 项目号
    private String projectNo;

    // 易瑞海外销售合同号
    private String contractNoOs;

    // 合同交货日期
    private String deliveryDate;

    // CRM客户ID
    private String crmCode;

    // 收款状态 1:未付款 2:部分付款 3:收款完成
    private Short payStatus;

    // 订单状态 1:待确认 2:未执行 3:执行中 4：完成
    private Short orderStatus;

    // 流程进度
    private String processProgress;

    // 事业部项目负责人
    private Long technicalId;

    // 执行事业部
    private Long businessUnitId;


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

    public String getContractNoOs() {
        return contractNoOs;
    }

    public void setContractNoOs(String contractNoOs) {
        this.contractNoOs = contractNoOs;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getCrmCode() {
        return crmCode;
    }

    public void setCrmCode(String crmCode) {
        this.crmCode = crmCode;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }

    public Short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getProcessProgress() {
        return processProgress;
    }

    public void setProcessProgress(String processProgress) {
        this.processProgress = processProgress;
    }

    public Long getTechnicalId() {
        return technicalId;
    }

    public void setTechnicalId(Long technicalId) {
        this.technicalId = technicalId;
    }

    public Long getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(Long businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

}
