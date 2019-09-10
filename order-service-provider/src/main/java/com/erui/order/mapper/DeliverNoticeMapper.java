package com.erui.order.mapper;

import com.erui.order.model.entity.DeliverNotice;
import com.erui.order.model.entity.DeliverNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliverNoticeMapper {
    int countByExample(DeliverNoticeExample example);

    int deleteByExample(DeliverNoticeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DeliverNotice record);

    int insertSelective(DeliverNotice record);

    List<DeliverNotice> selectByExample(DeliverNoticeExample example);

    DeliverNotice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DeliverNotice record, @Param("example") DeliverNoticeExample example);

    int updateByExample(@Param("record") DeliverNotice record, @Param("example") DeliverNoticeExample example);

    int updateByPrimaryKeySelective(DeliverNotice record);

    int updateByPrimaryKey(DeliverNotice record);
}