package com.pangu.foying.web.project.admin.controller;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.web.commom.util.MessageUtils;
import com.pangu.foying.web.project.admin.service.biz.BaseAreaBiz;
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

import java.util.Date;
import java.util.List;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/15 10:42
 * @Modified By
 */
@Controller
@RequestMapping("/foying/web/admin/BaseArea")
public class BaseAreaController extends BaseWebAdminController {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(BaseAreaController.class);

    @Autowired
    private BaseAreaBiz baseAreaBiz;

    //返回 省一级 的地区信息列表
    @RequestMapping(value = "/getProvinceBaseAreaList", method = RequestMethod.POST)
    @ResponseBody
    public ListTResponse<?> getProvinceBaseAreaList(){
        ListTResponse<?> response = null;
        try {
            response = baseAreaBiz.getProvinceBaseAreaList();
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = ListTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    //根据父节点编号 返回下一级的地区信息列表
    @RequestMapping(value = "/getSubAreaByLevelForDown", method = RequestMethod.POST)
    @ResponseBody
    public ListTResponse<?> getSubAreaByLevelForDown(@Validated @RequestBody ReqEntityByIdDTO dto, BindingResult errors){
        ListTResponse<?> response = null;
        try {
            if(errors.hasErrors()){
                return ListTResponse.error(errorMsg(errors));
            }
            response = baseAreaBiz.getSubAreaByLevelForDown(dto);
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = ListTResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }
}
