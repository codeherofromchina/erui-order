package com.erui.order.mapper;

import com.erui.order.model.entity.PurchContract;
import com.erui.order.model.entity.PurchContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchContractMapper {
    int countByExample(PurchContractExample example);

    int deleteByExample(PurchContractExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PurchContract record);

    int insertSelective(PurchContract record);

    List<PurchContract> selectByExample(PurchContractExample example);

    PurchContract selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurchContract record, @Param("example") PurchContractExample example);

    int updateByExample(@Param("record") PurchContract record, @Param("example") PurchContractExample example);

    int updateByPrimaryKeySelective(PurchContract record);

    int updateByPrimaryKey(PurchContract record);
}