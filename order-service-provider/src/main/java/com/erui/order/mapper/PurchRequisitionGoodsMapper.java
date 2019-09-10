package com.erui.order.mapper;

import com.erui.order.model.entity.PurchRequisitionGoods;
import com.erui.order.model.entity.PurchRequisitionGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchRequisitionGoodsMapper {
    int countByExample(PurchRequisitionGoodsExample example);

    int deleteByExample(PurchRequisitionGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PurchRequisitionGoods record);

    int insertSelective(PurchRequisitionGoods record);

    List<PurchRequisitionGoods> selectByExample(PurchRequisitionGoodsExample example);

    PurchRequisitionGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurchRequisitionGoods record, @Param("example") PurchRequisitionGoodsExample example);

    int updateByExample(@Param("record") PurchRequisitionGoods record, @Param("example") PurchRequisitionGoodsExample example);

    int updateByPrimaryKeySelective(PurchRequisitionGoods record);

    int updateByPrimaryKey(PurchRequisitionGoods record);
}