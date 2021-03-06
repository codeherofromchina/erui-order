package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.DeliverDetailStatusEnum;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.DeliverDetailQueryRequest;
import com.erui.order.common.pojo.request.DeliverDetailSaveRequest;
import com.erui.order.common.pojo.response.DeliverDetailDetailResponse;
import com.erui.order.common.pojo.response.DeliverDetailListResponse;
import com.erui.order.common.util.StringUtil;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.*;
import com.erui.order.model.entity.*;
import com.erui.order.service.*;
import com.erui.order.service.util.DeliverDetailFactory;
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

@Service
@Transactional
public class DeliverDetailServiceImpl implements DeliverDetailService {
    private static Logger LOGGER = LoggerFactory.getLogger(DeliverDetailServiceImpl.class);
    @Autowired
    private DeliverDetailMapper deliverDetailMapper;
    @Autowired
    private DeliverConsignMapper deliverConsignMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private DeliverNoticeMapper deliverNoticeMapper;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private DeliverConsignGoodsService deliverConsignGoodsService;
    @Autowired
    private DeliverDetailGoodsService deliverDetailGoodsService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UserService userService;
    @Autowired
    private PortService portService;
    @Autowired
    private LogisticsDataService logisticsDataService;

    @Override
    public Long insert(Long inspectNoticeId) throws Exception {
        DeliverNotice deliverNotice = deliverNoticeMapper.selectByPrimaryKey(inspectNoticeId);
        if (deliverNotice == null) {
            throw new Exception("看货通知不存在");
        }
        // 出库通知单
        DeliverConsign deliverConsign = deliverConsignMapper.selectByPrimaryKey(deliverNotice.getDeliverConsignId());
        // 订单
        Order order = orderMapper.selectByPrimaryKey(deliverConsign.getOrderId());
        // 项目
        Project project = selectByOrderId(order.getId());

        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();

        DeliverDetail deliverDetail = new DeliverDetail();
        deliverDetail.setDeliverNoticeId(inspectNoticeId);
        String lastDeliverDetailNo = findLastDeliverDetailNo();
        deliverDetail.setDeliverDetailNo(StringUtil.genDeliverDetailNo(lastDeliverDetailNo));
        deliverDetail.setDeliverConsignNo(deliverConsign.getDeliverConsignNo());
        deliverDetail.setContractNo(order.getContractNo());
        deliverDetail.setProjectNo(project.getProjectNo());
        deliverDetail.setTradeTerms(order.getTradeTerms());
        deliverDetail.setToPort(order.getToPort());
        // TODO 先跳过，需要设置仓库经办人(project.warehourseUid)、物流经办人（project.logisticsuid）
        deliverDetail.setQualityLeaderUserId(project.getQualityUid());
        deliverDetail.setDeliverDetailStatus(DeliverDetailStatusEnum.INIT.getCode());
        deliverDetail.setCreateTime(new Date());
        deliverDetail.setCreateUserId(userInfo.getId());
        deliverDetail.setDeleteFlag(Boolean.FALSE);
        deliverDetailMapper.insert(deliverDetail);
        Long deliverDetailId = deliverDetail.getId();

        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos = deliverConsignGoodsService.listByDeliverConsignId(deliverConsign.getId());
        deliverDetailGoodsService.insert(deliverDetailId, deliverConsignGoodsInfos);
        return deliverDetailId;

    }

