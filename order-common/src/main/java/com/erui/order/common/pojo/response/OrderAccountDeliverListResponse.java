package com.erui.order.common.pojo.response;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class OrderAccountDeliverListResponse {
    private Long id;

    // 状态
    private Short OrderAccountDeliverStatus;
    private String OrderAccountDeliverStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getOrderAccountDeliverStatus() {
        return OrderAccountDeliverStatus;
    }

    public void setOrderAccountDeliverStatus(Short OrderAccountDeliverStatus) {
        this.OrderAccountDeliverStatus = OrderAccountDeliverStatus;
    }

    public String getOrderAccountDeliverStatusName() {
        return OrderAccountDeliverStatusName;
    }

    public void setOrderAccountDeliverStatusName(String OrderAccountDeliverStatusName) {
        this.OrderAccountDeliverStatusName = OrderAccountDeliverStatusName;
    }
}

