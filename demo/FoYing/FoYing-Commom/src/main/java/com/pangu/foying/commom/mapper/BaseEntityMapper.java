package com.pangu.foying.commom.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 陈漫斌
 * @Description mybatis 通用Mapper
 * @Date 2019/11/28 9:34
 * @Modified By
 */
public interface BaseEntityMapper<Entity, Example> {
    //根据条件统计
    int countByExample(Example example);

    //根据条件删除
    int deleteByExample(Example example);

    //根据主键删除
    int deleteByPrimaryKey(String id);

    //插入
    int insert(Entity record);

    //非空插入
    int insertSelective(Entity record);

    //根据条件查询
    List<Entity> selectByExample(Example example);

    //根据主键查询
    Entity selectByPrimaryKey(String id);

    //根据条件非空修改
    int updateByExampleSelective(@Param("record") Entity record, @Param("example") Example example);

    //根据条件修改
    int updateByExample(@Param("record") Entity record, @Param("example") Example example);

    //根据主键非空修改
    int updateByPrimaryKeySelective(Entity record);

    //根据主键修改
    int updateByPrimaryKey(Entity record);

    //根据条件分页查询
    List<Entity> selectByExampleByPage(Example example);
}
