package com.pangu.foying.web.project.admin.controller;

import com.pangu.foying.commom.annotation.PGLog;
import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.pgenum.AccessModeEnum;
import com.pangu.foying.commom.pgenum.ActionEnum;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.commom.util.MessageUtils;
import com.pangu.foying.web.project.admin.dto.req.ReqAddBaseOrganizeDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqEditBaseOrganizeDTO;
import com.pangu.foying.web.project.admin.service.biz.BaseOrganizeBiz;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : 蔡茂诚
 * @Date : 2019/7/17 15:49
 * @Version : 01
 * @Description :
 * @param :
 * @return :
 */
@Controller
@RequestMapping("/foying/web/admin/BaseOrganize")
public class BaseOrganizeController extends BaseWebAdminController{
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(BaseOrganizeController.class);
    //private static final Logger sys_user_logger = LoggerFactory.getLogger("sys-user");

    @SuppressWarnings("ALL")
    @Autowired
    private BaseOrganizeBiz baseOrganizeBiz;

    /**
     * 该方法用于添加单个组织机构数据
     */
    @RequiresPermissions("BaseOrganize:add:addBaseOrganize")
    @RequestMapping(value = "/addBaseOrganize", method = RequestMethod.POST)
    @PGLog(businessModule = "组织机构模块", actionType = ActionEnum.add, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    TResponse<?> addBaseOrganize(@Validated @RequestBody ReqAddBaseOrganizeDTO reqDto, BindingResult errors){
        TResponse<?> response;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseOrganizeBiz.addBaseOrganize(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * 该方法返回组织机构列表,用于添加机构时下拉选择父机构
     */
    //@RequiresPermissions("BaseOrganize:list:getBaseOrganizeListForAdd")
    @RequestMapping(value = "/getBaseOrganizeListForAdd", method = RequestMethod.POST)
    @ResponseBody
    ListTResponse<?> getBaseOrganizeListForAdd(){
        ListTResponse<?> response;
        try {
            response = baseOrganizeBiz.getBaseOrganizeListForAdd();
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = ListTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * 前台展示机构列表
     */
    @RequiresPermissions("BaseOrganize:list:getBaseOrganizeListForShow")
    @RequestMapping(value = "/getBaseOrganizeListForShow", method = RequestMethod.POST)
    @ResponseBody
    ListTResponse<?> getBaseOrganizeListForShow(){
        ListTResponse<?> response;
        try {
            response = baseOrganizeBiz.getBaseOrganizeListForShow();
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = ListTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * 获取单个组织机构信息，用于前台修改
     */
    @RequiresPermissions("BaseOrganize:view:getSingleBaseOrganizeForEdit")
    @RequestMapping(value = "/getSingleBaseOrganizeForEdit", method = RequestMethod.POST)
    @ResponseBody
    TResponse<?> getSingleBaseOrganizeForEdit(@Validated @RequestBody ReqEntityByIdDTO reqDto , BindingResult errors){
        TResponse<?> response;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseOrganizeBiz.getSingleBaseOrganizeForEdit(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            return TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * 修改组织机构
     */
    @RequiresPermissions("BaseOrganize:update:editBaseOrganize")
    @RequestMapping(value = "/editBaseOrganize", method = RequestMethod.POST)
    @PGLog(businessModule = "组织机构模块", actionType = ActionEnum.update, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    TResponse<?> editBaseOrganize(@Validated @RequestBody ReqEditBaseOrganizeDTO reqDto, BindingResult errors){
        TResponse<?> response;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseOrganizeBiz.editBaseOrganize(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * 根据组织机构id,删除单个组织机构
     */
    @RequiresPermissions("BaseOrganize:delete:deleteSingleBaseOrganize")
    @RequestMapping(value = "/deleteSingleBaseOrganize", method = RequestMethod.POST)
    @PGLog(businessModule = "组织机构模块", actionType = ActionEnum.delete, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    TResponse<?> deleteSingleBaseOrganize(@Validated @RequestBody ReqEntityByIdDTO reqDto, BindingResult errors){
        TResponse<?> response;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseOrganizeBiz.deleteSingleBaseOrganize(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }


}
