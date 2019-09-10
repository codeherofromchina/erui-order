package com.erui.order.common.pojo.response;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class DeliverConsignListResponse {
    private Long id;

    // 状态
    private Short DeliverConsignStatus;
    private String DeliverConsignStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getDeliverConsignStatus() {
        return DeliverConsignStatus;
    }

    public void setDeliverConsignStatus(Short DeliverConsignStatus) {
        this.DeliverConsignStatus = DeliverConsignStatus;
    }

    public String getDeliverConsignStatusName() {
        return DeliverConsignStatusName;
    }

    public void setDeliverConsignStatusName(String DeliverConsignStatusName) {
        this.DeliverConsignStatusName = DeliverConsignStatusName;
    }
}

