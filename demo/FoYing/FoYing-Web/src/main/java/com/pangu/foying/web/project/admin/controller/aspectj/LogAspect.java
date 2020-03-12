package com.pangu.foying.web.project.admin.controller.aspectj;

import com.alibaba.fastjson.JSONObject;
import com.pangu.foying.commom.annotation.PGLog;
import com.pangu.foying.commom.pgenum.ActionEnum;
import com.pangu.foying.commom.pgenum.SystemEnum;
import com.pangu.foying.commom.pgenum.SystemLogStatus;
import com.pangu.foying.commom.util.ServletUtils;
import com.pangu.foying.commom.wrapper.response.ResponseBase;
import com.pangu.foying.web.project.admin.entity.BaseSystemLog;
import com.pangu.foying.web.project.admin.service.biz.BaseSystemLogBiz;
import com.pangu.foying.web.project.admin.util.SetPGEntityFieldUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 陈漫斌
 * @Description 日志记录切面
 * @Date 2019/8/2 9:41
 * @Modified By
 */
@Aspect
@Component
public class LogAspect {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(LogAspect.class);

    @Autowired
    private BaseSystemLogBiz baseSystemLogBiz;//系统日志服务类

    // 配置织入点
    @Pointcut("@annotation(com.pangu.foying.commom.annotation.PGLog)")
    public void logPointCut() { }

    /**
     * @Description 切面
     * @author 陈漫斌
     * @date 2019/1/14 15:43
     * @param joinPoint 织入点
     * @param retValue 方法返回值
     * @Modified By
     */
    @AfterReturning(pointcut = "logPointCut()", returning = "retValue")
    public void afterReturning(JoinPoint joinPoint, Object retValue) {
        try {
            BaseSystemLog entity = new BaseSystemLog();
            PGLog pgLog = getAnnotationLog(joinPoint);
            if (pgLog == null) {
                return;
            }
            entity.setAccessmode(pgLog.accessMode().getDescribe());//接口访问方式
            entity.setBusinessmodule(pgLog.businessModule());//系统模块
            entity.setActiontype(pgLog.actionType().getDescribe());//操作类型
            HttpServletRequest request = ServletUtils.getRequest();
            if (request != null) {
                entity.setHostip(request.getRemoteAddr());//主机IP
                entity.setOperurl(request.getRequestURI());//请求地址
            }
            Object[] args = joinPoint.getArgs();
            if (args != null && args.length > 0
                    && !ActionEnum.Login.equals(pgLog.actionType())) {
                List<Object> list = new ArrayList<>(args.length);
                for (Object arg : args) {
                    if (arg instanceof BindingResult) {
                        continue;
                    }
                    list.add(arg);
                }
                entity.setOperparams(JSONObject.toJSONString(list));//请求参数
            }
            if (retValue != null) {
                entity.setOperresult(JSONObject.toJSONString(retValue));//访问结果
                if (retValue instanceof ResponseBase) {
                    ResponseBase responseBase = (ResponseBase) retValue;
                    if (SystemEnum.SUCCESS.get_ResCode().equals(responseBase.get_ResCode())) {
                        entity.setStatus(SystemLogStatus.SUCCESS.getDescribe());//状态
                    } else {
                        entity.setStatus(SystemLogStatus.FAIL.getDescribe());//状态
                    }
                } else {
                    entity.setStatus(SystemLogStatus.UNKNOWN.getDescribe());//状态
                }
            }
            SetPGEntityFieldUtil.setAddMethod(entity, "系统id","系统name");
            baseSystemLogBiz.addSystemLogs(entity);
        } catch (Exception e) {
            LOG.error("系统日志切面出错", e);
        }
    }

    /**
     * 是否存在注解，如果存在就获取
     */
    private PGLog getAnnotationLog(JoinPoint joinPoint) throws Exception {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        if (methodSignature == null) {
            return null;
        }
        Method method = methodSignature.getMethod();
        if (method != null) {
            return method.getAnnotation(PGLog.class);
        }
        return null;
    }
}
