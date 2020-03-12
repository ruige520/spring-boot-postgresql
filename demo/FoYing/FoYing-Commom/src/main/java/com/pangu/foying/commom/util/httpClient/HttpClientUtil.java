package com.pangu.foying.commom.util.httpClient;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 陈漫斌
 * @Description http 客户端工具类
 * @Date 2018/9/20 14:30
 * @Modified By
 */
public class HttpClientUtil {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(HttpClientUtil.class);

    private HttpClientUtil() {
        init();
    }
    private static HttpClientUtil instance = null;
    public static synchronized HttpClientUtil getInstance() {
        if(instance == null){
            instance = new HttpClientUtil();
        }
        return instance;
    }
    //HttpClient连接池
    private PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
    //初始化连接池,支持https协议
    private void init() {
        LayeredConnectionSocketFactory sslsf = null;
        try {
            sslsf = new SSLConnectionSocketFactory(SSLContext.getDefault());
            Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
                    .register("https", sslsf)
                    .register("http", new PlainConnectionSocketFactory())
                    .build();
            cm =new PoolingHttpClientConnectionManager(socketFactoryRegistry);
            cm.setMaxTotal(200);
            cm.setDefaultMaxPerRoute(20);
        } catch (Exception e) {
            LOG.error("初始化HttpClient连接池出错", e);
            throw new RuntimeException(e);
        }
    }

    /**
     * @Description 获取HttpClient
     * @author 陈漫斌
     * @date 2018/9/20 14:44
     * @param
     * @Modified By
     */
    public CloseableHttpClient getHttpClient() {
        return HttpClients.custom().setConnectionManager(cm).build();
    }

    /**
     *
     * @Description
     * @author 陈漫斌
     * @date 2018-3-21 下午5:06:46
     * @version 0.1
     * @param httpRequest
     * @return
     * @throws Exception
     */
    public String net(HttpRequestBase httpRequest) {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        InputStream in = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try{
            httpClient = getHttpClient();
            response = httpClient.execute(httpRequest);
            in = response.getEntity().getContent();
//            int length = 2048;
//            byte[] buff = new byte[length];
//            while ((length = in.read(buff)) > 0) {
//                result.append(new String(buff, 0, length,"UTF-8"));//这种方式容易截断输入流，造成某些中文字符变成乱码
//            }
            int i=-1;
            while((i = in.read())!=-1){
                baos.write(i);
            }
            return baos.toString("UTF-8");
        }catch(Exception e){
            LOG.error("HttpClient访问异常", e);
            throw new RuntimeException(e);
        }finally{
            try {
                baos.close();
            } catch (Exception e) {
                LOG.error("释放字节数组输出流异常", e);
            }
           if (in != null) {
               try {
                   in.close();
               } catch (Exception e) {
                   LOG.error("释放输入流异常", e);
               }
           }
           if (response != null) {
               try {
                   response.close();
               } catch (Exception e) {
                   LOG.error("释放响应异常", e);
               }
           }
        }
    }

    /**
     * @Description GET请求
     * @author 陈漫斌
     * @date 2018/9/20 15:07
     * @param url
     * @Modified By
     */
    public String GET(String url) {
        try {
            HttpGet httpGet = new HttpGet(url);
            //添加head
            httpGet.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
            httpGet.addHeader("Content-type", "text/html; charset=UTF-8");
            return net(httpGet);
        } catch (Exception e) {
            LOG.error("设置GET请求参数异常", e);
            throw new RuntimeException(e);
        }
    }

    /**
     * @Description POST请求
     * @author 陈漫斌
     * @date 2018/9/20 15:12
     * @param url
     * @param params
     * @Modified By
     */
    public String POST(String url, ParamsMap... params) {
        try {
            HttpPost httpPost = new HttpPost(url);
            //添加head
            httpPost.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
            httpPost.addHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
            //httpPost.addHeader("Content-type", "text/html,application/x-www-form-urlencoded,application/xhtml+xml,application/xml,application/json");
            //组装请求参数，key-value形式的
            List<NameValuePair> pairs = null;
            if (params != null && params.length > 0) {
                pairs = new ArrayList<NameValuePair>(params.length);
                for (ParamsMap param : params) {
                    pairs.add(new BasicNameValuePair(param.paramsName, param.paramsValue));
                }
            }
            UrlEncodedFormEntity reqEntity = null;
            if (pairs != null && !pairs.isEmpty()) {
                // 解决中文乱码的问题
                reqEntity = new UrlEncodedFormEntity(pairs, "UTF-8");
                //reqEntity.setContentEncoding("UTF-8");
                httpPost.setEntity(reqEntity);
            }
            return net(httpPost);
        } catch (Exception e) {
            LOG.error("设置POST请求参数异常", e);
            throw new RuntimeException(e);
        }
    }

    /**
     * @Description POST请求
     * @author 陈漫斌
     * @date 2018/9/20 15:12
     * @param url
     * @param jsonstr
     * @Modified By
     */
    public String POST(String url, String jsonstr) {
        try {
            HttpPost httpPost = new HttpPost(url);
            //添加head
            httpPost.addHeader(HTTP.CONTENT_TYPE, "application/json");
            httpPost.addHeader(HTTP.CONTENT_ENCODING, "UTF-8");
            StringEntity se = new StringEntity(jsonstr,"UTF-8");
            se.setContentEncoding("UTF-8");
            httpPost.setEntity(se);
            return net(httpPost);
        } catch (Exception e) {
            LOG.error("设置POST请求参数异常", e);
            throw new RuntimeException(e);
        }
    }
}
