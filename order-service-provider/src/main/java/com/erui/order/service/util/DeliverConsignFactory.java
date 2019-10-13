package com.erui.order.service.util;

import com.erui.order.common.enums.BusinessNatureTypeEnum;
import com.erui.order.common.enums.CompanyEnum;
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

    public static DeliverConsign deliverConsign(DeliverConsignSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        DeliverConsign deliverConsign = new DeliverConsign();
        deliverConsign.setId(saveRequest.getId());
        deliverConsign.setOrderId(saveRequest.getOrderId());
        deliverConsign.setDeliverConsignStatus(saveRequest.getDeliverConsignStatus());
        deliverConsign.setWriteDate(saveRequest.getWriteDate());
        deliverConsign.setBusinessNature(saveRequest.getBusinessNature());
        deliverConsign.setBusinessSketch(saveRequest.getBusinessSketch());
        deliverConsign.setBookingDate(saveRequest.getBookingDate());
        deliverConsign.setThisShipmentsMoney(saveRequest.getThisShipmentsMoney());
        deliverConsign.setDeclareCustomsMoney(saveRequest.getDeclareCustomsMoney());
        deliverConsign.setClearCustomsMoney(saveRequest.getClearCustomsMoney());
        deliverConsign.setTradeMoney(saveRequest.getTradeMoney());
        deliverConsign.setDirectTransferMoney(saveRequest.getDirectTransferMoney());
        deliverConsign.setIndirectTransferMoney(saveRequest.getIndirectTransferMoney());
        deliverConsign.setShippingBatch(saveRequest.getShippingBatch());
        deliverConsign.setPayMethod(saveRequest.getPayMethod());
        deliverConsign.setMoreBatchExplain(saveRequest.getMoreBatchExplain());
        deliverConsign.setGoodsDepositPlace(saveRequest.getGoodsDepositPlace());
        deliverConsign.setHasInsurance(saveRequest.getHasInsurance());
        deliverConsign.setBookingOfficerId(saveRequest.getBookingOfficerId());
        deliverConsign.setOperationSpecialistId(saveRequest.getOperationSpecialistId());
        deliverConsign.setRemarks(saveRequest.getRemarks());
        deliverConsign.setDeliverYn((short) 1);
        deliverConsign.setInvoiceRise(saveRequest.getInvoiceRise());
        deliverConsign.setIsDangerous(saveRequest.getIsDangerous());

        return deliverConsign;
    }

    public static DeliverConsignDetailResponse deliverConsignDetailResponse(DeliverConsign deliverConsign) {
        if (deliverConsign == null) {
            return null;
        }
        DeliverConsignDetailResponse deliverConsignDetailResponse = new DeliverConsignDetailResponse();
        deliverConsignDetailResponse.setId(deliverConsign.getId());
        deliverConsignDetailResponse.setOrderId(deliverConsign.getOrderId());
        CompanyEnum execCoNameEnum = CompanyEnum.fromCode(deliverConsign.getExecCoName());
        if (execCoNameEnum != null) {
            deliverConsignDetailResponse.setExecCoName(execCoNameEnum.getName());
        }
        CompanyEnum coIdEnum = CompanyEnum.fromCode(deliverConsign.getCoId());
        if (coIdEnum != null) {
            deliverConsignDetailResponse.setCoId(coIdEnum.getName());
        }
        deliverConsignDetailResponse.setCurrencyBn(deliverConsign.getCurrencyBn());
        deliverConsignDetailResponse.setWriteDate(deliverConsign.getWriteDate());
        deliverConsignDetailResponse.setContractNo(deliverConsign.getContractNo());
        deliverConsignDetailResponse.setInvoiceRise(deliverConsign.getInvoiceRise());
        deliverConsignDetailResponse.setBusinessNature(deliverConsign.getBusinessNature());
        BusinessNatureTypeEnum businessNatureTypeEnum = BusinessNatureTypeEnum.valueOf(deliverConsign.getBusinessNature());
        if (businessNatureTypeEnum != null) {
            deliverConsignDetailResponse.setBusinessNatureName(businessNatureTypeEnum.getName());
        }
        deliverConsignDetailResponse.setBusinessSketch(deliverConsign.getBusinessSketch());
        deliverConsignDetailResponse.setAdvanceMoney(deliverConsign.getAdvanceMoney());
        deliverConsignDetailResponse.setBookingDate(deliverConsign.getBookingDate());
        deliverConsignDetailResponse.setThisShipmentsMoney(deliverConsign.getThisShipmentsMoney());
        deliverConsignDetailResponse.setDeclareCustomsMoney(deliverConsign.getDeclareCustomsMoney());
        deliverConsignDetailResponse.setClearCustomsMoney(deliverConsign.getClearCustomsMoney());
        deliverConsignDetailResponse.setTradeMoney(deliverConsign.getTradeMoney());
        deliverConsignDetailResponse.setDirectTransferMoney(deliverConsign.getDirectTransferMoney());
        deliverConsignDetailResponse.setIndirectTransferMoney(deliverConsign.getIndirectTransferMoney());
        deliverConsignDetailResponse.setShippingBatch(deliverConsign.getShippingBatch());
        deliverConsignDetailResponse.setPayMethod(deliverConsign.getPayMethod());
        deliverConsignDetailResponse.setMoreBatchExplain(deliverConsign.getMoreBatchExplain());
        deliverConsignDetailResponse.setIsDangerous(deliverConsign.getIsDangerous());
        deliverConsignDetailResponse.setGoodsDepositPlace(deliverConsign.getGoodsDepositPlace());
        deliverConsignDetailResponse.setHasInsurance(deliverConsign.getHasInsurance());

        deliverConsignDetailResponse.setBookingOfficerId(deliverConsign.getBookingOfficerId());
        deliverConsignDetailResponse.setOperationSpecialistId(deliverConsign.getOperationSpecialistId());
        deliverConsignDetailResponse.setRemarks(deliverConsign.getRemarks());

        return deliverConsignDetailResponse;
    }

    public static DeliverConsignListResponse deliverConsignListResponse(DeliverConsign deliverConsign) {
        if (deliverConsign == null) {
            return null;
        }
        DeliverConsignListResponse deliverConsignListResponse = new DeliverConsignListResponse();
        deliverConsignListResponse.setId(deliverConsign.getId());
        deliverConsignListResponse.setDeliverConsignNo(deliverConsign.getDeliverConsignNo());
        deliverConsignListResponse.setContractNo(deliverConsign.getContractNo());
        deliverConsignListResponse.setCrmCode(deliverConsign.getCrmCode());
        deliverConsignListResponse.setThisShipmentsMoney(deliverConsign.getThisShipmentsMoney());
        deliverConsignListResponse.setCurrencyBn(deliverConsign.getCurrencyBn());
        CompanyEnum execCoNameEnum = CompanyEnum.fromCode(deliverConsign.getExecCoName());
        if (execCoNameEnum != null) {
            deliverConsignListResponse.setExecCoName(execCoNameEnum.getName());
        }
        CompanyEnum coIdEnum = CompanyEnum.fromCode(deliverConsign.getCoId());
        if (coIdEnum != null) {
            deliverConsignListResponse.setCoId(coIdEnum.getName());
        }
        deliverConsignListResponse.setDeliverConsignStatus(deliverConsign.getDeliverConsignStatus());
        DeliverConsignStatusEnum statusEnum = DeliverConsignStatusEnum.valueOf(deliverConsign.getDeliverConsignStatus());
        if (statusEnum != null) {
            deliverConsignListResponse.setDeliverConsignStatusName(statusEnum.getName());
        }
        deliverConsignListResponse.setDeliverNoticeStatus(deliverConsign.getDeliverNoticeStatus());


        return deliverConsignListResponse;
    }
}

