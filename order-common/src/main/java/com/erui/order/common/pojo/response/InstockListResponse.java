package com.erui.order.common.pojo.response;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class InstockListResponse {
    private Long id;

    // 状态
    private Short InstockStatus;
    private String InstockStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getInstockStatus() {
        return InstockStatus;
    }

    public void setInstockStatus(Short InstockStatus) {
        this.InstockStatus = InstockStatus;
    }

    public String getInstockStatusName() {
        return InstockStatusName;
    }

    public void setInstockStatusName(String InstockStatusName) {
        this.InstockStatusName = InstockStatusName;
    }
}

