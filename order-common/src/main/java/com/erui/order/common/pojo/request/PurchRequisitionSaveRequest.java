package com.erui.order.common.pojo.request;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.PurchRequisitionGoodsInfo;

import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午4:49
 */
public class PurchRequisitionSaveRequest {
    private Long id;
    // 项目ID
    private Long projectId;
    // 下发日期
    private Date submitDate;
    // 厂家直接发货 1:直接发货 0：不是厂家直接发货
    private Short factorySend;
    // 交付地点
    private String deliveryPlace;
    // 客户文件要求
    private String requirements;
    // 备注
    private String remarks;
    private Short purchRequisitionStatus;


    List<PurchRequisitionGoodsInfo> purchRequisitionGoods;
    List<AttachmentInfo> attachments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PurchRequisitionGoodsInfo> getPurchRequisitionGoods() {
        return purchRequisitionGoods;
    }

    public void setPurchRequisitionGoods(List<PurchRequisitionGoodsInfo> purchRequisitionGoods) {
        this.purchRequisitionGoods = purchRequisitionGoods;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {

        this.attachments = attachments;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
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

    public Short getPurchRequisitionStatus() {
        return purchRequisitionStatus;
    }

    public void setPurchRequisitionStatus(Short purchRequisitionStatus) {
        this.purchRequisitionStatus = purchRequisitionStatus;
    }
}
