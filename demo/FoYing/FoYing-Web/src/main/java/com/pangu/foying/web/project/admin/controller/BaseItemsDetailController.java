package com.pangu.foying.web.project.admin.controller;

import com.pangu.foying.commom.annotation.PGLog;
import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.pgenum.AccessModeEnum;
import com.pangu.foying.commom.pgenum.ActionEnum;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.commom.util.MessageUtils;
import com.pangu.foying.web.project.admin.dto.req.*;
import com.pangu.foying.web.project.admin.service.biz.BaseItemsDetailBiz;
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
 * @Date :  2018/12/12 15:17
 * @Version : 01
 * @Description : 字典详情控制类
 * @ProjectName : pangu-cms
 */
@Controller
@RequestMapping("/foying/web/admin/BaseItemsDetail")
public class BaseItemsDetailController extends BaseWebAdminController {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(BaseItemsDetailController.class);
    @Autowired
    private BaseItemsDetailBiz baseItemsDetailBiz;

    /**
     * @Author : 邱杭锐
     * @Date : 2018/12/12 16:56
     * @Version : 01
     * @Description : 该方法用于添加单个字典详情数据
     * @param : [reqDto, errors]
     * @return : com.pangu.cms.commom.wrapper.response.TResponse<?>
     */
    @RequiresPermissions("BaseItemsDetail:add:addBaseItemsDetail")
    @RequestMapping(value = "/addBaseItemsDetail",method = RequestMethod.POST)
    @PGLog(businessModule = "字典详情模块", actionType = ActionEnum.add, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> addBaseItemsDetail(@Validated @RequestBody ReqAddBaseItemsDetailDTO reqDto, BindingResult errors) {
        TResponse<?> response = null;
        try {
            if (errors.hasErrors()) {
                return TResponse.error(errorMsg(errors));
            }
            response = baseItemsDetailBiz.addBaseItemsDetail(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2018/12/12 16:59
     * @Version : 01
     * @Description : 用于前台展示
     * @param : [reqDto, errors]
     * @return : com.pangu.cms.commom.wrapper.response.PageTResponse<?>
     */
    @RequiresPermissions("BaseItemsDetail:list:getBaseItemsDetailListForShow")
    @RequestMapping(value = "/getBaseItemsDetailListForShow",method = RequestMethod.POST)
    @ResponseBody
    public PageTResponse<?> getBaseItemsDetailListForShow(@Validated ReqItemsDetailListForShowDTO reqDto, BindingResult errors) {
        PageTResponse<?> response = null;
        try {
            if (errors.hasErrors()) {
                return PageTResponse.error(errorMsg(errors));
            }
            response = baseItemsDetailBiz.getBaseItemsDetailListForShow(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = PageTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2018/12/12 17:01
     * @Version : 01
     * @Description : 获取单个字典详情，用于前台修改
     * @param : [reqDto, errors]
     * @return : com.pangu.cms.commom.wrapper.response.TResponse<?>
     */
    @RequiresPermissions("BaseItemsDetail:view:getSingleBaseItemsDetailForEdit")
    @RequestMapping(value = "/getSingleBaseItemsDetailForEdit",method = RequestMethod.POST)
    @ResponseBody
    public TResponse<?> getSingleBaseItemsDetailForEdit(@Validated @RequestBody ReqGetItemsDetailForEditDTO reqDto, BindingResult errors) {
        TResponse<?> response = null;
        try {
            if (errors.hasErrors()) {
                return TResponse.error(errorMsg(errors));
            }
            response = baseItemsDetailBiz.getSingleBaseItemsDetailForEdit(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2018/12/12 17:03
     * @Version : 01
     * @Description : 修改单个字典详情
     * @param : [reqDto, errors]
     * @return : com.pangu.cms.commom.wrapper.response.TResponse<?>
     */
    @RequiresPermissions("BaseItemsDetail:update:editSingleBaseItemsDetail")
    @RequestMapping(value = "/editSingleBaseItemsDetail",method = RequestMethod.POST)
    @PGLog(businessModule = "字典详情模块", actionType = ActionEnum.update, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> editSingleBaseItemsDetail(@Validated @RequestBody ReqEditBaseItemsDetailDTO reqDto, BindingResult errors) {
        TResponse<?> response = null;
        try {
            if (errors.hasErrors()) {
                return TResponse.error(errorMsg(errors));
            }
            response = baseItemsDetailBiz.editSingleBaseItemsDetail(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2018/12/12 17:05
     * @Version : 01
     * @Description : 删除单个字典详情
     * @param : [reqDto, errors]
     * @return : com.pangu.cms.commom.wrapper.response.TResponse<?>
     */
    @RequiresPermissions("BaseItemsDetail:delete:deleteSingleBaseItemsDetail")
    @RequestMapping(value = "/deleteSingleBaseItemsDetail",method = RequestMethod.POST)
    @PGLog(businessModule = "字典详情模块", actionType = ActionEnum.delete, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> deleteSingleBaseItemsDetail(@Validated @RequestBody ReqEntityByIdDTO reqDto, BindingResult errors) {
        TResponse<?> response = null;
        try {
            if (errors.hasErrors()) {
                return TResponse.error(errorMsg(errors));
            }
            response = baseItemsDetailBiz.deleteSingleBaseItemsDetail(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

}
