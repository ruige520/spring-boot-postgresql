package com.pangu.foying.web.project.admin.service.biz;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.project.admin.dto.req.ReqAddBaseNavigationDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqUpdateBaseNavigationDTO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

public interface BaseNavigationBiz {
    /**
     *
     * 该方法用于查询所有的后台导航数据，并放回一个List集合
     *
     */
    ListTResponse<?> getAllBaseNavigation();

    /**
     * 该方法根据id查询数据库单个后台导航数据，并返回该导航数据
     */
    TResponse<?> getBaseNavigation(ReqEntityByIdDTO reqDTO);

    /**
     * 改方法用于添加单个后台导航数据
     */
    TResponse<?> addBaseNavigation(ReqAddBaseNavigationDTO reqDTO);

    /**
     * 该方法用于修改单个后台导航数据
     */
    TResponse<?> updateBaseNavigation(ReqUpdateBaseNavigationDTO reqDTO);

    /**
     * 该方法用于删除单个后台导航数据
     * 该方法实际上使用的是修改命令，并不是真的从数据库上删除改条数据，而是添加了删除时间、删除标记、删除人信息等删除信息
     */
    TResponse<?> deleteBaseNavigation(ReqEntityByIdDTO reqDTO);

    /**
     * 上传导航自定义小图标
     */
    TResponse<?> getCustomIconUpload(HttpServletRequest request, MultipartFile imgFile);

    /**
     * 获取左边导航栏
     */
    ListTResponse<?> getNavListForLeft();


}
