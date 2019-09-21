package com.erui.order.common.pojo.request;

import com.erui.order.common.PagingRequest;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class LogisticsDataQueryRequest extends PagingRequest {
    // 销售合同号
    private String contractNo;
    // 产品放行单号
    private String deliverDetailNo;
    // 放行日期
    private Date releaseDate;
    // 状态
    private Short LogisticsDataStatus;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getDeliverDetailNo() {
        return deliverDetailNo;
    }

    public void setDeliverDetailNo(String deliverDetailNo) {
        this.deliverDetailNo = deliverDetailNo;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Short getLogisticsDataStatus() {
        return LogisticsDataStatus;
    }

    public void setLogisticsDataStatus(Short logisticsDataStatus) {
        LogisticsDataStatus = logisticsDataStatus;
    }
}

