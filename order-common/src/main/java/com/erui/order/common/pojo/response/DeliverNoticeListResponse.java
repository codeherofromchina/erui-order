package com.erui.order.common.pojo.response;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class DeliverNoticeListResponse {
    private Long id;

    // 状态
    private Short DeliverNoticeStatus;
    private String DeliverNoticeStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getDeliverNoticeStatus() {
        return DeliverNoticeStatus;
    }

    public void setDeliverNoticeStatus(Short DeliverNoticeStatus) {
        this.DeliverNoticeStatus = DeliverNoticeStatus;
    }

    public String getDeliverNoticeStatusName() {
        return DeliverNoticeStatusName;
    }

    public void setDeliverNoticeStatusName(String DeliverNoticeStatusName) {
        this.DeliverNoticeStatusName = DeliverNoticeStatusName;
    }
}

