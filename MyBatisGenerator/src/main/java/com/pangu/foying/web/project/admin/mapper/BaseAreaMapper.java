package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.web.project.admin.entity.BaseArea;
import com.pangu.foying.web.project.admin.entity.BaseAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseAreaMapper {
    int countByExample(BaseAreaExample example);

    int deleteByExample(BaseAreaExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseArea record);

    int insertSelective(BaseArea record);

    List<BaseArea> selectByExample(BaseAreaExample example);

    BaseArea selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseArea record, @Param("example") BaseAreaExample example);

    int updateByExample(@Param("record") BaseArea record, @Param("example") BaseAreaExample example);

    int updateByPrimaryKeySelective(BaseArea record);

    int updateByPrimaryKey(BaseArea record);
}