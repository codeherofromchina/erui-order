package com.erui.order.service.util;

import com.erui.order.common.enums.DeliverConsignStatusEnum;
import com.erui.order.common.pojo.request.DeliverConsignSaveRequest;
import com.erui.order.common.pojo.response.DeliverConsignDetailResponse;
import com.erui.order.common.pojo.response.DeliverConsignListResponse;
import com.erui.order.model.entity.DeliverConsign;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class DeliverConsignFactory {

    public static DeliverConsign DeliverConsign(DeliverConsignSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        DeliverConsign DeliverConsign = new DeliverConsign();
        DeliverConsign.setId(saveRequest.getId());
        DeliverConsign.setDeliverConsignStatus(saveRequest.getDeliverConsignStatus());

        return DeliverConsign;
    }

    public static DeliverConsignDetailResponse DeliverConsignDetailResponse(DeliverConsign DeliverConsign) {
        if (DeliverConsign == null) {
            return null;
        }

        DeliverConsignDetailResponse DeliverConsignDetailResponse = new DeliverConsignDetailResponse();
        DeliverConsignDetailResponse.setId(DeliverConsign.getId());
        DeliverConsignDetailResponse.setDeliverConsignStatus(DeliverConsign.getDeliverConsignStatus());

        return DeliverConsignDetailResponse;
    }

    public static DeliverConsignListResponse DeliverConsignListResponse(DeliverConsign DeliverConsign) {
        if (DeliverConsign == null) {
            return null;
        }
        DeliverConsignListResponse DeliverConsignListResponse = new DeliverConsignListResponse();
        DeliverConsignListResponse.setId(DeliverConsign.getId());

        DeliverConsignListResponse.setDeliverConsignStatus(DeliverConsign.getDeliverConsignStatus());
        DeliverConsignStatusEnum statusEnum = DeliverConsignStatusEnum.valueOf(DeliverConsign.getDeliverConsignStatus());
        if (statusEnum != null) {
            DeliverConsignListResponse.setDeliverConsignStatusName(statusEnum.getName());
        }

        return DeliverConsignListResponse;
    }
}

