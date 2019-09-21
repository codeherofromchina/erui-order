package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.OrderPayStatusEnum;
import com.erui.order.common.enums.OrderStatusEnum;
import com.erui.order.common.enums.ProcessProgressEnum;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.OrderQueryRequest;
import com.erui.order.common.pojo.request.OrderSaveRequest;
import com.erui.order.common.pojo.response.OrderDetailResponse;
import com.erui.order.common.pojo.response.OrderListResponse;
import com.erui.order.common.util.StringUtil;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.model.entity.Order;
import com.erui.order.model.entity.OrderExample;
import com.erui.order.service.*;
import com.erui.order.service.util.OrderFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.erui.order.mapper.OrderMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    private static Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderGoodsService orderGoodsService;
    @Autowired
    private OrderPaymentService orderPaymentService;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private ProjectService projectService;
    @Autowired
    private UserService userService;
    @Autowired
    private AreaService areaService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private OrgService orgService;
    @Autowired
    private PortService portService;

    @Override
    public Long insert(OrderSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        Order order = OrderFactory.order(insertRequest);
        // 生成出口通知单
        String lastContractNo = findLastContractNo();
        order.setContractNo(StringUtil.genContractNo(lastContractNo));
        order.setPayStatus(OrderPayStatusEnum.UNPAID.code); // 设置支付状态
        // 设置流程进度
        order.setProcessProgress(ProcessProgressEnum.SUBMIT.getCode());

        order.setCreateTime(new Date());
        order.setCreateUserId(userInfo.getId());
        order.setDeleteFlag(Boolean.FALSE);
        int insertNum = orderMapper.insert(order);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long orderId = order.getId();
        // 订单收款
        List<OrderPaymentInfo> orderPayments = insertRequest.getOrderPayments();
        if (orderPayments != null && orderPayments.size() > 0) {
            int orderPaymentInsertNum = orderPaymentService.insert(orderId, orderPayments);
            if (orderPayments.size() != orderPaymentInsertNum) {
                LOGGER.info("orderPaymentInsertNum : {} - {}", orderPaymentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单收款数据操作失败");
            }
        }
        // 订单商品AttachmentService
        List<OrderGoodsInfo> orderGoods = insertRequest.getOrderGoods();
        if (orderGoods != null && orderGoods.size() > 0) {
            int orderGoodsInsertNum = orderGoodsService.insert(orderId, orderGoods);
            if (orderGoods.size() != orderGoodsInsertNum) {
                LOGGER.info("orderGoodsInsertNum : {} - {}", orderGoodsInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单商品数据操作失败");
            }
        }
        // 订单附件
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.ORDER, orderId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        if (OrderStatusEnum.valueOf(order.getOrderStatus()) == OrderStatusEnum.UNEXECUTED) {
            projectService.insert(orderId);
        }

        return orderId;
    }

    @Override
    public void update(Long id, OrderSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();

        Order order = orderMapper.selectByPrimaryKey(id);
        if (order == null) {
            throw new Exception("订单唯一标识错误");
        }
        OrderStatusEnum orderStatusEnum = OrderStatusEnum.valueOf(order.getOrderStatus());
        if (orderStatusEnum != OrderStatusEnum.INIT) {
            throw new Exception("订单当前状态错误");
        }

        Long orderId = order.getId();
        // 修改基本信息
        Order orderSelective = OrderFactory.order(updateRequest);
        orderSelective.setId(orderId);
        orderSelective.setUpdateTime(new Date());
        orderSelective.setUpdateUserId(userInfo.getId());

        orderMapper.updateByPrimaryKeySelective(orderSelective);

        // 订单收款
        List<OrderPaymentInfo> orderPayments = updateRequest.getOrderPayments();
        if (orderPayments == null) {
            orderPayments = new ArrayList<>();
        }
        int orderPaymentUpdateNum = orderPaymentService.insertOnDuplicateIdUpdate(orderId, orderPayments);
        if (orderPayments.size() != orderPaymentUpdateNum) {
            LOGGER.info("orderPaymentUpdateNum : {} - {}", orderPaymentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("订单收款数据操作失败");
        }

        // 订单商品
        List<OrderGoodsInfo> orderGoods = updateRequest.getOrderGoods();
        if (orderGoods == null) {
            orderGoods = new ArrayList<>();
        }
        int orderGoodsUpdateNum = orderGoodsService.insertOnDuplicateIdUpdate(orderId, orderGoods);
        if (orderGoods.size() != orderGoodsUpdateNum) {
            LOGGER.info("orderGoodsUpdateNum : {} - {}", orderGoodsUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("订单商品数据操作失败");
        }

        // 订单附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.ORDER, orderId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("订单附件数据操作失败");
        }

        if (OrderStatusEnum.valueOf(orderSelective.getOrderStatus()) == OrderStatusEnum.UNEXECUTED) {
            projectService.insert(orderId);
        }
    }

    @Override
    public Pager<OrderListResponse> list(OrderQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        OrderExample example = new OrderExample();
        example.setOrderByClause("id desc");
        OrderExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);
        // 销售合同号
        if (StringUtils.isNotBlank(queryRequest.getContractNo())) {
            criteria.andContractNoLike("%" + queryRequest.getContractNo() + "%");
        }
        // 项目号
        if (StringUtils.isNotBlank(queryRequest.getProjectNo())) {
            criteria.andProjectNoLike("%" + queryRequest.getProjectNo() + "%");
        }
        // 易瑞海外销售合同号
        if (StringUtils.isNotBlank(queryRequest.getContractNoOs())) {
            criteria.andContractNoOsLike("%" + queryRequest.getContractNoOs() + "%");
        }
        // 合同交货日期
        if (StringUtils.isNotBlank(queryRequest.getDeliveryDate())) {
            criteria.andDeliveryDateLike("%" + queryRequest.getDeliveryDate() + "%");
        }
        // CRM客户编码
        if (StringUtils.isNotBlank(queryRequest.getCrmCode())) {
            criteria.andCrmCodeLike("%" + queryRequest.getCrmCode() + "%");
        }
        // 收款状态 1:未付款 2:部分付款 3:收款完成
        if (queryRequest.getPayStatus() != null) {
            criteria.andPayStatusEqualTo(queryRequest.getPayStatus());
        }
        // 订单状态 1:待确认 2:未执行 3:执行中 4：完成
        if (queryRequest.getOrderStatus() != null) {
            criteria.andOrderStatusEqualTo(queryRequest.getOrderStatus());
        }
        // 流程进度
        if (StringUtils.isNotBlank(queryRequest.getProcessProgress())) {
            criteria.andProcessProgressEqualTo(queryRequest.getProcessProgress());
        }
        // 事业部项目负责人
        if (queryRequest.getTechnicalId() != null) {
            criteria.andTechnicalIdEqualTo(queryRequest.getTechnicalId());
        }
        // 执行事业部
        if (queryRequest.getBusinessUnitId() != null) {
            criteria.andBusinessUnitIdEqualTo(queryRequest.getBusinessUnitId());
        }
        List<Order> orders = orderMapper.selectByExample(example);

        List<OrderListResponse> orderListResponses = new ArrayList<>();
        for (Order order : orders) {
            OrderListResponse orderListResponse = OrderFactory.orderListResponse(order);
            try {
                UserInfo technicalUser = userService.findById(orderListResponse.getTechnicalId());
                if (technicalUser != null) {
                    orderListResponse.setTechnicalName(technicalUser.getUserName());
                }
                orderListResponse.setBusinessUnitName(orgService.findOrgNameById(order.getBusinessUnitId()));

            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("设置订单列表异常 - {} - {}", orderListResponse.getId(), e);
            }
            orderListResponses.add(orderListResponse);
        }

        // 输出
        Page<Order> page = (Page) orders;
        Pager<OrderListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), orderListResponses);
        return pager;
    }

    @Override
    public OrderDetailResponse detail(Long id) throws Exception {
        // 准备数据
        Order order = orderMapper.selectByPrimaryKey(id);
        if (order == null) {
            throw new Exception("订单不存在");
        }
        // 商品
        List<OrderGoodsInfo> orderGoodsInfos = orderGoodsService.list(id);
        // 收款信息
        List<OrderPaymentInfo> orderPaymentInfos = orderPaymentService.list(id);
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.ORDER, id);

        // 组织数据
        OrderDetailResponse detail = OrderFactory.orderDetailResponse(order);
        detail.setAgentUserName(userService.findNameById(detail.getAgentId()));
        detail.setAcquireUserName(userService.findNameById(detail.getAcquireId()));
        detail.setBusinessUnitName(orgService.findOrgNameById(detail.getBusinessUnitId()));
        detail.setPerLiableRepayUserName(userService.findNameById(detail.getPerLiableRepayId()));
        detail.setTechnicalUserName(userService.findNameById(detail.getTechnicalId()));
        detail.setFromCountryName(countryService.findCountryNameByBn(detail.getFromCountry()));
        detail.setFromPortName(portService.findPortNameByBn(detail.getFromPort()));
        detail.setToCountryName(countryService.findCountryNameByBn(detail.getToCountry()));
        detail.setToPortName(portService.findPortNameByBn(detail.getToPort()));
        detail.setRegionName(areaService.findAreaNameByBn(detail.getRegion()));
        detail.setCountryName(countryService.findCountryNameByBn(detail.getCountry()));

        detail.setOrderGoods(orderGoodsInfos);
        detail.setOrderPayments(orderPaymentInfos);
        detail.setAttachments(attachmentInfos);

        return detail;
    }

    @Override
    public void accountDone(Long id, OrderPayStatusEnum orderPayStatusEnum) throws Exception {
        Order order = orderMapper.selectByPrimaryKey(id);
        if (order == null) {
            throw new Exception("订单不存在");
        }
        Order orderSelective = new Order();
        orderSelective.setId(id);
        orderSelective.setPayStatus(orderPayStatusEnum.getCode());
        orderMapper.updateByPrimaryKeySelective(orderSelective);
    }

    private String findLastContractNo() {
        PageHelper.startPage(1, 1);
        OrderExample example = new OrderExample();
        example.setOrderByClause("contract_no desc");
        OrderExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);
        List<Order> orders = orderMapper.selectByExample(example);
        if (orders != null && orders.size() > 0) {
            return orders.get(0).getContractNo();
        }
        return null;
    }

}
