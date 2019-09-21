package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.DeliverNoticeStatusEnum;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.DeliverNoticeQueryRequest;
import com.erui.order.common.pojo.request.DeliverNoticeSaveRequest;
import com.erui.order.common.pojo.response.DeliverConsignDetailResponse;
import com.erui.order.common.pojo.response.DeliverNoticeDetailResponse;
import com.erui.order.common.pojo.response.DeliverNoticeListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.DeliverConsignMapper;
import com.erui.order.mapper.DeliverNoticeMapper;
import com.erui.order.model.entity.DeliverConsign;
import com.erui.order.model.entity.DeliverNotice;
import com.erui.order.model.entity.DeliverNoticeExample;
import com.erui.order.model.entity.Order;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.DeliverConsignGoodsService;
import com.erui.order.service.DeliverNoticeService;
import com.erui.order.service.GoodsService;
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

@Service
@Transactional
public class DeliverNoticeServiceImpl implements DeliverNoticeService {
    private static Logger LOGGER = LoggerFactory.getLogger(DeliverNoticeServiceImpl.class);
    @Autowired
    private DeliverNoticeMapper deliverNoticeMapper;
    @Autowired
    private DeliverConsignMapper deliverConsignMapper;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private DeliverConsignGoodsService deliverConsignGoodsService;
    @Autowired
    private GoodsService goodsService;

    @Override
    public Long insert(DeliverNoticeSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        DeliverNotice DeliverNotice = DeliverNoticeFactory.DeliverNotice(insertRequest);
        DeliverNotice.setCreateTime(new Date());
        DeliverNotice.setCreateUserId(userInfo.getId());
        int insertNum = deliverNoticeMapper.insert(DeliverNotice);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long DeliverNoticeId = DeliverNotice.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.DELIVER_NOTICE, DeliverNoticeId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return DeliverNoticeId;
    }

    @Override
    public void update(Long id, DeliverNoticeSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        DeliverNotice DeliverNotice = deliverNoticeMapper.selectByPrimaryKey(id);
        if (DeliverNotice == null) {
            throw new Exception("对象唯一标识错误");
        }
        DeliverNoticeStatusEnum requestStatusEnum = DeliverNoticeStatusEnum.valueOf(updateRequest.getDeliverNoticeStatus());
        if (requestStatusEnum == DeliverNoticeStatusEnum.INIT) {
            throw new Exception("请求对象的状态错误");
        }

        DeliverNoticeStatusEnum statusEnum = DeliverNoticeStatusEnum.valueOf(DeliverNotice.getDeliverNoticeStatus());
        if (statusEnum != DeliverNoticeStatusEnum.INIT && statusEnum != DeliverNoticeStatusEnum.SAVED) {
            throw new Exception("对象当前状态错误");
        }

        Long DeliverNoticeId = DeliverNotice.getId();
        // 修改基本信息
        DeliverNotice DeliverNoticeSelective = DeliverNoticeFactory.DeliverNotice(updateRequest);
        DeliverNoticeSelective.setId(DeliverNoticeId);
        DeliverNoticeSelective.setUpdateTime(new Date());
        DeliverNoticeSelective.setUpdateUserId(userInfo.getId());

        deliverNoticeMapper.updateByPrimaryKeySelective(DeliverNoticeSelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.DELIVER_NOTICE, DeliverNoticeId, attachments);
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
            criteria.andCrmCodeLike("%" + queryRequest.getContractNo() + "%");
        }

        DeliverNoticeStatusEnum deliverNoticeStatusEnum = DeliverNoticeStatusEnum.valueOf(queryRequest.getDeliverNoticeStatus());
        if (deliverNoticeStatusEnum != null) {
            criteria.andDeliverNoticeStatusEqualTo(deliverNoticeStatusEnum.getCode());
        }


        List<DeliverNotice> deliverNoticeList = deliverNoticeMapper.selectByExample(example);
        List<DeliverNoticeListResponse> deliverNoticeListResponses = new ArrayList<>();
        for (DeliverNotice deliverNotice : deliverNoticeList) {
            DeliverNoticeListResponse deliverNoticeListResponse = DeliverNoticeFactory.deliverNoticeListResponse(deliverNotice);
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
        // 准备数据
        DeliverNotice deliverNotice = deliverNoticeMapper.selectByPrimaryKey(id);
        if (deliverNotice == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.DELIVER_NOTICE, id);

        // 商品
        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos = deliverConsignGoodsService.listByDeliverConsignId(deliverNotice.getDeliverConsignId());
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByDeliverConsignGoods(deliverConsignGoodsInfos);

        // 组织数据
        DeliverNoticeDetailResponse detail = DeliverNoticeFactory.deliverNoticeDetailResponse(deliverNotice);
        detail.setAttachments(attachmentInfos);
        detail.setGoodsInfos(goodsInfoList);

        return detail;
    }


    @Override
    public DeliverNoticeDetailResponse detailByDeliverConsignId(Long deliverConsignId) throws Exception {
        // 准备数据
        DeliverConsign deliverConsign = deliverConsignMapper.selectByPrimaryKey(deliverConsignId);
        if (deliverConsign == null) {
            throw new Exception("订舱信息不存在");
        }
        // 查询商品的采购数量是否都已经和预报检数量数量相同，如果相同，返回null，否则返回预显示内容
        List<DeliverConsignGoodsInfo> deliverConsignGoodsInfos = deliverConsignGoodsService.listByDeliverConsignId(deliverConsignId);
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByDeliverConsignGoods(deliverConsignGoodsInfos);
        // 组装数据
        DeliverNoticeDetailResponse detailResponse = new DeliverNoticeDetailResponse();
        detailResponse.setDeliverConsignId(deliverConsignId);
        // 商品
        detailResponse.setGoodsInfos(goodsInfoList);

        return detailResponse;
    }
}

