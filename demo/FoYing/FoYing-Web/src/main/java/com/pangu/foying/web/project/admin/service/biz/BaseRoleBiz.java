package com.pangu.foying.web.project.admin.service.biz;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.dto.req.ReqEntityByIdsDTO;
import com.pangu.foying.commom.dto.req.ReqPaginationDTO;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.project.admin.dto.req.ReqAddBaseRoleDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqUpdateBaseNavigationRoleDTO;
import com.pangu.foying.web.project.admin.dto.req.ReqUpdateBaseRoleDTO;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/18 16:44
 * @Modified By
 */
public interface BaseRoleBiz {
    /**
     * @Description 添加角色
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    TResponse<?> addBaseRole(ReqAddBaseRoleDTO dto);
    /**
     * @Description 分页查询角色列表
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    PageTResponse<?> getBaseRoleByPage(ReqPaginationDTO dto);
    /**
     * @Description 获取角色信息
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    TResponse<?> getBaseRole(ReqEntityByIdDTO dto);
    /**
     * @Description 修改角色信息
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    TResponse<?> updateBaseRole(ReqUpdateBaseRoleDTO dto);
    /**
     * @Description 删除角色信息
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    TResponse<?> deleteBaseRole(ReqEntityByIdsDTO dto);
    /**
     * @Description 获取所有角色列表
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    ListTResponse<?> getAllBaseRole();
    /**
     * @Description 修改导航栏角色
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    TResponse<?> updateBaseNavigationRole(ReqUpdateBaseNavigationRoleDTO dto);
    /**
     * @Description 获取导航栏列表用于角色添加
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    ListTResponse<?> getNavForRoleAdd();
    /**
     * @Description 获取导航栏列表用于角色绑定导航栏
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    ListTResponse<?> getNavForRoleEdit(ReqEntityByIdDTO dto);
}
