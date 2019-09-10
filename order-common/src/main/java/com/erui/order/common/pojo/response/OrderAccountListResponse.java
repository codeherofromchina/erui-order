package com.erui.order.common.pojo.response;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class OrderAccountListResponse {
    private Long id;

    // 状态
    private Short OrderAccountStatus;
    private String OrderAccountStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getOrderAccountStatus() {
        return OrderAccountStatus;
    }

    public void setOrderAccountStatus(Short OrderAccountStatus) {
        this.OrderAccountStatus = OrderAccountStatus;
    }

    public String getOrderAccountStatusName() {
        return OrderAccountStatusName;
    }

    public void setOrderAccountStatusName(String OrderAccountStatusName) {
        this.OrderAccountStatusName = OrderAccountStatusName;
    }
}

