package com.erui.order.mapper;

import com.erui.order.model.entity.DeliverConsignGoods;
import com.erui.order.model.entity.DeliverConsignGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverConsignGoodsMapper {
    int countByExample(DeliverConsignGoodsExample example);

    int deleteByExample(DeliverConsignGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeliverConsignGoods record);

    int insertSelective(DeliverConsignGoods record);

    List<DeliverConsignGoods> selectByExample(DeliverConsignGoodsExample example);

    DeliverConsignGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeliverConsignGoods record, @Param("example") DeliverConsignGoodsExample example);

    int updateByExample(@Param("record") DeliverConsignGoods record, @Param("example") DeliverConsignGoodsExample example);

    int updateByPrimaryKeySelective(DeliverConsignGoods record);

    int updateByPrimaryKey(DeliverConsignGoods record);
}