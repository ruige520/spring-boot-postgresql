package com.pangu.foying.web.project.admin.mapper;
import com.pangu.foying.commom.mapper.BaseEntityMapper;
import com.pangu.foying.web.project.admin.entity.BaseItems;
import com.pangu.foying.web.project.admin.entity.BaseItemsExample;

import java.util.List;

public interface BaseItemsMapper extends BaseEntityMapper<BaseItems, BaseItemsExample> {
    int batchUpdate(List<BaseItems> list);
}