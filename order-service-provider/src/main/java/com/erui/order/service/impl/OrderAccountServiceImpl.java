package com.erui.order.service.impl;

import com.alibaba.fastjson.JSON;
import com.erui.order.common.enums.AttachmentTargetObjEnum;
import com.erui.order.common.enums.OrderAccountStatusEnum;
import com.erui.order.common.pojo.AttachmentInfo;
import com.erui.order.common.pojo.Pager;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.pojo.request.OrderAccountQueryRequest;
import com.erui.order.common.pojo.request.OrderAccountSaveRequest;
import com.erui.order.common.pojo.response.OrderAccountDetailResponse;
import com.erui.order.common.pojo.response.OrderAccountListResponse;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.OrderAccountMapper;
import com.erui.order.model.entity.OrderAccount;
import com.erui.order.model.entity.OrderAccountExample;
import com.erui.order.service.AttachmentService;
import com.erui.order.service.OrderAccountService;
import com.erui.order.service.util.OrderAccountFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
public class OrderAccountServiceImpl implements OrderAccountService {
    private static Logger LOGGER = LoggerFactory.getLogger(OrderAccountServiceImpl.class);
    @Autowired
    private OrderAccountMapper OrderAccountMapper;
    @Autowired
    private AttachmentService attachmentService;

    @Override
    public Long insert(OrderAccountSaveRequest insertRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        // 组织订单数据
        OrderAccount OrderAccount = OrderAccountFactory.OrderAccount(insertRequest);
        OrderAccount.setCreateTime(new Date());
        OrderAccount.setCreateUserId(userInfo.getId());
        int insertNum = OrderAccountMapper.insert(OrderAccount);
        if (insertNum == 0) {
            throw new Exception("数据库操作失败");
        }
        Long OrderAccountId = OrderAccount.getId();

        // 对象附件操作
        List<AttachmentInfo> attachments = insertRequest.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            int attachmentInsertNum = attachmentService.insert(AttachmentTargetObjEnum.ORDER_ACCOUNT, OrderAccountId, attachments);
            if (attachments.size() != attachmentInsertNum) {
                LOGGER.info("attachmentInsertNum : {} - {}", attachmentInsertNum, JSON.toJSONString(insertRequest));
                throw new Exception("订单附件数据操作失败");
            }
        }

        return OrderAccountId;
    }

    @Override
    public void update(Long id, OrderAccountSaveRequest updateRequest) throws Exception {
        // 获取当前用户
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        OrderAccount OrderAccount = OrderAccountMapper.selectByPrimaryKey(id);
        if (OrderAccount == null) {
            throw new Exception("对象唯一标识错误");
        }

        Long OrderAccountId = OrderAccount.getId();
        // 修改基本信息
        OrderAccount OrderAccountSelective = OrderAccountFactory.OrderAccount(updateRequest);
        OrderAccountSelective.setId(OrderAccountId);
        OrderAccountSelective.setUpdateTime(new Date());
        OrderAccountSelective.setUpdateUserId(userInfo.getId());

        OrderAccountMapper.updateByPrimaryKeySelective(OrderAccountSelective);

        // 对象附件
        List<AttachmentInfo> attachments = updateRequest.getAttachments();
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        int attachmentUpdateNum = attachmentService.insertOnDuplicateIdUpdate(AttachmentTargetObjEnum.ORDER_ACCOUNT, OrderAccountId, attachments);
        if (attachments.size() != attachmentUpdateNum) {
            LOGGER.info("attachmentUpdateNum : {} - {}", attachmentUpdateNum, JSON.toJSONString(updateRequest));
            throw new Exception("对象附件数据操作失败");
        }
    }

    @Override
    public Pager<OrderAccountListResponse> list(OrderAccountQueryRequest queryRequest) {
        // 分页
        PageHelper.startPage(queryRequest.getPageNum(), queryRequest.getPageSize());

        OrderAccountExample example = new OrderAccountExample();
        example.setOrderByClause("id desc");
        OrderAccountExample.Criteria criteria = example.createCriteria();
        // 未删除
        criteria.andDeleteFlagEqualTo(Boolean.FALSE);

        List<OrderAccount> OrderAccounts = OrderAccountMapper.selectByExample(example);

        List<OrderAccountListResponse> OrderAccountListResponses = new ArrayList<>();
        for (OrderAccount OrderAccount : OrderAccounts) {
            OrderAccountListResponse OrderAccountListResponse = OrderAccountFactory.OrderAccountListResponse(OrderAccount);
            OrderAccountListResponses.add(OrderAccountListResponse);
        }
        // 输出
        Page<OrderAccount> page = (Page) OrderAccounts;
        Pager<OrderAccountListResponse> pager = new Pager<>(page.getPageNum(), page.getPageSize()
                , page.getPages(), page.getTotal(), OrderAccountListResponses);
        return pager;
    }

    @Override
    public OrderAccountDetailResponse detail(Long id) throws Exception {
        // 准备数据
        OrderAccount OrderAccount = OrderAccountMapper.selectByPrimaryKey(id);
        if (OrderAccount == null) {
            throw new Exception("对象信息不存在");
        }
        // 附件
        List<AttachmentInfo> attachmentInfos = attachmentService.list(AttachmentTargetObjEnum.ORDER_ACCOUNT, id);

        // 组织数据
        OrderAccountDetailResponse detail = OrderAccountFactory.OrderAccountDetailResponse(OrderAccount);
        detail.setAttachments(attachmentInfos);

        return detail;
    }
}