    @Override
    public void update(Long id, DeliverDetailSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        DeliverDetail deliverDetail = deliverDetailMapper.selectByPrimaryKey(id);
        if (deliverDetail == null) {
            throw new Exception("出库对象ID标识错误");
        }

        Long deliverDetailId = deliverDetail.getId();
        // 修改基本信息
        DeliverDetail deliverDetailSelective = DeliverDetailFactory.deliverDetail(updateRequest);
        deliverDetailSelective.setId(deliverDetailId);
        deliverDetailSelective.setUpdateTime(new Date());
        deliverDetailSelective.setUpdateUserId(userInfo.getId());
        deliverDetailMapper.updateByPrimaryKeySelective(deliverDetailSelective);

        // 商品信息
        List<DeliverDetailGoodsInfo> deliverDetailGoodsInfos = updateRequest.getDeliverDetailGoodsInfos();
        if (deliverDetailGoodsInfos != null) {
            deliverDetailGoodsService.update(deliverDetailId, deliverDetailGoodsInfos);
        }

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.DELIVER_DETAIL, deliverDetailId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<DeliverDetailListResponse> list(DeliverDetailQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        DeliverDetailExample example = new DeliverDetailExample();
        example.setOrderByClause("id desc");
        DeliverDetailExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        if (StringUtils.isNotBlank(queryRequest.getDeliverDetailNo())) {
            criteria.andDeliverDetailNoLike("%" + queryRequest.getDeliverDetailNo() + "%");
        }

        if (StringUtils.isNotBlank(queryRequest.getContractNo())) {
            criteria.andContractNoLike("%" + queryRequest.getContractNo() + "%");
        }

        if (StringUtils.isNotBlank(queryRequest.getDeliverConsignNo())) {
            criteria.andDeliverConsignNoLike("%" + queryRequest.getDeliverConsignNo() + "%");
        }

        if (StringUtils.isNotBlank(queryRequest.getProjectNo())) {
            criteria.andProjectNoLike("%" + queryRequest.getProjectNo() + "%");
        }

        //前端传入的状态值 1未质检  2 质检中  3 质检完成  4 已出库
        if (queryRequest.getDeliverDetailStatus() != null) {
            List<Short> statusList = new ArrayList<>();
            if (1 == queryRequest.getDeliverDetailStatus()) {
                statusList.add(DeliverDetailStatusEnum.INIT.getCode());
                statusList.add(DeliverDetailStatusEnum.SAVED_OUTSTOCK.getCode());
            } else if (2 == queryRequest.getDeliverDetailStatus()) {
                statusList.add(DeliverDetailStatusEnum.SUBMITED_OUTSTOCK.getCode());
                statusList.add(DeliverDetailStatusEnum.SAVED_OUT_INSPECT.getCode());
            } else if (3 == queryRequest.getDeliverDetailStatus()) {
                statusList.add(DeliverDetailStatusEnum.SUBMITED_OUT_INSPECT.getCode());
            } else if (4 == queryRequest.getDeliverDetailStatus()) {
                statusList.add(DeliverDetailStatusEnum.PROCESS_LOGI_PERSON.getCode());
                statusList.add(DeliverDetailStatusEnum.PROCESS_LOGI.getCode());
                statusList.add(DeliverDetailStatusEnum.DONE_PROJECT.getCode());
            }
            if (statusList.size() > 0) {
                criteria.andDeliverDetailStatusIn(statusList);
            }
        }

        if (queryRequest.getDeliverDetailType() != null) {
            if (queryRequest.getDeliverDetailType() == 2) {
                criteria.andDeliverDetailStatusGreaterThanOrEqualTo(DeliverDetailStatusEnum.SUBMITED_OUTSTOCK.getCode());
            } else if (queryRequest.getDeliverDetailType() == 3) {
                criteria.andDeliverDetailStatusGreaterThanOrEqualTo(DeliverDetailStatusEnum.SUBMITED_OUT_INSPECT.getCode());
            }
        }


        List<DeliverDetail> deliverDetails = deliverDetailMapper.selectByExample(example);

        List<DeliverDetailListResponse> deliverDetailListResponses = new ArrayList<>();
        for (DeliverDetail deliverDetail : deliverDetails) {
            DeliverDetailListResponse deliverDetailListResponse = DeliverDetailFactory.deliverDetailListResponse(deliverDetail);
            deliverDetailListResponse.setCheckUserName(userService.findNameById(deliverDetail.getCheckUserId()));
            deliverDetailListResponses.add(deliverDetailListResponse);
        }
        // 输出
        Page<DeliverDetail> page = (Page) deliverDetails;
        Pager<DeliverDetailListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), deliverDetailListResponses);
        return pager;
    }

    @Override
    public DeliverDetailDetailResponse detail(Long id) throws Exception {
        // 准备数据
        DeliverDetail deliverDetail = deliverDetailMapper.selectByPrimaryKey(id);
        if (deliverDetail == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.DELIVER_DETAIL, id);
        List<DeliverDetailGoodsInfo> deliverDetailGoodsInfos = deliverDetailGoodsService.listByDeliverDetailId(id);
        List<GoodsInfo> goodsInfos = goodsService.goodsinfobyDeliverDetailGoods(deliverDetailGoodsInfos);

        // 组织数据
        DeliverDetailDetailResponse detail = DeliverDetailFactory.deliverDetailDetailResponse(deliverDetail);
        detail.setSenderUserName(userService.findNameById(detail.getSenderUserId()));
        detail.setReviewerUserName(userService.findNameById(detail.getReviewerUserId()));
        detail.setCheckUserName(userService.findNameById(detail.getCheckUserId()));
        detail.setReleaseUserName(userService.findNameById(detail.getReleaseUserId()));
        detail.setQualityLeaderUserName(userService.findNameById(detail.getQualityLeaderUserId()));
        detail.setApplicantUserName(userService.findNameById(detail.getApplicantUserId()));
        detail.setApproverUserName(userService.findNameById(detail.getApproverUserId()));

        detail.setToPortName(portService.findPortNameByBn(detail.getToPort()));
        detail.setAttachments(attachmentInfos);
        detail.setGoodsInfos(goodsInfos);

        return detail;
    }

    @Override
    public void confirmOutStock(Long id) throws Exception {
        DeliverDetail deliverDetail = deliverDetailMapper.selectByPrimaryKey(id);
        if (deliverDetail == null) {
            throw new Exception("出库信息不存在");
        }

        DeliverDetailStatusEnum deliverDetailStatusEnum = DeliverDetailStatusEnum.valueOf(deliverDetail.getDeliverDetailStatus());
        if (deliverDetailStatusEnum != DeliverDetailStatusEnum.SUBMITED_OUT_INSPECT) {
            throw new Exception("出库信息状态不正确");
        }

        DeliverDetail deliverDetail1Selective = new DeliverDetail();
        deliverDetail1Selective.setId(id);
        deliverDetail1Selective.setDeliverDetailStatus(DeliverDetailStatusEnum.PROCESS_LOGI_PERSON.getCode());
        deliverDetailMapper.updateByPrimaryKeySelective(deliverDetail1Selective);

        // 推送物流跟踪信息
        logisticsDataService.insert(id);
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

    private String findLastDeliverDetailNo() {
        PageHelper.startPage(1, 1);
        DeliverDetailExample example = new DeliverDetailExample();
        example.setOrderByClause("deliver_detail_no desc");
        List<DeliverDetail> deliverDetailList = deliverDetailMapper.selectByExample(null);
        if (deliverDetailList != null && deliverDetailList.size() > 0) {
            return deliverDetailList.get(0).getDeliverDetailNo();
        }
        return null;
    }
}

