package com.erui.order.mapper;

import com.erui.order.model.entity.PurchContractSimple;
import com.erui.order.model.entity.PurchContractSimpleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchContractSimpleMapper {
    int countByExample(PurchContractSimpleExample example);

    int deleteByExample(PurchContractSimpleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PurchContractSimple record);

    int insertSelective(PurchContractSimple record);

    List<PurchContractSimple> selectByExample(PurchContractSimpleExample example);

    PurchContractSimple selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurchContractSimple record, @Param("example") PurchContractSimpleExample example);

    int updateByExample(@Param("record") PurchContractSimple record, @Param("example") PurchContractSimpleExample example);

    int updateByPrimaryKeySelective(PurchContractSimple record);

    int updateByPrimaryKey(PurchContractSimple record);
}