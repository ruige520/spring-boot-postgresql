package com.pangu.foying.commom.xss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2018/12/10 9:30
 * @Modified By
 */
public class XssHttpServletRequestWrapper extends HttpServletRequestWrapper {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(XssHttpServletRequestWrapper.class);

    private byte[] bytes = null;

    public XssHttpServletRequestWrapper(HttpServletRequest servletRequest) {
        super(servletRequest);
    }

    public String[] getParameterValues(String parameter) {
        String[] values = super.getParameterValues(parameter);
        if (values == null) {
            return null;
        }
        int count = values.length;
        String[] encodedValues = new String[count];

        for (int i = 0; i < count; i++) {
            encodedValues[i] = cleanXSS(values[i]);
        }
        return encodedValues;
    }

    public String getParameter(String parameter) {
        String value = super.getParameter(parameter);
        if (value == null) {
            return null;
        }
        return cleanXSS(value);
    }

    public String getHeader(String name) {
        String value = super.getHeader(name);
        if (value == null)
            return null;
        return cleanXSS(value);
    }

    //处理SpringMVC中@RequestBody的入参
    @Override
    public ServletInputStream getInputStream() throws IOException {
        //处理原request的流中的数据
        if (bytes == null) { //防止请求被多次拦截导致输入流被关闭而报异常
            bytes = inputHandlers(super.getInputStream()).getBytes("UTF-8");//需要加字符编码，否则部署到tomcat服务器上，会有部分数据解码失败
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
    public String inputHandlers(ServletInputStream servletInputStream) {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(servletInputStream, Charset.forName("UTF-8")));
            String line = "";
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            LOG.error("Xss过滤异常", e);
        } finally {
            if (servletInputStream != null) {
                try {
                    servletInputStream.close();
                } catch (IOException e) {
                    LOG.error("Xss过滤异常", e);
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    LOG.error("Xss过滤异常", e);
                }
            }
        }
        return cleanXSS(sb.toString());
    }

    private String cleanXSS(String value) {

        //You'll need to remove the spaces from the html entities below

        value = value.replaceAll("<", "& lt;").replaceAll(">", "& gt;");

        value = value.replaceAll("\\(", "& #40;").replaceAll("\\)", "& #41;");

        value = value.replaceAll("'", "& #39;");

        value = value.replaceAll("eval\\((.*)\\)", "");

        value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");

//        value = value.replaceAll("script", "");
        value = value.replaceAll("script& gt;", "");
        return value;

    }
}
