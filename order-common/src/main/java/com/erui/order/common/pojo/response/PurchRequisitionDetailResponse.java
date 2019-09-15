package com.erui.order.common.pojo.response;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.GoodsInfo;

import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午4:59
 */
public class PurchRequisitionDetailResponse {
    private Long id;
    // 项目ID
    private Long projectId;
    // 项目号
    private String projectNo;
    // 项目经办人
    private Long pmUid;
    private String pmUserName;
    // 下发部门
    private Long department;
    private String departmentName;
    // 下发日期
    private Date submitDate;
    // 贸易方式 / 项目类型
    private Short tradeMethod;
    private String tradeMethodName;
    // 贸易术语
    private String transModeBn;
    // 厂家直接发货 1:直接发货 0：不是厂家直接发货
    private Short factorySend;
    // 交付地点
    private String deliveryPlace;
    // 客户文件要求
    private String requirements;
    // 备注
    private String remarks;
    // 商品及附件
    List<GoodsInfo> goodsInfos;
    List<AttachmentInfo> attachments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public Long getPmUid() {
        return pmUid;
    }

    public void setPmUid(Long pmUid) {
        this.pmUid = pmUid;
    }

    public String getPmUserName() {
        return pmUserName;
    }

    public void setPmUserName(String pmUserName) {
        this.pmUserName = pmUserName;
    }

    public Long getDepartment() {
        return department;
    }

    public void setDepartment(Long department) {
        this.department = department;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public Short getTradeMethod() {
        return tradeMethod;
    }

    public void setTradeMethod(Short tradeMethod) {
        this.tradeMethod = tradeMethod;
    }

    public String getTradeMethodName() {
        return tradeMethodName;
    }

    public void setTradeMethodName(String tradeMethodName) {
        this.tradeMethodName = tradeMethodName;
    }

    public String getTransModeBn() {
        return transModeBn;
    }

    public void setTransModeBn(String transModeBn) {
        this.transModeBn = transModeBn;
    }

    public Short getFactorySend() {
        return factorySend;
    }

    public void setFactorySend(Short factorySend) {
        this.factorySend = factorySend;
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<GoodsInfo> getGoodsInfos() {
        return goodsInfos;
    }

    public void setGoodsInfos(List<GoodsInfo> goodsInfos) {
        this.goodsInfos = goodsInfos;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }
}
