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

    public static InspectReport inspectReport(InspectReportSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        InspectReport inspectReport = new InspectReport();
        inspectReport.setId(saveRequest.getId());
        inspectReport.setCheckDate(saveRequest.getCheckDate());
        inspectReport.setDoneDate(saveRequest.getDoneDate());
        inspectReport.setReportRemarks(saveRequest.getReportRemarks());
        inspectReport.setInspectReportStatus(saveRequest.getInspectReportStatus());

        return inspectReport;
    }

    public static InspectReportDetailResponse inspectReportDetailResponse(InspectReport inspectReport) {
        if (inspectReport == null) {
            return null;
        }

        InspectReportDetailResponse inspectReportDetailResponse = new InspectReportDetailResponse();
        inspectReportDetailResponse.setId(inspectReport.getId());
        inspectReportDetailResponse.setCheckUserId(inspectReport.getCheckUserId());


        inspectReportDetailResponse.setNcrNo(inspectReport.getNcrNo());
        inspectReportDetailResponse.setCheckDate(inspectReport.getCheckDate());
        inspectReportDetailResponse.setDoneDate(inspectReport.getDoneDate());
        inspectReportDetailResponse.setInspectReportStatus(inspectReport.getInspectReportStatus());
        inspectReportDetailResponse.setReportRemarks(inspectReport.getReportRemarks());
        inspectReportDetailResponse.setMsg(inspectReport.getMsg());
        inspectReportDetailResponse.setInspectReportStatus(inspectReport.getInspectReportStatus());

        return inspectReportDetailResponse;
    }

    public static InspectReportListResponse inspectReportListResponse(InspectReport inspectReport) {
        if (inspectReport == null) {
            return null;
        }
        InspectReportListResponse inspectReportListResponse = new InspectReportListResponse();
        inspectReportListResponse.setId(inspectReport.getId());
        inspectReportListResponse.setInspectApplyNo(inspectReport.getInspectApplyNo());
        inspectReportListResponse.setContractNo(inspectReport.getContractNo());
        inspectReportListResponse.setProjectNo(inspectReport.getProjectNo());
        inspectReportListResponse.setPurchNo(inspectReport.getPurchNo());
        inspectReportListResponse.setSupplierName(inspectReport.getSupplierName());
        inspectReportListResponse.setCheckDate(inspectReport.getCheckDate());
        inspectReportListResponse.setCheckTimes(inspectReport.getCheckTimes());

        inspectReportListResponse.setInspectReportStatus(inspectReport.getInspectReportStatus());
        InspectReportStatusEnum statusEnum = InspectReportStatusEnum.valueOf(inspectReport.getInspectReportStatus());
        if (statusEnum != null) {
            inspectReportListResponse.setInspectReportStatusName(statusEnum.getName());
        }

        return inspectReportListResponse;
    }
}

