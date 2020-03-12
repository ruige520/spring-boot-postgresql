package com.pangu.foying.web.project.admin.service.biz;

import com.pangu.foying.commom.dto.req.ReqPaginationDTO;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.web.project.admin.entity.BaseSystemLog;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/19 10:55
 * @Modified By
 */
public interface BaseSystemLogBiz {
    /**
     * @Description 分页查询系统日志列表
     * @author 陈漫斌
     * @date 2019/6/4 11:22
     * @param reqDto
     * @Modified By
     */
    PageTResponse<?> getBaseSystemLogByPage(ReqPaginationDTO reqDto);
    /**
     * @Description 添加系统日志
     * @author 陈漫斌
     * @date 2019/6/4 10:09
     * @param logs
     * @Modified By
     */
    void addSystemLogs(BaseSystemLog... logs);
    /**
     * @Description 保存系统日志
     * @author 陈漫斌
     * @date 2019/6/4 10:17
     * @Modified By
     */
    void saveSystemLogs();
    /**
     * @Description 系统退出时调用销毁接口
     * @author 陈漫斌
     * @date 2019/8/8 14:59
     * @Modified By
     */
    void destory();
}
