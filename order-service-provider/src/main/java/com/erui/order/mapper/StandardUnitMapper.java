package com.erui.order.mapper;

import com.erui.order.model.entity.StandardUnit;
import com.erui.order.model.entity.StandardUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StandardUnitMapper {
    int countByExample(StandardUnitExample example);

    int deleteByExample(StandardUnitExample example);

    int deleteByPrimaryKey(String unitCode);

    int insert(StandardUnit record);

    int insertSelective(StandardUnit record);

    List<StandardUnit> selectByExample(StandardUnitExample example);

    StandardUnit selectByPrimaryKey(String unitCode);

    int updateByExampleSelective(@Param("record") StandardUnit record, @Param("example") StandardUnitExample example);

    int updateByExample(@Param("record") StandardUnit record, @Param("example") StandardUnitExample example);

    int updateByPrimaryKeySelective(StandardUnit record);

    int updateByPrimaryKey(StandardUnit record);
}