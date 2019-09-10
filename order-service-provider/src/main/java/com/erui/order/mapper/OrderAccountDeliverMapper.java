package com.erui.order.mapper;

import com.erui.order.model.entity.OrderAccountDeliver;
import com.erui.order.model.entity.OrderAccountDeliverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderAccountDeliverMapper {
    int countByExample(OrderAccountDeliverExample example);

    int deleteByExample(OrderAccountDeliverExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderAccountDeliver record);

    int insertSelective(OrderAccountDeliver record);

    List<OrderAccountDeliver> selectByExample(OrderAccountDeliverExample example);

    OrderAccountDeliver selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderAccountDeliver record, @Param("example") OrderAccountDeliverExample example);

    int updateByExample(@Param("record") OrderAccountDeliver record, @Param("example") OrderAccountDeliverExample example);

    int updateByPrimaryKeySelective(OrderAccountDeliver record);

    int updateByPrimaryKey(OrderAccountDeliver record);
}