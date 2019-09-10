package com.erui.order.service.util;

import com.erui.order.common.enums.OrderAccountDeliverStatusEnum;
import com.erui.order.common.pojo.request.OrderAccountDeliverSaveRequest;
import com.erui.order.common.pojo.response.OrderAccountDeliverDetailResponse;
import com.erui.order.common.pojo.response.OrderAccountDeliverListResponse;
import com.erui.order.model.entity.OrderAccountDeliver;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class OrderAccountDeliverFactory {

    public static OrderAccountDeliver OrderAccountDeliver(OrderAccountDeliverSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        OrderAccountDeliver OrderAccountDeliver = new OrderAccountDeliver();
        OrderAccountDeliver.setId(saveRequest.getId());

        return OrderAccountDeliver;
    }

    public static OrderAccountDeliverDetailResponse OrderAccountDeliverDetailResponse(OrderAccountDeliver OrderAccountDeliver) {
        if (OrderAccountDeliver == null) {
            return null;
        }

        OrderAccountDeliverDetailResponse OrderAccountDeliverDetailResponse = new OrderAccountDeliverDetailResponse();
        OrderAccountDeliverDetailResponse.setId(OrderAccountDeliver.getId());

        return OrderAccountDeliverDetailResponse;
    }

    public static OrderAccountDeliverListResponse OrderAccountDeliverListResponse(OrderAccountDeliver OrderAccountDeliver) {
        if (OrderAccountDeliver == null) {
            return null;
        }
        OrderAccountDeliverListResponse OrderAccountDeliverListResponse = new OrderAccountDeliverListResponse();
        OrderAccountDeliverListResponse.setId(OrderAccountDeliver.getId());


        return OrderAccountDeliverListResponse;
    }
}

