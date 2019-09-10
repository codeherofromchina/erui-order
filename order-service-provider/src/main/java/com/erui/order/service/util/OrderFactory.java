package com.erui.order.service.util;

import com.erui.order.common.enums.*;
import com.erui.order.common.pojo.request.OrderSaveRequest;
import com.erui.order.common.pojo.response.OrderDetailResponse;
import com.erui.order.common.pojo.response.OrderListResponse;
import com.erui.order.model.entity.Order;

/**
 * @Auther 王晓丹
 * @Date 2019/7/29 下午5:56
 */
public class OrderFactory {

    /**
     * 生成返回订单详情对象
     *
     * @param order
     * @return
     */
    public static OrderDetailResponse orderDetailResponse(Order order) {
        if (order == null) {
            return null;
        }
        OrderDetailResponse detailResponse = new OrderDetailResponse();
        detailResponse.setId(order.getId());
        detailResponse.setOrderCategory(order.getOrderCategory());
        detailResponse.setOverseasSales(order.getOverseasSales());
        detailResponse.setFrameworkNo(order.getFrameworkNo());
        detailResponse.setPoNo(order.getPoNo());
        detailResponse.setInquiryId(order.getInquiryId());
        detailResponse.setInquiryNo(order.getInquiryNo());
        detailResponse.setContractNo(order.getContractNo());
        detailResponse.setContractNoOs(order.getContractNoOs());
        detailResponse.setSigningDate(order.getSigningDate());
        detailResponse.setDeliveryDate(order.getDeliveryDate());
        detailResponse.setAgentId(order.getAgentId());
        detailResponse.setAcquireId(order.getAcquireId());
        detailResponse.setSigningCo(order.getSigningCo());
        detailResponse.setBusinessUnitId(order.getBusinessUnitId());
        CompanyEnum companyEnum = CompanyEnum.fromCode(order.getExecCoCode());
        if (companyEnum != null) {
            detailResponse.setExecCoCode(companyEnum.getCode());
            detailResponse.setExecCoName(companyEnum.getName());
        }
        detailResponse.setRegion(order.getRegion());
        detailResponse.setCountry(order.getCountry());
        detailResponse.setCrmCode(order.getCrmCode());
        detailResponse.setCustomerType(order.getCustomerType());
        detailResponse.setPerLiableRepayId(order.getPerLiableRepayId());
        detailResponse.setTechnicalId(order.getTechnicalId());
        detailResponse.setFinancing(order.getFinancing());
        detailResponse.setGrantType(order.getGrantType());
        detailResponse.setTradeTerms(order.getTradeTerms());
        detailResponse.setTransportType(order.getTransportType());
        detailResponse.setFromCountry(order.getFromCountry());
        detailResponse.setFromPort(order.getFromPort());
        detailResponse.setFromPlace(order.getFromPlace());
        detailResponse.setToCountry(order.getToCountry());
        detailResponse.setToPort(order.getToPort());
        detailResponse.setToPlace(order.getToPlace());
        detailResponse.setTotalPriceUsd(order.getTotalPriceUsd());
        detailResponse.setTotalPrice(order.getTotalPrice());
        detailResponse.setCurrencyBn(order.getCurrencyBn());
        detailResponse.setExchangeRate(order.getExchangeRate());
        detailResponse.setTaxBearing(order.getTaxBearing());
        detailResponse.setQualityFunds(order.getQualityFunds());
        detailResponse.setPaymentModeBn(order.getPaymentModeBn());
        detailResponse.setDeliveryRequires(order.getDeliveryRequires());
        detailResponse.setCustomerContext(order.getCustomerContext());
        detailResponse.setProcessId(order.getProcessId());

        return detailResponse;
    }

