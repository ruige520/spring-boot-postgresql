package com.pangu.foying.web.project.admin.service.biz;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.dto.req.ReqEntityByIdsDTO;
import com.pangu.foying.commom.dto.req.ReqPaginationDTO;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.project.admin.dto.req.*;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/17 15:39
 * @Modified By
 */
public interface BaseManagerBiz {
    /**
     * @Description 添加管理员
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    TResponse<?> addBaseManager(ReqAddBaseManagerDTO dto);
    /**
     * @Description 获取管理员信息
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    TResponse<?> getBaseManager(ReqEntityByIdDTO dto);
    /**
     * @Description 修改管理员信息
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    TResponse<?> updateBaseManager(ReqUpdateBaseManagerDTO dto);
    /**
     * @Description 是否禁用管理员
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    TResponse<?> lockBaseManager(ReqLockBaseManagerDTO dto);
    /**
     * @Description 管理员绑定角色
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    TResponse<?> updateBaseManagerRole(ReqUpdateBaseManagerRoleDTO dto);
    /**
     * @Description 删除管理员
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    TResponse<?> deleteBaseManager(ReqEntityByIdsDTO dto);
    /**
     * @Description 分页查询管理员列表
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    PageTResponse<?> getBaseManagerByPage(ReqPaginationDTO dto);
    /**
     * @Description 修改管理员密码
     * @author 陈漫斌
     * @date 2018/12/12 11:20
     * @Modified By
     */
    TResponse<?> updatePassword(ReqUpdatePasswordDTO dto);
}
