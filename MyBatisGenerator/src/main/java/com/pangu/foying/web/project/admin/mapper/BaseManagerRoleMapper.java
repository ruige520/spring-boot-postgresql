package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.web.project.admin.entity.BaseManagerRole;
import com.pangu.foying.web.project.admin.entity.BaseManagerRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseManagerRoleMapper {
    int countByExample(BaseManagerRoleExample example);

    int deleteByExample(BaseManagerRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseManagerRole record);

    int insertSelective(BaseManagerRole record);

    List<BaseManagerRole> selectByExample(BaseManagerRoleExample example);

    BaseManagerRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseManagerRole record, @Param("example") BaseManagerRoleExample example);

    int updateByExample(@Param("record") BaseManagerRole record, @Param("example") BaseManagerRoleExample example);

    int updateByPrimaryKeySelective(BaseManagerRole record);

    int updateByPrimaryKey(BaseManagerRole record);
}