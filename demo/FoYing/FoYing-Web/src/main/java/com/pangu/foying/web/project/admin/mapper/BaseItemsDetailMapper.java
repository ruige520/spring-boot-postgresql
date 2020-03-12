package com.pangu.foying.web.project.admin.mapper;
import com.pangu.foying.commom.mapper.BaseEntityMapper;
import com.pangu.foying.web.project.admin.dto.req.ReqGetItemsDetailForEditDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqItemsDetailListForShowDTO;
import com.pangu.foying.web.project.admin.entity.BaseItemsDetail;
import com.pangu.foying.web.project.admin.entity.BaseItemsDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseItemsDetailMapper extends BaseEntityMapper<BaseItemsDetail, BaseItemsDetailExample> {

    List<BaseItemsDetail> getBaseItemsDetailListByBaseItemsEncode(ReqItemsDetailListForShowDTO reqDto);

    List<BaseItemsDetail> getBaseItemsDetailListByBaseItemsEncodeString(@Param("baseItemsEnCode") String baseItemsEnCode);

    BaseItemsDetail getSingleBaseItemsDetailForEdit(ReqGetItemsDetailForEditDTO reqDto);

    List<BaseItemsDetail> getBaseItemsDetailListByBaseItemsId(List<String> list);

    int batchUpdate(List<BaseItemsDetail> list);
}