package com.pangu.foying.web.config.WxPay;

import com.google.gson.annotations.SerializedName;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/10/10 11:34
 * @Modified By
 */
public class WxGetBrandWCPayRequest {
    private String appId;
    private String timeStamp; //时间戳，自1970年以来的秒数
    private String nonceStr; //随机串
    @SerializedName("package")
    private String prepayId;
    private String signType; //微信签名方式
    private String paySign; //微信签名

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getPaySign() {
        return paySign;
    }

    public void setPaySign(String paySign) {
        this.paySign = paySign;
    }
}
