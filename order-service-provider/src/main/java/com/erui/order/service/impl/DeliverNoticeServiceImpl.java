package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.*;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.DeliverNoticeQueryRequest;
import com.erui.order.common.pojo.request.DeliverNoticeSaveRequest;
import com.erui.order.common.pojo.response.DeliverNoticeDetailResponse;
import com.erui.order.common.pojo.response.DeliverNoticeListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.DeliverConsignMapper;
import com.erui.order.mapper.DeliverNoticeMapper;
import com.erui.order.mapper.OrderMapper;
import com.erui.order.mapper.ProjectMapper;
import com.erui.order.model.entity.*;
import com.erui.order.service.*;
import com.erui.order.service.util.DeliverNoticeFactory;
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
public class DeliverNoticeServiceImpl implements DeliverNoticeService {
    private static Logger LOGGER = LoggerFactory.getLogger(DeliverNoticeServiceImpl.class);
    @Autowired
    private DeliverNoticeMapper deliverNoticeMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private DeliverConsignMapper deliverConsignMapper;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private DeliverConsignGoodsService deliverConsignGoodsService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UserService userService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private DeliverConsignBookingSpaceService deliverConsignBookingSpaceService;
    @Autowired
    private DeliverDetailService deliverDetailService;

    @Override
    public Long insert(DeliverNoticeSaveRequest insertRequest) throws Exception {
        DeliverConsign deliverConsign = deliverConsignMapper.selectByPrimaryKey(insertRequest.getDeliverConsignId());
        if (deliverConsign == null) {
            throw new Exception("对应的出口通知单不存在");
        }
        // 查找订单
        Order order = orderMapper.selectByPrimaryKey(deliverConsign.getOrderId());
        // 查找项目
        Project project = selectByOrderId(order.getId());
        // 获取商品总数量
        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos = deliverConsignGoodsService.listByDeliverConsignId(deliverConsign.getId());
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        DeliverNotice deliverNotice = DeliverNoticeFactory.deliverNotice(insertRequest);

        deliverNotice.setDeliverNoticeNo(UUID.randomUUID().toString());
        deliverNotice.setNumbers(deliverConsignGoodsInfos.stream().mapToInt(vo -> vo.getSendNum()).sum());
        deliverNotice.setContractNo(order.getContractNo());
        deliverNotice.setCrmCode(order.getCrmCode());
        deliverNotice.setDeliveryDate(project.getDeliveryDate());
        deliverNotice.setHandleStatus((short) 1);
        deliverNotice.setOperationSpecialistId(deliverConsign.getOperationSpecialistId());
        deliverNotice.setSenderId(userInfo.getId());
        deliverNotice.setCreateTime(new Date());
        deliverNotice.setCreateUserId(userInfo.getId());
        deliverNotice.setDeleteFlag(Boolean.FALSE);
        CompanyEnum companyEnum = CompanyEnum.fromCode(order.getExecCoCode());
        if (companyEnum != null) {
            deliverNotice.setExecCoName(companyEnum.getName());
        }
        int insertNum = deliverNoticeMapper.insert(deliverNotice);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long deliverNoticeId = deliverNotice.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.DELIVER_NOTICE, deliverNoticeId, attachments);
        if (attachments.size() != attachmentInsertNum) {
            LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
            throw new Exception("看货通知单附件数据操作失败");
        }

        // 已经生成看货通知单
        DeliverConsign deliverConsignSelective = new DeliverConsign();
        deliverConsignSelective.setId(deliverConsign.getId());
        deliverConsignSelective.setDeliverNoticeStatus(deliverNotice.getDeliverNoticeStatus());
        deliverConsignMapper.updateByPrimaryKeySelective(deliverConsignSelective);

