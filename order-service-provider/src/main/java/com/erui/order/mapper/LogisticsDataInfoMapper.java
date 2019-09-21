package com.erui.order.mapper;

import com.erui.order.model.entity.LogisticsDataInfo;
import com.erui.order.model.entity.LogisticsDataInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogisticsDataInfoMapper {
    int countByExample(LogisticsDataInfoExample example);

    int deleteByExample(LogisticsDataInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LogisticsDataInfo record);

    int insertSelective(LogisticsDataInfo record);

    List<LogisticsDataInfo> selectByExample(LogisticsDataInfoExample example);

    LogisticsDataInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LogisticsDataInfo record, @Param("example") LogisticsDataInfoExample example);

    int updateByExample(@Param("record") LogisticsDataInfo record, @Param("example") LogisticsDataInfoExample example);

    int updateByPrimaryKeySelective(LogisticsDataInfo record);

    int updateByPrimaryKey(LogisticsDataInfo record);
}