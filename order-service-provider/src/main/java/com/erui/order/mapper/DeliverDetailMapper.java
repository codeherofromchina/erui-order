package com.erui.order.mapper;

import com.erui.order.model.entity.DeliverDetail;
import com.erui.order.model.entity.DeliverDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverDetailMapper {
    int countByExample(DeliverDetailExample example);

    int deleteByExample(DeliverDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeliverDetail record);

    int insertSelective(DeliverDetail record);

    List<DeliverDetail> selectByExample(DeliverDetailExample example);

    DeliverDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeliverDetail record, @Param("example") DeliverDetailExample example);

    int updateByExample(@Param("record") DeliverDetail record, @Param("example") DeliverDetailExample example);

    int updateByPrimaryKeySelective(DeliverDetail record);

    int updateByPrimaryKey(DeliverDetail record);
}