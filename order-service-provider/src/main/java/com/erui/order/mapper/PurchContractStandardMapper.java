package com.erui.order.mapper;

import com.erui.order.model.entity.PurchContractStandard;
import com.erui.order.model.entity.PurchContractStandardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchContractStandardMapper {
    int countByExample(PurchContractStandardExample example);

    int deleteByExample(PurchContractStandardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PurchContractStandard record);

    int insertSelective(PurchContractStandard record);

    List<PurchContractStandard> selectByExample(PurchContractStandardExample example);

    PurchContractStandard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurchContractStandard record, @Param("example") PurchContractStandardExample example);

    int updateByExample(@Param("record") PurchContractStandard record, @Param("example") PurchContractStandardExample example);

    int updateByPrimaryKeySelective(PurchContractStandard record);

    int updateByPrimaryKey(PurchContractStandard record);
}