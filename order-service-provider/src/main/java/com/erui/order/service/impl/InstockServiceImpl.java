package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.InstockStatusEnum;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.InstockQueryRequest;
import com.erui.order.common.pojo.request.InstockSaveRequest;
import com.erui.order.common.pojo.response.InstockDetailResponse;
import com.erui.order.common.pojo.response.InstockListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.InspectReportMapper;
import com.erui.order.mapper.InstockMapper;
import com.erui.order.model.entity.InspectReport;
import com.erui.order.model.entity.Instock;
import com.erui.order.model.entity.InstockExample;
import com.erui.order.service.*;
import com.erui.order.service.util.InstockFactory;
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
public class InstockServiceImpl implements InstockService {
    private static Logger LOGGER = LoggerFactory.getLogger(InstockServiceImpl.class);
    @Autowired
    private InstockMapper instockMapper;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private InspectReportMapper inspectReportMapper;
    @Autowired
    private InspectApplyGoodsService inspectApplyGoodsService;
    @Autowired
    private InstockGoodsService instockGoodsService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UserService userService;

    @Override
    public Long insert(Long inspectReportId) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();

        InspectReport inspectReport = inspectReportMapper.selectByPrimaryKey(inspectReportId);
        if (inspectReport == null) {
            throw new Exception("质检单不存在");
        }

        Instock instock = new Instock();
        instock.setUid(10L); // TODO 这里需要确定是谁，这里先写死
        instock.setInspectReportId(inspectReportId);
        instock.setInspectApplyNo(inspectReport.getInspectApplyNo()); // 报检单号
        instock.setSupplierName(inspectReport.getSupplierName()); // 供应商
        instock.setInstockStatus(InstockStatusEnum.INIT.getCode());

        instock.setCreateTime(new Date());
        instock.setCreateUserId(userInfo.getId());
        instock.setDeleteFlag(Boolean.FALSE);
        instockMapper.insert(instock);

        Long instockId = instock.getId();

        List<InspectApplyGoodsInfo> inspectApplyGoodsInfos = inspectApplyGoodsService.listByInpsectReportId(inspectReportId);
        instockGoodsService.insert(instockId, inspectApplyGoodsInfos);
        return instockId;
    }

    @Override
    public void update(Long id, InstockSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        Instock instock = instockMapper.selectByPrimaryKey(id);
        if (instock == null) {
            throw new Exception("入库信息不存在");
        }
        InstockStatusEnum requestStatusEnum = InstockStatusEnum.valueOf(updateRequest.getInstockStatus());
        if (requestStatusEnum != InstockStatusEnum.SUBMITED && requestStatusEnum != InstockStatusEnum.SAVED) {
            throw new Exception("请求对象的状态错误");
        }

        InstockStatusEnum statusEnum = InstockStatusEnum.valueOf(instock.getInstockStatus());
        if (statusEnum != InstockStatusEnum.INIT && statusEnum != InstockStatusEnum.SAVED) {
            throw new Exception("对象当前状态错误");
        }

        Long instockId = instock.getId();
        // 修改基本信息
        Instock instockSelective = InstockFactory.Instock(updateRequest);
        instockSelective.setId(instockId);
        instockSelective.setInstockDate(updateRequest.getInstockDate());
        instockSelective.setRemarks(updateRequest.getRemarks());
        instockSelective.setUpdateTime(new Date());
        instockSelective.setUpdateUserId(userInfo.getId());
        instockMapper.updateByPrimaryKeySelective(instockSelective);

        // 商品信息
        List<InstockGoodsInfo> instockGoodsInfos = updateRequest.getInstockGoodsInfos();
        instockGoodsService.update(instockId, instockGoodsInfos);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.INSTOCK, instockId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<InstockListResponse> list(InstockQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPage(), queryRequest.getRows());

        InstockExample example = new InstockExample();
        example.setOrderByClause("id desc");
        InstockExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        if (StringUtils.isNotBlank(queryRequest.getInspectApplyNo())) {
            criteria.andInspectApplyNoLike("%" + queryRequest.getInspectApplyNo() + "%");
        }

        if (StringUtils.isNotBlank(queryRequest.getContractNo())) {
            criteria.andContractNoLike("%" + queryRequest.getContractNo() + "%");
        }

        if (StringUtils.isNotBlank(queryRequest.getProjectNo())) {
            criteria.andProjectNoLike("%" + queryRequest.getProjectNo() + "%");
        }

        if (StringUtils.isNotBlank(queryRequest.getSupplierName())) {
            criteria.andSupplierNameLike("%" + queryRequest.getSupplierName() + "%");
        }
        InstockStatusEnum instockStatusEnum = InstockStatusEnum.valueOf(queryRequest.getInstockStatus());
        if (instockStatusEnum != null) {
            criteria.andInstockStatusEqualTo(instockStatusEnum.getCode());
        }


        List<Instock> instocks = instockMapper.selectByExample(example);
        List<InstockListResponse> instockListResponses = new ArrayList<>();
        for (Instock instock : instocks) {
            InstockListResponse instockListResponse = InstockFactory.instockListResponse(instock);


            instockListResponses.add(instockListResponse);
        }
        // 输出
        Page<Instock> page = (Page) instocks;
        Pager<InstockListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), instockListResponses);
        return pager;
    }

    @Override
    public InstockDetailResponse detail(Long id) throws Exception {
        // 准备数据
        Instock instock = instockMapper.selectByPrimaryKey(id);
        if (instock == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.INSTOCK, id);
        // 商品
        List<InstockGoodsInfo> instockGoodsInfos = instockGoodsService.listByInstockId(id);
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByInstockGoods(instockGoodsInfos);

        // 组织数据
        InstockDetailResponse detail = InstockFactory.instockDetailResponse(instock);
        detail.setUid(userService.findNameById(instock.getUid()));
        detail.setGoodsInfos(goodsInfoList);
        detail.setAttachments(attachmentInfos);

        return detail;
    }
}

