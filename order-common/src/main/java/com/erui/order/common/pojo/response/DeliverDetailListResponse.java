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
    // 经办部门
    private String handleDepartment;
    // 开单日期
    private Date billingDate;
    // 仓库经办人
    private Long wareHouseman;
    private String wareHousemanName;
    // 是否厂家直接发 1:直发  2：否
    private Boolean outCheck;
    // 质检部门
    private String checkDept;
    // 检验员
    private Long checkUserId;
    private String checkUserName;
    // 检验日期
    private Date checkDate;
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


    public String getHandleDepartment() {
        return handleDepartment;
    }

    public void setHandleDepartment(String handleDepartment) {
        this.handleDepartment = handleDepartment;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public Long getWareHouseman() {
        return wareHouseman;
    }

    public void setWareHouseman(Long wareHouseman) {
        this.wareHouseman = wareHouseman;
    }

    public String getWareHousemanName() {
        return wareHousemanName;
    }

    public void setWareHousemanName(String wareHousemanName) {
        this.wareHousemanName = wareHousemanName;
    }

    public Boolean getOutCheck() {
        return outCheck;
    }

    public void setOutCheck(Boolean outCheck) {
        this.outCheck = outCheck;
    }

    public String getCheckDept() {
        return checkDept;
    }

    public void setCheckDept(String checkDept) {
        this.checkDept = checkDept;
    }

    public Long getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Long checkUserId) {
        this.checkUserId = checkUserId;
    }

    public String getCheckUserName() {
        return checkUserName;
    }

    public void setCheckUserName(String checkUserName) {
        this.checkUserName = checkUserName;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }
}

