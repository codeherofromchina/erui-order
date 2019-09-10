package com.erui.order.service.util;

import com.erui.order.common.pojo.DeliverConsignBookingSpaceInfo;
import com.erui.order.model.entity.DeliverConsignBookingSpace;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/9 上午12:27
 */
public class DeliverConsignBookingSpaceFactory {
    public static DeliverConsignBookingSpace DeliverConsignBookingSpace(DeliverConsignBookingSpaceInfo DeliverConsignBookingSpaceInfo) {
        if (DeliverConsignBookingSpaceInfo == null) {
            return null;
        }
        DeliverConsignBookingSpace DeliverConsignBookingSpace = new DeliverConsignBookingSpace();

        return DeliverConsignBookingSpace;
    }

    public static List<DeliverConsignBookingSpaceInfo> DeliverConsignBookingSpaceInfo(List<DeliverConsignBookingSpace> DeliverConsignBookingSpaceList) {
        if (DeliverConsignBookingSpaceList == null) {
            return null;
        }
        List<DeliverConsignBookingSpaceInfo> DeliverConsignBookingSpaceInfos = new ArrayList<>();
        for (DeliverConsignBookingSpace DeliverConsignBookingSpace : DeliverConsignBookingSpaceList) {

            DeliverConsignBookingSpaceInfos.add(DeliverConsignBookingSpaceInfo(DeliverConsignBookingSpace));
        }
        return DeliverConsignBookingSpaceInfos;
    }


    public static DeliverConsignBookingSpaceInfo DeliverConsignBookingSpaceInfo(DeliverConsignBookingSpace DeliverConsignBookingSpace) {
        if (DeliverConsignBookingSpace == null) {
            return null;
        }
        DeliverConsignBookingSpaceInfo DeliverConsignBookingSpaceInfo = new DeliverConsignBookingSpaceInfo();

        return DeliverConsignBookingSpaceInfo;
    }
}

