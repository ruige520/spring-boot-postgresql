package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.web.project.admin.entity.BaseNavigationRole;
import com.pangu.foying.web.project.admin.entity.BaseNavigationRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseNavigationRoleMapper {
    int countByExample(BaseNavigationRoleExample example);

    int deleteByExample(BaseNavigationRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseNavigationRole record);

    int insertSelective(BaseNavigationRole record);

    List<BaseNavigationRole> selectByExample(BaseNavigationRoleExample example);

    BaseNavigationRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseNavigationRole record, @Param("example") BaseNavigationRoleExample example);

    int updateByExample(@Param("record") BaseNavigationRole record, @Param("example") BaseNavigationRoleExample example);

    int updateByPrimaryKeySelective(BaseNavigationRole record);

    int updateByPrimaryKey(BaseNavigationRole record);
}