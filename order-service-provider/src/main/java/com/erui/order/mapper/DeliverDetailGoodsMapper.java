package com.erui.order.mapper;

import com.erui.order.model.entity.DeliverDetailGoods;
import com.erui.order.model.entity.DeliverDetailGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverDetailGoodsMapper {
    int countByExample(DeliverDetailGoodsExample example);

    int deleteByExample(DeliverDetailGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeliverDetailGoods record);

    int insertSelective(DeliverDetailGoods record);

    List<DeliverDetailGoods> selectByExample(DeliverDetailGoodsExample example);

    DeliverDetailGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeliverDetailGoods record, @Param("example") DeliverDetailGoodsExample example);

    int updateByExample(@Param("record") DeliverDetailGoods record, @Param("example") DeliverDetailGoodsExample example);

    int updateByPrimaryKeySelective(DeliverDetailGoods record);

    int updateByPrimaryKey(DeliverDetailGoods record);
}