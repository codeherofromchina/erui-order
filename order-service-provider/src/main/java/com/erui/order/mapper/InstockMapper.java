package com.erui.order.mapper;

import com.erui.order.model.entity.Instock;
import com.erui.order.model.entity.InstockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstockMapper {
    int countByExample(InstockExample example);

    int deleteByExample(InstockExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Instock record);

    int insertSelective(Instock record);

    List<Instock> selectByExample(InstockExample example);

    Instock selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Instock record, @Param("example") InstockExample example);

    int updateByExample(@Param("record") Instock record, @Param("example") InstockExample example);

    int updateByPrimaryKeySelective(Instock record);

    int updateByPrimaryKey(Instock record);
}