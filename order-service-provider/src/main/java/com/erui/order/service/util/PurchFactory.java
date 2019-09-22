package com.erui.order.service.util;

import com.erui.order.common.enums.OrderPayStatusEnum;
import com.erui.order.common.enums.PurchPayStatusEnum;
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

    public static Purch purch(PurchSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        Purch Purch = new Purch();
        Purch.setId(saveRequest.getId());
        Purch.setPurchContractId(saveRequest.getPurchContractId());
        Purch.setPurchNo(saveRequest.getPurchNo());
        Purch.setArrivalDate(saveRequest.getArrivalDate());
        Purch.setContractTag(saveRequest.getContractTag());
        Purch.setPurChgDate(saveRequest.getPurChgDate());
        Purch.setGoalCost(saveRequest.getGoalCost());
        Purch.setSaveAmount(saveRequest.getSaveAmount());
        Purch.setSaveMode(saveRequest.getPriceMode());
        Purch.setPriceMode(saveRequest.getPriceMode());
        Purch.setAgentId(saveRequest.getAgentId());
        Purch.setDepartment(saveRequest.getDepartment());
        Purch.setTotalPrice(saveRequest.getTotalPrice());
        Purch.setTaxBearing(saveRequest.getTaxBearing());
        Purch.setExchangeRate(saveRequest.getExchangeRate());
        Purch.setProfitPercent(saveRequest.getProfitPercent());
        Purch.setRemarks(saveRequest.getRemarks());
        Purch.setPurchStatus(saveRequest.getPurchStatus());

        return Purch;
    }

    public static PurchDetailResponse purchDetailResponse(Purch purch) {
        if (purch == null) {
            return null;
        }

        PurchDetailResponse purchDetailResponse = new PurchDetailResponse();
        purchDetailResponse.setId(purch.getId());
        purchDetailResponse.setPurchContractId(purch.getPurchContractId());
        purchDetailResponse.setPurchNo(purch.getPurchNo());
        purchDetailResponse.setArrivalDate(purch.getArrivalDate());
        purchDetailResponse.setSigningDate(purch.getSigningDate());
        purchDetailResponse.setSupplierId(purch.getSupplierId());
        purchDetailResponse.setContractTag(purch.getContractTag());
        purchDetailResponse.setPurChgDate(purch.getPurChgDate());
        purchDetailResponse.setGoalCost(purch.getGoalCost());
        purchDetailResponse.setSaveAmount(purch.getSaveAmount());
        purchDetailResponse.setSaveNode(purch.getSaveMode());
        purchDetailResponse.setPriceMode(purch.getPriceMode());
        purchDetailResponse.setAgentId(purch.getAgentId());
        purchDetailResponse.setDepartment(purch.getDepartment());
        purchDetailResponse.setTotalPrice(purch.getTotalPrice());
//        purchDetailResponse.setTotalPriceUsd(Purch.totdddddd);
        purchDetailResponse.setTaxBearing(purch.getTaxBearing());
        purchDetailResponse.setExchangeRate(purch.getExchangeRate());
        purchDetailResponse.setProfitPercent(purch.getProfitPercent());
        purchDetailResponse.setRemarks(purch.getRemarks());
        purchDetailResponse.setCurrencyBn(purch.getCurrencyBn());

        return purchDetailResponse;
    }

    public static PurchListResponse PurchListResponse(Purch purch) {
        if (purch == null) {
            return null;
        }
        PurchListResponse response = new PurchListResponse();
        response.setId(purch.getId());
        response.setPurchNo(purch.getPurchNo());
        response.setSigningDate(purch.getSigningDate());
        response.setArrivalDate(purch.getArrivalDate());
        response.setContractNo(purch.getContractNo());
        response.setProjectNo(purch.getProjectNo());
        response.setSupplierId(purch.getSupplierId());

        response.setTotalPrice(purch.getTotalPrice());
        response.setCurrencyBn(purch.getCurrencyBn());
        response.setPayStatus(purch.getPayStatus());
        response.setInspected(purch.getInspected());
        response.setPurchStatus(purch.getPurchStatus());
        response.setPayStatus(purch.getPurchStatus());
        PurchPayStatusEnum purchPayStatusEnum = PurchPayStatusEnum.valueOf(purch.getPurchStatus());
        if (purchPayStatusEnum != null) {
            response.setPayStatusName(purchPayStatusEnum.getName());
        }
        PurchStatusEnum statusEnum = PurchStatusEnum.valueOf(purch.getPurchStatus());
        if (statusEnum != null) {
            response.setPurchStatusName(statusEnum.getName());
        }
        return response;
    }
}

