package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.web.project.admin.entity.BaseNavigation;
import com.pangu.foying.web.project.admin.entity.BaseNavigationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseNavigationMapper {
    int countByExample(BaseNavigationExample example);

    int deleteByExample(BaseNavigationExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseNavigation record);

    int insertSelective(BaseNavigation record);

    List<BaseNavigation> selectByExample(BaseNavigationExample example);

    BaseNavigation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseNavigation record, @Param("example") BaseNavigationExample example);

    int updateByExample(@Param("record") BaseNavigation record, @Param("example") BaseNavigationExample example);

    int updateByPrimaryKeySelective(BaseNavigation record);

    int updateByPrimaryKey(BaseNavigation record);
}