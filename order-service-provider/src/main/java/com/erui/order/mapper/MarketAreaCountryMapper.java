package com.erui.order.mapper;

import com.erui.order.model.entity.MarketAreaCountry;
import com.erui.order.model.entity.MarketAreaCountryExample;
import com.erui.order.model.entity.MarketAreaCountryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketAreaCountryMapper {
    int countByExample(MarketAreaCountryExample example);

    int deleteByExample(MarketAreaCountryExample example);

    int deleteByPrimaryKey(MarketAreaCountryKey key);

    int insert(MarketAreaCountry record);

    int insertSelective(MarketAreaCountry record);

    List<MarketAreaCountry> selectByExample(MarketAreaCountryExample example);

    MarketAreaCountry selectByPrimaryKey(MarketAreaCountryKey key);

    int updateByExampleSelective(@Param("record") MarketAreaCountry record, @Param("example") MarketAreaCountryExample example);

    int updateByExample(@Param("record") MarketAreaCountry record, @Param("example") MarketAreaCountryExample example);

    int updateByPrimaryKeySelective(MarketAreaCountry record);

    int updateByPrimaryKey(MarketAreaCountry record);
}