package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class DeliverDetailQueryRequest extends PagingRequest {
    // 产品放行单号
    private String deliverDetailNo;
    // 销售合同号
    private String contractNo;
    // 出口通知单号
    private String deliverConsignNo;
    // 项目号
    private String projectNo;
    //  出库状态
    private Short deliverDetailStatus;
    // 出库类型 2：质检 3：出库信息管理
    private Short deliverDetailType;

    public String getDeliverDetailNo() {
        return deliverDetailNo;
    }

    public void setDeliverDetailNo(String deliverDetailNo) {
        this.deliverDetailNo = deliverDetailNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getDeliverConsignNo() {
        return deliverConsignNo;
    }

    public void setDeliverConsignNo(String deliverConsignNo) {
        this.deliverConsignNo = deliverConsignNo;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public Short getDeliverDetailStatus() {
        return deliverDetailStatus;
    }

    public Short getDeliverDetailType() {
        return deliverDetailType;
    }

    public void setDeliverDetailType(Short deliverDetailType) {
        this.deliverDetailType = deliverDetailType;
    }

    public void setDeliverDetailStatus(Short deliverDetailStatus) {
        this.deliverDetailStatus = deliverDetailStatus;
    }
}

