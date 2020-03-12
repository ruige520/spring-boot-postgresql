package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.web.project.admin.entity.BaseOrganizeRole;
import com.pangu.foying.web.project.admin.entity.BaseOrganizeRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseOrganizeRoleMapper {
    int countByExample(BaseOrganizeRoleExample example);

    int deleteByExample(BaseOrganizeRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseOrganizeRole record);

    int insertSelective(BaseOrganizeRole record);

    List<BaseOrganizeRole> selectByExample(BaseOrganizeRoleExample example);

    BaseOrganizeRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseOrganizeRole record, @Param("example") BaseOrganizeRoleExample example);

    int updateByExample(@Param("record") BaseOrganizeRole record, @Param("example") BaseOrganizeRoleExample example);

    int updateByPrimaryKeySelective(BaseOrganizeRole record);

    int updateByPrimaryKey(BaseOrganizeRole record);
}