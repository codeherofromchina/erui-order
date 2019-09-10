package com.erui.order.mapper;

import com.erui.order.model.entity.OrderPayment;
import com.erui.order.model.entity.OrderPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPaymentMapper {
    int countByExample(OrderPaymentExample example);

    int deleteByExample(OrderPaymentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderPayment record);

    int insertSelective(OrderPayment record);

    List<OrderPayment> selectByExample(OrderPaymentExample example);

    OrderPayment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderPayment record, @Param("example") OrderPaymentExample example);

    int updateByExample(@Param("record") OrderPayment record, @Param("example") OrderPaymentExample example);

    int updateByPrimaryKeySelective(OrderPayment record);

    int updateByPrimaryKey(OrderPayment record);
}