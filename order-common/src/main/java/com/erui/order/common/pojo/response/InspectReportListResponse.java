package com.erui.order.common.pojo.response;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class InspectReportListResponse {
    private Long id;

    // 状态
    private Short InspectReportStatus;
    private String InspectReportStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getInspectReportStatus() {
        return InspectReportStatus;
    }

    public void setInspectReportStatus(Short InspectReportStatus) {
        this.InspectReportStatus = InspectReportStatus;
    }

    public String getInspectReportStatusName() {
        return InspectReportStatusName;
    }

    public void setInspectReportStatusName(String InspectReportStatusName) {
        this.InspectReportStatusName = InspectReportStatusName;
    }
}

