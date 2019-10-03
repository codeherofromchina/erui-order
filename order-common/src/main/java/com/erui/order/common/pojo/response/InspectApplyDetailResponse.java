package com.erui.order.common.pojo.response;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.GoodsInfo;

import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:31
 */
public class InspectApplyDetailResponse {
    private Long id;
    private Long pId;
    // 采购单ID
    private Long purchId;
    // 下发部门
    private String department;
    // 采购经办人
    private Long purchaseNameId;
    private String purchaseName;
    // 供应商
    private Long supplierId;
    private String supplierName;
    // 报检日期
    private Date inspectDate;
    // 是否入易瑞仓库 true:入易瑞仓库  false:否
    private Boolean enterEruiWarehouse;
    // 备注
    private String remark;
    // 整改意见
    private String msg;
    // 状态
    private Short inspectApplyStatus;

    // 附件内容
    private List<AttachmentInfo> attachments;
    // 商品信息
    private List<GoodsInfo> goodsInfos;

    public List<GoodsInfo> getGoodsInfos() {
        return goodsInfos;
    }

    public void setGoodsInfos(List<GoodsInfo> goodsInfos) {
        this.goodsInfos = goodsInfos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }

    public Long getPurchId() {
        return purchId;
    }

    public void setPurchId(Long purchId) {
        this.purchId = purchId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getPurchaseNameId() {
        return purchaseNameId;
    }

    public void setPurchaseNameId(Long purchaseNameId) {
        this.purchaseNameId = purchaseNameId;
    }

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public Date getInspectDate() {
        return inspectDate;
    }

    public void setInspectDate(Date inspectDate) {
        this.inspectDate = inspectDate;
    }

    public Boolean getEnterEruiWarehouse() {
        return enterEruiWarehouse;
    }

    public void setEnterEruiWarehouse(Boolean enterEruiWarehouse) {
        this.enterEruiWarehouse = enterEruiWarehouse;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Short getInspectApplyStatus() {
        return inspectApplyStatus;
    }

    public void setInspectApplyStatus(Short inspectApplyStatus) {
        this.inspectApplyStatus = inspectApplyStatus;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

