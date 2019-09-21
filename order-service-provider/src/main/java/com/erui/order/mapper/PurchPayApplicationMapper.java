package com.erui.order.mapper;

import com.erui.order.model.entity.PurchPayApplication;
import com.erui.order.model.entity.PurchPayApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchPayApplicationMapper {
    int countByExample(PurchPayApplicationExample example);

    int deleteByExample(PurchPayApplicationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PurchPayApplication record);

    int insertSelective(PurchPayApplication record);

    List<PurchPayApplication> selectByExampleWithBLOBs(PurchPayApplicationExample example);

    List<PurchPayApplication> selectByExample(PurchPayApplicationExample example);

    PurchPayApplication selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurchPayApplication record, @Param("example") PurchPayApplicationExample example);

    int updateByExampleWithBLOBs(@Param("record") PurchPayApplication record, @Param("example") PurchPayApplicationExample example);

    int updateByExample(@Param("record") PurchPayApplication record, @Param("example") PurchPayApplicationExample example);

    int updateByPrimaryKeySelective(PurchPayApplication record);

    int updateByPrimaryKeyWithBLOBs(PurchPayApplication record);

    int updateByPrimaryKey(PurchPayApplication record);
}