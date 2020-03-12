package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.web.project.admin.entity.BaseRole;
import com.pangu.foying.web.project.admin.entity.BaseRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseRoleMapper {
    int countByExample(BaseRoleExample example);

    int deleteByExample(BaseRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseRole record);

    int insertSelective(BaseRole record);

    List<BaseRole> selectByExample(BaseRoleExample example);

    BaseRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseRole record, @Param("example") BaseRoleExample example);

    int updateByExample(@Param("record") BaseRole record, @Param("example") BaseRoleExample example);

    int updateByPrimaryKeySelective(BaseRole record);

    int updateByPrimaryKey(BaseRole record);
}