package com.pangu.foying.web.project.admin.service.biz;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.wrapper.response.ListTResponse;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/22 10:15
 * @Modified By
 */
public interface BaseAreaBiz {
    /**
     * @Description 返回 省一级 的地区信息列表
     * @author 陈漫斌
     * @date 2018/12/20 15:48
     * @Modified By
     */
    ListTResponse<?> getProvinceBaseAreaList();
    /**
     * @Description 根据父节点编号 返回下一级的地区信息列表
     * @author 陈漫斌
     * @date 2018/12/20 15:48
     * @Modified By
     */
    ListTResponse<?> getSubAreaByLevelForDown(ReqEntityByIdDTO reqDto);
}
