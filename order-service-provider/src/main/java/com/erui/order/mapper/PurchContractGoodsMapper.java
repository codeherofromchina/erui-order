package com.erui.order.mapper;

import com.erui.order.model.entity.PurchContractGoods;
import com.erui.order.model.entity.PurchContractGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchContractGoodsMapper {
    int countByExample(PurchContractGoodsExample example);

    int deleteByExample(PurchContractGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PurchContractGoods record);

    int insertSelective(PurchContractGoods record);

    List<PurchContractGoods> selectByExample(PurchContractGoodsExample example);

    PurchContractGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PurchContractGoods record, @Param("example") PurchContractGoodsExample example);

    int updateByExample(@Param("record") PurchContractGoods record, @Param("example") PurchContractGoodsExample example);

    int updateByPrimaryKeySelective(PurchContractGoods record);

    int updateByPrimaryKey(PurchContractGoods record);
}