        return deliverNoticeId;
    }

    @Override
    public void update(Long id, DeliverNoticeSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        DeliverNotice deliverNotice = deliverNoticeMapper.selectByPrimaryKey(id);
        if (deliverNotice == null) {
            throw new Exception("对象唯一标识错误");
        }
        DeliverNoticeStatusEnum requestStatusEnum = DeliverNoticeStatusEnum.valueOf(updateRequest.getDeliverNoticeStatus());
        if (requestStatusEnum != DeliverNoticeStatusEnum.SAVED && requestStatusEnum != DeliverNoticeStatusEnum.SUBMITED) {
            throw new Exception("请求对象的状态错误");
        }
        DeliverNoticeStatusEnum statusEnum = DeliverNoticeStatusEnum.valueOf(deliverNotice.getDeliverNoticeStatus());
        if (statusEnum != DeliverNoticeStatusEnum.SAVED) {
            throw new Exception("对象当前状态错误");
        }

        Long deliverNoticeId = deliverNotice.getId();
        // 修改基本信息
        DeliverNotice deliverNoticeSelective = DeliverNoticeFactory.deliverNotice(updateRequest);
        deliverNoticeSelective.setId(deliverNoticeId);
        deliverNoticeSelective.setSenderId(userInfo.getId());
        deliverNoticeSelective.setUpdateTime(new Date());
        deliverNoticeSelective.setUpdateUserId(userInfo.getId());

        deliverNoticeMapper.updateByPrimaryKeySelective(deliverNoticeSelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.DELIVER_NOTICE, deliverNoticeId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<DeliverNoticeListResponse> list(DeliverNoticeQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        DeliverNoticeExample example = new DeliverNoticeExample();
        example.setOrderByClause("id desc");
        DeliverNoticeExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        if (StringUtils.isNotBlank(queryRequest.getContractNo())) {
            criteria.andContractNoLike("%" + queryRequest.getContractNo() + "%");
        }

        if (StringUtils.isNotBlank(queryRequest.getCrmCode())) {
            criteria.andCrmCodeLike("%" + queryRequest.getCrmCode() + "%");
        }

        DeliverNoticeStatusEnum deliverNoticeStatusEnum = DeliverNoticeStatusEnum.valueOf(queryRequest.getDeliverNoticeStatus());
        if (deliverNoticeStatusEnum != null) {
            criteria.andDeliverNoticeStatusEqualTo(deliverNoticeStatusEnum.getCode());
        }


        List<DeliverNotice> deliverNoticeList = deliverNoticeMapper.selectByExample(example);
        List<DeliverNoticeListResponse> deliverNoticeListResponses = new ArrayList<>();
        for (DeliverNotice deliverNotice : deliverNoticeList) {
            DeliverNoticeListResponse deliverNoticeListResponse = DeliverNoticeFactory.deliverNoticeListResponse(deliverNotice);
            deliverNoticeListResponse.setWareHousemanName(userService.findNameById(deliverNotice.getWareHouseman()));
            deliverNoticeListResponse.setOperationSpecialistUserName(userService.findNameById(deliverNotice.getOperationSpecialistId()));
            deliverNoticeListResponses.add(deliverNoticeListResponse);
        }
        // 输出
        Page<DeliverNotice> page = (Page) deliverNoticeList;
        Pager<DeliverNoticeListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), deliverNoticeListResponses);
        return pager;
    }

    @Override
    public DeliverNoticeDetailResponse detail(Long id) throws Exception {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 准备数据
        DeliverNotice deliverNotice = deliverNoticeMapper.selectByPrimaryKey(id);
        if (deliverNotice == null) {
            throw new Exception("对象信息不存在");
        }
        // 出口通知单信息
        DeliverConsign deliverConsign = deliverConsignMapper.selectByPrimaryKey(deliverNotice.getDeliverConsignId());
        DeliverConsignBookingSpaceInfo deliverConsignBookingSpaceInfo = deliverConsignBookingSpaceService.selectByDeliverConsignId(deliverConsign.getId());
        // 查找订单
        Order order = orderMapper.selectByPrimaryKey(deliverConsign.getOrderId());
        // 查找项目
        Project project = selectByOrderId(order.getId());
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.DELIVER_NOTICE, id);
        // 商品
        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos = deliverConsignGoodsService.listByDeliverConsignId(deliverNotice.getDeliverConsignId());
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByDeliverConsignGoods(deliverConsignGoodsInfos);
        // 组织数据
        DeliverNoticeDetailResponse detail = DeliverNoticeFactory.deliverNoticeDetailResponse(deliverNotice);
        Short deliverNoticeStatus = deliverNotice.getDeliverNoticeStatus();
        if (deliverNoticeStatus > DeliverNoticeStatusEnum.SAVED.getCode()) {
            detail.setSenderId(deliverNotice.getSenderId());
        } else {
            detail.setSenderId(userInfo.getId());
        }
        detail.setSenderName(userService.findNameById(detail.getSenderId()));
        detail.setProjectNo(project.getProjectNo());

        detail.setOperationSpecialistName(userService.findNameById(detail.getOperationSpecialistId()));
        detail.setBusinessSketch(deliverConsign.getBusinessSketch());
        detail.setGoodsDepositPlace(deliverConsign.getGoodsDepositPlace());
        detail.setTradeTerms(order.getTradeTerms());
        // 目的国、目的地
        detail.setToCountry(order.getToCountry());
        detail.setToCountryName(countryService.findCountryNameByBn(order.getToCountry()));
        detail.setToPlace(order.getToPlace());
        // 事业部项目负责人
        detail.setTechnicalId(order.getTechnicalId());
        detail.setTechnicalUserName(userService.findNameById(order.getTechnicalId()));
        // 运输方式
        detail.setTransportType(order.getTransportType());
        OrderTransportTypeEnum orderTransportTypeEnum = OrderTransportTypeEnum.fromCode(order.getTransportType());
        if (orderTransportTypeEnum != null) {
            detail.setTransportTypeName(orderTransportTypeEnum.getName());
        }
        // 订单紧急程度 1:一般（成本优先） 2:紧急 3:异常紧急（交期优先）
        detail.setOrderEmergency(deliverConsignBookingSpaceInfo.getOrderEmergency());

        detail.setAttachments(attachmentInfos);
        detail.setGoodsInfos(goodsInfoList);

        return detail;
    }


    @Override
    public DeliverNoticeDetailResponse detailByDeliverConsignId(Long deliverConsignId) throws Exception {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 准备数据
        DeliverConsign deliverConsign = deliverConsignMapper.selectByPrimaryKey(deliverConsignId);
        if (deliverConsign == null) {
            throw new Exception("订舱信息不存在");
        }
        // 订舱信息
        DeliverConsignBookingSpaceInfo deliverConsignBookingSpaceInfo = deliverConsignBookingSpaceService.selectByDeliverConsignId(deliverConsignId);
        // 查找订单
        Order order = orderMapper.selectByPrimaryKey(deliverConsign.getOrderId());
        // 查找项目
        Project project = selectByOrderId(order.getId());

        // 查询商品的采购数量是否都已经和预报检数量数量相同，如果相同，返回null，否则返回预显示内容
        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos = deliverConsignGoodsService.listByDeliverConsignId(deliverConsignId);
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByDeliverConsignGoods(deliverConsignGoodsInfos);
        DeliverNoticeDetailResponse detailResponse = new DeliverNoticeDetailResponse();
        // 组装数据
        detailResponse.setDeliverConsignId(deliverConsignId);
        detailResponse.setSenderId(userInfo.getId());
        detailResponse.setSenderName(userInfo.getUserName());
        detailResponse.setProjectNo(project.getProjectNo());
        detailResponse.setOperationSpecialistId(deliverConsign.getOperationSpecialistId());
        detailResponse.setOperationSpecialistName(userService.findNameById(deliverConsign.getOperationSpecialistId()));
        detailResponse.setBusinessSketch(deliverConsign.getBusinessSketch());
        detailResponse.setGoodsDepositPlace(deliverConsign.getGoodsDepositPlace());
        detailResponse.setTradeTerms(order.getTradeTerms());
        // 目的国、目的地
        detailResponse.setToCountry(order.getToCountry());
        detailResponse.setToCountryName(countryService.findCountryNameByBn(order.getToCountry()));
        detailResponse.setToPlace(order.getToPlace());
        // 产品件数
        long totalGoodsNum = goodsInfoList.stream().mapToInt(vo -> vo.getSendNum()).sum();
        detailResponse.setNumbers((int) totalGoodsNum);
        // 事业部项目负责人
        detailResponse.setTechnicalId(order.getTechnicalId());
        detailResponse.setTechnicalUserName(userService.findNameById(order.getTechnicalId()));
        // 运输方式
        detailResponse.setTransportType(order.getTransportType());
        OrderTransportTypeEnum orderTransportTypeEnum = OrderTransportTypeEnum.fromCode(order.getTransportType());
        if (orderTransportTypeEnum != null) {
            detailResponse.setTransportTypeName(orderTransportTypeEnum.getName());
        }
        // 项目约定交付日期
        detailResponse.setDeliveryDate(project.getDeliveryDate());
        // 订单紧急程度 1:一般（成本优先） 2:紧急 3:异常紧急（交期优先）
        detailResponse.setOrderEmergency(deliverConsignBookingSpaceInfo.getOrderEmergency());

        // 商品
        detailResponse.setGoodsInfos(goodsInfoList);
        return detailResponse;
    }


    @Override
    public void deliverNoticeUpload(Long id, List<AttachmentInfo> attachments) throws Exception {
        DeliverNotice deliverNotice = deliverNoticeMapper.selectByPrimaryKey(id);
        if (deliverNotice == null) {
            throw new Exception("看货通知单不存在");
        }
        if (attachments == null) {
            throw new Exception("箱单不能为空");
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.DELIVER_NOTICE, deliverNotice.getId(), attachments);
        if (attachments.size() != attachmentUpdateNum) {
            throw new Exception("箱单上传失败");
        }
        // 更新状态
        DeliverNotice deliverNoticeSelective = new DeliverNotice();
        deliverNoticeSelective.setId(deliverNotice.getId());
        deliverNoticeSelective.setDeliverNoticeStatus(DeliverNoticeStatusEnum.UPLOAD.getCode());
        deliverNoticeSelective.setHandleStatus((short) 2);
        deliverNoticeMapper.updateByPrimaryKeySelective(deliverNoticeSelective);

        // 推送出库信息
        deliverDetailService.insert(deliverNotice.getId());
    }

    private Project selectByOrderId(Long orderId) {
        ProjectExample projectExample = new ProjectExample();
        projectExample.createCriteria().andDeleteFlagEqualTo(Boolean.FALSE).andOrderIdEqualTo(orderId);
        List<Project> projects = projectMapper.selectByExample(projectExample);
        Project project = null;
        if (projects != null && projects.size() > 0) {
            project = projects.get(0);
        }
        return project;
    }
}