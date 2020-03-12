package com.pangu.foying.web.project.admin.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class WechatUserInfoExample {
    protected int pageIndex = 1;//第几页

    protected int pageSize = 10;//每页记录数

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

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

    public WechatUserInfoExample() {
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

        public Criteria andOpenIdIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("openid =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("openid <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("openid >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("openid <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("openid like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("openid not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("openid in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("openid not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nickname =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nickname <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nickname like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nickname not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nickname in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNull() {
            addCriterion("headimgurl is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIsNotNull() {
            addCriterion("headimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlEqualTo(String value) {
            addCriterion("headimgurl =", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotEqualTo(String value) {
            addCriterion("headimgurl <>", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThan(String value) {
            addCriterion("headimgurl >", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("headimgurl >=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThan(String value) {
            addCriterion("headimgurl <", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLessThanOrEqualTo(String value) {
            addCriterion("headimgurl <=", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlLike(String value) {
            addCriterion("headimgurl like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotLike(String value) {
            addCriterion("headimgurl not like", value, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlIn(List<String> values) {
            addCriterion("headimgurl in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotIn(List<String> values) {
            addCriterion("headimgurl not in", values, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlBetween(String value1, String value2) {
            addCriterion("headimgurl between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andHeadimgurlNotBetween(String value1, String value2) {
            addCriterion("headimgurl not between", value1, value2, "headimgurl");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIsNull() {
            addCriterion("subscribe_time is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIsNotNull() {
            addCriterion("subscribe_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeEqualTo(String value) {
            addCriterion("subscribe_time =", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotEqualTo(String value) {
            addCriterion("subscribe_time <>", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeGreaterThan(String value) {
            addCriterion("subscribe_time >", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("subscribe_time >=", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeLessThan(String value) {
            addCriterion("subscribe_time <", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeLessThanOrEqualTo(String value) {
            addCriterion("subscribe_time <=", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeLike(String value) {
            addCriterion("subscribe_time like", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotLike(String value) {
            addCriterion("subscribe_time not like", value, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeIn(List<String> values) {
            addCriterion("subscribe_time in", values, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotIn(List<String> values) {
            addCriterion("subscribe_time not in", values, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeBetween(String value1, String value2) {
            addCriterion("subscribe_time between", value1, value2, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andSubscribeTimeNotBetween(String value1, String value2) {
            addCriterion("subscribe_time not between", value1, value2, "subscribeTime");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNull() {
            addCriterion("unionid is null");
            return (Criteria) this;
        }

        public Criteria andUnionIdIsNotNull() {
            addCriterion("unionid is not null");
            return (Criteria) this;
        }

        public Criteria andUnionIdEqualTo(String value) {
            addCriterion("unionid =", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotEqualTo(String value) {
            addCriterion("unionid <>", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThan(String value) {
            addCriterion("unionid >", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("unionid >=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThan(String value) {
            addCriterion("unionid <", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLessThanOrEqualTo(String value) {
            addCriterion("unionid <=", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdLike(String value) {
            addCriterion("unionid like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotLike(String value) {
            addCriterion("unionid not like", value, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdIn(List<String> values) {
            addCriterion("unionid in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotIn(List<String> values) {
            addCriterion("unionid not in", values, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdBetween(String value1, String value2) {
            addCriterion("unionid between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andUnionIdNotBetween(String value1, String value2) {
            addCriterion("unionid not between", value1, value2, "unionId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("groupid =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("groupid <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("groupid >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("groupid >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("groupid <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("groupid <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("groupid like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("groupid not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("groupid in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("groupid not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("groupid between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("groupid not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andTagidListIsNull() {
            addCriterion("tagid_list is null");
            return (Criteria) this;
        }

        public Criteria andTagidListIsNotNull() {
            addCriterion("tagid_list is not null");
            return (Criteria) this;
        }

        public Criteria andTagidListEqualTo(String value) {
            addCriterion("tagid_list =", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListNotEqualTo(String value) {
            addCriterion("tagid_list <>", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListGreaterThan(String value) {
            addCriterion("tagid_list >", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListGreaterThanOrEqualTo(String value) {
            addCriterion("tagid_list >=", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListLessThan(String value) {
            addCriterion("tagid_list <", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListLessThanOrEqualTo(String value) {
            addCriterion("tagid_list <=", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListLike(String value) {
            addCriterion("tagid_list like", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListNotLike(String value) {
            addCriterion("tagid_list not like", value, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListIn(List<String> values) {
            addCriterion("tagid_list in", values, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListNotIn(List<String> values) {
            addCriterion("tagid_list not in", values, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListBetween(String value1, String value2) {
            addCriterion("tagid_list between", value1, value2, "tagidList");
            return (Criteria) this;
        }

        public Criteria andTagidListNotBetween(String value1, String value2) {
            addCriterion("tagid_list not between", value1, value2, "tagidList");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneIsNull() {
            addCriterion("subscribe_scene is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneIsNotNull() {
            addCriterion("subscribe_scene is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneEqualTo(String value) {
            addCriterion("subscribe_scene =", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneNotEqualTo(String value) {
            addCriterion("subscribe_scene <>", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneGreaterThan(String value) {
            addCriterion("subscribe_scene >", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneGreaterThanOrEqualTo(String value) {
            addCriterion("subscribe_scene >=", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneLessThan(String value) {
            addCriterion("subscribe_scene <", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneLessThanOrEqualTo(String value) {
            addCriterion("subscribe_scene <=", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneLike(String value) {
            addCriterion("subscribe_scene like", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneNotLike(String value) {
            addCriterion("subscribe_scene not like", value, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneIn(List<String> values) {
            addCriterion("subscribe_scene in", values, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneNotIn(List<String> values) {
            addCriterion("subscribe_scene not in", values, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneBetween(String value1, String value2) {
            addCriterion("subscribe_scene between", value1, value2, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andSubscribeSceneNotBetween(String value1, String value2) {
            addCriterion("subscribe_scene not between", value1, value2, "subscribeScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneIsNull() {
            addCriterion("qr_scene is null");
            return (Criteria) this;
        }

        public Criteria andQrSceneIsNotNull() {
            addCriterion("qr_scene is not null");
            return (Criteria) this;
        }

        public Criteria andQrSceneEqualTo(String value) {
            addCriterion("qr_scene =", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneNotEqualTo(String value) {
            addCriterion("qr_scene <>", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneGreaterThan(String value) {
            addCriterion("qr_scene >", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneGreaterThanOrEqualTo(String value) {
            addCriterion("qr_scene >=", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneLessThan(String value) {
            addCriterion("qr_scene <", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneLessThanOrEqualTo(String value) {
            addCriterion("qr_scene <=", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneLike(String value) {
            addCriterion("qr_scene like", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneNotLike(String value) {
            addCriterion("qr_scene not like", value, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneIn(List<String> values) {
            addCriterion("qr_scene in", values, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneNotIn(List<String> values) {
            addCriterion("qr_scene not in", values, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneBetween(String value1, String value2) {
            addCriterion("qr_scene between", value1, value2, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneNotBetween(String value1, String value2) {
            addCriterion("qr_scene not between", value1, value2, "qrScene");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrIsNull() {
            addCriterion("qr_scene_str is null");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrIsNotNull() {
            addCriterion("qr_scene_str is not null");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrEqualTo(String value) {
            addCriterion("qr_scene_str =", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrNotEqualTo(String value) {
            addCriterion("qr_scene_str <>", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrGreaterThan(String value) {
            addCriterion("qr_scene_str >", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrGreaterThanOrEqualTo(String value) {
            addCriterion("qr_scene_str >=", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrLessThan(String value) {
            addCriterion("qr_scene_str <", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrLessThanOrEqualTo(String value) {
            addCriterion("qr_scene_str <=", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrLike(String value) {
            addCriterion("qr_scene_str like", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrNotLike(String value) {
            addCriterion("qr_scene_str not like", value, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrIn(List<String> values) {
            addCriterion("qr_scene_str in", values, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrNotIn(List<String> values) {
            addCriterion("qr_scene_str not in", values, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrBetween(String value1, String value2) {
            addCriterion("qr_scene_str between", value1, value2, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andQrSceneStrNotBetween(String value1, String value2) {
            addCriterion("qr_scene_str not between", value1, value2, "qrSceneStr");
            return (Criteria) this;
        }

        public Criteria andSubscribeIsNull() {
            addCriterion("subscribe is null");
            return (Criteria) this;
        }

        public Criteria andSubscribeIsNotNull() {
            addCriterion("subscribe is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribeEqualTo(String value) {
            addCriterion("subscribe =", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotEqualTo(String value) {
            addCriterion("subscribe <>", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeGreaterThan(String value) {
            addCriterion("subscribe >", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeGreaterThanOrEqualTo(String value) {
            addCriterion("subscribe >=", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeLessThan(String value) {
            addCriterion("subscribe <", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeLessThanOrEqualTo(String value) {
            addCriterion("subscribe <=", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeLike(String value) {
            addCriterion("subscribe like", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotLike(String value) {
            addCriterion("subscribe not like", value, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeIn(List<String> values) {
            addCriterion("subscribe in", values, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotIn(List<String> values) {
            addCriterion("subscribe not in", values, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeBetween(String value1, String value2) {
            addCriterion("subscribe between", value1, value2, "subscribe");
            return (Criteria) this;
        }

        public Criteria andSubscribeNotBetween(String value1, String value2) {
            addCriterion("subscribe not between", value1, value2, "subscribe");
            return (Criteria) this;
        }

        public Criteria andErrmsgIsNull() {
            addCriterion("errmsg is null");
            return (Criteria) this;
        }

        public Criteria andErrmsgIsNotNull() {
            addCriterion("errmsg is not null");
            return (Criteria) this;
        }

        public Criteria andErrmsgEqualTo(String value) {
            addCriterion("errmsg =", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotEqualTo(String value) {
            addCriterion("errmsg <>", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgGreaterThan(String value) {
            addCriterion("errmsg >", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgGreaterThanOrEqualTo(String value) {
            addCriterion("errmsg >=", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgLessThan(String value) {
            addCriterion("errmsg <", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgLessThanOrEqualTo(String value) {
            addCriterion("errmsg <=", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgLike(String value) {
            addCriterion("errmsg like", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotLike(String value) {
            addCriterion("errmsg not like", value, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgIn(List<String> values) {
            addCriterion("errmsg in", values, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotIn(List<String> values) {
            addCriterion("errmsg not in", values, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgBetween(String value1, String value2) {
            addCriterion("errmsg between", value1, value2, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrmsgNotBetween(String value1, String value2) {
            addCriterion("errmsg not between", value1, value2, "errmsg");
            return (Criteria) this;
        }

        public Criteria andErrcodeIsNull() {
            addCriterion("errcode is null");
            return (Criteria) this;
        }

        public Criteria andErrcodeIsNotNull() {
            addCriterion("errcode is not null");
            return (Criteria) this;
        }

        public Criteria andErrcodeEqualTo(String value) {
            addCriterion("errcode =", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotEqualTo(String value) {
            addCriterion("errcode <>", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeGreaterThan(String value) {
            addCriterion("errcode >", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("errcode >=", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLessThan(String value) {
            addCriterion("errcode <", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLessThanOrEqualTo(String value) {
            addCriterion("errcode <=", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLike(String value) {
            addCriterion("errcode like", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotLike(String value) {
            addCriterion("errcode not like", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeIn(List<String> values) {
            addCriterion("errcode in", values, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotIn(List<String> values) {
            addCriterion("errcode not in", values, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeBetween(String value1, String value2) {
            addCriterion("errcode between", value1, value2, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotBetween(String value1, String value2) {
            addCriterion("errcode not between", value1, value2, "errcode");
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