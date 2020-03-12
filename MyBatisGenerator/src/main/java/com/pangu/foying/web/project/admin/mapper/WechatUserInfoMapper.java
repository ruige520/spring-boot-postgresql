package com.pangu.foying.web.project.admin.mapper;

import com.pangu.foying.web.project.admin.entity.WechatUserInfo;
import com.pangu.foying.web.project.admin.entity.WechatUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatUserInfoMapper {
    int countByExample(WechatUserInfoExample example);

    int deleteByExample(WechatUserInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(WechatUserInfo record);

    int insertSelective(WechatUserInfo record);

    List<WechatUserInfo> selectByExample(WechatUserInfoExample example);

    WechatUserInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WechatUserInfo record, @Param("example") WechatUserInfoExample example);

    int updateByExample(@Param("record") WechatUserInfo record, @Param("example") WechatUserInfoExample example);

    int updateByPrimaryKeySelective(WechatUserInfo record);

    int updateByPrimaryKey(WechatUserInfo record);
}