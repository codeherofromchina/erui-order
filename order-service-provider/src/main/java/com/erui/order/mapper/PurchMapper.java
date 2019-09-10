package com.erui.order.mapper;

import com.erui.order.model.entity.Purch;
import com.erui.order.model.entity.PurchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchMapper {
    int countByExample(PurchExample example);

    int deleteByExample(PurchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Purch record);

    int insertSelective(Purch record);

    List<Purch> selectByExample(PurchExample example);

    Purch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Purch record, @Param("example") PurchExample example);

    int updateByExample(@Param("record") Purch record, @Param("example") PurchExample example);

    int updateByPrimaryKeySelective(Purch record);

    int updateByPrimaryKey(Purch record);
}