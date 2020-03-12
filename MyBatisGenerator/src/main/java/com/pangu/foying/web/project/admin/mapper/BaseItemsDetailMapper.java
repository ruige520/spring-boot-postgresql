package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.web.project.admin.entity.BaseItemsDetail;
import com.pangu.foying.web.project.admin.entity.BaseItemsDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseItemsDetailMapper {
    int countByExample(BaseItemsDetailExample example);

    int deleteByExample(BaseItemsDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(BaseItemsDetail record);

    int insertSelective(BaseItemsDetail record);

    List<BaseItemsDetail> selectByExample(BaseItemsDetailExample example);

    BaseItemsDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BaseItemsDetail record, @Param("example") BaseItemsDetailExample example);

    int updateByExample(@Param("record") BaseItemsDetail record, @Param("example") BaseItemsDetailExample example);

    int updateByPrimaryKeySelective(BaseItemsDetail record);

    int updateByPrimaryKey(BaseItemsDetail record);
}