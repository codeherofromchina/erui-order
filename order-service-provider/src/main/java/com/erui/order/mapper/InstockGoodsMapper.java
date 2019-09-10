package com.erui.order.mapper;

import com.erui.order.model.entity.InstockGoods;
import com.erui.order.model.entity.InstockGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstockGoodsMapper {
    int countByExample(InstockGoodsExample example);

    int deleteByExample(InstockGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InstockGoods record);

    int insertSelective(InstockGoods record);

    List<InstockGoods> selectByExample(InstockGoodsExample example);

    InstockGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InstockGoods record, @Param("example") InstockGoodsExample example);

    int updateByExample(@Param("record") InstockGoods record, @Param("example") InstockGoodsExample example);

    int updateByPrimaryKeySelective(InstockGoods record);

    int updateByPrimaryKey(InstockGoods record);
}