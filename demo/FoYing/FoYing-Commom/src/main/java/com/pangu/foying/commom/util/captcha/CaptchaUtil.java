package com.pangu.foying.commom.util.captcha;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;

import java.util.Properties;

/**
 * @Author 陈漫斌
 * @Description 图片验证码工具
 * @Date 2018/12/11 15:44
 * @Modified By
 */
public class CaptchaUtil {
    private String textproducerImpl = KaptchaTextCreator.class.getName();
    private static final Object synObj = new Object();
    private static CaptchaUtil instance = null;
    public static CaptchaUtil getInstance(){
        synchronized (synObj) {
            if(instance == null){
                instance = new CaptchaUtil();
                return instance;
            }else{
                return instance;
            }
        }
    }
    private CaptchaUtil(){
        initStr();
        initMath();
    }
    private DefaultKaptcha str = null;
    private DefaultKaptcha math = null;
    private void initStr(){
        str = new DefaultKaptcha();
        Properties properties = new Properties();
        properties.setProperty("kaptcha.border", "yes");
        properties.setProperty("kaptcha.border.color", "105,179,90");
        properties.setProperty("kaptcha.textproducer.font.color", "blue");
        properties.setProperty("kaptcha.image.width", "160");
        properties.setProperty("kaptcha.image.height", "60");
        properties.setProperty("kaptcha.textproducer.font.size", "28");
        properties.setProperty("kaptcha.session.key", "kaptchaCode");
        properties.setProperty("kaptcha.textproducer.char.spac", "35");
        properties.setProperty("kaptcha.textproducer.char.length", "5");
        properties.setProperty("kaptcha.textproducer.font.names", "Arial,Courier");
        properties.setProperty("kaptcha.noise.color", "white");
        Config config = new Config(properties);
        str.setConfig(config);
    }
    private void initMath(){
        math = new DefaultKaptcha();
        Properties properties = new Properties();
        properties.setProperty("kaptcha.border", "yes");
        properties.setProperty("kaptcha.border.color", "105,179,90");
        properties.setProperty("kaptcha.textproducer.font.color", "blue");
        properties.setProperty("kaptcha.image.width", "160");
        properties.setProperty("kaptcha.image.height", "60");
        properties.setProperty("kaptcha.textproducer.font.size", "38");
        properties.setProperty("kaptcha.session.key", "kaptchaCodeMath");
        properties.setProperty("kaptcha.textproducer.impl", textproducerImpl);
        properties.setProperty("kaptcha.textproducer.char.spac", "5");
        properties.setProperty("kaptcha.textproducer.char.length", "6");
        properties.setProperty("kaptcha.textproducer.font.names", "Arial,Courier");
        properties.setProperty("kaptcha.noise.color", "white");
        properties.setProperty("kaptcha.noise.impl", "com.google.code.kaptcha.impl.NoNoise");
        properties.setProperty("kaptcha.obscurificator.impl", "com.google.code.kaptcha.impl.ShadowGimpy");
        Config config = new Config(properties);
        math.setConfig(config);
    }


    /**
     * @Description 字符串验证码
     * @author 陈漫斌
     * @date 2018/12/11 15:48
     * @param
     * @Modified By
     */
    public DefaultKaptcha getKaptchaStr() {
        return str;
    }

    /**
     * @Description 算数验证码
     * @author 陈漫斌
     * @date 2018/12/11 15:49
     * @Modified By
     */
    public DefaultKaptcha getKaptchaMath() {
        return math;
    }
}
