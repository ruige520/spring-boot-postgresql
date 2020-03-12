package com.pangu.foying.web.project.admin.controller;

import com.pangu.foying.commom.annotation.PGLog;
import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.dto.req.ReqEntityByIdsDTO;
import com.pangu.foying.commom.dto.req.ReqPaginationDTO;
import com.pangu.foying.commom.pgenum.AccessModeEnum;
import com.pangu.foying.commom.pgenum.ActionEnum;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.commom.util.MessageUtils;
import com.pangu.foying.web.project.admin.dto.req.ReqAddBaseRoleDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqUpdateBaseNavigationRoleDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqUpdateBaseRoleDTO;
import com.pangu.foying.web.project.admin.service.biz.BaseRoleBiz;
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
 * @Date 2019/7/18 16:54
 * @Modified By
 */
@Controller
@RequestMapping("/foying/web/admin/BaseRole")
public class BaseRoleController extends BaseWebAdminController {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(BaseRoleController.class);
    @Autowired
    private BaseRoleBiz baseRoleBiz;

    //添加角色
    @RequiresPermissions("BaseRole:add:addBaseRole")
    @RequestMapping(value = "/addBaseRole", method = RequestMethod.POST)
    @PGLog(businessModule = "角色模块", actionType = ActionEnum.add, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> addBaseRole(@Validated @RequestBody ReqAddBaseRoleDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseRoleBiz.addBaseRole(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //分页获取角色列表
    @RequiresPermissions("BaseRole:list:getBaseRoleByPage")
    @RequestMapping(value = "/getBaseRoleByPage", method = RequestMethod.POST)
    @ResponseBody
    public PageTResponse<?> getBaseRoleByPage(@Validated ReqPaginationDTO dto, BindingResult errors){
        PageTResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return PageTResponse.error(errorMsg(errors));
            }
            response = baseRoleBiz.getBaseRoleByPage(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = PageTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //获取单个角色
    @RequiresPermissions("BaseRole:view:getBaseRole")
    @RequestMapping(value = "/getBaseRole", method = RequestMethod.POST)
    @ResponseBody
    public TResponse<?> getBaseRole(@Validated @RequestBody ReqEntityByIdDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseRoleBiz.getBaseRole(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //修改单个角色信息
    @RequiresPermissions("BaseRole:update:updateBaseRole")
    @RequestMapping(value = "/updateBaseRole", method = RequestMethod.POST)
    @PGLog(businessModule = "角色模块", actionType = ActionEnum.update, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> updateBaseRole(@Validated @RequestBody ReqUpdateBaseRoleDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseRoleBiz.updateBaseRole(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //删除角色
    @RequiresPermissions("BaseRole:delete:deleteBaseRole")
    @RequestMapping(value = "/deleteBaseRole", method = RequestMethod.POST)
    @PGLog(businessModule = "角色模块", actionType = ActionEnum.delete, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> deleteBaseRole(@Validated @RequestBody ReqEntityByIdsDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseRoleBiz.deleteBaseRole(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //获取所有角色列表
    @RequestMapping(value = "/getAllBaseRole", method = RequestMethod.POST)
    @ResponseBody
    public ListTResponse<?> getAllBaseRole(){
        ListTResponse<?> response = null;
        try {
            response = baseRoleBiz.getAllBaseRole();
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = ListTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //修改导航栏角色关系
    @RequiresPermissions("BaseRole:update:updateBaseNavigationRole")
    @RequestMapping(value = "/updateBaseNavigationRole", method = RequestMethod.POST)
    @PGLog(businessModule = "角色模块", actionType = ActionEnum.update, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> updateBaseNavigationRole(@Validated @RequestBody ReqUpdateBaseNavigationRoleDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseRoleBiz.updateBaseNavigationRole(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //获取导航栏列表用于角色添加
    @RequestMapping(value = "/getNavForRoleAdd", method = RequestMethod.POST)
    @ResponseBody
    public ListTResponse<?> getNavForRoleAdd(){
        ListTResponse<?> response = null;
        try {
            response = baseRoleBiz.getNavForRoleAdd();
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = ListTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    // 获取导航栏列表用于角色绑定导航栏
    @RequestMapping(value = "/getNavForRoleEdit", method = RequestMethod.POST)
    @ResponseBody
    public ListTResponse<?> getNavForRoleEdit(@Validated @RequestBody ReqEntityByIdDTO dto, BindingResult errors){
        ListTResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return ListTResponse.error(errorMsg(errors));
            }
            response = baseRoleBiz.getNavForRoleEdit(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = ListTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }
}
