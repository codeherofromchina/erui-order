package com.erui.order.mapper;

import com.erui.order.model.entity.PurchContractSignatories;
import com.erui.order.model.entity.PurchContractSignatoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchContractSignatoriesMapper {
    int countByExample(PurchContractSignatoriesExample example);

    int deleteByExample(PurchContractSignatoriesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PurchContractSignatories record);

    int insertSelective(PurchContractSignatories record);

    List<PurchContractSignatories> selectByExample(PurchContractSignatoriesExample example);

    PurchContractSignatories selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurchContractSignatories record, @Param("example") PurchContractSignatoriesExample example);

    int updateByExample(@Param("record") PurchContractSignatories record, @Param("example") PurchContractSignatoriesExample example);

    int updateByPrimaryKeySelective(PurchContractSignatories record);

    int updateByPrimaryKey(PurchContractSignatories record);
}