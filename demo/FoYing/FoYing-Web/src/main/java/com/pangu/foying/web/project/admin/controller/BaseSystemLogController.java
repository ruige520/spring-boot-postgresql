package com.pangu.foying.web.project.admin.controller;

import com.pangu.foying.commom.dto.req.ReqPaginationDTO;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.web.commom.util.MessageUtils;
import com.pangu.foying.web.project.admin.service.biz.BaseSystemLogBiz;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/19 11:10
 * @Modified By
 */
@Controller
@RequestMapping("/foying/web/admin/BaseSystemLog")
public class BaseSystemLogController extends BaseWebAdminController {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(BaseSystemLogController.class);
    @Autowired
    private BaseSystemLogBiz baseSystemLogBiz;

    //分页查询系统日志列表
    @RequiresPermissions("SystemLog:list:getBaseSystemLogByPage")
    @RequestMapping(value = "/getBaseSystemLogByPage", method = RequestMethod.POST)
    @ResponseBody
    public PageTResponse<?> getBaseSystemLogByPage(@Validated ReqPaginationDTO reqDto, BindingResult errors){
        PageTResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return PageTResponse.error(errorMsg(errors));
            }
            response = baseSystemLogBiz.getBaseSystemLogByPage(reqDto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = PageTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }
}
