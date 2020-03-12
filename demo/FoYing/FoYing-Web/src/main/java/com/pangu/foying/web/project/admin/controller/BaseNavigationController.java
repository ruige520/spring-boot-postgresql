package com.pangu.foying.web.project.admin.controller;

import com.pangu.foying.commom.annotation.PGLog;
import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.pgenum.AccessModeEnum;
import com.pangu.foying.commom.pgenum.ActionEnum;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.commom.util.MessageUtils;
import com.pangu.foying.web.project.admin.dto.req.ReqAddBaseNavigationDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqUpdateBaseNavigationDTO;
import com.pangu.foying.web.project.admin.service.biz.BaseNavigationBiz;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author : 蔡茂诚
 * @Date : 2019/7/18 9:26
 * @Version : 01
 * @Description :
 * @param :
 * @return :
 */
@Controller
@RequestMapping("/foying/web/admin/BaseNavigation")
public class BaseNavigationController extends BaseWebAdminController{
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(BaseNavigationController.class);

    @Autowired
    private BaseNavigationBiz baseNavigationBiz;

    /**
     * 获取左侧导航栏
     */
    @PostMapping(value = "/getNavListForLeft")
    @ResponseBody
    public ListTResponse<?> getNavListForLeft(){
        ListTResponse<?> response = null;
        try {
            response = baseNavigationBiz.getNavListForLeft();
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = ListTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * 该方法用于查询所有的后台导航数据，并放回一个List集合
     */
    @RequiresPermissions("BaseNavigation:list:getAllBaseNavigation")
    @RequestMapping(value = "/getAllBaseNavigation", method = RequestMethod.POST)
    @ResponseBody
    ListTResponse<?> getAllBaseNavigation() {
        ListTResponse<?> response;
        try {
            response = baseNavigationBiz.getAllBaseNavigation();
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = ListTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * 该方法根据id查询数据库单个后台导航数据，并返回该导航数据
     */
    @RequiresPermissions("BaseNavigation:view:getBaseNavigation")
    @RequestMapping(value = "/getBaseNavigation", method = RequestMethod.POST)
    @ResponseBody
    TResponse<?> getBaseNavigation(@Validated @RequestBody ReqEntityByIdDTO reqDTO, BindingResult errors) {
        TResponse<?> response;
        try {
            if (errors.hasErrors()) {
                return TResponse.error(errorMsg(errors));
            }
            response = baseNavigationBiz.getBaseNavigation(reqDTO);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * 改方法用于添加单个后台导航数据
     */
    @RequiresPermissions("BaseNavigation:add:addBaseNavigation")
    @RequestMapping(value = "/addBaseNavigation", method = RequestMethod.POST)
    @PGLog(businessModule = "后台导航模块", actionType = ActionEnum.add, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    TResponse<?> addBaseNavigation(@Validated @RequestBody ReqAddBaseNavigationDTO reqDTO, BindingResult errors) {
        TResponse<?> response;
        try {
            if (errors.hasErrors()) {
                return TResponse.error(errorMsg(errors));
            }
            response = baseNavigationBiz.addBaseNavigation(reqDTO);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * 该方法用于修改单个后台导航数据
     */
    @RequiresPermissions("BaseNavigation:update:updateBaseNavigation")
    @RequestMapping(value = "/updateBaseNavigation", method = RequestMethod.POST)
    @PGLog(businessModule = "后台导航模块", actionType = ActionEnum.update, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    TResponse<?> updateBaseNavigation(@Validated @RequestBody ReqUpdateBaseNavigationDTO reqDTO, BindingResult errors) {
        TResponse<?> response;
        try {
            if (errors.hasErrors()) {
                return TResponse.error(errorMsg(errors));
            }
            response = baseNavigationBiz.updateBaseNavigation(reqDTO);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * 该方法用于删除单个后台导航数据
     * 该方法实际上使用的是修改命令，并不是真的从数据库上删除改条数据，而是添加了删除时间、删除标记、删除人信息等删除信息
     */
    @RequiresPermissions("BaseNavigation:delete:deleteBaseNavigation")
    @RequestMapping(value = "/deleteBaseNavigation", method = RequestMethod.POST)
    @PGLog(businessModule = "后台导航模块", actionType = ActionEnum.delete, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    TResponse<?> deleteBaseNavigation(@Validated @RequestBody ReqEntityByIdDTO reqDTO, BindingResult errors) {
        TResponse<?> response;
        try {
            if (errors.hasErrors()) {
                return TResponse.error(errorMsg(errors));
            }
            response = baseNavigationBiz.deleteBaseNavigation(reqDTO);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * 上传自定义图片
     */
    @RequiresPermissions("BaseNavigation:update:getCustomIconUpload")
    @RequestMapping(value = "/getCustomIconUpload", method = RequestMethod.POST)
    @ResponseBody
    TResponse<?> getCustomIconUpload(HttpServletRequest request, @RequestParam MultipartFile imgFile){
        TResponse<?> response;
        try {
            response = baseNavigationBiz.getCustomIconUpload(request, imgFile);
        } catch (Exception e) {
            LOG.error("访问异常",e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }
}
