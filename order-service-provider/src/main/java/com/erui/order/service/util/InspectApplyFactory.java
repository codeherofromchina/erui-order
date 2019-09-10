package com.erui.order.service.util;

import com.erui.order.common.enums.InspectApplyStatusEnum;
import com.erui.order.common.pojo.request.InspectApplySaveRequest;
import com.erui.order.common.pojo.response.InspectApplyDetailResponse;
import com.erui.order.common.pojo.response.InspectApplyListResponse;
import com.erui.order.model.entity.InspectApply;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class InspectApplyFactory {

    public static InspectApply InspectApply(InspectApplySaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        InspectApply InspectApply = new InspectApply();
        InspectApply.setId(saveRequest.getId());
        InspectApply.setInspectApplyStatus(saveRequest.getInspectApplyStatus());

        return InspectApply;
    }

    public static InspectApplyDetailResponse InspectApplyDetailResponse(InspectApply InspectApply) {
        if (InspectApply == null) {
            return null;
        }

        InspectApplyDetailResponse InspectApplyDetailResponse = new InspectApplyDetailResponse();
        InspectApplyDetailResponse.setId(InspectApply.getId());
        InspectApplyDetailResponse.setInspectApplyStatus(InspectApply.getInspectApplyStatus());

        return InspectApplyDetailResponse;
    }

    public static InspectApplyListResponse InspectApplyListResponse(InspectApply InspectApply) {
        if (InspectApply == null) {
            return null;
        }
        InspectApplyListResponse InspectApplyListResponse = new InspectApplyListResponse();
        InspectApplyListResponse.setId(InspectApply.getId());

        InspectApplyListResponse.setInspectApplyStatus(InspectApply.getInspectApplyStatus());
        InspectApplyStatusEnum statusEnum = InspectApplyStatusEnum.valueOf(InspectApply.getInspectApplyStatus());
        if (statusEnum != null) {
            InspectApplyListResponse.setInspectApplyStatusName(statusEnum.getName());
        }

        return InspectApplyListResponse;
    }
}

