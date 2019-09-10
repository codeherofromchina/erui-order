package com.erui.order.common.pojo.response;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class PurchListResponse {
    private Long id;

    // 状态
    private Short PurchStatus;
    private String PurchStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getPurchStatus() {
        return PurchStatus;
    }

    public void setPurchStatus(Short PurchStatus) {
        this.PurchStatus = PurchStatus;
    }

    public String getPurchStatusName() {
        return PurchStatusName;
    }

    public void setPurchStatusName(String PurchStatusName) {
        this.PurchStatusName = PurchStatusName;
    }
}

