package com.erui.order.model.entity;

import java.util.Date;

public class LogisticsDataInfo {
    private Long id;

    private Long logisticsDataId;

    private Short dynamicDescription;

    private String portName;

    private String portNameZh;

    private Date leavePortDate;

    private Short logisticsDataInfoStatus;

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateTime;

    private Boolean deleteFlag;

    private Date deleteTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLogisticsDataId() {
        return logisticsDataId;
    }

    public void setLogisticsDataId(Long logisticsDataId) {
        this.logisticsDataId = logisticsDataId;
    }

    public Short getDynamicDescription() {
        return dynamicDescription;
    }

    public void setDynamicDescription(Short dynamicDescription) {
        this.dynamicDescription = dynamicDescription;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getPortNameZh() {
        return portNameZh;
    }

    public void setPortNameZh(String portNameZh) {
        this.portNameZh = portNameZh;
    }

    public Date getLeavePortDate() {
        return leavePortDate;
    }

    public void setLeavePortDate(Date leavePortDate) {
        this.leavePortDate = leavePortDate;
    }

    public Short getLogisticsDataInfoStatus() {
        return logisticsDataInfoStatus;
    }

    public void setLogisticsDataInfoStatus(Short logisticsDataInfoStatus) {
        this.logisticsDataInfoStatus = logisticsDataInfoStatus;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}