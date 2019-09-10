package com.erui.order.service.util;

import com.erui.order.common.enums.InstockStatusEnum;
import com.erui.order.common.pojo.request.InstockSaveRequest;
import com.erui.order.common.pojo.response.InstockDetailResponse;
import com.erui.order.common.pojo.response.InstockListResponse;
import com.erui.order.model.entity.Instock;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class InstockFactory {

    public static Instock Instock(InstockSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        Instock Instock = new Instock();
        Instock.setId(saveRequest.getId());
        Instock.setInstockStatus(saveRequest.getInstockStatus());

        return Instock;
    }

    public static InstockDetailResponse InstockDetailResponse(Instock Instock) {
        if (Instock == null) {
            return null;
        }

        InstockDetailResponse InstockDetailResponse = new InstockDetailResponse();
        InstockDetailResponse.setId(Instock.getId());
        InstockDetailResponse.setInstockStatus(Instock.getInstockStatus());

        return InstockDetailResponse;
    }

    public static InstockListResponse InstockListResponse(Instock Instock) {
        if (Instock == null) {
            return null;
        }
        InstockListResponse InstockListResponse = new InstockListResponse();
        InstockListResponse.setId(Instock.getId());

        InstockListResponse.setInstockStatus(Instock.getInstockStatus());
        InstockStatusEnum statusEnum = InstockStatusEnum.valueOf(Instock.getInstockStatus());
        if (statusEnum != null) {
            InstockListResponse.setInstockStatusName(statusEnum.getName());
        }

        return InstockListResponse;
    }
}

