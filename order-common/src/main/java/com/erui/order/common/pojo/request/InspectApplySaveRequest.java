package com.erui.order.common.pojo.request;

import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.InspectApplyGoodsInfo;

import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/10 下午1:59
 */
public class InspectApplySaveRequest {
    // 主键
    private Long id;
    // 采购单ID
    private Long purchId;
    // 报检日期
    private Date inspectDate;
    // 是否入易瑞仓库 true:入易瑞仓库  false:否
    private Boolean enterEruiWarehouse;
    // 备注
    private String remark;
    // 父报检单
    private Long pId;
    // 商品信息
    private List<InspectApplyGoodsInfo> goodsInfos;
    // 状态
    private Short inspectApplyStatus;
    // 附件内容
    private List<AttachmentInfo> attachments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getInspectApplyStatus() {
        return inspectApplyStatus;
    }

    public void setInspectApplyStatus(Short InspectApplyStatus) {
        this.inspectApplyStatus = InspectApplyStatus;
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

    public List<InspectApplyGoodsInfo> getGoodsInfos() {
        return goodsInfos;
    }

    public void setGoodsInfos(List<InspectApplyGoodsInfo> goodsInfos) {
        this.goodsInfos = goodsInfos;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }
}

