package com.erui.order.mapper;

import com.erui.order.model.entity.DeliverConsignPayment;
import com.erui.order.model.entity.DeliverConsignPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverConsignPaymentMapper {
    int countByExample(DeliverConsignPaymentExample example);

    int deleteByExample(DeliverConsignPaymentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeliverConsignPayment record);

    int insertSelective(DeliverConsignPayment record);

    List<DeliverConsignPayment> selectByExample(DeliverConsignPaymentExample example);

    DeliverConsignPayment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeliverConsignPayment record, @Param("example") DeliverConsignPaymentExample example);

    int updateByExample(@Param("record") DeliverConsignPayment record, @Param("example") DeliverConsignPaymentExample example);

    int updateByPrimaryKeySelective(DeliverConsignPayment record);

    int updateByPrimaryKey(DeliverConsignPayment record);
}