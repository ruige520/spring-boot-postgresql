package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.web.project.admin.entity.BaseItems;
import com.pangu.foying.web.project.admin.entity.BaseItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseItemsMapper {
    int countByExample(BaseItemsExample example);

    int deleteByExample(BaseItemsExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseItems record);

    int insertSelective(BaseItems record);

    List<BaseItems> selectByExample(BaseItemsExample example);

    BaseItems selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseItems record, @Param("example") BaseItemsExample example);

    int updateByExample(@Param("record") BaseItems record, @Param("example") BaseItemsExample example);

    int updateByPrimaryKeySelective(BaseItems record);

    int updateByPrimaryKey(BaseItems record);
}