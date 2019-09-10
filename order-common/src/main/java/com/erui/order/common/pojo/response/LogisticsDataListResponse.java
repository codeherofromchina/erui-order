package com.erui.order.common.pojo.response;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class LogisticsDataListResponse {
    private Long id;

    // 状态
    private Short LogisticsDataStatus;
    private String LogisticsDataStatusName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getLogisticsDataStatus() {
        return LogisticsDataStatus;
    }

    public void setLogisticsDataStatus(Short LogisticsDataStatus) {
        this.LogisticsDataStatus = LogisticsDataStatus;
    }

    public String getLogisticsDataStatusName() {
        return LogisticsDataStatusName;
    }

    public void setLogisticsDataStatusName(String LogisticsDataStatusName) {
        this.LogisticsDataStatusName = LogisticsDataStatusName;
    }
}

