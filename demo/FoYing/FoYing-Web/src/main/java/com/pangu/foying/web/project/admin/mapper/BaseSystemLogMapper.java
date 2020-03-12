package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.commom.mapper.BaseEntityMapper;
import com.pangu.foying.web.project.admin.entity.BaseSystemLog;
import com.pangu.foying.web.project.admin.entity.BaseSystemLogExample;
import java.util.List;

public interface BaseSystemLogMapper extends BaseEntityMapper<BaseSystemLog, BaseSystemLogExample> {
    int batchInsert(List<BaseSystemLog> list);
}