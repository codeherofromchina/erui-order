package com.erui.order.common.pojo.response;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:31
 */
public class OrderAccountListResponse {
    // 订单ID
    private Long id;
    // 销售合同号
    private String contractNo;
    // crm客户代码
    private String crmCode;
    // 订单签约日期
    private Date signingDate;
    // 订单状态
    private Short orderStatus;
    private String orderStatusName;
    // 收款状态
    private Short payStatus;
    private String payStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(Date signingDate) {
        this.signingDate = signingDate;
    }

    public Short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatusName() {
        return orderStatusName;
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayStatusName() {
        return payStatusName;
    }

    public void setPayStatusName(String payStatusName) {
        this.payStatusName = payStatusName;
    }
}

