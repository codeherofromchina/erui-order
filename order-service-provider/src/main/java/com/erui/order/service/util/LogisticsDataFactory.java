package com.erui.order.service.util;

import com.erui.order.common.enums.LogisticsDataStatusEnum;
import com.erui.order.common.pojo.request.LogisticsDataSaveRequest;
import com.erui.order.common.pojo.response.LogisticsDataDetailResponse;
import com.erui.order.common.pojo.response.LogisticsDataListResponse;
import com.erui.order.model.entity.LogisticsData;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class LogisticsDataFactory {

    public static LogisticsData LogisticsData(LogisticsDataSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        LogisticsData LogisticsData = new LogisticsData();
        LogisticsData.setId(saveRequest.getId());
        LogisticsData.setLogisticsDataStatus(saveRequest.getLogisticsDataStatus());

        return LogisticsData;
    }

    public static LogisticsDataDetailResponse LogisticsDataDetailResponse(LogisticsData LogisticsData) {
        if (LogisticsData == null) {
            return null;
        }

        LogisticsDataDetailResponse LogisticsDataDetailResponse = new LogisticsDataDetailResponse();
        LogisticsDataDetailResponse.setId(LogisticsData.getId());
        LogisticsDataDetailResponse.setLogisticsDataStatus(LogisticsData.getLogisticsDataStatus());

        return LogisticsDataDetailResponse;
    }

    public static LogisticsDataListResponse LogisticsDataListResponse(LogisticsData LogisticsData) {
        if (LogisticsData == null) {
            return null;
        }
        LogisticsDataListResponse LogisticsDataListResponse = new LogisticsDataListResponse();
        LogisticsDataListResponse.setId(LogisticsData.getId());

        LogisticsDataListResponse.setLogisticsDataStatus(LogisticsData.getLogisticsDataStatus());
        LogisticsDataStatusEnum statusEnum = LogisticsDataStatusEnum.valueOf(LogisticsData.getLogisticsDataStatus());
        if (statusEnum != null) {
            LogisticsDataListResponse.setLogisticsDataStatusName(statusEnum.getName());
        }

        return LogisticsDataListResponse;
    }
}

