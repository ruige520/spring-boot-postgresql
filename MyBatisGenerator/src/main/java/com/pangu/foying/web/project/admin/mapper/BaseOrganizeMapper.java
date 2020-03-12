package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.web.project.admin.entity.BaseOrganize;
import com.pangu.foying.web.project.admin.entity.BaseOrganizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseOrganizeMapper {
    int countByExample(BaseOrganizeExample example);

    int deleteByExample(BaseOrganizeExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseOrganize record);

    int insertSelective(BaseOrganize record);

    List<BaseOrganize> selectByExample(BaseOrganizeExample example);

    BaseOrganize selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseOrganize record, @Param("example") BaseOrganizeExample example);

    int updateByExample(@Param("record") BaseOrganize record, @Param("example") BaseOrganizeExample example);

    int updateByPrimaryKeySelective(BaseOrganize record);

    int updateByPrimaryKey(BaseOrganize record);
}