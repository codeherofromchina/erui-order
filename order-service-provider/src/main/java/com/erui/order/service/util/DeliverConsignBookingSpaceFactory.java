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

    public static List<DeliverConsignBookingSpaceInfo> deliverConsignBookingSpaceInfo(List<DeliverConsignBookingSpace> DeliverConsignBookingSpaceList) {
        if (DeliverConsignBookingSpaceList == null) {
            return null;
        }
        List<DeliverConsignBookingSpaceInfo> DeliverConsignBookingSpaceInfos = new ArrayList<>();
        for (DeliverConsignBookingSpace DeliverConsignBookingSpace : DeliverConsignBookingSpaceList) {

            DeliverConsignBookingSpaceInfos.add(deliverConsignBookingSpaceInfo(DeliverConsignBookingSpace));
        }
        return DeliverConsignBookingSpaceInfos;
    }


    public static DeliverConsignBookingSpaceInfo deliverConsignBookingSpaceInfo(DeliverConsignBookingSpace deliverConsignBookingSpace) {
        if (deliverConsignBookingSpace == null) {
            return null;
        }
        DeliverConsignBookingSpaceInfo deliverConsignBookingSpaceInfo = new DeliverConsignBookingSpaceInfo();

        deliverConsignBookingSpaceInfo.setDeliverConsignId(deliverConsignBookingSpace.getDeliverConsignId());
        deliverConsignBookingSpaceInfo.setReadyDate(deliverConsignBookingSpace.getReadyDate());
        deliverConsignBookingSpaceInfo.setArrivalDate(deliverConsignBookingSpace.getArrivalDate());
        deliverConsignBookingSpaceInfo.setOrderEmergency(deliverConsignBookingSpace.getOrderEmergency());
        deliverConsignBookingSpaceInfo.setPenaltyProvision(deliverConsignBookingSpace.getPenaltyProvision());
        deliverConsignBookingSpaceInfo.setRequiredDoc(deliverConsignBookingSpace.getRequiredDoc());
        deliverConsignBookingSpaceInfo.setBillOfPositive(deliverConsignBookingSpace.getBillOfPositive());
        deliverConsignBookingSpaceInfo.setBillOfVice(deliverConsignBookingSpace.getBillOfVice());
        deliverConsignBookingSpaceInfo.setBoxListPositive(deliverConsignBookingSpace.getBoxListPositive());
        deliverConsignBookingSpaceInfo.setBoxListVice(deliverConsignBookingSpace.getBoxListVice());
        deliverConsignBookingSpaceInfo.setInvoicePositive(deliverConsignBookingSpace.getInvoicePositive());
        deliverConsignBookingSpaceInfo.setInvoiceVice(deliverConsignBookingSpace.getInvoiceVice());
        deliverConsignBookingSpaceInfo.setPrimaryOrigin(deliverConsignBookingSpace.getPrimaryOrigin());
        deliverConsignBookingSpaceInfo.setOtherDoc(deliverConsignBookingSpace.getOtherDoc());
        deliverConsignBookingSpaceInfo.setSpecificRequire(deliverConsignBookingSpace.getSpecificRequire());
        deliverConsignBookingSpaceInfo.setBillOfLading(deliverConsignBookingSpace.getBillOfLading());
        deliverConsignBookingSpaceInfo.setShippingMarks(deliverConsignBookingSpace.getShippingMarks());
        deliverConsignBookingSpaceInfo.setPackageRequire(deliverConsignBookingSpace.getPackageRequire());
        deliverConsignBookingSpaceInfo.setCorporateName(deliverConsignBookingSpace.getCorporateName());
        deliverConsignBookingSpaceInfo.setAddress(deliverConsignBookingSpace.getAddress());
        deliverConsignBookingSpaceInfo.setContacts(deliverConsignBookingSpace.getContacts());
        deliverConsignBookingSpaceInfo.setContactInformation(deliverConsignBookingSpace.getContactInformation());
        deliverConsignBookingSpaceInfo.setDutyParagraph(deliverConsignBookingSpace.getDutyParagraph());
        deliverConsignBookingSpaceInfo.setZipCode(deliverConsignBookingSpace.getZipCode());


        return deliverConsignBookingSpaceInfo;
    }
}

