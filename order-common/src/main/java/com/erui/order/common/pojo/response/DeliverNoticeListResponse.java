package com.erui.order.common.pojo.response;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class DeliverNoticeListResponse {
    private Long id;
    private Long deliverConsignId;
    // 销售合同号
    private String contractNo;
    // 客户代码
    private String crmCode;
    // 项目要求交付日期
    private Date deliveryDate;

    // 发货申请部门
    private String execCoName;
    // 仓储经办人

    // 单证操作
    private Long operationSpecialistId;
    private String operationSpecialistUserName;
    // 看货状态
    private Short deliverNoticeStatus;
    private String deliverNoticeStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getDeliverConsignId() {
        return deliverConsignId;
    }

    public void setDeliverConsignId(Long deliverConsignId) {
        this.deliverConsignId = deliverConsignId;
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

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getExecCoName() {
        return execCoName;
    }

    public void setExecCoName(String execCoName) {
        this.execCoName = execCoName;
    }

    public Long getOperationSpecialistId() {
        return operationSpecialistId;
    }

    public void setOperationSpecialistId(Long operationSpecialistId) {
        this.operationSpecialistId = operationSpecialistId;
    }

    public String getOperationSpecialistUserName() {
        return operationSpecialistUserName;
    }

    public void setOperationSpecialistUserName(String operationSpecialistUserName) {
        this.operationSpecialistUserName = operationSpecialistUserName;
    }

    public Short getDeliverNoticeStatus() {
        return deliverNoticeStatus;
    }

    public void setDeliverNoticeStatus(Short deliverNoticeStatus) {
        this.deliverNoticeStatus = deliverNoticeStatus;
    }

    public String getDeliverNoticeStatusName() {
        return deliverNoticeStatusName;
    }

    public void setDeliverNoticeStatusName(String deliverNoticeStatusName) {
        this.deliverNoticeStatusName = deliverNoticeStatusName;
    }
}

