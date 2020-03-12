package com.pangu.foying.web.project.admin.service.bizImpl;

import com.pangu.foying.commom.dto.req.ReqEntityByIdDTO;
import com.pangu.foying.commom.pgenum.SystemEnum;
import com.pangu.foying.commom.util.CommomUtil;
import com.pangu.foying.commom.util.DTOMappingUtil;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.commom.wrapper.response.TResponse;
import com.pangu.foying.web.project.admin.dto.req.*;
import com.pangu.foying.web.project.admin.dto.res.ResGetBaseItemsDetailDTO;
import com.pangu.foying.web.project.admin.entity.BaseItems;
import com.pangu.foying.web.project.admin.entity.BaseItemsDetail;
import com.pangu.foying.web.project.admin.entity.BaseItemsDetailExample;
import com.pangu.foying.web.project.admin.mapper.BaseItemsDetailMapper;
import com.pangu.foying.web.project.admin.mapper.BaseItemsMapper;
import com.pangu.foying.web.project.admin.service.biz.BaseItemsDetailBiz;
import com.pangu.foying.web.project.admin.util.SetPGEntityFieldUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : 邱杭锐
 * @Date :  2019/7/17 15:50
 * @Version : 01
 * @Description : 字典详细信息业务层接口实现类
 * @ProjectName : FoYing
 */
@Service
public class BaseItemsDetailBizImpl implements BaseItemsDetailBiz {

    // dto映射工具
    private DTOMappingUtil mapper = DTOMappingUtil.getInstance();

    @SuppressWarnings("all")
    @Autowired
    private BaseItemsDetailMapper baseItemsDetailMapper;

    @SuppressWarnings("all")
    @Autowired
    private BaseItemsMapper baseItemsMapper;

