package com.erui.order.common.pojo.response;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:48
 */
public class ProjectListResponse {
    private Long id;
    // 销售合同号
    private String contractNo;
    // 项目号
    private String projectNo;
    // 合同标的
    private String projectName;
    // 下发部门，订单的执行事业部
    private Long sendDeptId;
    private String sendDeptName;
    // 事业部项目负责人/商务技术部经办人
    private Long businessUid;
    private String businessUserName;
    // 项目创建日期
    private Date createTime;
    // 项目开始日期
    private Date startDate;
    // 是否已经创建采购申请单 1：未创建  2：已创建保存状态 3:已创建并提交
    private Short purchReqCreate;
    // 项目状态
    private String projectStatus;
    private String projectStatusName;
    // 流程进度
    private String processProgress;
    private String processProgressName;


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

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Long getSendDeptId() {
        return sendDeptId;
    }

    public void setSendDeptId(Long sendDeptId) {
        this.sendDeptId = sendDeptId;
    }

    public String getSendDeptName() {
        return sendDeptName;
    }

    public void setSendDeptName(String sendDeptName) {
        this.sendDeptName = sendDeptName;
    }

    public Long getBusinessUid() {
        return businessUid;
    }

    public void setBusinessUid(Long businessUid) {
        this.businessUid = businessUid;
    }

    public String getBusinessUserName() {
        return businessUserName;
    }

    public void setBusinessUserName(String businessUserName) {
        this.businessUserName = businessUserName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Short getPurchReqCreate() {
        return purchReqCreate;
    }

    public void setPurchReqCreate(Short purchReqCreate) {
        this.purchReqCreate = purchReqCreate;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getProjectStatusName() {
        return projectStatusName;
    }

    public void setProjectStatusName(String projectStatusName) {
        this.projectStatusName = projectStatusName;
    }

    public String getProcessProgress() {
        return processProgress;
    }

    public void setProcessProgress(String processProgress) {
        this.processProgress = processProgress;
    }

    public String getProcessProgressName() {
        return processProgressName;
    }

    public void setProcessProgressName(String processProgressName) {
        this.processProgressName = processProgressName;
    }

}
