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

    public static DeliverDetail DeliverDetail(DeliverDetailSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        DeliverDetail DeliverDetail = new DeliverDetail();
        DeliverDetail.setId(saveRequest.getId());
//        DELIVER_DETAIL.setDeliverDetailStatus(saveRequest.getDeliverDetailStatus());

        return DeliverDetail;
    }

    public static DeliverDetailDetailResponse DeliverDetailDetailResponse(DeliverDetail DeliverDetail) {
        if (DeliverDetail == null) {
            return null;
        }

        DeliverDetailDetailResponse DeliverDetailDetailResponse = new DeliverDetailDetailResponse();
        DeliverDetailDetailResponse.setId(DeliverDetail.getId());
//        DeliverDetailDetailResponse.setDeliverDetailStatus(DELIVER_DETAIL.getDeliverDetailStatus());

        return DeliverDetailDetailResponse;
    }

    public static DeliverDetailListResponse DeliverDetailListResponse(DeliverDetail DeliverDetail) {
        if (DeliverDetail == null) {
            return null;
        }
        DeliverDetailListResponse DeliverDetailListResponse = new DeliverDetailListResponse();
        DeliverDetailListResponse.setId(DeliverDetail.getId());

//        DeliverDetailListResponse.setDeliverDetailStatus(DELIVER_DETAIL.getDeliverDetailStatus());
//        DeliverDetailStatusEnum statusEnum = DeliverDetailStatusEnum.valueOf(DELIVER_DETAIL.getDeliverDetailStatus());
//        if (statusEnum != null) {
//            DeliverDetailListResponse.setDeliverDetailStatusName(statusEnum.getName());
//        }

        return DeliverDetailListResponse;
    }
}

