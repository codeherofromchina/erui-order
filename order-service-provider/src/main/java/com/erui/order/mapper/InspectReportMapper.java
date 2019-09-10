package com.erui.order.mapper;

import com.erui.order.model.entity.InspectReport;
import com.erui.order.model.entity.InspectReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectReportMapper {
    int countByExample(InspectReportExample example);

    int deleteByExample(InspectReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectReport record);

    int insertSelective(InspectReport record);

    List<InspectReport> selectByExample(InspectReportExample example);

    InspectReport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectReport record, @Param("example") InspectReportExample example);

    int updateByExample(@Param("record") InspectReport record, @Param("example") InspectReportExample example);

    int updateByPrimaryKeySelective(InspectReport record);

    int updateByPrimaryKey(InspectReport record);
}