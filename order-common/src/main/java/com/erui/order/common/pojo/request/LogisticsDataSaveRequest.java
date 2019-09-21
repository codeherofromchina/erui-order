package com.erui.order.common.pojo.request;

import com.erui.order.common.pojo.AttachmentInfo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/10 下午1:59
 */
public class LogisticsDataSaveRequest {
    // 主键
    private Long id;
    // 经办日期
    private Date logisticsDate;
    // 物流发运金额（usd）
    private BigDecimal logisticsPriceUsd;
    // 物流费用
    private BigDecimal logisticsCost;
    // 物流费用币种
    private String logisticsCostType;
    // 物流发票号
    private String logiInvoiceNo;
    // 仓库出具发运箱单日期
    private Date packingTime;
    // 离厂日期
    private Date leaveFactory;
    // 船期或航班
    private Date sailingDate;
    // 报关日期
    private Date customsClearance;
    // 实际离港日期
    private Date leavePortTime;
    // 预计抵达日期
    private Date arrivalPortTime;

    // 备注
    private String remarks;
    // 状态
    private Short logisticsDataStatus;

    // 附件内容
    private List<AttachmentInfo> attachments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getLogisticsDataStatus() {
        return logisticsDataStatus;
    }

    public void setLogisticsDataStatus(Short LogisticsDataStatus) {
        this.logisticsDataStatus = LogisticsDataStatus;
    }

    public List<AttachmentInfo> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<AttachmentInfo> attachments) {
        this.attachments = attachments;
    }

    public Date getLogisticsDate() {
        return logisticsDate;
    }

    public void setLogisticsDate(Date logisticsDate) {
        this.logisticsDate = logisticsDate;
    }

    public BigDecimal getLogisticsPriceUsd() {
        return logisticsPriceUsd;
    }

    public void setLogisticsPriceUsd(BigDecimal logisticsPriceUsd) {
        this.logisticsPriceUsd = logisticsPriceUsd;
    }

    public BigDecimal getLogisticsCost() {
        return logisticsCost;
    }

    public void setLogisticsCost(BigDecimal logisticsCost) {
        this.logisticsCost = logisticsCost;
    }

    public String getLogisticsCostType() {
        return logisticsCostType;
    }

    public void setLogisticsCostType(String logisticsCostType) {
        this.logisticsCostType = logisticsCostType;
    }

    public String getLogiInvoiceNo() {
        return logiInvoiceNo;
    }

    public void setLogiInvoiceNo(String logiInvoiceNo) {
        this.logiInvoiceNo = logiInvoiceNo;
    }

    public Date getPackingTime() {
        return packingTime;
    }

    public void setPackingTime(Date packingTime) {
        this.packingTime = packingTime;
    }

    public Date getLeaveFactory() {
        return leaveFactory;
    }

    public void setLeaveFactory(Date leaveFactory) {
        this.leaveFactory = leaveFactory;
    }

    public Date getSailingDate() {
        return sailingDate;
    }

    public void setSailingDate(Date sailingDate) {
        this.sailingDate = sailingDate;
    }

    public Date getCustomsClearance() {
        return customsClearance;
    }

    public void setCustomsClearance(Date customsClearance) {
        this.customsClearance = customsClearance;
    }

    public Date getLeavePortTime() {
        return leavePortTime;
    }

    public void setLeavePortTime(Date leavePortTime) {
        this.leavePortTime = leavePortTime;
    }

    public Date getArrivalPortTime() {
        return arrivalPortTime;
    }

    public void setArrivalPortTime(Date arrivalPortTime) {
        this.arrivalPortTime = arrivalPortTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

