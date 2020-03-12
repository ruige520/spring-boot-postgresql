package com.pangu.foying.commom.util;

import com.pangu.foying.commom.mapper.BaseEntityMapper;
import java.util.List;

/**
 * @Author 陈漫斌
 * @Description mapper工具类型
 * @Date 2019/11/28 11:43
 * @Modified By
 */
public final class DBMapperUtil {
    public static <Entity, Example> int countByExample(BaseEntityMapper<Entity, Example> mapper, Example example) {
        return mapper.countByExample(example);
    }

    public static <Entity, Example> int deleteByExample(BaseEntityMapper<Entity, Example> mapper, Example example) {
        return mapper.deleteByExample(example);
    }

    public static <Entity, Example> int deleteByPrimaryKey(BaseEntityMapper<Entity, Example> mapper, String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    public static <Entity, Example> int insert(BaseEntityMapper<Entity, Example> mapper, Entity record) {
        return mapper.insert(record);
    }

    public static <Entity, Example> int insertSelective(BaseEntityMapper<Entity, Example> mapper, Entity record) {
        return mapper.insertSelective(record);
    }

    public static <Entity, Example> List<Entity> selectByExample(BaseEntityMapper<Entity, Example> mapper, Example example) {
        return mapper.selectByExample(example);
    }

    public static <Entity, Example> Entity selectByPrimaryKey(BaseEntityMapper<Entity, Example> mapper, String id) {
        return mapper.selectByPrimaryKey(id);
    }

    public static <Entity, Example> int updateByExampleSelective(BaseEntityMapper<Entity, Example> mapper, Entity record, Example example) {
        return mapper.updateByExampleSelective(record, example);
    }

    public static <Entity, Example> int updateByExample(BaseEntityMapper<Entity, Example> mapper, Entity record, Example example) {
        return mapper.updateByExample(record, example);
    }

    public static <Entity, Example> int updateByPrimaryKeySelective(BaseEntityMapper<Entity, Example> mapper, Entity record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    public static <Entity, Example> int updateByPrimaryKey(BaseEntityMapper<Entity, Example> mapper, Entity record) {
        return mapper.updateByPrimaryKey(record);
    }

    public static <Entity, Example> List<Entity> selectByExampleByPage(BaseEntityMapper<Entity, Example> mapper, Example example) {
        return mapper.selectByExampleByPage(example);
    }
}
