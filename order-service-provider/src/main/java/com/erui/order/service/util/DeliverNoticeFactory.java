package com.erui.order.service.util;

import com.erui.order.common.enums.DeliverNoticeStatusEnum;
import com.erui.order.common.pojo.request.DeliverNoticeSaveRequest;
import com.erui.order.common.pojo.response.DeliverNoticeDetailResponse;
import com.erui.order.common.pojo.response.DeliverNoticeListResponse;
import com.erui.order.model.entity.DeliverNotice;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class DeliverNoticeFactory {

    public static DeliverNotice deliverNotice(DeliverNoticeSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        DeliverNotice deliverNotice = new DeliverNotice();
        deliverNotice.setId(saveRequest.getId());
        deliverNotice.setDeliverConsignId(saveRequest.getDeliverConsignId());
        deliverNotice.setOtherReq(saveRequest.getOtherReq());
        deliverNotice.setPackageReq(saveRequest.getPackageReq());
        deliverNotice.setPrepareReq(saveRequest.getPrepareReq());

        return deliverNotice;
    }

    public static DeliverNoticeDetailResponse deliverNoticeDetailResponse(DeliverNotice deliverNotice) {
        if (deliverNotice == null) {
            return null;
        }

        DeliverNoticeDetailResponse deliverNoticeDetailResponse = new DeliverNoticeDetailResponse();
        deliverNoticeDetailResponse.setId(deliverNotice.getId());
        deliverNoticeDetailResponse.setDeliverConsignId(deliverNotice.getDeliverConsignId());
        deliverNoticeDetailResponse.setOtherReq(deliverNotice.getOtherReq());
        deliverNoticeDetailResponse.setPackageReq(deliverNotice.getPackageReq());
        deliverNoticeDetailResponse.setPrepareReq(deliverNotice.getPrepareReq());

        return deliverNoticeDetailResponse;
    }

    public static DeliverNoticeListResponse deliverNoticeListResponse(DeliverNotice deliverNotice) {
        if (deliverNotice == null) {
            return null;
        }
        DeliverNoticeListResponse deliverNoticeListResponse = new DeliverNoticeListResponse();
        deliverNoticeListResponse.setId(deliverNotice.getId());
        deliverNoticeListResponse.setDeliverConsignId(deliverNotice.getDeliverConsignId());
        deliverNoticeListResponse.setContractNo(deliverNotice.getContractNo());
        deliverNoticeListResponse.setCrmCode(deliverNotice.getCrmCode());
        deliverNoticeListResponse.setDeliveryDate(deliverNotice.getDeliveryDate());
        deliverNoticeListResponse.setExecCoName(deliverNotice.getExecCoName());
        deliverNoticeListResponse.setWareHouseman(deliverNotice.getWareHouseman());

        deliverNoticeListResponse.setOperationSpecialistId(deliverNotice.getOperationSpecialistId());
        deliverNoticeListResponse.setDeliverNoticeStatus(deliverNotice.getDeliverNoticeStatus());
        DeliverNoticeStatusEnum statusEnum = DeliverNoticeStatusEnum.valueOf(deliverNotice.getDeliverNoticeStatus());
        if (statusEnum != null) {
            deliverNoticeListResponse.setDeliverNoticeStatusName(statusEnum.getName());
        }

        return deliverNoticeListResponse;
    }
}

