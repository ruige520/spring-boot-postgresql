package com.pangu.foying.web.project.admin.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.pangu.foying.commom.annotation.PGLog;
import com.pangu.foying.commom.pgenum.AccessModeEnum;
import com.pangu.foying.commom.pgenum.ActionEnum;
import com.pangu.foying.commom.util.captcha.CaptchaUtil;
import com.pangu.foying.commom.wrapper.response.ResponseBase;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.commom.util.MessageUtils;
import com.pangu.foying.web.project.admin.dto.req.ReqLoginDTO;
import com.pangu.foying.web.project.admin.dto.res.ResLoginInfoDTO;
import com.pangu.foying.web.project.admin.util.shiro.ShiroKit;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/17 13:46
 * @Modified By
 */
@Controller
@RequestMapping("/foying/web/admin/Login")
public class LoginController extends BaseWebAdminController {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);
    //验证码工具
    private CaptchaUtil captchaUtil = CaptchaUtil.getInstance();

    /**
     * 验证码生成
     */
    @GetMapping(value = "/captchaImage")
    public ModelAndView getKaptchaImage(HttpServletRequest request, HttpServletResponse response){
        ServletOutputStream out = null;
        try {
            HttpSession session = request.getSession();
            response.setDateHeader("Expires", 0);
            response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
            response.addHeader("Cache-Control", "post-check=0, pre-check=0");
            response.setHeader("Pragma", "no-cache");
            response.setContentType("image/jpeg");
            //算术验证码
            DefaultKaptcha getKaptchaMath = captchaUtil.getKaptchaMath();
            String capText = getKaptchaMath.createText();
            String capStr = capText.substring(0, capText.lastIndexOf("@"));
            String code = capText.substring(capText.lastIndexOf("@") + 1);
            BufferedImage bi = getKaptchaMath.createImage(capStr);
            session.setAttribute(Constants.KAPTCHA_SESSION_KEY, code);
            out = response.getOutputStream();
            ImageIO.write(bi, "jpg", out);
            out.flush();
        }
        catch (Exception e) {
            LOG.error("访问异常", e);
        }
        finally {
            try {
                if (out != null) {
                    out.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    //管理员登陆
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @PGLog(businessModule = "管理员模块", actionType = ActionEnum.Login, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public TResponse<?> login(@Validated @RequestBody ReqLoginDTO dto, BindingResult errors){
        TResponse<Object> response = null;
        try {
            if(errors.hasErrors()){
                return TResponse.error(errorMsg(errors));
            }
            //判断验证码是否正确
            Session session = ShiroKit.getSession();
            String code = (String) session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
            if (code == null || !code.equals(dto.getCode())){
                return TResponse.error("验证码不正确");
            }
            //登陆验证
            Subject subject = ShiroKit.getSubject();
            if (subject.isAuthenticated()){
                //管理员已登陆
                response = TResponse.success("登陆成功");
                response.setEntity(ShiroKit.getPrincipal());//管理员信息
                return response;
            }
            UsernamePasswordToken token = new UsernamePasswordToken(dto.getAccount(), dto.getPassword());
            subject.login(token);
            response = TResponse.success("登陆成功");
            response.setEntity(ShiroKit.getPrincipal());//管理员信息
        } catch (UnknownAccountException e) {
            LOG.error("未知账号", e);;
            response = TResponse.error(e.getMessage());
        } catch (LockedAccountException e) {
            LOG.error("账号已锁定", e);;
            response = TResponse.error(e.getMessage());
        } catch (AuthenticationException e) {
            LOG.error("认证失败", e);;
            response = TResponse.error("登陆失败");
        } catch (Exception e) {
            LOG.error("访问异常", e);
            response = TResponse.error(MessageUtils.message("controller.error"));
        }
        return response;
    }

    /**
     * 管理员登出
     */
    @PostMapping(value = "/logout")
    @PGLog(businessModule = "管理员模块", actionType = ActionEnum.logout, accessMode = AccessModeEnum.pageAccess)
    @ResponseBody
    public ResponseBase logout(){
        Subject subject = ShiroKit.getSubject();
        Serializable sessionId = ShiroKit.getSession().getId();
        ResLoginInfoDTO principal = (ResLoginInfoDTO) ShiroKit.getPrincipal();
        ShiroKit.removePrincipalsMap(principal.getId());//清理principalsMap缓存
        subject.logout();//退出
        ShiroKit.clearEhAuthenticationcache(principal.getAccount());//清理EhCache 认证缓存
        ShiroKit.clearEhAuthorizationcache(principal);//清理EhCache 权限缓存
        ShiroKit.clearEhSessioncache(sessionId);//清理EhCache Session缓存
        return ResponseBase.success("退出登录");
    }
}
