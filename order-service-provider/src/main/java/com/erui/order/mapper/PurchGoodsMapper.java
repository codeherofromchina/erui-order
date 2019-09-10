package com.erui.order.mapper;

import com.erui.order.model.entity.PurchGoods;
import com.erui.order.model.entity.PurchGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchGoodsMapper {
    int countByExample(PurchGoodsExample example);

    int deleteByExample(PurchGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PurchGoods record);

    int insertSelective(PurchGoods record);

    List<PurchGoods> selectByExample(PurchGoodsExample example);

    PurchGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurchGoods record, @Param("example") PurchGoodsExample example);

    int updateByExample(@Param("record") PurchGoods record, @Param("example") PurchGoodsExample example);

    int updateByPrimaryKeySelective(PurchGoods record);

    int updateByPrimaryKey(PurchGoods record);
}