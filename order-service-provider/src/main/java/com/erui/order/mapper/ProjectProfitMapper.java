package com.erui.order.mapper;

import com.erui.order.model.entity.ProjectProfit;
import com.erui.order.model.entity.ProjectProfitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectProfitMapper {
    int countByExample(ProjectProfitExample example);

    int deleteByExample(ProjectProfitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectProfit record);

    int insertSelective(ProjectProfit record);

    List<ProjectProfit> selectByExample(ProjectProfitExample example);

    ProjectProfit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectProfit record, @Param("example") ProjectProfitExample example);

    int updateByExample(@Param("record") ProjectProfit record, @Param("example") ProjectProfitExample example);

    int updateByPrimaryKeySelective(ProjectProfit record);

    int updateByPrimaryKey(ProjectProfit record);
}