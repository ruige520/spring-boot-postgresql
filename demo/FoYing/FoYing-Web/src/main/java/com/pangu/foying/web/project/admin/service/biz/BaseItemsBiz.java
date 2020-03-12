package com.pangu.foying.web.project.admin.service.biz;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.project.admin.dto.req.ReqAddBaseItemsDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqEditBaseItemsDTO; /**
 * @Author : 邱杭锐
 * @Date :  2019/7/18 9:08
 * @Version : 01
 * @Description :
 * @ProjectName : FoYing
 */
public interface BaseItemsBiz {
    //添加字典信息
    TResponse<?> addBaseItems(ReqAddBaseItemsDTO dto);

    //获取单个字典信息
    TResponse<?> getBaseItemsForAdd(ReqEntityByIdDTO dto);

    //用于前台左边下拉展示
    ListTResponse<?> getBaseItemsListForLeftShow();

    //获取单个字典信息,用于前端修改
    TResponse<?> getSingleBaseItemsForEdit(ReqEntityByIdDTO reqDto);

    //用于前台弹窗展示
    PageTResponse<?> getBaseItemsListForShow();

    //修改单个字典信息
    TResponse<?> editSingleBaseItems(ReqEditBaseItemsDTO reqDto);

    //根据字典信息id,删除单个字典信息
    TResponse<?> deleteSingleBaseItems(ReqEntityByIdDTO reqDto);
}
