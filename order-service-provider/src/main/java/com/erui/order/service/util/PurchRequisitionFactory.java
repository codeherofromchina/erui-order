package com.erui.order.service.util;

import com.erui.order.common.enums.ProjectTypeEnum;
import com.erui.order.common.enums.PurchStatusEnum;
import com.erui.order.common.pojo.request.PurchRequisitionSaveRequest;
import com.erui.order.common.pojo.response.PurchRequisitionDetailResponse;
import com.erui.order.common.pojo.response.PurchRequisitionListResponse;
import com.erui.order.model.entity.PurchRequisition;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午5:15
 */
public class PurchRequisitionFactory {
    public static PurchRequisition purchRequisition(PurchRequisitionSaveRequest purchRequisitionSaveRequest) {
        if (purchRequisitionSaveRequest == null) {
            return null;
        }
        PurchRequisition purchRequisition = new PurchRequisition();
        purchRequisition.setId(purchRequisitionSaveRequest.getId());
        purchRequisition.setProjectId(purchRequisitionSaveRequest.getProjectId());
        purchRequisition.setSubmitDate(purchRequisitionSaveRequest.getSubmitDate());
        purchRequisition.setFactorySend(purchRequisitionSaveRequest.getFactorySend());
        purchRequisition.setDeliveryPlace(purchRequisitionSaveRequest.getDeliveryPlace());
        purchRequisition.setRequirements(purchRequisitionSaveRequest.getRequirements());
        purchRequisition.setRemarks(purchRequisitionSaveRequest.getRemarks());
        purchRequisition.setPurchRequisitionStatus(purchRequisitionSaveRequest.getPurchRequisitionStatus());
        return purchRequisition;
    }

    public static PurchRequisitionListResponse purchRequisitionListResponse(PurchRequisition purchRequisition) {
        if (purchRequisition == null) {
            return null;
        }
        PurchRequisitionListResponse response = new PurchRequisitionListResponse();
        response.setId(purchRequisition.getId());
        response.setProjectId(purchRequisition.getProjectId());
        response.setContractNo(purchRequisition.getContractNo());
        response.setProjectNo(purchRequisition.getProjectNo());
        response.setProjectName(purchRequisition.getProjectName());
        response.setBusinessUid(purchRequisition.getBusinessUid());
        response.setProjectStartDate(purchRequisition.getProjectStartDate());
        response.setSubmitDate(purchRequisition.getSubmitDate());
        response.setRequirePurchaseDate(purchRequisition.getRequirePurchaseDate());
        response.setPurchStatus(purchRequisition.getPurchStatus());
        response.setPurchaseUid(purchRequisition.getPurchaseUid());
        PurchStatusEnum purchStatusEnum = PurchStatusEnum.valueOf(purchRequisition.getPurchStatus());
        if (purchStatusEnum != null) {
            response.setPurchStatusName(purchStatusEnum.getName());
        }

        return response;
    }

    public static PurchRequisitionDetailResponse purchRequisitionDetailResponse(PurchRequisition purchRequisition) {
        if (purchRequisition == null) {
            return null;
        }
        PurchRequisitionDetailResponse response = new PurchRequisitionDetailResponse();
        response.setId(purchRequisition.getId());
        response.setProjectId(purchRequisition.getProjectId());
        response.setProjectNo(purchRequisition.getProjectNo());
        response.setPmUid(purchRequisition.getBusinessUid());
        response.setDepartment(purchRequisition.getDepartment());
        response.setSubmitDate(purchRequisition.getSubmitDate());
        response.setTradeMethod(purchRequisition.getTradeMethod());
        ProjectTypeEnum projectTypeEnum = ProjectTypeEnum.valueOf(purchRequisition.getTradeMethod());
        if (projectTypeEnum != null) {
            response.setTradeMethodName(projectTypeEnum.getName());
        }
        response.setTransModeBn(purchRequisition.getTransModeBn());
        response.setFactorySend(purchRequisition.getFactorySend());
        response.setDeliveryPlace(purchRequisition.getDeliveryPlace());
        response.setRequirements(purchRequisition.getRequirements());
        response.setRemarks(purchRequisition.getRemarks());

        return response;
    }
}
