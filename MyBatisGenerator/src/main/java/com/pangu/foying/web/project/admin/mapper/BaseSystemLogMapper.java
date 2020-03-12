package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.web.project.admin.entity.BaseSystemLog;
import com.pangu.foying.web.project.admin.entity.BaseSystemLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseSystemLogMapper {
    int countByExample(BaseSystemLogExample example);

    int deleteByExample(BaseSystemLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseSystemLog record);

    int insertSelective(BaseSystemLog record);

    List<BaseSystemLog> selectByExample(BaseSystemLogExample example);

    BaseSystemLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseSystemLog record, @Param("example") BaseSystemLogExample example);

    int updateByExample(@Param("record") BaseSystemLog record, @Param("example") BaseSystemLogExample example);

    int updateByPrimaryKeySelective(BaseSystemLog record);

    int updateByPrimaryKey(BaseSystemLog record);
}