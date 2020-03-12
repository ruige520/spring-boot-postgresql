package com.pangu.foying.web.project.admin.util;


import com.pangu.foying.commom.entity.BaseEntity;
import com.pangu.foying.web.project.admin.dto.res.ResLoginInfoDTO;
import com.pangu.foying.web.project.admin.util.shiro.ShiroKit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2018/12/12 11:30
 * @Modified By
 */
public class SetPGEntityFieldUtil {

    /**
     * @Description 设置添加时间、人员Id、人员账号、删除标识
     * @author 陈漫斌
     * @date 2018/12/12 13:45
     * @param entity
     * @Modified By
     */
    public static void setAddMethod(BaseEntity entity) {
        //登陆信息
        ResLoginInfoDTO principal = (ResLoginInfoDTO) ShiroKit.getPrincipal();
        //添加时间
        entity.setAddTime(getTimestamp());
        //修改时间
        entity.setModifyTime(getTimestamp());
        //添加人员Id
        entity.setAddUserId(principal.getId());
        //添加人员账号
        entity.setAddUserName(principal.getAccount());
        //删除标识
        entity.setDeleteMark(false);

    }

    /**
     * @Description 设置修改时间、人员Id、人员账号
     * @author 陈漫斌
     * @date 2018/12/12 13:45
     * @param entity
     * @Modified By
     */
    public static void setModifyMethod(BaseEntity entity) {
        //登陆信息
        ResLoginInfoDTO principal = (ResLoginInfoDTO) ShiroKit.getPrincipal();
        //修改时间
        entity.setModifyTime(getTimestamp());
        //修改人员Id
        entity.setModifyUserId(principal.getId());
        //修改人员账号
        entity.setModifyName(principal.getAccount());
    }
    /**
     * @Description 设置删除时间、人员账号、删除标识
     * @author 陈漫斌
     * @date 2018/12/12 13:46
     * @param entity
     * @Modified By
     */
    public static void setDeleteMethod(BaseEntity entity) {
        //登陆信息
        ResLoginInfoDTO principal = (ResLoginInfoDTO) ShiroKit.getPrincipal();
        //删除时间
        entity.setDeleteTime(getTimestamp());
        //删除人员Id
        entity.setDeleteName(principal.getAccount());
        //删除标识
        entity.setDeleteMark(true);
    }
    /**
     * @Description 设置添加时间、人员Id、人员账号、删除标识
     * @author 陈漫斌
     * @date 2018/12/12 13:47
     * @param entity
     * @param userId
     * @param userName
     * @Modified By
     */
    public static void setAddMethod(BaseEntity entity, String userId, String userName) {
        //添加时间
        entity.setAddTime(getTimestamp());
        //修改时间
        entity.setModifyTime(getTimestamp());
        //添加人员Id
        entity.setAddUserId(userId);
        //添加人员账号
        entity.setAddUserName(userName);
        //删除标识
        entity.setDeleteMark(false);

    }
    /**
     * @Description 设置修改时间、人员Id、人员账号
     * @author 陈漫斌
     * @date 2018/12/12 13:48
     * @param entity
     * @param userId
     * @param userName
     * @Modified By
     */
    public static void setModifyMethod(BaseEntity entity, String userId, String userName) {
        //修改时间
        entity.setModifyTime(getTimestamp());
        //修改人员Id
        entity.setModifyUserId(userId);
        //修改人员账号
        entity.setModifyName(userName);
    }
    /**
     * @Description 设置删除时间、人员账号、删除标识
     * @author 陈漫斌
     * @date 2018/12/12 13:48
     * @param entity
     * @param userName
     * @Modified By
     */
    public static void setDeleteMethod(BaseEntity entity, String userName) {
        //删除时间
        entity.setDeleteTime(getTimestamp());
        //删除人员Id
        entity.setDeleteName(userName);
        //删除标识
        entity.setDeleteMark(true);
    }
    //获取当前时间
    private static Timestamp getTimestamp(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = df.format(new Date());
        return Timestamp.valueOf(currentDate);
    }
}
