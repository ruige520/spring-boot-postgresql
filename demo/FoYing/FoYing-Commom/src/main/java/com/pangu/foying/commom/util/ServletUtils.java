package com.pangu.foying.commom.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * @Author 陈漫斌
 * @Description Servlet工具类
 * @Date 2019/1/23 9:39
 * @Modified By
 */
public class ServletUtils {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(ServletUtils.class);

    public static final String CHARSET_NAME = "UTF-8";

    public static ServletRequestAttributes getRequestAttributes() {
        RequestAttributes attributes = RequestContextHolder.getRequestAttributes();
        return (ServletRequestAttributes) attributes;
    }
    /**
     * 获取原生的request
     */
    public static HttpServletRequest getRequest() {
        return getRequestAttributes().getRequest();
    }

    /**
     * 获取原生的response
     */
    public static HttpServletResponse getResponse() {
        return getRequestAttributes().getResponse();
    }

    /**
     * 获取原生的session
     */
    public static HttpSession getSession() {
        return getRequest().getSession();
    }

    /**
     * 获取请求体内容
     */
    public static String getBodyString(HttpServletRequest request) throws Exception {
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            is = request.getInputStream();
            if (is != null) {
                baos = new ByteArrayOutputStream();
                int i=-1;
                while((i = is.read())!=-1){
                    baos.write(i);
                }
                return baos.toString(CHARSET_NAME);
            }
        } catch (Exception e) {
            LOG.error("ServletUtils获取请求体内容异常", e);
            throw e;
        } finally {
            if (baos != null) {
                try {
                    baos.close();
                } catch (Exception e) {
                    LOG.error("ServletUtils关闭输出流异常", e);
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (Exception e) {
                    LOG.error("ServletUtils关闭输入流异常", e);
                }
            }
        }
        return null;
    }

    /**
     * 返回JSON
     */
    public static void outJson(HttpServletResponse response, String json) throws Exception {
        response.setContentType("application/json");
        response.setHeader("Cache-Control", "no-cache");
        response.setCharacterEncoding(CHARSET_NAME);
        PrintWriter out = null;
        try{
            //创建PrintWriter 对象 将信息写入到Reponse中
            out = response.getWriter();
            out.print(json);
            //清空缓存
            out.flush();
        } catch (Exception e) {
            LOG.error("ServletUtils返回JSON异常", e);
            throw e;
        } finally {
            if(out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    LOG.error("ServletUtils关闭输出流异常", e);
                }
            }
        }
    }
}