    /**
     * @Author : 邱杭锐
     * @Date : 2019/7/17 16:56
     * @Version : 01
     * @Description : 添加单个字典详细信息
     * @param : [reqDto]
     * @return : com.pangu.foying.commom.wrapper.response.TResponse<?>
     */
    @Transactional
    @Override
    public TResponse<?> addBaseItemsDetail(ReqAddBaseItemsDetailDTO reqDto) {
        try {
            //判断 字典编号 是否唯一
            BaseItemsDetailExample example = new BaseItemsDetailExample();
            example.setDistinct(true);
            BaseItemsDetailExample.Criteria criteria = example.createCriteria();
            criteria.andEnCodeEqualTo(reqDto.getEnCode()).andDeleteMarkEqualTo(false);
            List<BaseItemsDetail> list = baseItemsDetailMapper.selectByExample(example);
            if(list != null && !list.isEmpty()){
                return TResponse.error("添加失败，字典编号 已存在!");
            }
            BaseItems baseItems = baseItemsMapper.selectByPrimaryKey(reqDto.getBaseItemsId());
            if(baseItems == null){
                return TResponse.error("添加失败，查找不到字典信息外键对应的字典信息!");
            }
            //转化
            BaseItemsDetail baseItemsDetail = mapper.map(reqDto, BaseItemsDetail.class);
            //添加ID
            baseItemsDetail.setId(CommomUtil.getUUID());
            baseItemsDetail.setItemsId(reqDto.getBaseItemsId());
            //添加时间
            SetPGEntityFieldUtil.setAddMethod(baseItemsDetail);
            //是否默认(默认为false, 表示为用户自定义添加,true表示为系统预定义添加)
            baseItemsDetail.setIsDefault(false);
            //启用标识(扩展用的，默认为true)
            baseItemsDetail.setEnabledMark(true);

            //保存到数据库中
            int insert = baseItemsDetailMapper.insertSelective(baseItemsDetail);
            if(insert > 0){
                return TResponse.success("添加字典成功!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("添加字典失败!");
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2019/7/18 8:38
     * @Version : 01
     * @Description : 获取字典详细信息列表
     * @param : [reqDto]
     * @return : com.pangu.foying.commom.wrapper.response.PageTResponse<?>
     */
    @Override
    public PageTResponse<?> getBaseItemsDetailListForShow(ReqItemsDetailListForShowDTO reqDto) {
        try {
            //查询字典详细信息列表
            List<BaseItemsDetail> baseItemsDetailList = baseItemsDetailMapper.getBaseItemsDetailListByBaseItemsEncode(reqDto);

            if(!baseItemsDetailList.isEmpty() || baseItemsDetailList.size() > 0){
                List<ResGetBaseItemsDetailDTO> listDto = mapper.mapList(baseItemsDetailList, ResGetBaseItemsDetailDTO.class);
                return new PageTResponse<ResGetBaseItemsDetailDTO>(SystemEnum.SUCCESS.get_ResCode(),"查询成功!",listDto,1,1,listDto.size(),1);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return PageTResponse.error("查询结果为空!");
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2019/7/18 8:55
     * @Version : 01
     * @Description : 获取单个字典详情，用于前台修改
     * @param : [reqDto]
     * @return : com.pangu.foying.commom.wrapper.response.TResponse<?>
     */
    @Override
    public TResponse<?> getSingleBaseItemsDetailForEdit(ReqGetItemsDetailForEditDTO reqDto) {
        try {
            BaseItemsDetail baseItemsDetail = baseItemsDetailMapper.getSingleBaseItemsDetailForEdit(reqDto);
            if (baseItemsDetail != null) {
                ResGetBaseItemsDetailDTO map = mapper.map(baseItemsDetail, ResGetBaseItemsDetailDTO.class);
                return new TResponse<ResGetBaseItemsDetailDTO>(SystemEnum.SUCCESS.get_ResCode(),"查询成功!",map);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("查询字典失败!");
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2019/7/18 8:55
     * @Version : 01
     * @Description : 修改单个字典详情
     * @param : [reqDto]
     * @return : com.pangu.foying.commom.wrapper.response.TResponse<?>
     */
    @Transactional
    @Override
    public TResponse<?> editSingleBaseItemsDetail(ReqEditBaseItemsDetailDTO reqDto) {
        try {
            //从数据库中获取字典详情
            BaseItemsDetail baseItemsDetail = baseItemsDetailMapper.selectByPrimaryKey(reqDto.getId());
            if(baseItemsDetail == null){
                return TResponse.error("修改失败，未查询到该数据!");
            }
            //判断字典编号是否已存在
            if(!baseItemsDetail.getEnCode().equals(reqDto.getEnCode())){
                //判断 字典编号 是否唯一
                BaseItemsDetailExample example = new BaseItemsDetailExample();
                example.setDistinct(true);
                BaseItemsDetailExample.Criteria criteria = example.createCriteria();
                criteria.andEnCodeEqualTo(reqDto.getEnCode()).andDeleteMarkEqualTo(false);
                List<BaseItemsDetail> list = baseItemsDetailMapper.selectByExample(example);
                if(list != null && !list.isEmpty()){
                    return TResponse.error("修改失败，字典编号已存在!");
                }
                baseItemsDetail.setEnCode(reqDto.getEnCode());
            }
            baseItemsDetail.setItemName(reqDto.getItemName());
            baseItemsDetail.setRemark(reqDto.getRemark());
            baseItemsDetail.setSortCode(reqDto.getSortCode());
            //修改时间
            SetPGEntityFieldUtil.setModifyMethod(baseItemsDetail);

            //更新数据库中的字典信息
            int result = baseItemsDetailMapper.updateByPrimaryKey(baseItemsDetail);
            if (result > 0) {
                return TResponse.success("修改数据成功!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("修改数据失败!");
    }

    /**
     * @Author : 邱杭锐
     * @Date : 2019/7/18 8:59
     * @Version : 01
     * @Description : 根据id删除单个字典详细信息
     * @param : [reqDto]
     * @return : com.pangu.foying.commom.wrapper.response.TResponse<?>
     */
    @Transactional
    @Override
    public TResponse<?> deleteSingleBaseItemsDetail(ReqEntityByIdDTO reqDto) {
        try {
            //从数据库中获取字典信息
            BaseItemsDetail baseItemsDetail = baseItemsDetailMapper.selectByPrimaryKey(reqDto.getId());
            if(baseItemsDetail == null || baseItemsDetail.getDeleteMark().equals(true)){
                return TResponse.error("删除失败,未查询到该数据!");
            }
            //该字典详情为系统默认添加，无法删除
            if(baseItemsDetail.getIsDefault()){
                return TResponse.error("删除失败,该字典详情为系统默认添加!");
            }
            //删除时间
            SetPGEntityFieldUtil.setDeleteMethod(baseItemsDetail);

            //从数据库中删除字典详情
            int result = baseItemsDetailMapper.updateByPrimaryKeySelective(baseItemsDetail);
            if (result > 0 ) {
                return TResponse.success("删除数据成功!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return TResponse.error("删除数据失败!");
    }
}
