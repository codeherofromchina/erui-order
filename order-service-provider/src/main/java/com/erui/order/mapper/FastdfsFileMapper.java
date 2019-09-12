package com.erui.order.mapper;

import com.erui.order.model.entity.FastdfsFile;
import com.erui.order.model.entity.FastdfsFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FastdfsFileMapper {
    int countByExample(FastdfsFileExample example);

    int deleteByExample(FastdfsFileExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FastdfsFile record);

    int insertSelective(FastdfsFile record);

    List<FastdfsFile> selectByExample(FastdfsFileExample example);

    FastdfsFile selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FastdfsFile record, @Param("example") FastdfsFileExample example);

    int updateByExample(@Param("record") FastdfsFile record, @Param("example") FastdfsFileExample example);

    int updateByPrimaryKeySelective(FastdfsFile record);

    int updateByPrimaryKey(FastdfsFile record);
}