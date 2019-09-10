package com.erui.order.mapper;

import com.erui.order.model.entity.DeliverConsignBookingSpace;
import com.erui.order.model.entity.DeliverConsignBookingSpaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverConsignBookingSpaceMapper {
    int countByExample(DeliverConsignBookingSpaceExample example);

    int deleteByExample(DeliverConsignBookingSpaceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeliverConsignBookingSpace record);

    int insertSelective(DeliverConsignBookingSpace record);

    List<DeliverConsignBookingSpace> selectByExample(DeliverConsignBookingSpaceExample example);

    DeliverConsignBookingSpace selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeliverConsignBookingSpace record, @Param("example") DeliverConsignBookingSpaceExample example);

    int updateByExample(@Param("record") DeliverConsignBookingSpace record, @Param("example") DeliverConsignBookingSpaceExample example);

    int updateByPrimaryKeySelective(DeliverConsignBookingSpace record);

    int updateByPrimaryKey(DeliverConsignBookingSpace record);
}