package com.erui.order.mapper;

import com.erui.order.model.entity.Port;
import com.erui.order.model.entity.PortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PortMapper {
    int countByExample(PortExample example);

    int deleteByExample(PortExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Port record);

    int insertSelective(Port record);

    List<Port> selectByExample(PortExample example);

    Port selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Port record, @Param("example") PortExample example);

    int updateByExample(@Param("record") Port record, @Param("example") PortExample example);

    int updateByPrimaryKeySelective(Port record);

    int updateByPrimaryKey(Port record);
}