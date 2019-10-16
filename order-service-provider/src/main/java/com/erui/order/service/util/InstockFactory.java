package com.erui.order.service.util;

import com.erui.order.common.enums.InstockStatusEnum;
import com.erui.order.common.pojo.request.InstockSaveRequest;
import com.erui.order.common.pojo.response.InstockDetailResponse;
import com.erui.order.common.pojo.response.InstockListResponse;
import com.erui.order.model.entity.Instock;

/**
 * @Auther 王晓丹
 * @Date 2019/9/8 上午7:33
 */
public class InstockFactory {

    public static Instock Instock(InstockSaveRequest saveRequest) {
        if (saveRequest == null) {
            return null;
        }
        Instock Instock = new Instock();
        Instock.setId(saveRequest.getId());
        Instock.setInstockStatus(saveRequest.getInstockStatus());

        return Instock;
    }

    public static InstockDetailResponse instockDetailResponse(Instock instock) {
        if (instock == null) {
            return null;
        }
        InstockDetailResponse instockDetailResponse = new InstockDetailResponse();
        instockDetailResponse.setId(instock.getId());
        instockDetailResponse.setPurchNo(instock.getPurchNo());
//        instockDetailResponse.setuName(Instock.getSupplierName());
        instockDetailResponse.setuName("王晓丹");
        instockDetailResponse.setInstockDate(instock.getInstockDate());
        instockDetailResponse.setInstockStatus(instock.getInstockStatus());
        instockDetailResponse.setRemarks(instock.getRemarks());

        return instockDetailResponse;
    }

    public static InstockListResponse instockListResponse(Instock instock) {
        if (instock == null) {
            return null;
        }
        InstockListResponse instockListResponse = new InstockListResponse();
        instockListResponse.setId(instock.getId());
        instockListResponse.setInspectApplyNo(instock.getInspectApplyNo());
        instockListResponse.setContractNo(instock.getContractNo());
        instockListResponse.setProjectNo(instock.getProjectNo());
        instockListResponse.setPurchNo(instock.getPurchNo());
        instockListResponse.setSupplierName(instock.getSupplierName());
        instockListResponse.setEnterEruiWarehouse(instock.getEnterEruiWarehouse());
        instockListResponse.setInstockDate(instock.getInstockDate());
        instockListResponse.setInstockStatus(instock.getInstockStatus());
        InstockStatusEnum statusEnum = InstockStatusEnum.valueOf(instock.getInstockStatus());
        if (statusEnum != null) {
            instockListResponse.setInstockStatusName(statusEnum.getName());
        }

        return instockListResponse;
    }
}

