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

    public static DeliverConsign deliverConsign(DeliverConsignSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        DeliverConsign deliverConsign = new DeliverConsign();
        deliverConsign.setId(saveRequest.getId());
        deliverConsign.setOrderId(saveRequest.getOrderId());
        deliverConsign.setDeliverConsignStatus(saveRequest.getDeliverConsignStatus());
        deliverConsign.setExecCoName(saveRequest.getExecCoName());
        deliverConsign.setCoId(saveRequest.getCoId());
        deliverConsign.setWriteDate(saveRequest.getWriteDate());
        deliverConsign.setContractNo(saveRequest.getContractNo());
//        deliverConsign.setInvoicerise(saveRequest.getInvoiceRise());
        deliverConsign.setBusinessNature(saveRequest.getBusinessNature());
//        deliverConsignDetailResponse.setBusinessNatureName(deliverConsign.ge());
//        deliverConsignDetailResponse.setExchangeRate(deliverConsign.gete());
        deliverConsign.setBusinessSketch(saveRequest.getBusinessSketch());
//        deliverConsignDetailResponse.setTotalPriceUsd(deliverConsign.gett());
        deliverConsign.setAdvanceMoney(saveRequest.getAdvanceMoney());
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
//        deliverConsignDetailResponse.setPerLiableRepayUsername(deliverConsign.getp());
//        deliverConsign.setIsdangerous(saveRequest.getIsDangerous());
        deliverConsign.setGoodsDepositPlace(saveRequest.getGoodsDepositPlace());
//        deliverConsignDetailResponse.setTradeTerms(deliverConsign.gettr());
//        deliverConsignDetailResponse.setTransporttype(deliverConsign.gettr());
        deliverConsign.setHasInsurance(saveRequest.getHasInsurance());
//        deliverConsignDetailResponse.setFromCountry(deliverConsign.getFromcountry());
//        deliverConsignDetailResponse.setFromPort(deliverConsign.getFromport());
//        deliverConsignDetailResponse.setToCountry(deliverConsign.getto);
//        deliverConsignDetailResponse.setToPort(deliverConsign.getToport());
//        deliverConsignDetailResponse.setAdvanceMoneyDate(deliverConsign.getad());

        deliverConsign.setBookingOfficerId(saveRequest.getBookingOfficerId());
//        deliverConsignDetailResponse.setBookingOfficerName(deliverConsign.getBookingofficerid());
        deliverConsign.setOperationSpecialistId(saveRequest.getOperationSpecialistId());
//        deliverConsignDetailResponse.setOperationSpecialistName(deliverConsign.getOperationSpecialistId());
        deliverConsign.setRemarks(saveRequest.getRemarks());

        return deliverConsign;
    }

    public static DeliverConsignDetailResponse deliverConsignDetailResponse(DeliverConsign deliverConsign) {
        if (deliverConsign == null) {
            return null;
        }
        // deliverConsignDetailResponse
        DeliverConsignDetailResponse deliverConsignDetailResponse = new DeliverConsignDetailResponse();

        deliverConsignDetailResponse.setId(deliverConsign.getId());
        deliverConsignDetailResponse.setExecCoName(deliverConsign.getExecCoName());
        deliverConsignDetailResponse.setCoId(deliverConsign.getCoId());
        deliverConsignDetailResponse.setWriteDate(deliverConsign.getWriteDate());
        deliverConsignDetailResponse.setContractNo(deliverConsign.getContractNo());
        deliverConsignDetailResponse.setInvoicerise(deliverConsign.getInvoiceRise());
        deliverConsignDetailResponse.setBusinessNature(deliverConsign.getBusinessNature());
//        deliverConsignDetailResponse.setBusinessNatureName(deliverConsign.ge());
//        deliverConsignDetailResponse.setExchangeRate(deliverConsign.gete());
        deliverConsignDetailResponse.setBusinessSketch(deliverConsign.getBusinessSketch());
//        deliverConsignDetailResponse.setTotalPriceUsd(deliverConsign.gett());
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
//        deliverConsignDetailResponse.setPerLiableRepayUsername(deliverConsign.getp());
        deliverConsignDetailResponse.setIsdangerous(deliverConsign.getIsDangerous());
        deliverConsignDetailResponse.setGoodsDepositPlace(deliverConsign.getGoodsDepositPlace());
//        deliverConsignDetailResponse.setTradeTerms(deliverConsign.gettr());
//        deliverConsignDetailResponse.setTransporttype(deliverConsign.gettr());
        deliverConsignDetailResponse.setHasInsurance(deliverConsign.getHasInsurance());
//        deliverConsignDetailResponse.setFromCountry(deliverConsign.getFromcountry());
//        deliverConsignDetailResponse.setFromPort(deliverConsign.getFromport());
//        deliverConsignDetailResponse.setToCountry(deliverConsign.getto);
//        deliverConsignDetailResponse.setToPort(deliverConsign.getToport());
//        deliverConsignDetailResponse.setAdvanceMoneyDate(deliverConsign.getad());

        deliverConsignDetailResponse.setBookingOfficerId(deliverConsign.getBookingOfficerId());
//        deliverConsignDetailResponse.setBookingOfficerName(deliverConsign.getBookingofficerid());
        deliverConsignDetailResponse.setOperationSpecialistId(deliverConsign.getOperationSpecialistId());
//        deliverConsignDetailResponse.setOperationSpecialistName(deliverConsign.getOperationSpecialistId());
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
        deliverConsignListResponse.setCoId(deliverConsign.getCoId());
        deliverConsignListResponse.setExecCoName(deliverConsign.getExecCoName());
        deliverConsignListResponse.setDeliverConsignStatus(deliverConsign.getDeliverConsignStatus());
        DeliverConsignStatusEnum statusEnum = DeliverConsignStatusEnum.valueOf(deliverConsign.getDeliverConsignStatus());
        if (statusEnum != null) {
            deliverConsignListResponse.setDeliverConsignStatusName(statusEnum.getName());
        }
        deliverConsignListResponse.setDeliverNoticeStatus(deliverConsign.getDeliverNoticeStatus());

        return deliverConsignListResponse;
    }
}

