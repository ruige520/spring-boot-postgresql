package com.pangu.foying.web.project.admin.service.biz;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.project.admin.dto.req.*;

/**
 * @Author : 邱杭锐
 * @Date :  2019/7/17 15:50
 * @Version : 01
 * @Description : 字典详细信息业务层接口
 * @ProjectName : FoYing
 */
public interface BaseItemsDetailBiz {
    //添加单个字典详细信息
    TResponse<?> addBaseItemsDetail(ReqAddBaseItemsDetailDTO reqDto);

    //获取字典列表
    PageTResponse<?> getBaseItemsDetailListForShow(ReqItemsDetailListForShowDTO reqDto);

    //根据id获取单个字典详细信息,用于修改
    TResponse<?> getSingleBaseItemsDetailForEdit(ReqGetItemsDetailForEditDTO reqDto);

    //根据id编辑单个字典详细信息
    TResponse<?> editSingleBaseItemsDetail(ReqEditBaseItemsDetailDTO reqDto);

    //根据id删除单个字典详细详细信息
    TResponse<?> deleteSingleBaseItemsDetail(ReqEntityByIdDTO reqDto);
}
