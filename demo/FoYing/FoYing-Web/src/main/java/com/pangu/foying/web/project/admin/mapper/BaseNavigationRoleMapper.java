package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.commom.mapper.BaseEntityMapper;
import com.pangu.foying.web.project.admin.entity.BaseNavigationRole;
import com.pangu.foying.web.project.admin.entity.BaseNavigationRoleExample;
import java.util.List;

public interface BaseNavigationRoleMapper extends BaseEntityMapper<BaseNavigationRole, BaseNavigationRoleExample> {
    List<BaseNavigationRole> selectBaseNavigationRole (List list);
}