package com.erui.order.service.util;

import com.erui.order.common.enums.PurchPayApplicationStatusEnum;
import com.erui.order.common.pojo.request.PurchPayApplicationSaveRequest;
import com.erui.order.common.pojo.response.PurchPayApplicationDetailResponse;
import com.erui.order.common.pojo.response.PurchPayApplicationListResponse;
import com.erui.order.model.entity.PurchPayApplication;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class PurchPayApplicationFactory {

    public static PurchPayApplication purchPayApplication(PurchPayApplicationSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        PurchPayApplication purchPayApplication = new PurchPayApplication();

        purchPayApplication.setId(saveRequest.getId());
        purchPayApplication.setPayNo(saveRequest.getPayNo());
        purchPayApplication.setPurchId(saveRequest.getPurchId());
        purchPayApplication.setPurchContractNo(saveRequest.getPurchContractNo());
        purchPayApplication.setPayStatus(saveRequest.getPayStatus());
        purchPayApplication.setApplicantId(saveRequest.getApplicantId());
        purchPayApplication.setApplicantDeptId(saveRequest.getApplicantDeptId());
        purchPayApplication.setApplicantDeptName(saveRequest.getApplicantDeptName());
        purchPayApplication.setApplicantDate(saveRequest.getApplicantDate());
        purchPayApplication.setSupplierId(saveRequest.getSupplierId());
        purchPayApplication.setSupplierName(saveRequest.getSupplierName());
        purchPayApplication.setOpeningBank(saveRequest.getOpeningBank());
        purchPayApplication.setAccountNum(saveRequest.getAccountNum());
        purchPayApplication.setProjectComment(saveRequest.getProjectComment());
        purchPayApplication.setCurrencyBn(saveRequest.getCurrencyBn());
        purchPayApplication.setExchangeRate(saveRequest.getExchangeRate());
        purchPayApplication.setContractAmount(saveRequest.getContractAmount());
        purchPayApplication.setApplicantAmount(saveRequest.getApplicantAmount());
        purchPayApplication.setHandlingFee(saveRequest.getHandlingFee());
        purchPayApplication.setPayerId(saveRequest.getPayerId());
        purchPayApplication.setPayerName(saveRequest.getPayerName());
        purchPayApplication.setPayDate(saveRequest.getPayDate());
        purchPayApplication.setPayMode(saveRequest.getPayMode());
        purchPayApplication.setRemark(saveRequest.getRemark());

        return purchPayApplication;
    }

    public static PurchPayApplicationDetailResponse purchPayApplicationDetailResponse(PurchPayApplication purchPayApplication) {
        if (purchPayApplication == null) {
            return null;
        }

        PurchPayApplicationDetailResponse purchPayApplicationDetailResponse = new PurchPayApplicationDetailResponse();
        purchPayApplicationDetailResponse.setId(purchPayApplication.getId());
        purchPayApplicationDetailResponse.setPayNo(purchPayApplication.getPayNo());
        purchPayApplicationDetailResponse.setPurchId(purchPayApplication.getPurchId());
        purchPayApplicationDetailResponse.setPurchContractNo(purchPayApplication.getPurchContractNo());
        purchPayApplicationDetailResponse.setPayStatus(purchPayApplication.getPayStatus());
        purchPayApplicationDetailResponse.setApplicantId(purchPayApplication.getApplicantId());
        purchPayApplicationDetailResponse.setApplicantDeptId(purchPayApplication.getApplicantDeptId());
        purchPayApplicationDetailResponse.setApplicantDeptName(purchPayApplication.getApplicantDeptName());
        purchPayApplicationDetailResponse.setApplicantDate(purchPayApplication.getApplicantDate());
        purchPayApplicationDetailResponse.setSupplierId(purchPayApplication.getSupplierId());
        purchPayApplicationDetailResponse.setSupplierName(purchPayApplication.getSupplierName());
        purchPayApplicationDetailResponse.setOpeningBank(purchPayApplication.getOpeningBank());
        purchPayApplicationDetailResponse.setAccountNum(purchPayApplication.getAccountNum());
        purchPayApplicationDetailResponse.setProjectComment(purchPayApplication.getProjectComment());
        purchPayApplicationDetailResponse.setCurrencyBn(purchPayApplication.getCurrencyBn());
        purchPayApplicationDetailResponse.setExchangeRate(purchPayApplication.getExchangeRate());
        purchPayApplicationDetailResponse.setContractAmount(purchPayApplication.getContractAmount());
        purchPayApplicationDetailResponse.setApplicantAmount(purchPayApplication.getApplicantAmount());
        purchPayApplicationDetailResponse.setHandlingFee(purchPayApplication.getHandlingFee());
        purchPayApplicationDetailResponse.setPayerId(purchPayApplication.getPayerId());
        purchPayApplicationDetailResponse.setPayerName(purchPayApplication.getPayerName());
        purchPayApplicationDetailResponse.setPayDate(purchPayApplication.getPayDate());
        purchPayApplicationDetailResponse.setPayMode(purchPayApplication.getPayMode());
        purchPayApplicationDetailResponse.setRemark(purchPayApplication.getRemark());

        return purchPayApplicationDetailResponse;
    }

    public static PurchPayApplicationListResponse purchPayApplicationListResponse(PurchPayApplication purchPayApplication) {
        if (purchPayApplication == null) {
            return null;
        }
        PurchPayApplicationListResponse purchPayApplicationListResponse = new PurchPayApplicationListResponse();
        purchPayApplicationListResponse.setId(purchPayApplication.getId());
        purchPayApplicationListResponse.setPayNo(purchPayApplication.getPayNo());
        purchPayApplicationListResponse.setPurchContractNo(purchPayApplication.getPurchContractNo());
        purchPayApplicationListResponse.setSupplierId(purchPayApplication.getSupplierId());
        purchPayApplicationListResponse.setSupplierName(purchPayApplication.getSupplierName());
        purchPayApplicationListResponse.setContractAmount(purchPayApplication.getContractAmount());
        purchPayApplicationListResponse.setApplicantAmount(purchPayApplication.getApplicantAmount());
        purchPayApplicationListResponse.setPayStatus(purchPayApplication.getPayStatus());
        purchPayApplicationListResponse.setCurrencyBn(purchPayApplication.getCurrencyBn());
        PurchPayApplicationStatusEnum statusEnum = PurchPayApplicationStatusEnum.valueOf(purchPayApplication.getPayStatus());
        if (statusEnum != null) {
            purchPayApplicationListResponse.setPayStatusName(statusEnum.getName());
        }
        return purchPayApplicationListResponse;
    }
}

