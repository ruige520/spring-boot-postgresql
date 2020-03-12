package com.pangu.foying.commom.controller.advice;

import com.pangu.foying.commom.pgenum.SystemEnum;
import com.pangu.foying.commom.wrapper.response.ResponseBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/6/13 10:43
 * @Modified By
 */
@ControllerAdvice
public class CommomControllerAdvice {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(CommomControllerAdvice.class);

    //上传异常拦截
    @ResponseBody
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseBase handleUploadException(MaxUploadSizeExceededException e){
        LOG.error("上传异常", e);
        return new ResponseBase(SystemEnum.ERROR.get_ResCode(),"上传异常");
    }
    //异常拦截
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResponseBase handleShiroException(Exception e){
        LOG.error("访问异常", e);
        return new ResponseBase(SystemEnum.ERROR.get_ResCode(),"访问异常");
    }
}
