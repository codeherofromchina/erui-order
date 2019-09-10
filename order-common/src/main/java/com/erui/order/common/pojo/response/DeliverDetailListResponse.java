package com.erui.order.common.pojo.response;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class DeliverDetailListResponse {
    private Long id;

    // 状态
    private Short DeliverDetailStatus;
    private String DeliverDetailStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getDeliverDetailStatus() {
        return DeliverDetailStatus;
    }

    public void setDeliverDetailStatus(Short DeliverDetailStatus) {
        this.DeliverDetailStatus = DeliverDetailStatus;
    }

    public String getDeliverDetailStatusName() {
        return DeliverDetailStatusName;
    }

    public void setDeliverDetailStatusName(String DeliverDetailStatusName) {
        this.DeliverDetailStatusName = DeliverDetailStatusName;
    }
}

