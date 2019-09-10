package com.erui.order.mapper;

import com.erui.order.model.entity.PurchPayment;
import com.erui.order.model.entity.PurchPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchPaymentMapper {
    int countByExample(PurchPaymentExample example);

    int deleteByExample(PurchPaymentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PurchPayment record);

    int insertSelective(PurchPayment record);

    List<PurchPayment> selectByExample(PurchPaymentExample example);

    PurchPayment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurchPayment record, @Param("example") PurchPaymentExample example);

    int updateByExample(@Param("record") PurchPayment record, @Param("example") PurchPaymentExample example);

    int updateByPrimaryKeySelective(PurchPayment record);

    int updateByPrimaryKey(PurchPayment record);
}