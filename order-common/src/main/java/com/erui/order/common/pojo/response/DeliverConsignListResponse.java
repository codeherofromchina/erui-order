package com.erui.order.common.pojo.response;

import java.math.BigDecimal;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class DeliverConsignListResponse {
    private Long id;
    // 出口通知单号
    private String deliverConsignNo;
    // 销售合同号
    private String contractNo;
    // 客户代码
    private String crmCode;
    // 发货金额
    private BigDecimal thisShipmentsMoney;
    private String currencyBn; // 币种
    // 报关主体
    private String coId;
    // 发货申请部门
    private String execCoName;
    // 状态
    private Short deliverConsignStatus;
    private String deliverConsignStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getDeliverConsignStatus() {
        return deliverConsignStatus;
    }

    public void setDeliverConsignStatus(Short DeliverConsignStatus) {
        this.deliverConsignStatus = DeliverConsignStatus;
    }

    public String getDeliverConsignStatusName() {
        return deliverConsignStatusName;
    }

    public void setDeliverConsignStatusName(String DeliverConsignStatusName) {
        this.deliverConsignStatusName = DeliverConsignStatusName;
    }


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

    public BigDecimal getThisShipmentsMoney() {
        return thisShipmentsMoney;
    }

    public void setThisShipmentsMoney(BigDecimal thisShipmentsMoney) {
        this.thisShipmentsMoney = thisShipmentsMoney;
    }

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }

    public String getCoId() {
        return coId;
    }

    public void setCoId(String coId) {
        this.coId = coId;
    }

    public String getExecCoName() {
        return execCoName;
    }

    public void setExecCoName(String execCoName) {
        this.execCoName = execCoName;
    }
}

