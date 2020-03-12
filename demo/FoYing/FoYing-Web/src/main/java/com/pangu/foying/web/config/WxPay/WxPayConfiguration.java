package com.pangu.foying.web.config.WxPay;

import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.service.impl.WxPayServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Binary Wang
 */
@Configuration
@ConditionalOnClass(WxPayService.class)
@EnableConfigurationProperties(WxPayProperties.class)
public class WxPayConfiguration {
  private WxPayProperties properties;

  @Autowired
  public WxPayConfiguration(WxPayProperties properties) {
    this.properties = properties;
  }

  //微信支付商户密钥
  private static String mchKey = "123456";
  //微信secret
  public static String appSecret = "123456";

  @Bean
  @ConditionalOnMissingBean
  public WxPayService wxService() {
    WxPayConfig payConfig = new WxPayConfig();
    payConfig.setPayBaseUrl(StringUtils.trimToNull(this.properties.getPayBaseUrl()));//设置微信支付基础URL
    payConfig.setAppId(StringUtils.trimToNull(this.properties.getAppId()));//设置微信公众号或者小程序等的appid
    payConfig.setMchId(StringUtils.trimToNull(this.properties.getMchId()));//微信支付商户号
    payConfig.setMchKey(mchKey);//微信支付商户密钥
    payConfig.setSubAppId(StringUtils.trimToNull(this.properties.getSubAppId()));//服务商模式下的子商户公众账号ID，普通模式请不要配置，请在配置文件中将对应项删除
    payConfig.setSubMchId(StringUtils.trimToNull(this.properties.getSubMchId()));//服务商模式下的子商户号，普通模式请不要配置，最好是请在配置文件中将对应项删除
    payConfig.setKeyPath(StringUtils.trimToNull(this.properties.getKeyPath()));//apiclient_cert.p12文件的绝对路径，或者如果放在项目中，请以classpath:开头指定
    payConfig.setSignType(StringUtils.trimToNull(this.properties.getSignType()));//签名类型

    // 可以指定是否使用沙箱环境
    payConfig.setUseSandboxEnv(false);

    WxPayService wxPayService = new WxPayServiceImpl();
    wxPayService.setConfig(payConfig);
    return wxPayService;
  }

}
