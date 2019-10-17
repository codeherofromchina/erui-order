package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.*;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.DeliverConsignQueryRequest;
import com.erui.order.common.pojo.request.DeliverConsignSaveRequest;
import com.erui.order.common.pojo.response.DeliverConsignDetailResponse;
import com.erui.order.common.pojo.response.DeliverConsignListResponse;
import com.erui.order.common.util.StringUtil;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.DeliverConsignMapper;
import com.erui.order.mapper.OrderMapper;
import com.erui.order.model.entity.DeliverConsign;
import com.erui.order.model.entity.DeliverConsignExample;
import com.erui.order.model.entity.Order;
import com.erui.order.model.entity.OrderExample;
import com.erui.order.service.*;
import com.erui.order.service.util.DeliverConsignFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class DeliverConsignServiceImpl implements DeliverConsignService {
    private static Logger LOGGER = LoggerFactory.getLogger(DeliverConsignServiceImpl.class);
    @Autowired
    private DeliverConsignMapper deliverConsignMapper;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private DeliverConsignGoodsService deliverConsignGoodsService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UserService userService;
    @Autowired
    private DeliverConsignBookingSpaceService deliverConsignBookingSpaceService;
    @Autowired
    private DeliverConsignPaymentService deliverConsignPaymentService;
    @Autowired
    private OrderGoodsService orderGoodsService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private PortService portService;
    @Autowired
    private OrderPaymentService orderPaymentService;


    @Override
    public Long insert(DeliverConsignSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 查找出口通知单对应订单信息
        Order order = orderMapper.selectByPrimaryKey(insertRequest.getOrderId());
        if (order == null) {
            throw new Exception("对应销售订单不存在");
        }
        // 组织出口通知单数据
        DeliverConsign deliverConsign = DeliverConsignFactory.deliverConsign(insertRequest);
        // 填充自动信息
        // 事业部项目负责人Id
        deliverConsign.setBusinessLeaderId(order.getTechnicalId());
        // 客户代码
        deliverConsign.setCrmCode(order.getCrmCode());
        // 发货申请部门、报关主体
        deliverConsign.setCoId(order.getSigningCo());
        deliverConsign.setExecCoName(order.getSigningCo());
        // 销售合同号
        deliverConsign.setContractNo(order.getContractNo());
        // 预收金额
        deliverConsign.setAdvanceMoney(order.getAdvanceMoney());
        // 币种
        deliverConsign.setCurrencyBn(order.getCurrencyBn());
        // 其他
        String lastDeliverConsignNo = findLastDeliverConsignNo();
        deliverConsign.setDeliverConsignNo(StringUtil.genDeliverConsignNo(lastDeliverConsignNo));
        deliverConsign.setDeliverNoticeStatus((short) 0);
        deliverConsign.setCreateTime(new Date());
        deliverConsign.setCreateUserId(userInfo.getId());
        deliverConsign.setDeleteFlag(Boolean.FALSE);
        int insertNum = deliverConsignMapper.insert(deliverConsign);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long deliverConsignId = deliverConsign.getId();

        // 保存商品内容
        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfoList = insertRequest.getDeliverConsignGoodsInfoList();
        deliverConsignGoodsService.insertOnDuplicateIdUpdate(deliverConsignId, deliverConsignGoodsInfoList);

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.DELIVER_CONSIGN, deliverConsignId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return deliverConsignId;
    }

    @Override
    public void update(Long id, DeliverConsignSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        DeliverConsign deliverConsign = deliverConsignMapper.selectByPrimaryKey(id);
        if (deliverConsign == null) {
            throw new Exception("对象唯一标识错误");
        }
        DeliverConsignStatusEnum deliverConsignStatusEnum = DeliverConsignStatusEnum.valueOf(updateRequest.getDeliverConsignStatus());
        if (deliverConsignStatusEnum != DeliverConsignStatusEnum.SUBMITED && deliverConsignStatusEnum != DeliverConsignStatusEnum.SAVED) {
            throw new Exception("请求对象的状态错误");
        }

        DeliverConsignStatusEnum statusEnum = DeliverConsignStatusEnum.valueOf(deliverConsign.getDeliverConsignStatus());
        if (statusEnum != DeliverConsignStatusEnum.SAVED) {
            throw new Exception("订舱当前状态错误");
        }

        Long deliverConsignId = deliverConsign.getId();
        // 修改基本信息
        DeliverConsign deliverConsignSelective = DeliverConsignFactory.deliverConsign(updateRequest);
        deliverConsignSelective.setId(deliverConsignId);
        deliverConsignSelective.setUpdateTime(new Date());
        deliverConsignSelective.setUpdateUserId(userInfo.getId());

        deliverConsignMapper.updateByPrimaryKeySelective(deliverConsignSelective);

        // 商品信息
        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfoList = updateRequest.getDeliverConsignGoodsInfoList();
        deliverConsignGoodsService.insertOnDuplicateIdUpdate(deliverConsignId, deliverConsignGoodsInfoList);

        // 订舱信息
        DeliverConsignBookingSpaceInfo deliverConsignBookingSpaceInfo = updateRequest.getDeliverConsignBookingSpaceInfo();
        deliverConsignBookingSpaceService.insertOnDuplicateIdUpdate(deliverConsignId, deliverConsignBookingSpaceInfo);

        // 收款信息
        List<DeliverConsignPaymentInfo> deliverConsignPaymentInfoList = updateRequest.getDeliverConsignPaymentInfoList();
        deliverConsignPaymentService.insertOnDuplicateIdUpdate(deliverConsignId, deliverConsignPaymentInfoList);


        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.DELIVER_CONSIGN, deliverConsignId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<DeliverConsignListResponse> list(DeliverConsignQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        DeliverConsignExample example = new DeliverConsignExample();
        example.setOrderByClause("id desc");
        DeliverConsignExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        if (StringUtils.isNotBlank(queryRequest.getDeliverConsignNo())) {
            criteria.andDeliverConsignNoLike("%" + queryRequest.getDeliverConsignNo() + "%");
        }
        if (StringUtils.isNotBlank(queryRequest.getContractNo())) {
            criteria.andContractNoLike("%" + queryRequest.getContractNo() + "%");
        }
        if (StringUtils.isNotBlank(queryRequest.getCrmCode())) {
            criteria.andCrmCodeLike("%" + queryRequest.getCrmCode() + "%");
        }
        if (StringUtils.isNotBlank(queryRequest.getExecCoName())) {
            criteria.andExecCoNameLike("%" + queryRequest.getExecCoName() + "%");
        }
        if (queryRequest.getSubmitTimeStart() != null) {
            criteria.andSubmitTimeGreaterThanOrEqualTo(queryRequest.getSubmitTimeStart());
        }
        if (queryRequest.getSubmitTimeEnd() != null) {
            criteria.andSubmitTimeLessThanOrEqualTo(queryRequest.getSubmitTimeEnd());
        }

        List<DeliverConsign> deliverConsigns = deliverConsignMapper.selectByExample(example);

        List<DeliverConsignListResponse> deliverConsignListResponses = new ArrayList<>();
        for (DeliverConsign deliverConsign : deliverConsigns) {
            DeliverConsignListResponse deliverConsignListResponse = DeliverConsignFactory.deliverConsignListResponse(deliverConsign);
            deliverConsignListResponses.add(deliverConsignListResponse);
        }
        // 输出
        Page<DeliverConsign> page = (Page) deliverConsigns;
        Pager<DeliverConsignListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), deliverConsignListResponses);
        return pager;
    }

    @Override
    public DeliverConsignDetailResponse detail(Long id) throws Exception {
        // 准备数据
        DeliverConsign deliverConsign = deliverConsignMapper.selectByPrimaryKey(id);
        if (deliverConsign == null) {
            throw new Exception("对象信息不存在");
        }
        // 订单
        Order order = orderMapper.selectByPrimaryKey(deliverConsign.getOrderId());
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.DELIVER_CONSIGN, id);
        // 查询商品
        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos = deliverConsignGoodsService.listByDeliverConsignId(id);
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByDeliverConsignGoods(deliverConsignGoodsInfos);
        // 查询订舱信息
        DeliverConsignBookingSpaceInfo deliverConsignBookingSpaceInfo = deliverConsignBookingSpaceService.selectByDeliverConsignId(id);
        // 订单收款信息
        List<OrderPaymentInfo> orderPaymentInfoList = orderPaymentService.list(order.getId());


        // 组织数据
        DeliverConsignDetailResponse detail = DeliverConsignFactory.deliverConsignDetailResponse(deliverConsign);
        // 提报人
        detail.setCreateUserName(userService.findNameById(deliverConsign.getCreateUserId()));

        // 订单基础信息
        // 汇率
        detail.setExchangeRate(order.getExchangeRate());
        // 客户合同金额(USD)
        detail.setTotalPriceUsd(order.getTotalPriceUsd());
        detail.setTotalPrice(order.getTotalPrice());
        // 可用额度
        detail.setAvailableCredit(order.getAlreadyGatheringMoney().subtract(order.getShipmentsMoney()));
        // 回款责任人
        detail.setPerLiableRepayId(order.getPerLiableRepayId());
        detail.setPerLiableRepayUsername(userService.findNameById(order.getPerLiableRepayId()));
        // 贸易术语
        detail.setTradeTerms(order.getTradeTerms());
        // 运输方式
        detail.setTransportType(order.getTransportType());
        OrderTransportTypeEnum orderTransportTypeEnum = OrderTransportTypeEnum.fromCode(order.getTransportType());
        if (orderTransportTypeEnum != null) {
            detail.setTransportTypeName(orderTransportTypeEnum.getName());
        }
        // 起运国、港口
        detail.setFromCountryName(countryService.findCountryNameByBn(order.getFromCountry()));
        detail.setFromPortName(portService.findPortNameByBn(order.getFromPort()));
        // 目的国、目的港
        detail.setToCountryName(countryService.findCountryNameByBn(order.getToCountry()));
        detail.setToPortName(portService.findPortNameByBn(order.getToPort()));


        detail.setAttachments(attachmentInfos);
        detail.setGoodsInfos(goodsInfoList);
        detail.setDeliverConsignBookingSpaceInfo(deliverConsignBookingSpaceInfo);
        detail.setOrderPaymentInfos(orderPaymentInfoList);

        return detail;
    }


    @Override
    public List<DeliverConsignListResponse> listByOrderid(Long orderId) {
        DeliverConsignExample example = new DeliverConsignExample();
        example.setOrderByClause("id asc");
        DeliverConsignExample.Criteria criteria = example.createCriteria();
        criteria.andDeleteFlagEqualTo(Boolean.FALSE).andOrderIdEqualTo(orderId);

        List<DeliverConsign> deliverConsigns = deliverConsignMapper.selectByExample(example);

        return deliverConsigns.stream().map(deliverConsign -> DeliverConsignFactory.deliverConsignListResponse(deliverConsign)).collect(Collectors.toList());
    }

    @Override
    public DeliverConsignDetailResponse detailByOrderId(Long orderId) throws Exception {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 准备数据
        Order order = orderMapper.selectByPrimaryKey(orderId);
        if (order == null) {
            throw new Exception("销售订单不存在");
        }
        // 查询商品的采购数量是否都已经和预报检数量数量相同，如果相同，返回null，否则返回预显示内容
        List<OrderGoodsInfo> orderGoodsInfos = orderGoodsService.listByOrderId(orderId);
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByOrderGoods(orderGoodsInfos);
        // 组装数据
        DeliverConsignDetailResponse detailResponse = new DeliverConsignDetailResponse();
        detailResponse.setOrderId(orderId);
        // 发货申请部门、报关主体
        CompanyEnum companyEnum = CompanyEnum.fromCode(order.getSigningCo());
        if (companyEnum != null) {
            detailResponse.setCoId(companyEnum.getName());
            detailResponse.setExecCoName(companyEnum.getName());
        }
        // 提报人
        detailResponse.setCreateUserName(userInfo.getUserName());
        // 销售合同号
        detailResponse.setContractNo(order.getContractNo());
        // 汇率
        detailResponse.setExchangeRate(order.getExchangeRate());
        // 客户合同金额(USD)
        detailResponse.setTotalPriceUsd(order.getTotalPriceUsd());
        detailResponse.setTotalPrice(order.getTotalPrice());
        detailResponse.setCurrencyBn(order.getCurrencyBn());
        // 可用额度
        detailResponse.setAvailableCredit(order.getAlreadyGatheringMoney().subtract(order.getShipmentsMoney()));
        // 预收金额(USD)
        detailResponse.setAdvanceMoney(order.getAdvanceMoney());
        // 回款责任人
        detailResponse.setPerLiableRepayId(order.getPerLiableRepayId());
        detailResponse.setPerLiableRepayUsername(userService.findNameById(order.getPerLiableRepayId()));
        // 贸易术语
        detailResponse.setTradeTerms(order.getTradeTerms());
        // 运输方式
        detailResponse.setTransportType(order.getTransportType());
        OrderTransportTypeEnum orderTransportTypeEnum = OrderTransportTypeEnum.fromCode(order.getTransportType());
        if (orderTransportTypeEnum != null) {
            detailResponse.setTransportTypeName(orderTransportTypeEnum.getName());
        }
        // 起运国、港口
        detailResponse.setFromCountryName(countryService.findCountryNameByBn(order.getFromCountry()));
        detailResponse.setFromPortName(portService.findPortNameByBn(order.getFromPort()));
        // 目的国、目的港
        detailResponse.setToCountryName(countryService.findCountryNameByBn(order.getToCountry()));
        detailResponse.setToPortName(portService.findPortNameByBn(order.getToPort()));
        // 商品
        detailResponse.setGoodsInfos(goodsInfoList);
        // 订单收款信息
        detailResponse.setOrderPaymentInfos(orderPaymentService.list(orderId));

        return detailResponse;
    }


    @Override
    public void deliverConsignUpload(Long id, List<AttachmentInfo> attachments) throws Exception {
        DeliverConsign deliverConsign = deliverConsignMapper.selectByPrimaryKey(id);
        if (deliverConsign == null) {
            throw new Exception("出口通知单不存在");
        }
        if (attachments == null) {
            throw new Exception("货物签收单不能为空");
        }
        attachments = attachments.stream().filter(vo -> vo.getAttachType() == 4).collect(Collectors.toList());
        if (attachments == null || attachments.size() == 0) {
            throw new Exception("货物签收单不能为空");
        }
        List<AttachmentInfo> list = attachmentService.list(AttachmentTargetObjEnum.DELIVER_CONSIGN, deliverConsign.getId());
        list = list.stream().filter(vo -> vo.getAttachType() != 4).collect(Collectors.toList());

        List<AttachmentInfo> updateList = new ArrayList<>();
        updateList.addAll(list);
        updateList.addAll(attachments);


        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.DELIVER_CONSIGN, deliverConsign.getId(), updateList);
        if (updateList.size() != attachmentUpdateNum) {
            throw new Exception("货物签收单上传失败");
        }
        // 更新状态
        DeliverConsign deliverConsignSelective = new DeliverConsign();
        deliverConsignSelective.setId(deliverConsign.getId());
        deliverConsignSelective.setDeliverConsignStatus(DeliverConsignStatusEnum.DONE.getCode());

        deliverConsignMapper.updateByPrimaryKeySelective(deliverConsignSelective);
    }

    private String findLastDeliverConsignNo() {
        PageHelper.startPage(1, 1);
        DeliverConsignExample example = new DeliverConsignExample();
        example.setOrderByClause("deliver_consign_no desc");
        DeliverConsignExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);
        List<DeliverConsign> deliverConsigns = deliverConsignMapper.selectByExample(example);
        if (deliverConsigns != null && deliverConsigns.size() > 0) {
            return deliverConsigns.get(0).getDeliverConsignNo();
        }
        return null;
    }
}

