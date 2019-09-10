package com.erui.order.mapper;

import com.erui.order.model.entity.LogisticsData;
import com.erui.order.model.entity.LogisticsDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsDataMapper {
    int countByExample(LogisticsDataExample example);

    int deleteByExample(LogisticsDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LogisticsData record);

    int insertSelective(LogisticsData record);

    List<LogisticsData> selectByExample(LogisticsDataExample example);

    LogisticsData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LogisticsData record, @Param("example") LogisticsDataExample example);

    int updateByExample(@Param("record") LogisticsData record, @Param("example") LogisticsDataExample example);

    int updateByPrimaryKeySelective(LogisticsData record);

    int updateByPrimaryKey(LogisticsData record);
}