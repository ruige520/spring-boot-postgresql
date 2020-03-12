package com.pangu.foying.web.project.admin.controller;

import com.pangu.foying.commom.annotation.PGLog;
import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.dto.req.ReqEntityByIdsDTO;
import com.pangu.foying.commom.dto.req.ReqPaginationDTO;
import com.pangu.foying.commom.pgenum.AccessModeEnum;
import com.pangu.foying.commom.pgenum.ActionEnum;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.commom.util.MessageUtils;
import com.pangu.foying.web.project.admin.dto.req.*;
import com.pangu.foying.web.project.admin.service.biz.BaseManagerBiz;
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
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/17 15:58
 * @Modified By
 */
@Controller
@RequestMapping("/foying/web/admin/BaseManager")
public class BaseManagerController extends BaseWebAdminController {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(BaseManagerController.class);
    @Autowired
    private BaseManagerBiz baseManagerBiz;

    //添加管理员
    @RequiresPermissions("BaseManager:add:addBaseManager")
    @RequestMapping(value = "/addBaseManager", method = RequestMethod.POST)
    @PGLog(businessModule = "管理员模块", actionType = ActionEnum.add, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> addBaseManager(@Validated @RequestBody ReqAddBaseManagerDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseManagerBiz.addBaseManager(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //获取单个管理员
    @RequiresPermissions("BaseManager:view:getBaseManager")
    @RequestMapping(value = "/getBaseManager", method = RequestMethod.POST)
    @ResponseBody
    public TResponse<?> getBaseManager(@Validated @RequestBody ReqEntityByIdDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseManagerBiz.getBaseManager(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //修改单个管理员信息
    @RequiresPermissions("BaseManager:update:updateBaseManager")
    @RequestMapping(value = "/updateBaseManager", method = RequestMethod.POST)
    @PGLog(businessModule = "管理员模块", actionType = ActionEnum.update, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> updateBaseManager(@Validated @RequestBody ReqUpdateBaseManagerDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseManagerBiz.updateBaseManager(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //是否禁用管理员
    @RequiresPermissions("BaseManager:update:lockBaseManager")
    @RequestMapping(value = "/lockBaseManager", method = RequestMethod.POST)
    @PGLog(businessModule = "管理员模块", actionType = ActionEnum.update, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> lockBaseManager(@Validated @RequestBody ReqLockBaseManagerDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseManagerBiz.lockBaseManager(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //管理员绑定角色
    @RequiresPermissions("BaseManager:update:updateBaseManagerRole")
    @RequestMapping(value = "/updateBaseManagerRole", method = RequestMethod.POST)
    @PGLog(businessModule = "管理员模块", actionType = ActionEnum.update, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> updateBaseManagerRole(@Validated @RequestBody ReqUpdateBaseManagerRoleDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseManagerBiz.updateBaseManagerRole(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //删除管理员
    @RequiresPermissions("BaseManager:delete:deleteBaseManager")
    @RequestMapping(value = "/deleteBaseManager", method = RequestMethod.POST)
    @PGLog(businessModule = "管理员模块", actionType = ActionEnum.update, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> deleteBaseManager(@Validated @RequestBody ReqEntityByIdsDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseManagerBiz.deleteBaseManager(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //分页获取管理员列表
    @RequiresPermissions("BaseManager:list:getBaseManagerByPage")
    @RequestMapping(value = "/getBaseManagerByPage", method = RequestMethod.POST)
    @ResponseBody
    public PageTResponse<?> getBaseManagerByPage(@Validated ReqPaginationDTO dto, BindingResult errors){
        PageTResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return PageTResponse.error(errorMsg(errors));
            }
            response = baseManagerBiz.getBaseManagerByPage(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = PageTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //修改管理员密码
    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    @ResponseBody
    public TResponse<?> updatePassword(@Validated @RequestBody ReqUpdatePasswordDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseManagerBiz.updatePassword(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }
}
