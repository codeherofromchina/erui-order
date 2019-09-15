package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午11:55
 */
public class ProjectQueryRequest extends PagingRequest {
    // 销售合同号
    private String contractNo;
    // 项目编号
    private String projectNo;
    // 项目名称/合同标的
    private String projectName;
    // 项目开始日期
    private Date startDate;
    // 项目状态
    private String projectStatus;
    // 流程进度
    private String processProgress;
    // 要求采购到货日期
    private Date requirePurchaseDate;
    // 执行事业部
    private Long sendDeptId;
    // 事业部项目负责人
    private Long businessUid;
    // 项目创建日期
    private Date createTimeStart;
    private Date createTimeEnd;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getProcessProgress() {
        return processProgress;
    }

    public void setProcessProgress(String processProgress) {
        this.processProgress = processProgress;
    }

    public Date getRequirePurchaseDate() {
        return requirePurchaseDate;
    }

    public void setRequirePurchaseDate(Date requirePurchaseDate) {
        this.requirePurchaseDate = requirePurchaseDate;
    }

    public Long getSendDeptId() {
        return sendDeptId;
    }

    public void setSendDeptId(Long sendDeptId) {
        this.sendDeptId = sendDeptId;
    }

    public Long getBusinessUid() {
        return businessUid;
    }

    public void setBusinessUid(Long businessUid) {
        this.businessUid = businessUid;
    }

    public Date getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(Date createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public Date getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(Date createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

}
