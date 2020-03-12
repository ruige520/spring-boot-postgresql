package com.pangu.foying.web.project.admin.service.biz;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.project.admin.dto.req.ReqAddBaseOrganizeDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqEditBaseOrganizeDTO;

/**
 * @Author : 蔡茂诚
 * @Date : 2019/7/17 16:11
 * @Version : 01
 * @Description :
 * @param :
 * @return :
 */
public interface BaseOrganizeBiz {

    TResponse<?> getSingleBaseOrganizeForEdit(ReqEntityByIdDTO reqDto);

    TResponse<?> addBaseOrganize(ReqAddBaseOrganizeDTO reqDto);

    ListTResponse<?> getBaseOrganizeListForAdd();

    ListTResponse<?> getBaseOrganizeListForShow();

    TResponse<?> editBaseOrganize(ReqEditBaseOrganizeDTO reqDto);

     TResponse<?> deleteSingleBaseOrganize(ReqEntityByIdDTO reqDto);
}
