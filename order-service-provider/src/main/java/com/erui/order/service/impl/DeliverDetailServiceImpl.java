package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.DeliverDetailStatusEnum;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.DeliverDetailQueryRequest;
import com.erui.order.common.pojo.request.DeliverDetailSaveRequest;
import com.erui.order.common.pojo.response.DeliverDetailDetailResponse;
import com.erui.order.common.pojo.response.DeliverDetailListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.DeliverDetailMapper;
import com.erui.order.mapper.DeliverNoticeMapper;
import com.erui.order.model.entity.DeliverDetail;
import com.erui.order.model.entity.DeliverDetailExample;
import com.erui.order.model.entity.DeliverNotice;
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

    @Override
    public Long insert(Long inspectNoticeId) throws Exception {
        DeliverNotice deliverNotice = deliverNoticeMapper.selectByPrimaryKey(inspectNoticeId);
        if (deliverNotice == null) {
            throw new Exception("看货通知不存在");
        }
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();

        DeliverDetail deliverDetail = new DeliverDetail();
        deliverDetail.setDeliverNoticeId(inspectNoticeId);
        deliverDetail.setDeliverDetailNo(deliverNotice.getDeliverNoticeNo());
        // TODO 先跳过，需要设置仓库经办人(project.warehourseUid)、物流经办人（project.logisticsuid）、品控经办人（project.qualityuid）
        deliverDetail.setDeliverDetailStatus(DeliverDetailStatusEnum.INIT.getCode());
        deliverDetail.setCreateTime(new Date());
        deliverDetail.setCreateUserId(userInfo.getId());
        deliverDetailMapper.insert(deliverDetail);
        Long deliverDetailId = deliverDetail.getId();

        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos = deliverConsignGoodsService.listByDeliverConsignId(inspectNoticeId);
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
        deliverDetailGoodsService.update(deliverDetailId, deliverDetailGoodsInfos);

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

        if (StringUtils.isNotBlank(queryRequest.getDeliverConsignNo())) {
            criteria.andDeliverConsignNoLike("%" + queryRequest.getDeliverConsignNo() + "%");
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

        DeliverDetailStatusEnum deliverDetailStatusEnum = DeliverDetailStatusEnum.valueOf(queryRequest.getDeliverDetailStatus());
        if (deliverDetailStatusEnum != null) {
            if (deliverDetailStatusEnum == DeliverDetailStatusEnum.SUBMITED_OUTSTOCK) {
                criteria.andDeliverDetailStatusLessThanOrEqualTo(DeliverDetailStatusEnum.SUBMITED_OUTSTOCK.getCode());
            } else if (deliverDetailStatusEnum == DeliverDetailStatusEnum.PROCESS_LOGI_PERSON) {
                criteria.andDeliverDetailStatusGreaterThanOrEqualTo(DeliverDetailStatusEnum.PROCESS_LOGI_PERSON.getCode());
            } else {
                criteria.andDeliverDetailStatusEqualTo(deliverDetailStatusEnum.getCode());
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
        detail.setAttachments(attachmentInfos);
        detail.setGoodsInfos(goodsInfos);

        return detail;
    }
}

