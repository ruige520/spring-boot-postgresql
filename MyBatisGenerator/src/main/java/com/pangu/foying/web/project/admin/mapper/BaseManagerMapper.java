package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.web.project.admin.entity.BaseManager;
import com.pangu.foying.web.project.admin.entity.BaseManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseManagerMapper {
    int countByExample(BaseManagerExample example);

    int deleteByExample(BaseManagerExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseManager record);

    int insertSelective(BaseManager record);

    List<BaseManager> selectByExample(BaseManagerExample example);

    BaseManager selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseManager record, @Param("example") BaseManagerExample example);

    int updateByExample(@Param("record") BaseManager record, @Param("example") BaseManagerExample example);

    int updateByPrimaryKeySelective(BaseManager record);

    int updateByPrimaryKey(BaseManager record);
}