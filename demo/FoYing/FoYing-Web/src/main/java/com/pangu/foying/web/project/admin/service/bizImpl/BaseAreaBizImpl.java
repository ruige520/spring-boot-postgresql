package com.pangu.foying.web.project.admin.service.bizImpl;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.pgenum.SystemEnum;
import com.pangu.foying.commom.util.DTOMappingUtil;
import com.pangu.foying.commom.wrapper.response.ListTResponse;
import com.pangu.foying.web.commom.constant.AreaLevelEnum;
import com.pangu.foying.web.project.admin.dto.res.ResGetSubAreaForDownDTO;
import com.pangu.foying.web.project.admin.entity.BaseArea;
import com.pangu.foying.web.project.admin.entity.BaseAreaExample;
import com.pangu.foying.web.project.admin.mapper.BaseAreaMapper;
import com.pangu.foying.web.project.admin.service.biz.BaseAreaBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/22 10:16
 * @Modified By
 */
@Service
public class BaseAreaBizImpl implements BaseAreaBiz {
    // dto映射工具
    private DTOMappingUtil mapper = DTOMappingUtil.getInstance();
    @Autowired
    private BaseAreaMapper baseAreaMapper;
    /**
     * @Description 返回 省一级 的地区信息列表
     * @author 陈漫斌
     * @date 2018/12/20 15:48
     * @Modified By
     */
    @Override
    public ListTResponse<?> getProvinceBaseAreaList() {
        try {
            //省一级
            BaseAreaExample baseAreaExample = new BaseAreaExample();
            baseAreaExample.createCriteria().andDeleteMarkEqualTo(false).andAreaLevelEqualTo(AreaLevelEnum.Province.getLevel());
            List<BaseArea> listBaseArea = baseAreaMapper.selectByExample(baseAreaExample);
            if(listBaseArea == null || listBaseArea.isEmpty()){
                return ListTResponse.error();
            }
            //转化
            List<ResGetSubAreaForDownDTO> listDto = mapper.mapList(listBaseArea, ResGetSubAreaForDownDTO.class);
            ListTResponse<ResGetSubAreaForDownDTO> response = new ListTResponse<>();
            response.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
            response.set_ResMsg(SystemEnum.SUCCESS.get_ResMsg());
            response.setEntityList(listDto);
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param reqDto
     * @Description 根据父节点编号 返回下一级的地区信息列表
     * @author 陈漫斌
     * @date 2018/12/20 15:48
     * @Modified By
     */
    @Override
    public ListTResponse<?> getSubAreaByLevelForDown(ReqEntityByIdDTO reqDto) {
        try {
            BaseAreaExample baseAreaExample = new BaseAreaExample();
            baseAreaExample.createCriteria().andDeleteMarkEqualTo(false).andParentIdEqualTo(reqDto.getId());
            List<BaseArea> listBaseArea = baseAreaMapper.selectByExample(baseAreaExample);
            if(listBaseArea == null || listBaseArea.isEmpty()){
                return ListTResponse.error();
            }
            //转化
            List<ResGetSubAreaForDownDTO> listDto = mapper.mapList(listBaseArea, ResGetSubAreaForDownDTO.class);
            ListTResponse<ResGetSubAreaForDownDTO> response = new ListTResponse<>();
            response.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
            response.set_ResMsg(SystemEnum.SUCCESS.get_ResMsg());
            response.setEntityList(listDto);
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
