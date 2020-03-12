package com.pangu.foying.commom.xss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @Author 陈漫斌
 * @Description 防止添加HandlerInterceptorAdapter拦截器后，导致输入流被关闭
 * @Date 2019/10/24 15:20
 * @Modified By
 */
public class ComHttpServletRequestWrapper extends HttpServletRequestWrapper {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(ComHttpServletRequestWrapper.class);

    private byte[] bytes = null;

    public ComHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
    }
    //处理SpringMVC中@RequestBody的入参
    @Override
    public ServletInputStream getInputStream() throws IOException {
        //处理原request的流中的数据
        if (bytes == null) { //防止请求被多次拦截导致输入流被关闭而报异常
            bytes = getBytes(super.getInputStream());
        }
        final ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        return new ServletInputStream() {
            @Override
            public int read() throws IOException {
                return bais.read();
            }
            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener readListener) {
            }
        };
    }

    private byte[] getBytes(ServletInputStream servletInputStream) {
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            int i= -1;
            while((i = servletInputStream.read())!=-1){
                baos.write(i);
            }
            return baos.toByteArray();
        } catch (Exception e) {
            LOG.error("ServletUtils获取请求体内容异常", e);
        } finally {
            if (baos != null) {
                try {
                    baos.close();
                } catch (Exception e) {
                    LOG.error("ServletUtils关闭输出流异常", e);
                }
            }
            if (servletInputStream != null) {
                try {
                    servletInputStream.close();
                } catch (Exception e) {
                    LOG.error("ServletUtils关闭输入流异常", e);
                }
            }
        }
        return null;
    }
}
