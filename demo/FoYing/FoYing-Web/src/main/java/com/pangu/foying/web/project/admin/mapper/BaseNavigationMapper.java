package com.pangu.foying.web.project.admin.mapper;
import com.pangu.foying.commom.mapper.BaseEntityMapper;
import com.pangu.foying.web.project.admin.entity.BaseNavigation;
import com.pangu.foying.web.project.admin.entity.BaseNavigationExample;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BaseNavigationMapper extends BaseEntityMapper<BaseNavigation, BaseNavigationExample> {

    List<BaseNavigation> selectAll();

    @Select("select * from Base_Navigation bn where bn.deleteMark = '0' and bn.Islock = '0' and bn.navigationType in ('dir','page') order by bn.sortCode asc, bn.addTime asc")
    List<BaseNavigation> selectBaseNavigation();

    List<BaseNavigation>  selectBaseNavigationByIDs(List list);
}