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

    public static DeliverNotice DeliverNotice(DeliverNoticeSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        DeliverNotice DeliverNotice = new DeliverNotice();
        DeliverNotice.setId(saveRequest.getId());

        return DeliverNotice;
    }

    public static DeliverNoticeDetailResponse DeliverNoticeDetailResponse(DeliverNotice DeliverNotice) {
        if (DeliverNotice == null) {
            return null;
        }

        DeliverNoticeDetailResponse DeliverNoticeDetailResponse = new DeliverNoticeDetailResponse();
        DeliverNoticeDetailResponse.setId(DeliverNotice.getId());

        return DeliverNoticeDetailResponse;
    }

    public static DeliverNoticeListResponse DeliverNoticeListResponse(DeliverNotice DeliverNotice) {
        if (DeliverNotice == null) {
            return null;
        }
        DeliverNoticeListResponse DeliverNoticeListResponse = new DeliverNoticeListResponse();
        DeliverNoticeListResponse.setId(DeliverNotice.getId());

//        DeliverNoticeListResponse.setDeliverNoticeStatus(DELIVER_NOTICE.getDeliverNoticeStatus());
//        DeliverNoticeStatusEnum statusEnum = DeliverNoticeStatusEnum.valueOf(DELIVER_NOTICE.getDeliverNoticeStatus());
//        if (statusEnum != null) {
//            DeliverNoticeListResponse.setDeliverNoticeStatusName(statusEnum.getName());
//        }

        return DeliverNoticeListResponse;
    }
}

