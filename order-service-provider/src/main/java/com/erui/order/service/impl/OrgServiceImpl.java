package com.erui.order.service.impl;

import com.erui.order.common.pojo.OrgInfo;
import com.erui.order.common.pojo.request.OrgListQueryRequest;
import com.erui.order.mapper.OrgMapper;
import com.erui.order.mapper.OrgUserMapper;
import com.erui.order.model.entity.Org;
import com.erui.order.model.entity.OrgExample;
import com.erui.order.model.entity.OrgUserExample;
import com.erui.order.model.entity.OrgUserKey;
import com.erui.order.service.OrgService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther 王晓丹
 * @Date 2019/9/13 下午10:19
 */
@Service
@Transactional
public class OrgServiceImpl implements OrgService {
    @Autowired
    private OrgMapper orgMapper;
    @Autowired
    private OrgUserMapper orgUserMapper;

    @Override
    public String findOrgNameById(Long id) {
        Org org = orgMapper.selectByPrimaryKey(id);
        if (org != null) {
            return org.getOrgName();
        }
        return null;
    }


    @Override
    public List<OrgInfo> findByUserId(Long userId) {
        List<OrgInfo> orgInfoList = new ArrayList<>();
        OrgUserExample orgUserExample = new OrgUserExample();
        orgUserExample.createCriteria().andUserIdEqualTo(userId);
        List<OrgUserKey> orgUserKeys = orgUserMapper.selectByExample(orgUserExample);
        if (orgUserKeys != null && orgUserKeys.size() > 0) {
            List<Long> orgIds = orgUserKeys.stream().map(OrgUserKey::getOrgId).collect(Collectors.toList());
            OrgExample example = new OrgExample();
            example.createCriteria().andIdIn(orgIds);
            List<Org> orgs = orgMapper.selectByExample(example);
            for (Org org : orgs) {
                orgInfoList.add(orgInfo(org));
            }
        }
        return orgInfoList;
    }

    @Override
    public List<OrgInfo> listAll(OrgListQueryRequest queryRequest) {
        List<OrgInfo> orgInfoList = new ArrayList<>();
        OrgExample example = new OrgExample();
        List<String> orgNodes = new ArrayList<>();
        orgNodes.add("eub");
        orgNodes.add("ub");
        orgNodes.add("erui");
        OrgExample.Criteria criteria = example.createCriteria().andParentIdEqualTo(0L).andDeletedFlagEqualTo("N")
                .andOrgNodeIn(orgNodes);
        if (StringUtils.isNotBlank(queryRequest.getOrgName())) {
            criteria.andOrgNameLike("%" + queryRequest.getOrgName() + "%");
        }
        List<Org> orgs = orgMapper.selectByExample(example);
        for (Org org : orgs) {
            orgInfoList.add(orgInfo(org));
        }
        return orgInfoList;
    }

    private OrgInfo orgInfo(Org org) {
        OrgInfo orgInfo = new OrgInfo();
        orgInfo.setId(org.getId());
        orgInfo.setOrgName(org.getOrgName());
        return orgInfo;
    }
}
