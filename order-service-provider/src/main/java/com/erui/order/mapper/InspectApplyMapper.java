package com.erui.order.mapper;

import com.erui.order.model.entity.InspectApply;
import com.erui.order.model.entity.InspectApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectApplyMapper {
    int countByExample(InspectApplyExample example);

    int deleteByExample(InspectApplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectApply record);

    int insertSelective(InspectApply record);

    List<InspectApply> selectByExample(InspectApplyExample example);

    InspectApply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectApply record, @Param("example") InspectApplyExample example);

    int updateByExample(@Param("record") InspectApply record, @Param("example") InspectApplyExample example);

    int updateByPrimaryKeySelective(InspectApply record);

    int updateByPrimaryKey(InspectApply record);
}