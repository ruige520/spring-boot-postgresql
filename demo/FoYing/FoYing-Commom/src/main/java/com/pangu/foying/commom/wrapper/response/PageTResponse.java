package com.pangu.foying.commom.wrapper.response;

import com.pangu.foying.commom.pgenum.SystemEnum;

import java.util.List;

/**
 * @Author 陈漫斌
 * @Description 分页响应结果
 * @Date 2018/12/10 9:25
 * @Modified By
 */
public class PageTResponse<T> extends ResponseBase {
    //实体列表
    protected List<T> entityList;
    //当前页
    protected int pageIndex = 0;
    //每页记录数
    protected int pageSize = 0;
    //总记录数
    protected long recordCount = 0;
    //总页数
    protected int pageCount = 0;

    public PageTResponse() {
    }

    public PageTResponse(String _ResCode, String _ResMsg) {
        super(_ResCode, _ResMsg);
    }

    public PageTResponse(String _ResCode, String _ResMsg, List<T> entityList, int pageIndex, int pageSize, long recordCount, int pageCount) {
        this(_ResCode, _ResMsg);
        this.entityList = entityList;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.recordCount = recordCount;
        this.pageCount = pageCount;
    }

    public List<T> getEntityList() {
        return entityList;
    }

    public void setEntityList(List<T> entityList) {
        this.entityList = entityList;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(long recordCount) {
        this.recordCount = recordCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public static PageTResponse error() {
        return new PageTResponse(SystemEnum.ERROR.get_ResCode(), SystemEnum.ERROR.get_ResMsg());
    }

    public static PageTResponse error(String msg) {
        return new PageTResponse(SystemEnum.ERROR.get_ResCode(), msg);
    }

    public static PageTResponse success(String msg) {
        return new PageTResponse(SystemEnum.SUCCESS.get_ResCode(), msg);
    }

    public static <T> PageTResponse success(Class<T> clazz, String msg) {
        return new PageTResponse<T>(SystemEnum.SUCCESS.get_ResCode(), msg);
    }
}