    public static OrderListResponse orderListResponse(Order order) {
        if (order == null) {
            return null;
        }
        OrderListResponse orderListResponse = new OrderListResponse();
        orderListResponse.setId(order.getId());
        orderListResponse.setContractNo(order.getContractNo());
        orderListResponse.setProjectNo(order.getProjectNo());
        orderListResponse.setContractNoOs(order.getContractNoOs());
        orderListResponse.setTechnicalId(order.getTechnicalId());

        orderListResponse.setBusinessUnitId(order.getBusinessUnitId());

        orderListResponse.setDeliveryDate(order.getDeliveryDate());
        orderListResponse.setBuyerId(order.getBuyerId());
        orderListResponse.setCrmCode(order.getCrmCode());
        orderListResponse.setTotalPriceUsd(order.getTotalPriceUsd());
        orderListResponse.setPayStatus(order.getPayStatus());
        OrderPayStatusEnum orderPayStatusEnum = OrderPayStatusEnum.valueOf(order.getPayStatus());
        if (orderPayStatusEnum != null) {
            orderListResponse.setPayStatusName(orderPayStatusEnum.getName());
        }
        orderListResponse.setOrderStatus(order.getOrderStatus());
        OrderStatusEnum orderStatusEnum = OrderStatusEnum.valueOf(order.getOrderStatus());
        if (orderStatusEnum != null) {
            orderListResponse.setOrderStatusName(orderStatusEnum.getName());
        }
        orderListResponse.setProcessProgress(order.getProcessProgress());
        ProcessProgressEnum processProgressEnum = ProcessProgressEnum.fromCode(order.getProcessProgress());
        if (processProgressEnum != null) {
            orderListResponse.setProcessProgressName(processProgressEnum.getName());
        }
        orderListResponse.setAuditingProcess(order.getAuditingProcess());
        orderListResponse.setAuditingStatus(order.getAuditingStatus());
        AuditingStatusEnum auditingStatusEnum = AuditingStatusEnum.valueOf(order.getAuditingStatus());
        if (auditingStatusEnum != null) {
            orderListResponse.setAuditingStatusName(auditingStatusEnum.getName());
        }

        return orderListResponse;
    }

    public static Order order(OrderSaveRequest orderSaveRequest) {
        if (orderSaveRequest == null) {
            return null;
        }

        Order order = new Order();
        order.setId(orderSaveRequest.getId());
        order.setOrderCategory(orderSaveRequest.getOrderCategory());
        order.setOverseasSales(orderSaveRequest.getOverseasSales());
        order.setFrameworkNo(orderSaveRequest.getFrameworkNo());
        order.setPoNo(orderSaveRequest.getPoNo());
        order.setInquiryId(orderSaveRequest.getInquiryId());
        order.setInquiryNo(orderSaveRequest.getInquiryNo());
        order.setContractNoOs(orderSaveRequest.getContractNoOs());
        order.setSigningDate(orderSaveRequest.getSigningDate());
        order.setDeliveryDate(orderSaveRequest.getDeliveryDate());
        order.setAgentId(orderSaveRequest.getAgentId());
        order.setAcquireId(orderSaveRequest.getAcquireId());
        order.setSigningCo(orderSaveRequest.getSigningCo());
        order.setBusinessUnitId(orderSaveRequest.getBusinessUnitId());
        order.setExecCoCode(orderSaveRequest.getExecCoCode());
        order.setRegion(orderSaveRequest.getRegion());
        order.setCountry(orderSaveRequest.getCountry());
        order.setCrmCode(orderSaveRequest.getCrmCode());
        order.setCustomerType(orderSaveRequest.getCustomerType());
        order.setPerLiableRepayId(orderSaveRequest.getPerLiableRepayId());
        order.setTechnicalId(orderSaveRequest.getTechnicalId());
        order.setFinancing(orderSaveRequest.getFinancing());
        order.setGrantType(orderSaveRequest.getGrantType());
        order.setTradeTerms(orderSaveRequest.getTradeTerms());
        order.setTransportType(orderSaveRequest.getTransportType());
        order.setFromCountry(orderSaveRequest.getFromCountry());
        order.setFromPort(orderSaveRequest.getFromPort());
        order.setFromPlace(orderSaveRequest.getFromPlace());
        order.setToCountry(orderSaveRequest.getToCountry());
        order.setToPort(orderSaveRequest.getToPort());
        order.setToPlace(orderSaveRequest.getToPlace());
        order.setTotalPrice(orderSaveRequest.getTotalPrice());
        order.setCurrencyBn(orderSaveRequest.getCurrencyBn());
        order.setExchangeRate(orderSaveRequest.getExchangeRate());
        order.setTaxBearing(orderSaveRequest.getTaxBearing());
        order.setQualityFunds(orderSaveRequest.getQualityFunds());
        order.setPaymentModeBn(orderSaveRequest.getPaymentModeBn());
        order.setDeliveryRequires(orderSaveRequest.getDeliveryRequires());
        order.setCustomerContext(orderSaveRequest.getCustomerContext());
        order.setOrderStatus(orderSaveRequest.getOrderStatus());

        return order;
    }
}
