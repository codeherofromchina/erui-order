package com.erui.order.common.pojo.response;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class InspectApplyListResponse {
    private Long id;

    // 状态
    private Short InspectApplyStatus;
    private String InspectApplyStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getInspectApplyStatus() {
        return InspectApplyStatus;
    }

    public void setInspectApplyStatus(Short InspectApplyStatus) {
        this.InspectApplyStatus = InspectApplyStatus;
    }

    public String getInspectApplyStatusName() {
        return InspectApplyStatusName;
    }

    public void setInspectApplyStatusName(String InspectApplyStatusName) {
        this.InspectApplyStatusName = InspectApplyStatusName;
    }
}

