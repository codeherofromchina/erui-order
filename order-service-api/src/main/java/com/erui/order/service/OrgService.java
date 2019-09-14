package com.erui.order.service;

import com.erui.order.common.pojo.OrgInfo;
import com.erui.order.common.pojo.request.OrgListQueryRequest;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/9/13 下午10:19
 */
public interface OrgService {

    /**
     * 根据ID查找事业部名称
     * @param id
     * @return
     */
    String findOrgNameById(Long id);

    /**
     * 查找用户的事业部
     *
     * @param userId
     * @return
     */
    List<OrgInfo> findByUserId(Long userId);

    /**
     * 查询所有易瑞事业部
     * @return
     */
    List<OrgInfo> listAll(OrgListQueryRequest queryRequest);

}
