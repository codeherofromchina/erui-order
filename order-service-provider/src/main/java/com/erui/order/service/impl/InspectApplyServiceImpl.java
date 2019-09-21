package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.InspectApplyStatusEnum;
import com.erui.order.common.pojo.*;
import com.erui.order.common.pojo.request.InspectApplySaveRequest;
import com.erui.order.common.pojo.response.InspectApplyDetailResponse;
import com.erui.order.common.pojo.response.InspectApplyListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.InspectApplyMapper;
import com.erui.order.mapper.PurchMapper;
import com.erui.order.model.entity.InspectApply;
import com.erui.order.model.entity.InspectApplyExample;
import com.erui.order.model.entity.Purch;
import com.erui.order.service.*;
import com.erui.order.service.util.InspectApplyFactory;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class InspectApplyServiceImpl implements InspectApplyService {
    private static Logger LOGGER = LoggerFactory.getLogger(InspectApplyServiceImpl.class);
    @Autowired
    private InspectApplyMapper inspectApplyMapper;
    @Autowired
    private AttachmentService attachmentService;
    @Autowired
    private UserService userService;
    @Autowired
    private PurchMapper purchMapper;
    @Autowired
    private PurchGoodsService purchGoodsService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private InspectApplyGoodsService inspectApplyGoodsService;
    @Autowired
    private InspectReportService inspectReportService;

    @Override
    public Long insert(InspectApplySaveRequest insertRequest) throws Exception {
        Long purchId = insertRequest.getPurchId();
        Purch purch = purchMapper.selectByPrimaryKey(purchId);
        if (purch == null) {
            throw new Exception("采购单不存在");
        }

        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        InspectApply inspectApply = InspectApplyFactory.inspectApply(insertRequest);
        if (inspectApply.getMasteer()) {
            // 是否是主报检单
            inspectApply.setInspectApplyNo(genInspectApplyNo());
            inspectApply.setNum((short) 1);
        } else {
            // 不是主报检单
            Long pInspectApplyId = inspectApply.getpId();
            InspectApply parentInspectApply = inspectApplyMapper.selectByPrimaryKey(pInspectApplyId);
            if (parentInspectApply == null) {
                throw new Exception("父报检单不存在");
            }

            inspectApply.setNum((short) (parentInspectApply.getNum() + 1));
            inspectApply.setInspectApplyNo(String.format("%s-%d", parentInspectApply.getInspectApplyNo(), inspectApply.getNum()));
        }

        inspectApply.setPurchId(purch.getId());
        inspectApply.setPurchNo(purch.getPurchNo());
        inspectApply.setDepartment(purch.getDepartment());
        // 采购经办人
        inspectApply.setPurchaseNameId(purch.getAgentId());
        // 供应商
        inspectApply.setSupplierName(supplierService.findNameById(purch.getSupplierId()));

        inspectApply.setCreateTime(new Date());
        inspectApply.setCreateUserId(userInfo.getId());
        inspectApply.setDeleteFlag(Boolean.FALSE);
        int insertNum = inspectApplyMapper.insert(inspectApply);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long inspectApplyId = inspectApply.getId();
        if (inspectApplyId == null) {
            throw new Exception("操作报检单失败");
        }

        // 商品操作
        List<InspectApplyGoodsInfo> insertRequestGoodsInfos = insertRequest.getGoodsInfos();
        inspectApplyGoodsService.insert(inspectApplyId, insertRequestGoodsInfos);

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.INSPECT_APPLY, inspectApplyId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        if (inspectApply.getInspectApplyStatus() == InspectApplyStatusEnum.SUBMITED.getCode()) {
            inspectReportService.insert(inspectApplyId);
        }


        return inspectApplyId;
    }

    @Override
    public void update(Long id, InspectApplySaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        InspectApply inspectApply = inspectApplyMapper.selectByPrimaryKey(id);
        if (inspectApply == null) {
            throw new Exception("对象唯一标识错误");
        }
        InspectApplyStatusEnum requestStatusEnum = InspectApplyStatusEnum.valueOf(updateRequest.getInspectApplyStatus());
        if (requestStatusEnum != InspectApplyStatusEnum.SAVED && requestStatusEnum != InspectApplyStatusEnum.SUBMITED) {
            throw new Exception("请求状态错误");
        }

        InspectApplyStatusEnum statusEnum = InspectApplyStatusEnum.valueOf(inspectApply.getInspectApplyStatus());
        if (statusEnum != InspectApplyStatusEnum.SAVED) {
            throw new Exception("对象当前状态错误");
        }

        Long inspectApplyId = inspectApply.getId();
        // 修改基本信息
        InspectApply inspectApplySelective = InspectApplyFactory.inspectApply(updateRequest);
        inspectApplySelective.setId(inspectApplyId);
        inspectApplySelective.setUpdateTime(new Date());
        inspectApplySelective.setUpdateUserId(userInfo.getId());

        inspectApplyMapper.updateByPrimaryKeySelective(inspectApplySelective);

        // 更新商品
        List<InspectApplyGoodsInfo> inspectApplyGoodsInfos = updateRequest.getGoodsInfos();
        inspectApplyGoodsService.insertOnDuplicateIdUpdate(inspectApplyId, inspectApplyGoodsInfos);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.INSPECT_APPLY, inspectApplyId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }

        if (inspectApply.getInspectApplyStatus() == InspectApplyStatusEnum.SUBMITED.getCode()) {
            // 推送信息到报检内容中
            inspectReportService.insert(inspectApplyId);
        }
    }

    @Override
    public List<InspectApplyListResponse> list(Long purchId) {
        InspectApplyExample example = new InspectApplyExample();
        example.setOrderByClause("inspect_apply_no asc");
        InspectApplyExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE).andPurchIdEqualTo(purchId);

        List<InspectApply> inspectApplies = inspectApplyMapper.selectByExample(example);
        List<InspectApplyListResponse> inspectApplyListResponses = new ArrayList<>();
        for (InspectApply inspectApply : inspectApplies) {
            InspectApplyListResponse inspectApplyListResponse = InspectApplyFactory.inspectApplyListResponse(inspectApply);
            inspectApplyListResponse.setPurchaseName(userService.findNameById(inspectApply.getPurchaseNameId()));
            inspectApplyListResponses.add(inspectApplyListResponse);
        }
        return inspectApplyListResponses;
    }

    @Override
    public InspectApplyDetailResponse detail(Long id) throws Exception {
        // 准备数据
        InspectApply inspectApply = inspectApplyMapper.selectByPrimaryKey(id);
        if (inspectApply == null) {
            throw new Exception("报检单信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.INSPECT_APPLY, id);
        List<InspectApplyGoodsInfo> inspectApplyGoodsInfos = inspectApplyGoodsService.listByInspectApplyId(id);
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByInspectApplyGoods(inspectApplyGoodsInfos);

        // 组织数据
        InspectApplyDetailResponse detail = InspectApplyFactory.inspectApplyDetailResponse(inspectApply);
        detail.setPurchaseName(userService.findNameById(detail.getPurchaseNameId()));
        detail.setAttachments(attachmentInfos);
        detail.setGoodsInfos(goodsInfoList);

        return detail;
    }

    @Override
    public InspectApplyDetailResponse detailByPurchId(Long purchId) throws Exception {
        // 准备数据
        Purch purch = purchMapper.selectByPrimaryKey(purchId);
        if (purch == null) {
            throw new Exception("采购单不存在");
        }
        // 查询商品的采购数量是否都已经和预报检数量数量相同，如果相同，返回null，否则返回预显示内容
        List<PurchGoodsInfo> purchGoodsInfos = purchGoodsService.listByPurchId(purchId);
        List<PurchGoodsInfo> purchGoodsInfoList = purchGoodsInfos.stream().filter(purchGoodsInfo -> {
            Integer preInspectNum = purchGoodsInfo.getPreInspectNum();
            Integer purchaseNum = purchGoodsInfo.getPurchaseNum();
            return purchaseNum > preInspectNum; // 过滤出还没有报检完的商品
        }).collect(Collectors.toList());
        // 无商品可报检
        if (purchGoodsInfoList.size() == 0) {
            return null;
        }
        List<GoodsInfo> goodsInfoList = goodsService.goodsInfoByPurchGoods(purchGoodsInfoList);
        // 组装数据
        InspectApplyDetailResponse detailResponse = new InspectApplyDetailResponse();
        detailResponse.setPurchId(purchId);
        detailResponse.setDepartment(purch.getDepartment());
        // 采购经办人
        detailResponse.setPurchaseNameId(purch.getAgentId());
        detailResponse.setPurchaseName(userService.findNameById(purch.getAgentId()));
        // 供应商
        detailResponse.setSupplierId(purch.getSupplierId());
        detailResponse.setSupplierName(supplierService.findNameById(purch.getSupplierId()));
        // 商品
        detailResponse.setGoodsInfos(goodsInfoList);

        return detailResponse;
    }

    @Override
    public void againInspectApplyInfo(Long id, String msg) throws Exception {
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        InspectApply inspectApply = inspectApplyMapper.selectByPrimaryKey(id);
        if (inspectApply == null) {
            throw new Exception("不存在的报检单信息");
        }
        // 检查状态
        if (inspectApply.getInspectApplyStatus() != InspectApplyStatusEnum.QUALIFIED.getCode()) {
            throw new Exception("报检单不是未合格状态");
        }

        InspectApply parentInspectApply = null;
        Long pId = inspectApply.getpId();
        if (pId == null) {
            parentInspectApply = inspectApply;
            pId = parentInspectApply.getId();
        } else {
            parentInspectApply = inspectApplyMapper.selectByPrimaryKey(pId);
        }


        // 重新组织报检且是提交状态
        InspectApply againInspectApply = new InspectApply();
        BeanUtils.copyProperties(parentInspectApply, againInspectApply);
        againInspectApply.setId(null);
        againInspectApply.setNum((short) (inspectApply.getNum() + 1));
        againInspectApply.setInspectApplyNo(parentInspectApply.getInspectApplyNo() + "-" + againInspectApply.getNum());
        againInspectApply.setMasteer(Boolean.FALSE);
        againInspectApply.setpId(pId);
        againInspectApply.setMsg(inspectApply.getTmpMsg());
        againInspectApply.setTmpMsg(null);
        againInspectApply.setInspectApplyStatus(InspectApplyStatusEnum.SUBMITED.getCode());
        againInspectApply.setCreateTime(new Date());
        againInspectApply.setCreateUserId(userInfo.getId());
        againInspectApply.setUpdateTime(null);
        againInspectApply.setUpdateUserId(null);
        againInspectApply.setDeleteFlag(Boolean.FALSE);
        inspectApplyMapper.insert(againInspectApply);
        Long againInspectApplyId = againInspectApply.getId();


        // 组织不合格商品
        List<InspectApplyGoodsInfo> inspectApplyGoodsInfos = inspectApplyGoodsService.listByInspectApplyId(id);
        inspectApplyGoodsInfos = inspectApplyGoodsInfos.stream().filter(vo -> vo.getUnqualified() > 0).collect(Collectors.toList());
        if (inspectApplyGoodsInfos.size() == 0) {
            throw new Exception("没有未合格的商品");
        }
        List<InspectApplyGoodsInfo> newInspectApplyGoodsInfos = new ArrayList<>();
        inspectApplyGoodsInfos.forEach(inspectApplyGoodsInfo -> {
            InspectApplyGoodsInfo applyGoodsInfo = new InspectApplyGoodsInfo();
            applyGoodsInfo.setOrderGoodsId(inspectApplyGoodsInfo.getOrderGoodsId());
            applyGoodsInfo.setPurchGoodsId(inspectApplyGoodsInfo.getPurchGoodsId());
            applyGoodsInfo.setInspectNum(inspectApplyGoodsInfo.getUnqualified());
            applyGoodsInfo.setHeight(inspectApplyGoodsInfo.getHeight());
            applyGoodsInfo.setLwh(inspectApplyGoodsInfo.getLwh());
            newInspectApplyGoodsInfos.add(applyGoodsInfo);
        });

        inspectApplyGoodsService.insert(againInspectApplyId, newInspectApplyGoodsInfos);


        // 推送质检单消息
        inspectReportService.insert(againInspectApplyId);
    }

    public String genInspectApplyNo() {
        String prefix = "ERJ" + DateFormatUtils.format(new Date(), "yyyyMM");
        int number = 1;
        PageHelper.startPage(1, 1);
        InspectApplyExample example = new InspectApplyExample();
        example.setOrderByClause("inspect_apply_no desc");
        example.createCriteria().andInspectApplyNoLike(prefix + "%").andMasteerEqualTo(Boolean.TRUE);

        List<InspectApply> inspectApplies = inspectApplyMapper.selectByExample(example);
        if (inspectApplies != null && inspectApplies.size() > 0) {
            String inspectApplyNo = inspectApplies.get(0).getInspectApplyNo();
            String substring = inspectApplyNo.substring(prefix.length());
            if (StringUtils.isNumeric(substring)) {
                number = Integer.parseInt(substring);
                ++number;
            }
        }
        return String.format("%s%s", prefix, APPLY_NO_FORMAT.format(number));
    }

    public static final NumberFormat APPLY_NO_FORMAT = new DecimalFormat("00000");
}

