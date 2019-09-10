package com.erui.order.mapper;

import com.erui.order.model.entity.DeliverConsign;
import com.erui.order.model.entity.DeliverConsignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverConsignMapper {
    int countByExample(DeliverConsignExample example);

    int deleteByExample(DeliverConsignExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeliverConsign record);

    int insertSelective(DeliverConsign record);

    List<DeliverConsign> selectByExample(DeliverConsignExample example);

    DeliverConsign selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeliverConsign record, @Param("example") DeliverConsignExample example);

    int updateByExample(@Param("record") DeliverConsign record, @Param("example") DeliverConsignExample example);

    int updateByPrimaryKeySelective(DeliverConsign record);

    int updateByPrimaryKey(DeliverConsign record);
}