package com.erui.order.service.util;

import com.erui.order.common.pojo.request.PurchContractSaveRequest;
import com.erui.order.common.pojo.response.PurchContractDetailResponse;
import com.erui.order.common.pojo.response.PurchContractListResponse;
import com.erui.order.model.entity.PurchContract;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 下午9:42
 */
public class PurchContractFactory {
    public static PurchContractListResponse purchContractListResponse(PurchContract purchContract) {
        if (purchContract == null) {
            return null;
        }
        PurchContractListResponse response = new PurchContractListResponse();
        response.setId(purchContract.getId());
        response.setPurchContractNo(purchContract.getPurchContractNo());
        response.setSigningDate(purchContract.getSigningDate());
        response.setAgentId(purchContract.getAgentId());
        response.setSupplierId(purchContract.getSupplierId());
        response.setSupplierName(purchContract.getSupplierName());
        response.setLowercasePrice(purchContract.getLowercasePrice());
        response.setCurrencyBn(purchContract.getCurrencyBn());
        response.setContractStatus(purchContract.getPurchContractStatus());
        response.setContractType(purchContract.getContractType());

        return response;
    }

    public static PurchContract purchContract(PurchContractSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        PurchContract purchContract = new PurchContract();
        purchContract.setId(saveRequest.getId());

        purchContract.setSigningDate(saveRequest.getSigningDate());
        purchContract.setSigningPlace(saveRequest.getSigningPlace());
        purchContract.setAgentId(saveRequest.getAgentId());
        purchContract.setSupplierId(saveRequest.getSupplierId());
        purchContract.setSupplierName(saveRequest.getSupplierName());
        purchContract.setLowercasePrice(saveRequest.getLowercasePrice());
        purchContract.setCurrencyBn(saveRequest.getCurrencyBn());
        purchContract.setPurchContractStatus(saveRequest.getContractStatus());
        purchContract.setContractType(saveRequest.getContractType());
        purchContract.setTaxPoint(saveRequest.getTaxPoint());
        purchContract.setCapitalizedPrice(saveRequest.getCapitalizedPrice());
        purchContract.setLowercasePrice(saveRequest.getLowercasePrice());
        purchContract.setCurrencyBn(saveRequest.getCurrencyBn());
        purchContract.setGoodsRemarks(saveRequest.getGoodsRemarks());

        return purchContract;
    }

    public static PurchContractDetailResponse purchContractDetailResponse(PurchContract purchContract) {
        if (purchContract == null) {
            return null;
        }
        PurchContractDetailResponse purchContractDetailResponse = new PurchContractDetailResponse();
        purchContractDetailResponse.setId(purchContract.getId());
        purchContractDetailResponse.setSigningDate(purchContract.getSigningDate());
        purchContractDetailResponse.setSigningPlace(purchContract.getSigningPlace());
        purchContractDetailResponse.setAgentId(purchContract.getAgentId());
        purchContractDetailResponse.setSupplierId(purchContract.getSupplierId());
        purchContractDetailResponse.setSupplierName(purchContract.getSupplierName());
        purchContractDetailResponse.setLowercasePrice(purchContract.getLowercasePrice());
        purchContractDetailResponse.setCurrencyBn(purchContract.getCurrencyBn());
        purchContractDetailResponse.setContractStatus(purchContract.getPurchContractStatus());
        purchContractDetailResponse.setContractType(purchContract.getContractType());
        purchContractDetailResponse.setTaxPoint(purchContract.getTaxPoint());
        purchContractDetailResponse.setCapitalizedPrice(purchContract.getCapitalizedPrice());
        purchContractDetailResponse.setLowercasePrice(purchContract.getLowercasePrice());
        purchContractDetailResponse.setCurrencyBn(purchContract.getCurrencyBn());
        purchContractDetailResponse.setGoodsRemarks(purchContract.getGoodsRemarks());

        return purchContractDetailResponse;
    }
}
