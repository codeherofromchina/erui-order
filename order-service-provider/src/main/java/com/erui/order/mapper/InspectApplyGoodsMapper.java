package com.erui.order.mapper;

import com.erui.order.model.entity.InspectApplyGoods;
import com.erui.order.model.entity.InspectApplyGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectApplyGoodsMapper {
    int countByExample(InspectApplyGoodsExample example);

    int deleteByExample(InspectApplyGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectApplyGoods record);

    int insertSelective(InspectApplyGoods record);

    List<InspectApplyGoods> selectByExample(InspectApplyGoodsExample example);

    InspectApplyGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectApplyGoods record, @Param("example") InspectApplyGoodsExample example);

    int updateByExample(@Param("record") InspectApplyGoods record, @Param("example") InspectApplyGoodsExample example);

    int updateByPrimaryKeySelective(InspectApplyGoods record);

    int updateByPrimaryKey(InspectApplyGoods record);
}