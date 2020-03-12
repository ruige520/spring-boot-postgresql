package com.pangu.foying.web.project.admin.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BaseSystemLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseSystemLogExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccessModeIsNull() {
            addCriterion("accessmode is null");
            return (Criteria) this;
        }

        public Criteria andAccessModeIsNotNull() {
            addCriterion("accessmode is not null");
            return (Criteria) this;
        }

        public Criteria andAccessModeEqualTo(String value) {
            addCriterion("accessmode =", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeNotEqualTo(String value) {
            addCriterion("accessmode <>", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeGreaterThan(String value) {
            addCriterion("accessmode >", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeGreaterThanOrEqualTo(String value) {
            addCriterion("accessmode >=", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeLessThan(String value) {
            addCriterion("accessmode <", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeLessThanOrEqualTo(String value) {
            addCriterion("accessmode <=", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeLike(String value) {
            addCriterion("accessmode like", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeNotLike(String value) {
            addCriterion("accessmode not like", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeIn(List<String> values) {
            addCriterion("accessmode in", values, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeNotIn(List<String> values) {
            addCriterion("accessmode not in", values, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeBetween(String value1, String value2) {
            addCriterion("accessmode between", value1, value2, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeNotBetween(String value1, String value2) {
            addCriterion("accessmode not between", value1, value2, "accessMode");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleIsNull() {
            addCriterion("businessmodule is null");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleIsNotNull() {
            addCriterion("businessmodule is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleEqualTo(String value) {
            addCriterion("businessmodule =", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleNotEqualTo(String value) {
            addCriterion("businessmodule <>", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleGreaterThan(String value) {
            addCriterion("businessmodule >", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleGreaterThanOrEqualTo(String value) {
            addCriterion("businessmodule >=", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleLessThan(String value) {
            addCriterion("businessmodule <", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleLessThanOrEqualTo(String value) {
            addCriterion("businessmodule <=", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleLike(String value) {
            addCriterion("businessmodule like", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleNotLike(String value) {
            addCriterion("businessmodule not like", value, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleIn(List<String> values) {
            addCriterion("businessmodule in", values, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleNotIn(List<String> values) {
            addCriterion("businessmodule not in", values, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleBetween(String value1, String value2) {
            addCriterion("businessmodule between", value1, value2, "businessModule");
            return (Criteria) this;
        }

        public Criteria andBusinessModuleNotBetween(String value1, String value2) {
            addCriterion("businessmodule not between", value1, value2, "businessModule");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNull() {
            addCriterion("actiontype is null");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNotNull() {
            addCriterion("actiontype is not null");
            return (Criteria) this;
        }

        public Criteria andActionTypeEqualTo(String value) {
            addCriterion("actiontype =", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotEqualTo(String value) {
            addCriterion("actiontype <>", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThan(String value) {
            addCriterion("actiontype >", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("actiontype >=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThan(String value) {
            addCriterion("actiontype <", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThanOrEqualTo(String value) {
            addCriterion("actiontype <=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLike(String value) {
            addCriterion("actiontype like", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotLike(String value) {
            addCriterion("actiontype not like", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeIn(List<String> values) {
            addCriterion("actiontype in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotIn(List<String> values) {
            addCriterion("actiontype not in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeBetween(String value1, String value2) {
            addCriterion("actiontype between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotBetween(String value1, String value2) {
            addCriterion("actiontype not between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNull() {
            addCriterion("hostip is null");
            return (Criteria) this;
        }

        public Criteria andHostIpIsNotNull() {
            addCriterion("hostip is not null");
            return (Criteria) this;
        }

        public Criteria andHostIpEqualTo(String value) {
            addCriterion("hostip =", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotEqualTo(String value) {
            addCriterion("hostip <>", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThan(String value) {
            addCriterion("hostip >", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpGreaterThanOrEqualTo(String value) {
            addCriterion("hostip >=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThan(String value) {
            addCriterion("hostip <", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLessThanOrEqualTo(String value) {
            addCriterion("hostip <=", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpLike(String value) {
            addCriterion("hostip like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotLike(String value) {
            addCriterion("hostip not like", value, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpIn(List<String> values) {
            addCriterion("hostip in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotIn(List<String> values) {
            addCriterion("hostip not in", values, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpBetween(String value1, String value2) {
            addCriterion("hostip between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andHostIpNotBetween(String value1, String value2) {
            addCriterion("hostip not between", value1, value2, "hostIp");
            return (Criteria) this;
        }

        public Criteria andOperUrlIsNull() {
            addCriterion("operurl is null");
            return (Criteria) this;
        }

        public Criteria andOperUrlIsNotNull() {
            addCriterion("operurl is not null");
            return (Criteria) this;
        }

        public Criteria andOperUrlEqualTo(String value) {
            addCriterion("operurl =", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlNotEqualTo(String value) {
            addCriterion("operurl <>", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlGreaterThan(String value) {
            addCriterion("operurl >", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlGreaterThanOrEqualTo(String value) {
            addCriterion("operurl >=", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlLessThan(String value) {
            addCriterion("operurl <", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlLessThanOrEqualTo(String value) {
            addCriterion("operurl <=", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlLike(String value) {
            addCriterion("operurl like", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlNotLike(String value) {
            addCriterion("operurl not like", value, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlIn(List<String> values) {
            addCriterion("operurl in", values, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlNotIn(List<String> values) {
            addCriterion("operurl not in", values, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlBetween(String value1, String value2) {
            addCriterion("operurl between", value1, value2, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperUrlNotBetween(String value1, String value2) {
            addCriterion("operurl not between", value1, value2, "operUrl");
            return (Criteria) this;
        }

        public Criteria andOperParamsIsNull() {
            addCriterion("operparams is null");
            return (Criteria) this;
        }

        public Criteria andOperParamsIsNotNull() {
            addCriterion("operparams is not null");
            return (Criteria) this;
        }

        public Criteria andOperParamsEqualTo(String value) {
            addCriterion("operparams =", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsNotEqualTo(String value) {
            addCriterion("operparams <>", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsGreaterThan(String value) {
            addCriterion("operparams >", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsGreaterThanOrEqualTo(String value) {
            addCriterion("operparams >=", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsLessThan(String value) {
            addCriterion("operparams <", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsLessThanOrEqualTo(String value) {
            addCriterion("operparams <=", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsLike(String value) {
            addCriterion("operparams like", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsNotLike(String value) {
            addCriterion("operparams not like", value, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsIn(List<String> values) {
            addCriterion("operparams in", values, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsNotIn(List<String> values) {
            addCriterion("operparams not in", values, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsBetween(String value1, String value2) {
            addCriterion("operparams between", value1, value2, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperParamsNotBetween(String value1, String value2) {
            addCriterion("operparams not between", value1, value2, "operParams");
            return (Criteria) this;
        }

        public Criteria andOperResultIsNull() {
            addCriterion("operresult is null");
            return (Criteria) this;
        }

        public Criteria andOperResultIsNotNull() {
            addCriterion("operresult is not null");
            return (Criteria) this;
        }

        public Criteria andOperResultEqualTo(String value) {
            addCriterion("operresult =", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultNotEqualTo(String value) {
            addCriterion("operresult <>", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultGreaterThan(String value) {
            addCriterion("operresult >", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultGreaterThanOrEqualTo(String value) {
            addCriterion("operresult >=", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultLessThan(String value) {
            addCriterion("operresult <", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultLessThanOrEqualTo(String value) {
            addCriterion("operresult <=", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultLike(String value) {
            addCriterion("operresult like", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultNotLike(String value) {
            addCriterion("operresult not like", value, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultIn(List<String> values) {
            addCriterion("operresult in", values, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultNotIn(List<String> values) {
            addCriterion("operresult not in", values, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultBetween(String value1, String value2) {
            addCriterion("operresult between", value1, value2, "operResult");
            return (Criteria) this;
        }

        public Criteria andOperResultNotBetween(String value1, String value2) {
            addCriterion("operresult not between", value1, value2, "operResult");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Timestamp value) {
            addCriterion("addtime =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Timestamp value) {
            addCriterion("addtime <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Timestamp value) {
            addCriterion("addtime >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("addtime >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Timestamp value) {
            addCriterion("addtime <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("addtime <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Timestamp> values) {
            addCriterion("addtime in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Timestamp> values) {
            addCriterion("addtime not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("addtime between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("addtime not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNull() {
            addCriterion("adduserid is null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNotNull() {
            addCriterion("adduserid is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdEqualTo(String value) {
            addCriterion("adduserid =", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotEqualTo(String value) {
            addCriterion("adduserid <>", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThan(String value) {
            addCriterion("adduserid >", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("adduserid >=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThan(String value) {
            addCriterion("adduserid <", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThanOrEqualTo(String value) {
            addCriterion("adduserid <=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLike(String value) {
            addCriterion("adduserid like", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotLike(String value) {
            addCriterion("adduserid not like", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIn(List<String> values) {
            addCriterion("adduserid in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotIn(List<String> values) {
            addCriterion("adduserid not in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdBetween(String value1, String value2) {
            addCriterion("adduserid between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotBetween(String value1, String value2) {
            addCriterion("adduserid not between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserNameIsNull() {
            addCriterion("addusername is null");
            return (Criteria) this;
        }

        public Criteria andAddUserNameIsNotNull() {
            addCriterion("addusername is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserNameEqualTo(String value) {
            addCriterion("addusername =", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotEqualTo(String value) {
            addCriterion("addusername <>", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameGreaterThan(String value) {
            addCriterion("addusername >", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("addusername >=", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameLessThan(String value) {
            addCriterion("addusername <", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameLessThanOrEqualTo(String value) {
            addCriterion("addusername <=", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameLike(String value) {
            addCriterion("addusername like", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotLike(String value) {
            addCriterion("addusername not like", value, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameIn(List<String> values) {
            addCriterion("addusername in", values, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotIn(List<String> values) {
            addCriterion("addusername not in", values, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameBetween(String value1, String value2) {
            addCriterion("addusername between", value1, value2, "addUserName");
            return (Criteria) this;
        }

        public Criteria andAddUserNameNotBetween(String value1, String value2) {
            addCriterion("addusername not between", value1, value2, "addUserName");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modifytime is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Timestamp value) {
            addCriterion("modifytime =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Timestamp value) {
            addCriterion("modifytime <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Timestamp value) {
            addCriterion("modifytime >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("modifytime >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Timestamp value) {
            addCriterion("modifytime <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("modifytime <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Timestamp> values) {
            addCriterion("modifytime in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Timestamp> values) {
            addCriterion("modifytime not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("modifytime between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("modifytime not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNull() {
            addCriterion("modifyuserid is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIsNotNull() {
            addCriterion("modifyuserid is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdEqualTo(String value) {
            addCriterion("modifyuserid =", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotEqualTo(String value) {
            addCriterion("modifyuserid <>", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThan(String value) {
            addCriterion("modifyuserid >", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("modifyuserid >=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThan(String value) {
            addCriterion("modifyuserid <", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLessThanOrEqualTo(String value) {
            addCriterion("modifyuserid <=", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdLike(String value) {
            addCriterion("modifyuserid like", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotLike(String value) {
            addCriterion("modifyuserid not like", value, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdIn(List<String> values) {
            addCriterion("modifyuserid in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotIn(List<String> values) {
            addCriterion("modifyuserid not in", values, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdBetween(String value1, String value2) {
            addCriterion("modifyuserid between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyUserIdNotBetween(String value1, String value2) {
            addCriterion("modifyuserid not between", value1, value2, "modifyUserId");
            return (Criteria) this;
        }

        public Criteria andModifyNameIsNull() {
            addCriterion("modifyname is null");
            return (Criteria) this;
        }

        public Criteria andModifyNameIsNotNull() {
            addCriterion("modifyname is not null");
            return (Criteria) this;
        }

        public Criteria andModifyNameEqualTo(String value) {
            addCriterion("modifyname =", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotEqualTo(String value) {
            addCriterion("modifyname <>", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameGreaterThan(String value) {
            addCriterion("modifyname >", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("modifyname >=", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLessThan(String value) {
            addCriterion("modifyname <", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLessThanOrEqualTo(String value) {
            addCriterion("modifyname <=", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLike(String value) {
            addCriterion("modifyname like", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotLike(String value) {
            addCriterion("modifyname not like", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameIn(List<String> values) {
            addCriterion("modifyname in", values, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotIn(List<String> values) {
            addCriterion("modifyname not in", values, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameBetween(String value1, String value2) {
            addCriterion("modifyname between", value1, value2, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotBetween(String value1, String value2) {
            addCriterion("modifyname not between", value1, value2, "modifyName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameIsNull() {
            addCriterion("deletename is null");
            return (Criteria) this;
        }

        public Criteria andDeleteNameIsNotNull() {
            addCriterion("deletename is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteNameEqualTo(String value) {
            addCriterion("deletename =", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotEqualTo(String value) {
            addCriterion("deletename <>", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameGreaterThan(String value) {
            addCriterion("deletename >", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameGreaterThanOrEqualTo(String value) {
            addCriterion("deletename >=", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameLessThan(String value) {
            addCriterion("deletename <", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameLessThanOrEqualTo(String value) {
            addCriterion("deletename <=", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameLike(String value) {
            addCriterion("deletename like", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotLike(String value) {
            addCriterion("deletename not like", value, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameIn(List<String> values) {
            addCriterion("deletename in", values, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotIn(List<String> values) {
            addCriterion("deletename not in", values, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameBetween(String value1, String value2) {
            addCriterion("deletename between", value1, value2, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteNameNotBetween(String value1, String value2) {
            addCriterion("deletename not between", value1, value2, "deleteName");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("deletetime is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("deletetime is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Timestamp value) {
            addCriterion("deletetime =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Timestamp value) {
            addCriterion("deletetime <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Timestamp value) {
            addCriterion("deletetime >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("deletetime >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Timestamp value) {
            addCriterion("deletetime <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("deletetime <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Timestamp> values) {
            addCriterion("deletetime in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Timestamp> values) {
            addCriterion("deletetime not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("deletetime between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("deletetime not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNull() {
            addCriterion("deletemark is null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNotNull() {
            addCriterion("deletemark is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkEqualTo(Boolean value) {
            addCriterion("deletemark =", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotEqualTo(Boolean value) {
            addCriterion("deletemark <>", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThan(Boolean value) {
            addCriterion("deletemark >", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deletemark >=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThan(Boolean value) {
            addCriterion("deletemark <", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThanOrEqualTo(Boolean value) {
            addCriterion("deletemark <=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIn(List<Boolean> values) {
            addCriterion("deletemark in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotIn(List<Boolean> values) {
            addCriterion("deletemark not in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBetween(Boolean value1, Boolean value2) {
            addCriterion("deletemark between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deletemark not between", value1, value2, "deleteMark");
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