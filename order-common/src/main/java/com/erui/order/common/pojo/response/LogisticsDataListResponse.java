package com.erui.order.common.pojo.response;

import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/7 下午5:30
 */
public class LogisticsDataListResponse {
    // 主键
    private Long id;
    // 运单号
    private String theAwbNo;
    // 销售合同号
    private String contractNo;
    // 产品放行单号
    private String deliverDetailNo;
    // 放行日期
    private Date releaseDate;
    // 实际完成日期
    private Date accomplishDate;
    // 状态
    private Short logisticsDataStatus;
    private String logisticsDataStatusName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheAwbNo() {
        return theAwbNo;
    }

    public void setTheAwbNo(String theAwbNo) {
        this.theAwbNo = theAwbNo;
    }

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

    public Date getAccomplishDate() {
        return accomplishDate;
    }

    public void setAccomplishDate(Date accomplishDate) {
        this.accomplishDate = accomplishDate;
    }

    public Short getLogisticsDataStatus() {
        return logisticsDataStatus;
    }

    public void setLogisticsDataStatus(Short logisticsDataStatus) {
        this.logisticsDataStatus = logisticsDataStatus;
    }

    public String getLogisticsDataStatusName() {
        return logisticsDataStatusName;
    }

    public void setLogisticsDataStatusName(String logisticsDataStatusName) {
        this.logisticsDataStatusName = logisticsDataStatusName;
    }
}

