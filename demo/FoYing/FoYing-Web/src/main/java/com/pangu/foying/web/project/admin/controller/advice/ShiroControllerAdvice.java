package com.pangu.foying.web.project.admin.controller.advice;

import com.pangu.foying.commom.pgenum.ActionEnum;
import com.pangu.foying.commom.pgenum.SystemEnum;
import com.pangu.foying.commom.wrapper.response.ResponseBase;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2018/12/17 10:26
 * @Modified By
 */
@ControllerAdvice
public class ShiroControllerAdvice {
    //权限异常拦截
    @ResponseBody
    @ExceptionHandler(UnauthorizedException.class)
    public ResponseBase handleShiroException(UnauthorizedException e){
        String msg = e.getMessage();
        for (ActionEnum item : ActionEnum.values()) {
            if (msg.contains(":" + item.name().toLowerCase() + ":")) {
                return new ResponseBase(SystemEnum.UNAUTHORIZED.get_ResCode(),"无" + item.getDescribe() + "权限");
            }
        }
        return new ResponseBase(SystemEnum.UNAUTHORIZED.get_ResCode(),"无权限");
    }
}
