package com.erui.order.service.impl;

import com.erui.order.common.pojo.ProjectProfitInfo;
import com.erui.order.common.pojo.UserInfo;
import com.erui.order.common.util.ThreadLocalUtil;
import com.erui.order.mapper.ProjectProfitMapper;
import com.erui.order.model.entity.ProjectProfit;
import com.erui.order.model.entity.ProjectProfitExample;
import com.erui.order.service.CountryService;
import com.erui.order.service.ProjectProfitService;
import com.erui.order.service.util.ProjectProfitFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ProjectProfitServiceImpl implements ProjectProfitService {
    private static Logger LOGGER = LoggerFactory.getLogger(ProjectProfitServiceImpl.class);
    @Autowired
    private ProjectProfitMapper projectProfitMapper;
    @Autowired
    private CountryService countryService;

    @Override
    public int insertOnDuplicateProjectIdUpdate(Long projectId, ProjectProfitInfo projectProfitInfo) throws Exception {
        if (projectId == null) {
            throw new Exception("项目标识错误");
        }
        ProjectProfit projectProfit = findByProjectId02(projectId);
        int updateNum = 0;
        if (projectProfit == null) {
            updateNum += insert(projectId, projectProfitInfo);
        } else {
            // 更新操作
            updateNum += updateByProjectId(projectId, projectProfitInfo);
        }
        return updateNum;
    }


    @Override
    public int insert(Long projectId, ProjectProfitInfo projectProfitInfo) throws Exception {
        ProjectProfit projectProfit = ProjectProfitFactory.projectProfit(projectProfitInfo);
        if (projectProfit == null) {
            throw new Exception("项目利润为空");
        }
        projectProfit.setId(null);
        projectProfit.setProjectId(projectId);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            projectProfit.setCreateUserId(userInfo.getId());
        }

        projectProfit.setCreateTime(new Date());
        projectProfit.setDeleteFlag(Boolean.FALSE);
        return projectProfitMapper.insert(projectProfit);
    }

    @Override
    public int updateByProjectId(Long projectId, ProjectProfitInfo projectProfitInfo) throws Exception {
        ProjectProfit projectProfitSelective = ProjectProfitFactory.projectProfit(projectProfitInfo);
        if (projectProfitSelective == null) {
            throw new Exception("项目利润为空");
        }

        projectProfitSelective.setId(null);
        UserInfo userInfo = ThreadLocalUtil.getUserInfo();
        if (userInfo != null) {
            projectProfitSelective.setUpdateUserId(userInfo.getId());
        }
        projectProfitSelective.setUpdateTime(new Date());

        ProjectProfitExample example = new ProjectProfitExample();
        example.createCriteria().andProjectIdEqualTo(projectId);
        return projectProfitMapper.updateByExampleSelective(projectProfitSelective, example);
    }


    @Override
    public ProjectProfitInfo findByProjectId(Long projectId) {
        ProjectProfit projectProfit = findByProjectId02(projectId);
        if (projectProfit != null) {
            ProjectProfitInfo projectProfitInfo = ProjectProfitFactory.projectProfitInfo(projectProfit);

            projectProfitInfo.setCountryName(countryService.findCountryNameByBn(projectProfit.getCountryBn()));
            return projectProfitInfo;
        }
        return null;
    }


    private ProjectProfit findByProjectId02(Long projectId) {
        ProjectProfitExample example = new ProjectProfitExample();
        example.createCriteria().andProjectIdEqualTo(projectId);
        List<ProjectProfit> projectProfits = projectProfitMapper.selectByExample(example);
        if (projectProfits.size() > 0) {
            return projectProfits.get(0);
        }
        return null;
    }

}
