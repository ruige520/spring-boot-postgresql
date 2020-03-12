package com.pangu.foying.web.project.admin.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BaseSystemLogExample {
    protected int pageIndex = 1;//第几页

    protected int pageSize = 10;//每页记录数

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseSystemLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        if (pageIndex <= 0) {
            this.pageIndex = 1;
        } else {
            this.pageIndex = pageIndex;
        }
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        if (pageSize <= 0) {
            this.pageSize = 10;
        } else {
            this.pageSize = pageSize;
        }
    }


    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        pageIndex = 1;//第几页
        pageSize = 10;//每页记录数
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccessmodeIsNull() {
            addCriterion("AccessMode is null");
            return (Criteria) this;
        }

        public Criteria andAccessmodeIsNotNull() {
            addCriterion("AccessMode is not null");
            return (Criteria) this;
        }

        public Criteria andAccessmodeEqualTo(String value) {
            addCriterion("AccessMode =", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeNotEqualTo(String value) {
            addCriterion("AccessMode <>", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeGreaterThan(String value) {
            addCriterion("AccessMode >", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeGreaterThanOrEqualTo(String value) {
            addCriterion("AccessMode >=", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeLessThan(String value) {
            addCriterion("AccessMode <", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeLessThanOrEqualTo(String value) {
            addCriterion("AccessMode <=", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeLike(String value) {
            addCriterion("AccessMode like", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeNotLike(String value) {
            addCriterion("AccessMode not like", value, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeIn(List<String> values) {
            addCriterion("AccessMode in", values, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeNotIn(List<String> values) {
            addCriterion("AccessMode not in", values, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeBetween(String value1, String value2) {
            addCriterion("AccessMode between", value1, value2, "accessmode");
            return (Criteria) this;
        }

        public Criteria andAccessmodeNotBetween(String value1, String value2) {
            addCriterion("AccessMode not between", value1, value2, "accessmode");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleIsNull() {
            addCriterion("BusinessModule is null");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleIsNotNull() {
            addCriterion("BusinessModule is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleEqualTo(String value) {
            addCriterion("BusinessModule =", value, "businessmodule");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleNotEqualTo(String value) {
            addCriterion("BusinessModule <>", value, "businessmodule");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleGreaterThan(String value) {
            addCriterion("BusinessModule >", value, "businessmodule");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessModule >=", value, "businessmodule");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleLessThan(String value) {
            addCriterion("BusinessModule <", value, "businessmodule");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleLessThanOrEqualTo(String value) {
            addCriterion("BusinessModule <=", value, "businessmodule");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleLike(String value) {
            addCriterion("BusinessModule like", value, "businessmodule");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleNotLike(String value) {
            addCriterion("BusinessModule not like", value, "businessmodule");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleIn(List<String> values) {
            addCriterion("BusinessModule in", values, "businessmodule");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleNotIn(List<String> values) {
            addCriterion("BusinessModule not in", values, "businessmodule");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleBetween(String value1, String value2) {
            addCriterion("BusinessModule between", value1, value2, "businessmodule");
            return (Criteria) this;
        }

        public Criteria andBusinessmoduleNotBetween(String value1, String value2) {
            addCriterion("BusinessModule not between", value1, value2, "businessmodule");
            return (Criteria) this;
        }

        public Criteria andActiontypeIsNull() {
            addCriterion("ActionType is null");
            return (Criteria) this;
        }

        public Criteria andActiontypeIsNotNull() {
            addCriterion("ActionType is not null");
            return (Criteria) this;
        }

        public Criteria andActiontypeEqualTo(String value) {
            addCriterion("ActionType =", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotEqualTo(String value) {
            addCriterion("ActionType <>", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeGreaterThan(String value) {
            addCriterion("ActionType >", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("ActionType >=", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLessThan(String value) {
            addCriterion("ActionType <", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLessThanOrEqualTo(String value) {
            addCriterion("ActionType <=", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeLike(String value) {
            addCriterion("ActionType like", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotLike(String value) {
            addCriterion("ActionType not like", value, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeIn(List<String> values) {
            addCriterion("ActionType in", values, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotIn(List<String> values) {
            addCriterion("ActionType not in", values, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeBetween(String value1, String value2) {
            addCriterion("ActionType between", value1, value2, "actiontype");
            return (Criteria) this;
        }

        public Criteria andActiontypeNotBetween(String value1, String value2) {
            addCriterion("ActionType not between", value1, value2, "actiontype");
            return (Criteria) this;
        }

        public Criteria andHostipIsNull() {
            addCriterion("HostIp is null");
            return (Criteria) this;
        }

        public Criteria andHostipIsNotNull() {
            addCriterion("HostIp is not null");
            return (Criteria) this;
        }

        public Criteria andHostipEqualTo(String value) {
            addCriterion("HostIp =", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipNotEqualTo(String value) {
            addCriterion("HostIp <>", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipGreaterThan(String value) {
            addCriterion("HostIp >", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipGreaterThanOrEqualTo(String value) {
            addCriterion("HostIp >=", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipLessThan(String value) {
            addCriterion("HostIp <", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipLessThanOrEqualTo(String value) {
            addCriterion("HostIp <=", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipLike(String value) {
            addCriterion("HostIp like", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipNotLike(String value) {
            addCriterion("HostIp not like", value, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipIn(List<String> values) {
            addCriterion("HostIp in", values, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipNotIn(List<String> values) {
            addCriterion("HostIp not in", values, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipBetween(String value1, String value2) {
            addCriterion("HostIp between", value1, value2, "hostip");
            return (Criteria) this;
        }

        public Criteria andHostipNotBetween(String value1, String value2) {
            addCriterion("HostIp not between", value1, value2, "hostip");
            return (Criteria) this;
        }

        public Criteria andOperurlIsNull() {
            addCriterion("OperUrl is null");
            return (Criteria) this;
        }

        public Criteria andOperurlIsNotNull() {
            addCriterion("OperUrl is not null");
            return (Criteria) this;
        }

        public Criteria andOperurlEqualTo(String value) {
            addCriterion("OperUrl =", value, "operurl");
            return (Criteria) this;
        }

        public Criteria andOperurlNotEqualTo(String value) {
            addCriterion("OperUrl <>", value, "operurl");
            return (Criteria) this;
        }

        public Criteria andOperurlGreaterThan(String value) {
            addCriterion("OperUrl >", value, "operurl");
            return (Criteria) this;
        }

        public Criteria andOperurlGreaterThanOrEqualTo(String value) {
            addCriterion("OperUrl >=", value, "operurl");
            return (Criteria) this;
        }

        public Criteria andOperurlLessThan(String value) {
            addCriterion("OperUrl <", value, "operurl");
            return (Criteria) this;
        }

        public Criteria andOperurlLessThanOrEqualTo(String value) {
            addCriterion("OperUrl <=", value, "operurl");
            return (Criteria) this;
        }

        public Criteria andOperurlLike(String value) {
            addCriterion("OperUrl like", value, "operurl");
            return (Criteria) this;
        }

        public Criteria andOperurlNotLike(String value) {
            addCriterion("OperUrl not like", value, "operurl");
            return (Criteria) this;
        }

        public Criteria andOperurlIn(List<String> values) {
            addCriterion("OperUrl in", values, "operurl");
            return (Criteria) this;
        }

        public Criteria andOperurlNotIn(List<String> values) {
            addCriterion("OperUrl not in", values, "operurl");
            return (Criteria) this;
        }

        public Criteria andOperurlBetween(String value1, String value2) {
            addCriterion("OperUrl between", value1, value2, "operurl");
            return (Criteria) this;
        }

        public Criteria andOperurlNotBetween(String value1, String value2) {
            addCriterion("OperUrl not between", value1, value2, "operurl");
            return (Criteria) this;
        }

        public Criteria andOperparamsIsNull() {
            addCriterion("OperParams is null");
            return (Criteria) this;
        }

        public Criteria andOperparamsIsNotNull() {
            addCriterion("OperParams is not null");
            return (Criteria) this;
        }

        public Criteria andOperparamsEqualTo(String value) {
            addCriterion("OperParams =", value, "operparams");
            return (Criteria) this;
        }

        public Criteria andOperparamsNotEqualTo(String value) {
            addCriterion("OperParams <>", value, "operparams");
            return (Criteria) this;
        }

        public Criteria andOperparamsGreaterThan(String value) {
            addCriterion("OperParams >", value, "operparams");
            return (Criteria) this;
        }

        public Criteria andOperparamsGreaterThanOrEqualTo(String value) {
            addCriterion("OperParams >=", value, "operparams");
            return (Criteria) this;
        }

        public Criteria andOperparamsLessThan(String value) {
            addCriterion("OperParams <", value, "operparams");
            return (Criteria) this;
        }

        public Criteria andOperparamsLessThanOrEqualTo(String value) {
            addCriterion("OperParams <=", value, "operparams");
            return (Criteria) this;
        }

        public Criteria andOperparamsLike(String value) {
            addCriterion("OperParams like", value, "operparams");
            return (Criteria) this;
        }

        public Criteria andOperparamsNotLike(String value) {
            addCriterion("OperParams not like", value, "operparams");
            return (Criteria) this;
        }

        public Criteria andOperparamsIn(List<String> values) {
            addCriterion("OperParams in", values, "operparams");
            return (Criteria) this;
        }

        public Criteria andOperparamsNotIn(List<String> values) {
            addCriterion("OperParams not in", values, "operparams");
            return (Criteria) this;
        }

        public Criteria andOperparamsBetween(String value1, String value2) {
            addCriterion("OperParams between", value1, value2, "operparams");
            return (Criteria) this;
        }

        public Criteria andOperparamsNotBetween(String value1, String value2) {
            addCriterion("OperParams not between", value1, value2, "operparams");
            return (Criteria) this;
        }

        public Criteria andOperresultIsNull() {
            addCriterion("OperResult is null");
            return (Criteria) this;
        }

        public Criteria andOperresultIsNotNull() {
            addCriterion("OperResult is not null");
            return (Criteria) this;
        }

        public Criteria andOperresultEqualTo(String value) {
            addCriterion("OperResult =", value, "operresult");
            return (Criteria) this;
        }

        public Criteria andOperresultNotEqualTo(String value) {
            addCriterion("OperResult <>", value, "operresult");
            return (Criteria) this;
        }

        public Criteria andOperresultGreaterThan(String value) {
            addCriterion("OperResult >", value, "operresult");
            return (Criteria) this;
        }

        public Criteria andOperresultGreaterThanOrEqualTo(String value) {
            addCriterion("OperResult >=", value, "operresult");
            return (Criteria) this;
        }

        public Criteria andOperresultLessThan(String value) {
            addCriterion("OperResult <", value, "operresult");
            return (Criteria) this;
        }

        public Criteria andOperresultLessThanOrEqualTo(String value) {
            addCriterion("OperResult <=", value, "operresult");
            return (Criteria) this;
        }

        public Criteria andOperresultLike(String value) {
            addCriterion("OperResult like", value, "operresult");
            return (Criteria) this;
        }

        public Criteria andOperresultNotLike(String value) {
            addCriterion("OperResult not like", value, "operresult");
            return (Criteria) this;
        }

        public Criteria andOperresultIn(List<String> values) {
            addCriterion("OperResult in", values, "operresult");
            return (Criteria) this;
        }

        public Criteria andOperresultNotIn(List<String> values) {
            addCriterion("OperResult not in", values, "operresult");
            return (Criteria) this;
        }

        public Criteria andOperresultBetween(String value1, String value2) {
            addCriterion("OperResult between", value1, value2, "operresult");
            return (Criteria) this;
        }

        public Criteria andOperresultNotBetween(String value1, String value2) {
            addCriterion("OperResult not between", value1, value2, "operresult");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("AddTime is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("AddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Timestamp value) {
            addCriterion("AddTime =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Timestamp value) {
            addCriterion("AddTime <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Timestamp value) {
            addCriterion("AddTime >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("AddTime >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Timestamp value) {
            addCriterion("AddTime <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("AddTime <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Timestamp> values) {
            addCriterion("AddTime in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Timestamp> values) {
            addCriterion("AddTime not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("AddTime between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("AddTime not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNull() {
            addCriterion("AddUserID is null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNotNull() {
            addCriterion("AddUserID is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdEqualTo(String value) {
            addCriterion("AddUserID =", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotEqualTo(String value) {
            addCriterion("AddUserID <>", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThan(String value) {
            addCriterion("AddUserID >", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("AddUserID >=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThan(String value) {
            addCriterion("AddUserID <", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThanOrEqualTo(String value) {
            addCriterion("AddUserID <=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLike(String value) {
            addCriterion("AddUserID like", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotLike(String value) {
            addCriterion("AddUserID not like", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIn(List<String> values) {
            addCriterion("AddUserID in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotIn(List<String> values) {
            addCriterion("AddUserID not in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdBetween(String value1, String value2) {
            addCriterion("AddUserID between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotBetween(String value1, String value2) {
            addCriterion("AddUserID not between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserNameIsNull() {
            addCriterion("AddUserName is null");
            return (Criteria) this;
        }

        public Criteria andAddUserNameIsNotNull() {
            addCriterion("AddUserName is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserNameEqualTo(String value) {
            addCriterion("AddUserName =", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotEqualTo(String value) {
            addCriterion("AddUserName <>", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameGreaterThan(String value) {
            addCriterion("AddUserName >", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("AddUserName >=", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameLessThan(String value) {
            addCriterion("AddUserName <", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameLessThanOrEqualTo(String value) {
            addCriterion("AddUserName <=", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameLike(String value) {
            addCriterion("AddUserName like", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotLike(String value) {
            addCriterion("AddUserName not like", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameIn(List<String> values) {
            addCriterion("AddUserName in", values, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotIn(List<String> values) {
            addCriterion("AddUserName not in", values, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameBetween(String value1, String value2) {
            addCriterion("AddUserName between", value1, value2, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotBetween(String value1, String value2) {
            addCriterion("AddUserName not between", value1, value2, "addUserName");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Timestamp value) {
            addCriterion("ModifyTime =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Timestamp value) {
            addCriterion("ModifyTime <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Timestamp value) {
            addCriterion("ModifyTime >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("ModifyTime >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Timestamp value) {
            addCriterion("ModifyTime <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("ModifyTime <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Timestamp> values) {
            addCriterion("ModifyTime in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Timestamp> values) {
            addCriterion("ModifyTime not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ModifyTime between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNull() {
            addCriterion("ModifyUserID is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNotNull() {
            addCriterion("ModifyUserID is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdEqualTo(String value) {
            addCriterion("ModifyUserID =", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotEqualTo(String value) {
            addCriterion("ModifyUserID <>", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThan(String value) {
            addCriterion("ModifyUserID >", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyUserID >=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThan(String value) {
            addCriterion("ModifyUserID <", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThanOrEqualTo(String value) {
            addCriterion("ModifyUserID <=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLike(String value) {
            addCriterion("ModifyUserID like", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotLike(String value) {
            addCriterion("ModifyUserID not like", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIn(List<String> values) {
            addCriterion("ModifyUserID in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotIn(List<String> values) {
            addCriterion("ModifyUserID not in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdBetween(String value1, String value2) {
            addCriterion("ModifyUserID between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotBetween(String value1, String value2) {
            addCriterion("ModifyUserID not between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyNameIsNull() {
            addCriterion("ModifyName is null");
            return (Criteria) this;
        }

        public Criteria andModifyNameIsNotNull() {
            addCriterion("ModifyName is not null");
            return (Criteria) this;
        }

        public Criteria andModifyNameEqualTo(String value) {
            addCriterion("ModifyName =", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotEqualTo(String value) {
            addCriterion("ModifyName <>", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameGreaterThan(String value) {
            addCriterion("ModifyName >", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("ModifyName >=", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLessThan(String value) {
            addCriterion("ModifyName <", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLessThanOrEqualTo(String value) {
            addCriterion("ModifyName <=", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLike(String value) {
            addCriterion("ModifyName like", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotLike(String value) {
            addCriterion("ModifyName not like", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameIn(List<String> values) {
            addCriterion("ModifyName in", values, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotIn(List<String> values) {
            addCriterion("ModifyName not in", values, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameBetween(String value1, String value2) {
            addCriterion("ModifyName between", value1, value2, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotBetween(String value1, String value2) {
            addCriterion("ModifyName not between", value1, value2, "modifyName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameIsNull() {
            addCriterion("DeleteName is null");
            return (Criteria) this;
        }

        public Criteria andDeleteNameIsNotNull() {
            addCriterion("DeleteName is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteNameEqualTo(String value) {
            addCriterion("DeleteName =", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotEqualTo(String value) {
            addCriterion("DeleteName <>", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameGreaterThan(String value) {
            addCriterion("DeleteName >", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameGreaterThanOrEqualTo(String value) {
            addCriterion("DeleteName >=", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameLessThan(String value) {
            addCriterion("DeleteName <", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameLessThanOrEqualTo(String value) {
            addCriterion("DeleteName <=", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameLike(String value) {
            addCriterion("DeleteName like", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotLike(String value) {
            addCriterion("DeleteName not like", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameIn(List<String> values) {
            addCriterion("DeleteName in", values, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotIn(List<String> values) {
            addCriterion("DeleteName not in", values, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameBetween(String value1, String value2) {
            addCriterion("DeleteName between", value1, value2, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotBetween(String value1, String value2) {
            addCriterion("DeleteName not between", value1, value2, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("DeleteTime is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("DeleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Timestamp value) {
            addCriterion("DeleteTime =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Timestamp value) {
            addCriterion("DeleteTime <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Timestamp value) {
            addCriterion("DeleteTime >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("DeleteTime >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Timestamp value) {
            addCriterion("DeleteTime <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("DeleteTime <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Timestamp> values) {
            addCriterion("DeleteTime in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Timestamp> values) {
            addCriterion("DeleteTime not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DeleteTime between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DeleteTime not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNull() {
            addCriterion("DeleteMark is null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNotNull() {
            addCriterion("DeleteMark is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkEqualTo(Boolean value) {
            addCriterion("DeleteMark =", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotEqualTo(Boolean value) {
            addCriterion("DeleteMark <>", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThan(Boolean value) {
            addCriterion("DeleteMark >", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DeleteMark >=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThan(Boolean value) {
            addCriterion("DeleteMark <", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThanOrEqualTo(Boolean value) {
            addCriterion("DeleteMark <=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIn(List<Boolean> values) {
            addCriterion("DeleteMark in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotIn(List<Boolean> values) {
            addCriterion("DeleteMark not in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBetween(Boolean value1, Boolean value2) {
            addCriterion("DeleteMark between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DeleteMark not between", value1, value2, "deleteMark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}