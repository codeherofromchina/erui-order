package com.erui.order.mapper;

import com.erui.order.model.entity.OrderAccount;
import com.erui.order.model.entity.OrderAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderAccountMapper {
    int countByExample(OrderAccountExample example);

    int deleteByExample(OrderAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderAccount record);

    int insertSelective(OrderAccount record);

    List<OrderAccount> selectByExample(OrderAccountExample example);

    OrderAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderAccount record, @Param("example") OrderAccountExample example);

    int updateByExample(@Param("record") OrderAccount record, @Param("example") OrderAccountExample example);

    int updateByPrimaryKeySelective(OrderAccount record);

    int updateByPrimaryKey(OrderAccount record);
}