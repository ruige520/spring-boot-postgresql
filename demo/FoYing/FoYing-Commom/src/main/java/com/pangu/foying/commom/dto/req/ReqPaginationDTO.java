package com.pangu.foying.commom.dto.req;

import org.hibernate.validator.constraints.Range;

/**
 * @Author 陈漫斌
 * @Description 基础分页请求
 * @Date 2018/12/14 11:37
 * @Modified By
 */
public class ReqPaginationDTO {
    @Range(min = 1, message = "当前页不能小于0")
    protected int page;//当前页
    @Range(min = 1, message = "每页的记录数小于0")
    protected int rows;//每页的记录数
    protected String keyword;
    protected String sidx;//排序字段
    protected String sord;//升降序

    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getRows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }
    public String getSidx() {
        return sidx;
    }
    public void setSidx(String sidx) {
        this.sidx = sidx;
    }
    public String getSord() {
        return sord;
    }
    public void setSord(String sord) {
        this.sord = sord;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "ReqPaginationDTO{" +
                "page=" + page +
                ", rows=" + rows +
                ", keyword='" + keyword + '\'' +
                ", sidx='" + sidx + '\'' +
                ", sord='" + sord + '\'' +
                '}';
    }
}
