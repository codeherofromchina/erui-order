package com.erui.order.service.util;

import com.erui.order.common.enums.LogisticsDataInfoStatusEnum;
import com.erui.order.common.pojo.request.LogisticsDataSaveRequest;
import com.erui.order.common.pojo.response.LogisticsDataDetailResponse;
import com.erui.order.common.pojo.response.LogisticsDataListResponse;
import com.erui.order.model.entity.LogisticsData;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class LogisticsDataFactory {

    public static LogisticsData logisticsData(LogisticsDataSaveRequest logisticsDataSaveRequest) {
        if (logisticsDataSaveRequest == null) {
            return null;
        }
        LogisticsData logisticsData = new LogisticsData();
        logisticsData.setId(logisticsDataSaveRequest.getId());
        logisticsData.setLogisticsDate(logisticsDataSaveRequest.getLogisticsDate());
        logisticsData.setLogisticsPriceUsd(logisticsDataSaveRequest.getLogisticsPriceUsd());
        logisticsData.setLogisticsCost(logisticsDataSaveRequest.getLogisticsCost());
        logisticsData.setLogisticsCostType(logisticsDataSaveRequest.getLogisticsCostType());
        logisticsData.setLogiInvoiceNo(logisticsDataSaveRequest.getLogiInvoiceNo());
        logisticsData.setPackingTime(logisticsDataSaveRequest.getPackingTime());
        logisticsData.setLeaveFactory(logisticsDataSaveRequest.getLeaveFactory());
        logisticsData.setSailingDate(logisticsDataSaveRequest.getSailingDate());
        logisticsData.setCustomsClearance(logisticsDataSaveRequest.getCustomsClearance());
        logisticsData.setLeavePortTime(logisticsDataSaveRequest.getLeavePortTime());
        logisticsData.setArrivalPortTime(logisticsDataSaveRequest.getArrivalPortTime());
        logisticsData.setRemarks(logisticsDataSaveRequest.getRemarks());
        logisticsData.setLogisticsDataStatus(logisticsDataSaveRequest.getLogisticsDataStatus());

        return logisticsData;
    }

    public static LogisticsDataDetailResponse LogisticsDataDetailResponse(LogisticsData logisticsData) {
        if (logisticsData == null) {
            return null;
        }

        LogisticsDataDetailResponse logisticsDataDetailResponse = new LogisticsDataDetailResponse();
        logisticsDataDetailResponse.setId(logisticsData.getId());
        logisticsDataDetailResponse.setLogisticsDate(logisticsData.getLogisticsDate());
        logisticsDataDetailResponse.setLogisticsPriceUsd(logisticsData.getLogisticsPriceUsd());
        logisticsDataDetailResponse.setLogisticsCost(logisticsData.getLogisticsCost());
        logisticsDataDetailResponse.setLogisticsCostType(logisticsData.getLogisticsCostType());
        logisticsDataDetailResponse.setLogiInvoiceNo(logisticsData.getLogiInvoiceNo());
        logisticsDataDetailResponse.setPackingTime(logisticsData.getPackingTime());
        logisticsDataDetailResponse.setLeaveFactory(logisticsData.getLeaveFactory());
        logisticsDataDetailResponse.setSailingDate(logisticsData.getSailingDate());
        logisticsDataDetailResponse.setCustomsClearance(logisticsData.getCustomsClearance());
        logisticsDataDetailResponse.setLeavePortTime(logisticsData.getLeavePortTime());
        logisticsDataDetailResponse.setArrivalPortTime(logisticsData.getArrivalPortTime());
        logisticsDataDetailResponse.setRemarks(logisticsData.getRemarks());
        logisticsDataDetailResponse.setLogisticsDataStatus(logisticsData.getLogisticsDataStatus());
        return logisticsDataDetailResponse;
    }

    public static LogisticsDataListResponse logisticsDataListResponse(LogisticsData logisticsData) {
        if (logisticsData == null) {
            return null;
        }
        LogisticsDataListResponse logisticsDataListResponse = new LogisticsDataListResponse();
        logisticsDataListResponse.setId(logisticsData.getId());
        logisticsDataListResponse.setTheAwbNo(logisticsData.getTheAwbNo());
        logisticsDataListResponse.setContractNo(logisticsData.getContractNo());
        logisticsDataListResponse.setDeliverDetailNo(logisticsData.getDeliverDetailNo());
        logisticsDataListResponse.setReleaseDate(logisticsData.getReleaseDate());
        logisticsDataListResponse.setAccomplishDate(logisticsData.getAccomplishDate());
        logisticsDataListResponse.setLogisticsDataStatus(logisticsData.getLogisticsDataStatus());
        LogisticsDataInfoStatusEnum statusEnum = LogisticsDataInfoStatusEnum.valueOf(logisticsData.getLogisticsDataStatus());
        if (statusEnum != null) {
            logisticsDataListResponse.setLogisticsDataStatusName(statusEnum.getName());
        }

        return logisticsDataListResponse;
    }
}

