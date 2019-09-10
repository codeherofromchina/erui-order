package com.erui.order.service.util;

import com.erui.order.common.enums.OrderAccountStatusEnum;
import com.erui.order.common.pojo.request.OrderAccountSaveRequest;
import com.erui.order.common.pojo.response.OrderAccountDetailResponse;
import com.erui.order.common.pojo.response.OrderAccountListResponse;
import com.erui.order.model.entity.OrderAccount;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class OrderAccountFactory {

    public static OrderAccount OrderAccount(OrderAccountSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        OrderAccount OrderAccount = new OrderAccount();
        OrderAccount.setId(saveRequest.getId());

        return OrderAccount;
    }

    public static OrderAccountDetailResponse OrderAccountDetailResponse(OrderAccount OrderAccount) {
        if (OrderAccount == null) {
            return null;
        }

        OrderAccountDetailResponse OrderAccountDetailResponse = new OrderAccountDetailResponse();
        OrderAccountDetailResponse.setId(OrderAccount.getId());

        return OrderAccountDetailResponse;
    }

    public static OrderAccountListResponse OrderAccountListResponse(OrderAccount OrderAccount) {
        if (OrderAccount == null) {
            return null;
        }
        OrderAccountListResponse OrderAccountListResponse = new OrderAccountListResponse();
        OrderAccountListResponse.setId(OrderAccount.getId());


        return OrderAccountListResponse;
    }
}

