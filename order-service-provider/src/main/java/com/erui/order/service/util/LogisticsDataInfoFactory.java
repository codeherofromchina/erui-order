package com.erui.order.service.util;

import com.erui.order.common.pojo.request.LogisticsDataInfoSaveRequest;
import com.erui.order.common.pojo.response.LogisticsDataInfoDetailResponse;
import com.erui.order.model.entity.LogisticsDataInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/9 上午12:27
 */
public class LogisticsDataInfoFactory {
    public static LogisticsDataInfo logisticsDataInfo(LogisticsDataInfoSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        LogisticsDataInfo logisticsDataInfo = new LogisticsDataInfo();
        logisticsDataInfo.setId(saveRequest.getId());
        logisticsDataInfo.setLogisticsDataId(saveRequest.getLogisticsDataId());
        logisticsDataInfo.setPortName(saveRequest.getPortName());
        logisticsDataInfo.setPortNameZh(saveRequest.getPortNameZh());
        logisticsDataInfo.setLeavePortDate(saveRequest.getLeavePortDate());
        logisticsDataInfo.setLogisticsDataInfoStatus(saveRequest.getStatus());

        return logisticsDataInfo;
    }

    public static List<LogisticsDataInfoDetailResponse> logisticsDataDetailResponse(List<LogisticsDataInfo> logisticsDataInfos) {
        if (logisticsDataInfos == null) {
            return null;
        }
        List<LogisticsDataInfoDetailResponse> logisticsDataInfoDetailResponses = new ArrayList<>();
        for (LogisticsDataInfo LogisticsDataInfo : logisticsDataInfos) {
            logisticsDataInfoDetailResponses.add(logisticsDataDetailResponse(LogisticsDataInfo));
        }
        return logisticsDataInfoDetailResponses;
    }


    public static LogisticsDataInfoDetailResponse logisticsDataDetailResponse(LogisticsDataInfo logisticsDataInfo) {
        if (logisticsDataInfo == null) {
            return null;
        }
        LogisticsDataInfoDetailResponse logisticsDataInfoDetailResponse = new LogisticsDataInfoDetailResponse();
        logisticsDataInfoDetailResponse.setId(logisticsDataInfo.getId());
        logisticsDataInfoDetailResponse.setLogisticsDataId(logisticsDataInfo.getLogisticsDataId());
        logisticsDataInfoDetailResponse.setPortName(logisticsDataInfo.getPortName());
        logisticsDataInfoDetailResponse.setPortNameZh(logisticsDataInfo.getPortNameZh());
        logisticsDataInfoDetailResponse.setLeavePortDate(logisticsDataInfo.getLeavePortDate());
        logisticsDataInfoDetailResponse.setStatus(logisticsDataInfo.getLogisticsDataInfoStatus());

        return logisticsDataInfoDetailResponse;
    }
}

