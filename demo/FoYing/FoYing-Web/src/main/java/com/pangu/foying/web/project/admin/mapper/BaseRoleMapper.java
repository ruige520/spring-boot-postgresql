package com.pangu.foying.web.project.admin.mapper;
import com.pangu.foying.commom.mapper.BaseEntityMapper;
import com.pangu.foying.web.project.admin.entity.BaseRole;
import com.pangu.foying.web.project.admin.entity.BaseRoleExample;
import java.util.List;

public interface BaseRoleMapper extends BaseEntityMapper<BaseRole, BaseRoleExample> {
    List<BaseRole> selectBaseRole( List list);
}