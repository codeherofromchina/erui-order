package com.erui.order.service.util;

import com.erui.order.common.enums.InspectReportStatusEnum;
import com.erui.order.common.pojo.request.InspectReportSaveRequest;
import com.erui.order.common.pojo.response.InspectReportDetailResponse;
import com.erui.order.common.pojo.response.InspectReportListResponse;
import com.erui.order.model.entity.InspectReport;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class InspectReportFactory {

    public static InspectReport InspectReport(InspectReportSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        InspectReport InspectReport = new InspectReport();
        InspectReport.setId(saveRequest.getId());
        InspectReport.setInspectReportStatus(saveRequest.getInspectReportStatus());

        return InspectReport;
    }

    public static InspectReportDetailResponse InspectReportDetailResponse(InspectReport InspectReport) {
        if (InspectReport == null) {
            return null;
        }

        InspectReportDetailResponse InspectReportDetailResponse = new InspectReportDetailResponse();
        InspectReportDetailResponse.setId(InspectReport.getId());
        InspectReportDetailResponse.setInspectReportStatus(InspectReport.getInspectReportStatus());

        return InspectReportDetailResponse;
    }

    public static InspectReportListResponse InspectReportListResponse(InspectReport InspectReport) {
        if (InspectReport == null) {
            return null;
        }
        InspectReportListResponse InspectReportListResponse = new InspectReportListResponse();
        InspectReportListResponse.setId(InspectReport.getId());

        InspectReportListResponse.setInspectReportStatus(InspectReport.getInspectReportStatus());
        InspectReportStatusEnum statusEnum = InspectReportStatusEnum.valueOf(InspectReport.getInspectReportStatus());
        if (statusEnum != null) {
            InspectReportListResponse.setInspectReportStatusName(statusEnum.getName());
        }

        return InspectReportListResponse;
    }
}

