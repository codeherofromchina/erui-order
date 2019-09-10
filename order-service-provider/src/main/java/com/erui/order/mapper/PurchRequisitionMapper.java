package com.erui.order.mapper;

import com.erui.order.model.entity.PurchRequisition;
import com.erui.order.model.entity.PurchRequisitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchRequisitionMapper {
    int countByExample(PurchRequisitionExample example);

    int deleteByExample(PurchRequisitionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PurchRequisition record);

    int insertSelective(PurchRequisition record);

    List<PurchRequisition> selectByExample(PurchRequisitionExample example);

    PurchRequisition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurchRequisition record, @Param("example") PurchRequisitionExample example);

    int updateByExample(@Param("record") PurchRequisition record, @Param("example") PurchRequisitionExample example);

    int updateByPrimaryKeySelective(PurchRequisition record);

    int updateByPrimaryKey(PurchRequisition record);
}