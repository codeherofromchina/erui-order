package com.erui.order.service.util;

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

        // TODO
        return purchRequisition;
    }

    public static PurchRequisitionListResponse purchRequisitionListResponse(PurchRequisition purchRequisition) {
        if (purchRequisition == null) {
            return null;
        }
        PurchRequisitionListResponse response = new PurchRequisitionListResponse();
        response.setId(purchRequisition.getId());


        return response;
    }

    public static PurchRequisitionDetailResponse purchRequisitionDetailResponse(PurchRequisition purchRequisition) {
        if (purchRequisition == null) {
            return null;
        }
        PurchRequisitionDetailResponse response = new PurchRequisitionDetailResponse();
        response.setId(purchRequisition.getId());
        return response;
    }
}
