package com.erui.order.common.pojo.response;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class DeliverDetailListResponse {
    private Long id;
    // 产品放行单号
    private String deliverDetailNo;
    // 销售合同号
    private String contractNo;
    // 出口通知单号
    private String deliverConsignNo;
    // 项目号
    private String projectNo;
    // 放行日期
    private Date releaseDate;
    // 出库日期
    private Date leaveDate;
    //  出库状态
    private Short deliverDetailStatus;
    private String deliverDetailStatusName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getDeliverDetailStatus() {
        return deliverDetailStatus;
    }

    public void setDeliverDetailStatus(Short DeliverDetailStatus) {
        this.deliverDetailStatus = DeliverDetailStatus;
    }

    public String getDeliverDetailStatusName() {
        return deliverDetailStatusName;
    }

    public void setDeliverDetailStatusName(String DeliverDetailStatusName) {
        this.deliverDetailStatusName = DeliverDetailStatusName;
    }


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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }
}

