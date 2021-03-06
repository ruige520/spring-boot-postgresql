package com.pangu.foying.web.project.admin.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BaseAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseAreaExample() {
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

        public Criteria andMainIdIsNull() {
            addCriterion("mainid is null");
            return (Criteria) this;
        }

        public Criteria andMainIdIsNotNull() {
            addCriterion("mainid is not null");
            return (Criteria) this;
        }

        public Criteria andMainIdEqualTo(String value) {
            addCriterion("mainid =", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotEqualTo(String value) {
            addCriterion("mainid <>", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThan(String value) {
            addCriterion("mainid >", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThanOrEqualTo(String value) {
            addCriterion("mainid >=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThan(String value) {
            addCriterion("mainid <", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThanOrEqualTo(String value) {
            addCriterion("mainid <=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLike(String value) {
            addCriterion("mainid like", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotLike(String value) {
            addCriterion("mainid not like", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdIn(List<String> values) {
            addCriterion("mainid in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotIn(List<String> values) {
            addCriterion("mainid not in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdBetween(String value1, String value2) {
            addCriterion("mainid between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotBetween(String value1, String value2) {
            addCriterion("mainid not between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parentid =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parentid <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parentid >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parentid >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parentid <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parentid <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parentid like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parentid not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parentid in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parentid not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parentid between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parentid not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andEnCodeIsNull() {
            addCriterion("encode is null");
            return (Criteria) this;
        }

        public Criteria andEnCodeIsNotNull() {
            addCriterion("encode is not null");
            return (Criteria) this;
        }

        public Criteria andEnCodeEqualTo(String value) {
            addCriterion("encode =", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeNotEqualTo(String value) {
            addCriterion("encode <>", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeGreaterThan(String value) {
            addCriterion("encode >", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("encode >=", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeLessThan(String value) {
            addCriterion("encode <", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeLessThanOrEqualTo(String value) {
            addCriterion("encode <=", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeLike(String value) {
            addCriterion("encode like", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeNotLike(String value) {
            addCriterion("encode not like", value, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeIn(List<String> values) {
            addCriterion("encode in", values, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeNotIn(List<String> values) {
            addCriterion("encode not in", values, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeBetween(String value1, String value2) {
            addCriterion("encode between", value1, value2, "enCode");
            return (Criteria) this;
        }

        public Criteria andEnCodeNotBetween(String value1, String value2) {
            addCriterion("encode not between", value1, value2, "enCode");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("areaname is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("areaname is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("areaname =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("areaname <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("areaname >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("areaname >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("areaname <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("areaname <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("areaname like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("areaname not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("areaname in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("areaname not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("areaname between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("areaname not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingIsNull() {
            addCriterion("simplespelling is null");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingIsNotNull() {
            addCriterion("simplespelling is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingEqualTo(String value) {
            addCriterion("simplespelling =", value, "simpleSpelling");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingNotEqualTo(String value) {
            addCriterion("simplespelling <>", value, "simpleSpelling");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingGreaterThan(String value) {
            addCriterion("simplespelling >", value, "simpleSpelling");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingGreaterThanOrEqualTo(String value) {
            addCriterion("simplespelling >=", value, "simpleSpelling");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingLessThan(String value) {
            addCriterion("simplespelling <", value, "simpleSpelling");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingLessThanOrEqualTo(String value) {
            addCriterion("simplespelling <=", value, "simpleSpelling");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingLike(String value) {
            addCriterion("simplespelling like", value, "simpleSpelling");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingNotLike(String value) {
            addCriterion("simplespelling not like", value, "simpleSpelling");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingIn(List<String> values) {
            addCriterion("simplespelling in", values, "simpleSpelling");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingNotIn(List<String> values) {
            addCriterion("simplespelling not in", values, "simpleSpelling");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingBetween(String value1, String value2) {
            addCriterion("simplespelling between", value1, value2, "simpleSpelling");
            return (Criteria) this;
        }

        public Criteria andSimpleSpellingNotBetween(String value1, String value2) {
            addCriterion("simplespelling not between", value1, value2, "simpleSpelling");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIsNull() {
            addCriterion("arealevel is null");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIsNotNull() {
            addCriterion("arealevel is not null");
            return (Criteria) this;
        }

        public Criteria andAreaLevelEqualTo(Integer value) {
            addCriterion("arealevel =", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelNotEqualTo(Integer value) {
            addCriterion("arealevel <>", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelGreaterThan(Integer value) {
            addCriterion("arealevel >", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("arealevel >=", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelLessThan(Integer value) {
            addCriterion("arealevel <", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelLessThanOrEqualTo(Integer value) {
            addCriterion("arealevel <=", value, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelIn(List<Integer> values) {
            addCriterion("arealevel in", values, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelNotIn(List<Integer> values) {
            addCriterion("arealevel not in", values, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelBetween(Integer value1, Integer value2) {
            addCriterion("arealevel between", value1, value2, "areaLevel");
            return (Criteria) this;
        }

        public Criteria andAreaLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("arealevel not between", value1, value2, "areaLevel");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSortCodeIsNull() {
            addCriterion("sortcode is null");
            return (Criteria) this;
        }

        public Criteria andSortCodeIsNotNull() {
            addCriterion("sortcode is not null");
            return (Criteria) this;
        }

        public Criteria andSortCodeEqualTo(Integer value) {
            addCriterion("sortcode =", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeNotEqualTo(Integer value) {
            addCriterion("sortcode <>", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeGreaterThan(Integer value) {
            addCriterion("sortcode >", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortcode >=", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeLessThan(Integer value) {
            addCriterion("sortcode <", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeLessThanOrEqualTo(Integer value) {
            addCriterion("sortcode <=", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeIn(List<Integer> values) {
            addCriterion("sortcode in", values, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeNotIn(List<Integer> values) {
            addCriterion("sortcode not in", values, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeBetween(Integer value1, Integer value2) {
            addCriterion("sortcode between", value1, value2, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("sortcode not between", value1, value2, "sortCode");
            return (Criteria) this;
        }

        public Criteria andIsSysIsNull() {
            addCriterion("issys is null");
            return (Criteria) this;
        }

        public Criteria andIsSysIsNotNull() {
            addCriterion("issys is not null");
            return (Criteria) this;
        }

        public Criteria andIsSysEqualTo(Boolean value) {
            addCriterion("issys =", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotEqualTo(Boolean value) {
            addCriterion("issys <>", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysGreaterThan(Boolean value) {
            addCriterion("issys >", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysGreaterThanOrEqualTo(Boolean value) {
            addCriterion("issys >=", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysLessThan(Boolean value) {
            addCriterion("issys <", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysLessThanOrEqualTo(Boolean value) {
            addCriterion("issys <=", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysIn(List<Boolean> values) {
            addCriterion("issys in", values, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotIn(List<Boolean> values) {
            addCriterion("issys not in", values, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysBetween(Boolean value1, Boolean value2) {
            addCriterion("issys between", value1, value2, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotBetween(Boolean value1, Boolean value2) {
            addCriterion("issys not between", value1, value2, "isSys");
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