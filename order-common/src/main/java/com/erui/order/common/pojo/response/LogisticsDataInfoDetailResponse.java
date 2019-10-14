package com.erui.order.common.pojo.response;

import com.erui.order.common.pojo.AttachmentInfo;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/22 上午5:15
 */
public class LogisticsDataInfoDetailResponse {
    private Long id;
    private Long logisticsDataId;
    // 动态描述 1:离开起运港 2:到达中转港 3:到达目的港 4:到达目的地 5:其他',
    private Short dynamicDescription;
    // '港口名称（英文）'
    private String portName;
    // '港口名称(中文)'
    private String portNameZh;
    // 离港/到港日期
    private Date leavePortDate;
    // 状态 1：保存/草稿 2:已提交
    private Short logisticsDataInfoStatus;
    // 附件
    private AttachmentInfo attachment;


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

    public AttachmentInfo getAttachment() {
        return attachment;
    }

    public void setAttachment(AttachmentInfo attachment) {
        this.attachment = attachment;
    }
}
