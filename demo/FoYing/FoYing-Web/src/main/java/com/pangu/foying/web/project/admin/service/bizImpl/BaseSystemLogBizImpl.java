package com.pangu.foying.web.project.admin.service.bizImpl;


import com.pangu.foying.commom.dto.req.ReqPaginationDTO;
import com.pangu.foying.commom.pgenum.SystemEnum;
import com.pangu.foying.commom.util.CommomUtil;
import com.pangu.foying.commom.util.DTOMappingUtil;
import com.pangu.foying.commom.util.SqlUtil;
import com.pangu.foying.commom.wrapper.response.PageTResponse;
import com.pangu.foying.web.project.admin.dto.res.ResGetSystemLogPageDTO;
import com.pangu.foying.web.project.admin.entity.BaseSystemLog;
import com.pangu.foying.web.project.admin.entity.BaseSystemLogExample;
import com.pangu.foying.web.project.admin.mapper.BaseSystemLogMapper;
import com.pangu.foying.web.project.admin.service.biz.BaseSystemLogBiz;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author 陈漫斌
 * @Description
 * @Date 2019/7/19 10:55
 * @Modified By
 */
@SuppressWarnings("all")
@Service
public class BaseSystemLogBizImpl implements BaseSystemLogBiz {
    //日志记录器
    private static final Logger LOG = LoggerFactory.getLogger(BaseSystemLogBizImpl.class);
    // dto映射工具
    private DTOMappingUtil mapper = DTOMappingUtil.getInstance();
    @Autowired
    private BaseSystemLogMapper baseSystemLogMapper;
    //日志队列
    private Queue<BaseSystemLog> logQueue = new LinkedList<>();
    //同步锁
    private final Object synObj = new Object();

    /**
     * @param reqDto
     * @Description 分页查询系统日志列表
     * @author 陈漫斌
     * @date 2019/6/4 11:22
     * @Modified By
     */
    @Override
    public PageTResponse<?> getBaseSystemLogByPage(ReqPaginationDTO reqDto) {
        try {
            BaseSystemLogExample baseSystemLogExample = new BaseSystemLogExample();
            if(CommomUtil.isNotNullOrEmpty(reqDto.getKeyword())) {
                //a and ( b or c ) = ( a and b) or ( a and c )
                baseSystemLogExample.createCriteria().andDeleteMarkEqualTo(false).andAccessmodeLike('%' + reqDto.getKeyword() + '%');
                baseSystemLogExample.or().andDeleteMarkEqualTo(false).andBusinessmoduleLike('%' + reqDto.getKeyword() + '%');
                baseSystemLogExample.or().andDeleteMarkEqualTo(false).andActiontypeLike('%' + reqDto.getKeyword() + '%');
                baseSystemLogExample.or().andDeleteMarkEqualTo(false).andStatusLike('%' + reqDto.getKeyword() + '%');
            } else {
                baseSystemLogExample.createCriteria().andDeleteMarkEqualTo(false);
            }
            int count = baseSystemLogMapper.countByExample(baseSystemLogExample);
            if (count == 0) {
                return PageTResponse.error("查询不到系统日志列表");
            }
            //总页数
            int pageCount = (count + reqDto.getRows() - 1)/reqDto.getRows();
            baseSystemLogExample.setOrderByClause("addTime desc");
            baseSystemLogExample.setPageIndex(reqDto.getPage());
            baseSystemLogExample.setPageSize(reqDto.getRows());
            List<BaseSystemLog> list = baseSystemLogMapper.selectByExampleByPage(baseSystemLogExample);
            if (list == null || list.isEmpty()){
                return PageTResponse.error("查询不到系统日志列表");
            }
            List<ResGetSystemLogPageDTO> listDto = mapper.mapList(list, ResGetSystemLogPageDTO.class);
            PageTResponse<ResGetSystemLogPageDTO> response = new PageTResponse<>();
            response.set_ResCode(SystemEnum.SUCCESS.get_ResCode());
            response.set_ResMsg(SystemEnum.SUCCESS.get_ResMsg());
            response.setEntityList(listDto);
            response.setPageCount((int)pageCount);
            response.setRecordCount(count);
            response.setPageIndex(reqDto.getPage());
            response.setPageSize(reqDto.getRows());
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param logs
     * @Description 添加系统日志
     * @author 陈漫斌
     * @date 2019/6/4 10:09
     * @Modified By
     */
    @Override
    public void addSystemLogs(BaseSystemLog... logs) {
        synchronized (synObj) {
            if (logs == null || logs.length < 1) {
                return;
            }
            for (BaseSystemLog log : logs) {
                logQueue.add(log);
            }
        }
    }

    /**
     * @Description 保存系统日志
     * @author 陈漫斌
     * @date 2019/6/4 10:17
     * @Modified By
     */
    @Scheduled(fixedRate = 1000 * 60 * 3, initialDelay = 1000 * 60 * 3)//每隔3分钟刷新一次，延迟3分钟执行
    @Override
    public void saveSystemLogs() {
        try {
            List<BaseSystemLog> list = getlogQueue();
            if (list == null || list.isEmpty()) {
                return;
            }
            int totalNum = SqlUtil.getColValueSizes(BaseSystemLog.class);//每次插入的条数
            int totalNumIndex = totalNum;//每次插入之后的下标
            int index = 0;
            while (index < totalNumIndex) {
                if (totalNumIndex >= list.size()) {
                    totalNumIndex = list.size();
                    baseSystemLogMapper.batchInsert(list.subList(index, totalNumIndex));
                    break;
                } else {
                    baseSystemLogMapper.batchInsert(list.subList(index, totalNumIndex));
                    index = totalNumIndex;
                    totalNumIndex = index + totalNum;
                }
            }
            list.clear();
        } catch (Exception e) {
            LOG.error("保存系统日志失败", e);
        }
    }

    /**
     * @Description 系统退出时调用销毁接口
     * @author 陈漫斌
     * @date 2019/8/8 14:59
     * @Modified By
     */
    @PreDestroy
    @Override
    public void destory() {
        try {
            System.out.println("系统退出时调用日志服务销毁接口");
            LOG.info("系统退出时调用日志服务销毁接口");
            List<BaseSystemLog> list = getlogQueue();
            if (list == null || list.isEmpty()) {
                return;
            }
            int totalNum = SqlUtil.getColValueSizes(BaseSystemLog.class);//每次插入的条数
            int totalNumIndex = totalNum;//每次插入之后的下标
            int index = 0;
            while (index < totalNumIndex) {
                if (totalNumIndex >= list.size()) {
                    totalNumIndex = list.size();
                    baseSystemLogMapper.batchInsert(list.subList(index, totalNumIndex));
                    break;
                } else {
                    baseSystemLogMapper.batchInsert(list.subList(index, totalNumIndex));
                    index = totalNumIndex;
                    totalNumIndex = index + totalNum;
                }
            }
            list.clear();
        } catch (Exception e) {
            LOG.error("保存系统日志失败", e);
        }
    }

    //获取系统日志列表
    private List<BaseSystemLog> getlogQueue() {
        synchronized (synObj) {
            if (logQueue.isEmpty()) {
                return null;
            }
            List<BaseSystemLog> result = new ArrayList<>(logQueue.size());
            BaseSystemLog log = null;
            while (!logQueue.isEmpty()) {
                log = logQueue.poll();
                log.setId(CommomUtil.getUUID());
                result.add(log);
            }
            return result;
        }
    }
}
