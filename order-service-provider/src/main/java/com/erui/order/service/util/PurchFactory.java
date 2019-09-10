package com.erui.order.service.util;

import com.erui.order.common.enums.PurchStatusEnum;
import com.erui.order.common.pojo.request.PurchSaveRequest;
import com.erui.order.common.pojo.response.PurchDetailResponse;
import com.erui.order.common.pojo.response.PurchListResponse;
import com.erui.order.model.entity.Purch;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class PurchFactory {

    public static Purch Purch(PurchSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        Purch Purch = new Purch();
        Purch.setId(saveRequest.getId());
        Purch.setPurchStatus(saveRequest.getPurchStatus());

        return Purch;
    }

    public static PurchDetailResponse PurchDetailResponse(Purch Purch) {
        if (Purch == null) {
            return null;
        }

        PurchDetailResponse PurchDetailResponse = new PurchDetailResponse();
        PurchDetailResponse.setId(Purch.getId());
        PurchDetailResponse.setPurchStatus(Purch.getPurchStatus());

        return PurchDetailResponse;
    }

    public static PurchListResponse PurchListResponse(Purch Purch) {
        if (Purch == null) {
            return null;
        }
        PurchListResponse PurchListResponse = new PurchListResponse();
        PurchListResponse.setId(Purch.getId());

        PurchListResponse.setPurchStatus(Purch.getPurchStatus());
        PurchStatusEnum statusEnum = PurchStatusEnum.valueOf(Purch.getPurchStatus());
        if (statusEnum != null) {
            PurchListResponse.setPurchStatusName(statusEnum.getName());
        }

        return PurchListResponse;
    }
}

