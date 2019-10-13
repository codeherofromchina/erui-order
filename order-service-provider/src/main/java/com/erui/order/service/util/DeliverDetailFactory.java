package com.erui.order.service.util;

import com.erui.order.common.enums.DeliverDetailStatusEnum;
import com.erui.order.common.pojo.request.DeliverDetailSaveRequest;
import com.erui.order.common.pojo.response.DeliverDetailDetailResponse;
import com.erui.order.common.pojo.response.DeliverDetailListResponse;
import com.erui.order.model.entity.DeliverDetail;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class DeliverDetailFactory {

    public static DeliverDetail deliverDetail(DeliverDetailSaveRequest deliverDetailSaveRequest) {
        if (deliverDetailSaveRequest == null) {
            return null;
        }
        DeliverDetail deliverDetail = new DeliverDetail();
        deliverDetail.setId(deliverDetailSaveRequest.getId());
        deliverDetail.setDeliverNoticeId(deliverDetailSaveRequest.getDeliverNoticeId());
        deliverDetail.setBillingDate(deliverDetailSaveRequest.getBillingDate());
        deliverDetail.setPackTotal(deliverDetailSaveRequest.getPackTotal());
        deliverDetail.setCarrierCo(deliverDetailSaveRequest.getCarrierCo());
        deliverDetail.setDriver(deliverDetailSaveRequest.getDriver());
        deliverDetail.setPlateNo(deliverDetailSaveRequest.getPlateNo());
        deliverDetail.setPickupDate(deliverDetailSaveRequest.getPickupDate());
        deliverDetail.setContactTel(deliverDetailSaveRequest.getContactTel());
        deliverDetail.setSenderUserId(deliverDetailSaveRequest.getSenderUserId());
        deliverDetail.setSendDate(deliverDetailSaveRequest.getSendDate());
        deliverDetail.setReviewerUserId(deliverDetailSaveRequest.getReviewerUserId());
        deliverDetail.setGoodsChkStatus(deliverDetailSaveRequest.getGoodsChkStatus());
        deliverDetail.setBillsChkStatus(deliverDetailSaveRequest.getBillsChkStatus());
        deliverDetail.setCheckUserId(deliverDetailSaveRequest.getCheckUserId());
        deliverDetail.setCheckDept(deliverDetailSaveRequest.getCheckDept());
        deliverDetail.setCheckDate(deliverDetailSaveRequest.getCheckDate());
        deliverDetail.setReleaseUserId(deliverDetailSaveRequest.getReleaseUserId());
        deliverDetail.setReleaseDate(deliverDetailSaveRequest.getReleaseDate());
        deliverDetail.setQualityLeaderUserId(deliverDetailSaveRequest.getQualityLeaderUserId());
        deliverDetail.setApplicantUserId(deliverDetailSaveRequest.getApplicantUserId());
        deliverDetail.setApplicantDate(deliverDetailSaveRequest.getApplicantDate());
        deliverDetail.setApproverUserId(deliverDetailSaveRequest.getApproverUserId());
        deliverDetail.setApprovalDate(deliverDetailSaveRequest.getApprovalDate());
        deliverDetail.setReason(deliverDetailSaveRequest.getReason());
        deliverDetail.setOpinion(deliverDetailSaveRequest.getOpinion());
        deliverDetail.setDeliverDetailStatus(deliverDetailSaveRequest.getDeliverDetailStatus());

        return deliverDetail;
    }

    public static DeliverDetailDetailResponse deliverDetailDetailResponse(DeliverDetail deliverDetail) {
        if (deliverDetail == null) {
            return null;
        }
        DeliverDetailDetailResponse deliverDetailDetailResponse = new DeliverDetailDetailResponse();
        deliverDetailDetailResponse.setId(deliverDetail.getId());
        deliverDetailDetailResponse.setDeliverNoticeId(deliverDetail.getDeliverNoticeId());
        deliverDetailDetailResponse.setTradeTerms(deliverDetail.getTradeTerms());
        deliverDetailDetailResponse.setToPort(deliverDetail.getToPort());
        deliverDetailDetailResponse.setBillingDate(deliverDetail.getBillingDate());
        deliverDetailDetailResponse.setPackTotal(deliverDetail.getPackTotal());
        deliverDetailDetailResponse.setCarrierCo(deliverDetail.getCarrierCo());
        deliverDetailDetailResponse.setDriver(deliverDetail.getDriver());
        deliverDetailDetailResponse.setPlateNo(deliverDetail.getPlateNo());
        deliverDetailDetailResponse.setPickupDate(deliverDetail.getPickupDate());
        deliverDetailDetailResponse.setContactTel(deliverDetail.getContactTel());
        deliverDetailDetailResponse.setSenderUserId(deliverDetail.getSenderUserId());
        deliverDetailDetailResponse.setSendDate(deliverDetail.getSendDate());
        deliverDetailDetailResponse.setReviewerUserId(deliverDetail.getReviewerUserId());
        deliverDetailDetailResponse.setGoodsChkStatus(deliverDetail.getGoodsChkStatus());
        deliverDetailDetailResponse.setBillsChkStatus(deliverDetail.getBillsChkStatus());
        deliverDetailDetailResponse.setCheckUserId(deliverDetail.getCheckUserId());
        deliverDetailDetailResponse.setCheckDept(deliverDetail.getCheckDept());
        deliverDetailDetailResponse.setCheckDate(deliverDetail.getCheckDate());
        deliverDetailDetailResponse.setReleaseUserId(deliverDetail.getReleaseUserId());
        deliverDetailDetailResponse.setReleaseDate(deliverDetail.getReleaseDate());
        deliverDetailDetailResponse.setQualityLeaderUserId(deliverDetail.getQualityLeaderUserId());
        deliverDetailDetailResponse.setApplicantUserId(deliverDetail.getApplicantUserId());
        deliverDetailDetailResponse.setApplicantDate(deliverDetail.getApplicantDate());
        deliverDetailDetailResponse.setApproverUserId(deliverDetail.getApproverUserId());
        deliverDetailDetailResponse.setApprovalDate(deliverDetail.getApprovalDate());
        deliverDetailDetailResponse.setReason(deliverDetail.getReason());
        deliverDetailDetailResponse.setOpinion(deliverDetail.getOpinion());
        deliverDetailDetailResponse.setDeliverDetailStatus(deliverDetail.getDeliverDetailStatus());

        return deliverDetailDetailResponse;
    }

    public static DeliverDetailListResponse deliverDetailListResponse(DeliverDetail deliverDetail) {
        if (deliverDetail == null) {
            return null;
        }
        DeliverDetailListResponse deliverDetailListResponse = new DeliverDetailListResponse();
        deliverDetailListResponse.setId(deliverDetail.getId());
        deliverDetailListResponse.setDeliverDetailNo(deliverDetail.getDeliverDetailNo());
        deliverDetailListResponse.setContractNo(deliverDetail.getContractNo());
        deliverDetailListResponse.setDeliverConsignNo(deliverDetail.getDeliverConsignNo());
        deliverDetailListResponse.setProjectNo(deliverDetail.getProjectNo());
        deliverDetailListResponse.setReleaseDate(deliverDetail.getReleaseDate());
        deliverDetailListResponse.setLeaveDate(deliverDetail.getLeaveDate());
        deliverDetailListResponse.setHandleDepartment(deliverDetail.getHandleDepartment());
        deliverDetailListResponse.setBillingDate(deliverDetail.getBillingDate());
        deliverDetailListResponse.setWareHouseman(deliverDetail.getWareHouseman());
        deliverDetailListResponse.setWareHousemanName(deliverDetail.getWareHousemanName());
        deliverDetailListResponse.setOutCheck(deliverDetail.getOutCheck());
        deliverDetailListResponse.setCheckDept(deliverDetail.getCheckDept());
        deliverDetailListResponse.setCheckUserId(deliverDetail.getCheckUserId());
        deliverDetailListResponse.setCheckDate(deliverDetail.getCheckDate());
        deliverDetailListResponse.setDeliverDetailStatus(deliverDetail.getDeliverDetailStatus());
        DeliverDetailStatusEnum statusEnum = DeliverDetailStatusEnum.valueOf(deliverDetail.getDeliverDetailStatus());
        if (statusEnum != null) {
            deliverDetailListResponse.setDeliverDetailStatusName(statusEnum.getName());
        }

        return deliverDetailListResponse;
    }
}

