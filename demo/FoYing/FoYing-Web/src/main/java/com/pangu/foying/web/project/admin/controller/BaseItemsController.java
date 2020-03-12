package com.pangu.foying.web.project.admin.controller;

import com.pangu.foying.commom.annotation.PGLog;
import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.pgenum.AccessModeEnum;
import com.pangu.foying.commom.pgenum.ActionEnum;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.commom.util.MessageUtils;
import com.pangu.foying.web.project.admin.dto.req.ReqAddBaseItemsDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqEditBaseItemsDTO;
import com.pangu.foying.web.project.admin.service.biz.BaseItemsBiz;
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
 * @Author : 邱杭锐
 * @Date :  2018/12/11 16:01
 * @Version : 01
 * @Description : 字典信息控制类
 * @ProjectName : pangu-cms
 */
@Controller
@RequestMapping("/foying/web/admin/BaseItems")
public class BaseItemsController extends BaseWebAdminController {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(BaseItemsController.class);

    @Autowired
    private BaseItemsBiz baseItemsBiz;

    /**
     * @Author : 邱杭锐
     * @Date : 2018/12/12 10:19
     * @Version : 01
     * @Description : 添加字典信息
     * @param : [dto, errors]
     * @return : com.pangu.cms.commom.wrapper.response.TResponse<?>
     */
    @RequiresPermissions("BaseItems:add:addBaseBaseItems")
    @RequestMapping(value = "/addBaseBaseItems", method = RequestMethod.POST)
    @PGLog(businessModule = "字典信息模块", actionType = ActionEnum.add, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> addBaseBaseItems(@Validated @RequestBody ReqAddBaseItemsDTO dto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            response = baseItemsBiz.addBaseItems(dto);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2018/12/12 10:30
     * @Version : 01
     * @Description : 获取单个字典信息
     * @param : [dto, errors]
     * @return : com.pangu.cms.commom.wrapper.response.TResponse<?>
     */
    @RequiresPermissions("BaseItems:view:getBaseItemsForAdd")
    @RequestMapping(value = "/getBaseItemsForAdd",method = RequestMethod.POST)
    @ResponseBody
    public TResponse<?> getBaseItemsForAdd(@Validated @RequestBody ReqEntityByIdDTO dto, BindingResult errors) {
        TResponse<?> response = null;
        try{
            if (errors.hasErrors()) {
                return TResponse.error(errorMsg(errors));
            }
            response = baseItemsBiz.getBaseItemsForAdd(dto);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2018/12/12 10:34
     * @Version : 01
     * @Description : 用于前台左边下拉展示
     * @param : []
     * @return : com.pangu.cms.commom.wrapper.response.ListTResponse<?>
     */
    @RequiresPermissions("BaseItems:list:getBaseItemsListForLeftShow")
    @RequestMapping(value = "/getBaseItemsListForLeftShow",method = RequestMethod.POST)
    @ResponseBody
    public ListTResponse<?> getBaseItemsListForLeftShow(){
        ListTResponse<?> response = null;
        try {
            response = baseItemsBiz.getBaseItemsListForLeftShow();
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = ListTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2018/12/12 10:40
     * @Version : 01
     * @Description : 获取单个字典信息,用于前端修改
     * @param : [reqDto, errors]
     * @return : com.pangu.cms.commom.wrapper.response.TResponse<?>
     */
    @RequiresPermissions("BaseItems:view:getSingleBaseItemsForEdit")
    @RequestMapping(value = "/getSingleBaseItemsForEdit",method = RequestMethod.POST)
    @ResponseBody
    public TResponse<?> getSingleBaseItemsForEdit(@Validated @RequestBody ReqEntityByIdDTO reqDto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if (errors.hasErrors()) {
                return TResponse.error(errorMsg(errors));
            }
            response = baseItemsBiz.getSingleBaseItemsForEdit(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2018/12/12 10:51
     * @Version : 01
     * @Description : 用于前台弹窗展示
     * @param : []
     * @return : com.pangu.cms.commom.wrapper.response.PageTResponse<?>
     */
    @RequiresPermissions("BaseItems:list:getBaseItemsListForShow")
    @RequestMapping(value = "/getBaseItemsListForShow",method = RequestMethod.POST)
    @ResponseBody
    public PageTResponse<?> getBaseItemsListForShow(){
        PageTResponse<?> response = null;
        try {
            response = baseItemsBiz.getBaseItemsListForShow();
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = PageTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2018/12/12 10:58
     * @Version : 01
     * @Description : 修改单个字典信息
     * @param : [reqDto, errors]
     * @return : com.pangu.cms.commom.wrapper.response.TResponse<?>
     */
    @RequiresPermissions("BaseItems:update:editSingleBaseItems")
    @RequestMapping(value = "/editSingleBaseItems",method = RequestMethod.POST)
    @PGLog(businessModule = "字典信息模块", actionType = ActionEnum.update, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> editSingleBaseItems(@Validated @RequestBody ReqEditBaseItemsDTO reqDto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if (errors.hasErrors()) {
                return TResponse.error(errorMsg(errors));
            }
            response = baseItemsBiz.editSingleBaseItems(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2018/12/12 11:01
     * @Version : 01
     * @Description : 根据字典信息id,删除单个字典信息
     * @param : [reqDto, errors]
     * @return : com.pangu.cms.commom.wrapper.response.TResponse<?>
     */
    @RequiresPermissions("BaseItems:delete:deleteSingleBaseItems")
    @RequestMapping(value = "/deleteSingleBaseItems",method = RequestMethod.POST)
    @PGLog(businessModule = "字典信息模块", actionType = ActionEnum.delete, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> deleteSingleBaseItems(@Validated @RequestBody ReqEntityByIdDTO reqDto, BindingResult errors){
        TResponse<?> response = null;
        try {
            if (errors.hasErrors()) {
                return TResponse.error(errorMsg(errors));
            }
            response = baseItemsBiz.deleteSingleBaseItems(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }


}
