package com.erui.order.service.util;

import com.erui.order.common.enums.InspectApplyStatusEnum;
import com.erui.order.common.pojo.request.InspectApplySaveRequest;
import com.erui.order.common.pojo.response.InspectApplyDetailResponse;
import com.erui.order.common.pojo.response.InspectApplyListResponse;
import com.erui.order.model.entity.InspectApply;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class InspectApplyFactory {

    public static InspectApply inspectApply(InspectApplySaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        InspectApply inspectApply = new InspectApply();
        inspectApply.setId(saveRequest.getId());
        inspectApply.setPurchId(saveRequest.getPurchId());
        inspectApply.setInspectDate(saveRequest.getInspectDate());
        inspectApply.setEnterEruiWarehouse(saveRequest.getEnterEruiWarehouse());
        inspectApply.setRemark(saveRequest.getRemark());
        inspectApply.setInspectApplyStatus(saveRequest.getInspectApplyStatus());
        inspectApply.setpId(saveRequest.getpId());
        if (saveRequest.getpId() != null) {
            inspectApply.setMasteer(Boolean.TRUE);
        } else {
            inspectApply.setMasteer(Boolean.FALSE);
        }

        return inspectApply;
    }

    public static InspectApplyDetailResponse inspectApplyDetailResponse(InspectApply inspectApply) {
        if (inspectApply == null) {
            return null;
        }
        InspectApplyDetailResponse inspectApplyDetailResponse = new InspectApplyDetailResponse();
        inspectApplyDetailResponse.setId(inspectApply.getId());
        inspectApplyDetailResponse.setpId(inspectApply.getpId());
        inspectApplyDetailResponse.setPurchId(inspectApply.getPurchId());
        inspectApplyDetailResponse.setDepartment(inspectApply.getDepartment());
        inspectApplyDetailResponse.setPurchaseNameId(inspectApply.getPurchaseNameId());
        inspectApplyDetailResponse.setSupplierName(inspectApply.getSupplierName());
        inspectApplyDetailResponse.setInspectDate(inspectApply.getInspectDate());
        inspectApplyDetailResponse.setEnterEruiWarehouse(inspectApply.getEnterEruiWarehouse());
        inspectApplyDetailResponse.setRemark(inspectApply.getRemark());
        inspectApplyDetailResponse.setInspectApplyStatus(inspectApply.getInspectApplyStatus());
        return inspectApplyDetailResponse;
    }

    public static InspectApplyListResponse inspectApplyListResponse(InspectApply inspectApply) {
        if (inspectApply == null) {
            return null;
        }
        InspectApplyListResponse InspectApplyListResponse = new InspectApplyListResponse();
        InspectApplyListResponse.setId(inspectApply.getId());
        InspectApplyListResponse.setPurchNo(inspectApply.getPurchNo());
        InspectApplyListResponse.setInspectApplyNo(inspectApply.getInspectApplyNo());
        InspectApplyListResponse.setDepartment(inspectApply.getDepartment());
        InspectApplyListResponse.setPurchaseNameId(inspectApply.getPurchaseNameId());
//
        InspectApplyListResponse.setSupplierName(inspectApply.getSupplierName());
        InspectApplyListResponse.setInspectDate(inspectApply.getInspectDate());
        InspectApplyListResponse.setNum(inspectApply.getNum());
        InspectApplyListResponse.setPubStatus(inspectApply.getPubStatus());
        InspectApplyStatusEnum pubStatusEnum = InspectApplyStatusEnum.valueOf(inspectApply.getPubStatus());
        if (pubStatusEnum != null) {
            InspectApplyListResponse.setPubStatusName(pubStatusEnum.getName());
        }
        InspectApplyListResponse.setInspectApplyStatus(inspectApply.getInspectApplyStatus());
        InspectApplyStatusEnum statusEnum = InspectApplyStatusEnum.valueOf(inspectApply.getInspectApplyStatus());
        if (statusEnum != null) {
            InspectApplyListResponse.setInspectApplyStatusName(statusEnum.getName());
        }

        return InspectApplyListResponse;
    }
}

