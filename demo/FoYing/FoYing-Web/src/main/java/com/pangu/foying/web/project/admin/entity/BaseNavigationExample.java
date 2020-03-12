package com.pangu.foying.web.project.admin.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BaseNavigationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseNavigationExample() {
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

        public Criteria andMainIdIsNull() {
            addCriterion("MainID is null");
            return (Criteria) this;
        }

        public Criteria andMainIdIsNotNull() {
            addCriterion("MainID is not null");
            return (Criteria) this;
        }

        public Criteria andMainIdEqualTo(Integer value) {
            addCriterion("MainID =", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotEqualTo(Integer value) {
            addCriterion("MainID <>", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThan(Integer value) {
            addCriterion("MainID >", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MainID >=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThan(Integer value) {
            addCriterion("MainID <", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdLessThanOrEqualTo(Integer value) {
            addCriterion("MainID <=", value, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdIn(List<Integer> values) {
            addCriterion("MainID in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotIn(List<Integer> values) {
            addCriterion("MainID not in", values, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdBetween(Integer value1, Integer value2) {
            addCriterion("MainID between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andMainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MainID not between", value1, value2, "mainId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("ParentID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("ParentID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("ParentID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("ParentID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("ParentID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("ParentID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("ParentID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("ParentID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("ParentID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("ParentID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeIsNull() {
            addCriterion("NavigationType is null");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeIsNotNull() {
            addCriterion("NavigationType is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeEqualTo(String value) {
            addCriterion("NavigationType =", value, "navigationType");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeNotEqualTo(String value) {
            addCriterion("NavigationType <>", value, "navigationType");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeGreaterThan(String value) {
            addCriterion("NavigationType >", value, "navigationType");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NavigationType >=", value, "navigationType");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeLessThan(String value) {
            addCriterion("NavigationType <", value, "navigationType");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeLessThanOrEqualTo(String value) {
            addCriterion("NavigationType <=", value, "navigationType");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeLike(String value) {
            addCriterion("NavigationType like", value, "navigationType");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeNotLike(String value) {
            addCriterion("NavigationType not like", value, "navigationType");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeIn(List<String> values) {
            addCriterion("NavigationType in", values, "navigationType");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeNotIn(List<String> values) {
            addCriterion("NavigationType not in", values, "navigationType");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeBetween(String value1, String value2) {
            addCriterion("NavigationType between", value1, value2, "navigationType");
            return (Criteria) this;
        }

        public Criteria andNavigationTypeNotBetween(String value1, String value2) {
            addCriterion("NavigationType not between", value1, value2, "navigationType");
            return (Criteria) this;
        }

        public Criteria andNavigationNameIsNull() {
            addCriterion("NavigationName is null");
            return (Criteria) this;
        }

        public Criteria andNavigationNameIsNotNull() {
            addCriterion("NavigationName is not null");
            return (Criteria) this;
        }

        public Criteria andNavigationNameEqualTo(String value) {
            addCriterion("NavigationName =", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameNotEqualTo(String value) {
            addCriterion("NavigationName <>", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameGreaterThan(String value) {
            addCriterion("NavigationName >", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameGreaterThanOrEqualTo(String value) {
            addCriterion("NavigationName >=", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameLessThan(String value) {
            addCriterion("NavigationName <", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameLessThanOrEqualTo(String value) {
            addCriterion("NavigationName <=", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameLike(String value) {
            addCriterion("NavigationName like", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameNotLike(String value) {
            addCriterion("NavigationName not like", value, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameIn(List<String> values) {
            addCriterion("NavigationName in", values, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameNotIn(List<String> values) {
            addCriterion("NavigationName not in", values, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameBetween(String value1, String value2) {
            addCriterion("NavigationName between", value1, value2, "navigationName");
            return (Criteria) this;
        }

        public Criteria andNavigationNameNotBetween(String value1, String value2) {
            addCriterion("NavigationName not between", value1, value2, "navigationName");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNull() {
            addCriterion("SubTitle is null");
            return (Criteria) this;
        }

        public Criteria andSubTitleIsNotNull() {
            addCriterion("SubTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubTitleEqualTo(String value) {
            addCriterion("SubTitle =", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotEqualTo(String value) {
            addCriterion("SubTitle <>", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThan(String value) {
            addCriterion("SubTitle >", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SubTitle >=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThan(String value) {
            addCriterion("SubTitle <", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLessThanOrEqualTo(String value) {
            addCriterion("SubTitle <=", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleLike(String value) {
            addCriterion("SubTitle like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotLike(String value) {
            addCriterion("SubTitle not like", value, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleIn(List<String> values) {
            addCriterion("SubTitle in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotIn(List<String> values) {
            addCriterion("SubTitle not in", values, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleBetween(String value1, String value2) {
            addCriterion("SubTitle between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andSubTitleNotBetween(String value1, String value2) {
            addCriterion("SubTitle not between", value1, value2, "subTitle");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("IconUrl is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("IconUrl is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("IconUrl =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("IconUrl <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("IconUrl >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IconUrl >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("IconUrl <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("IconUrl <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("IconUrl like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("IconUrl not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("IconUrl in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("IconUrl not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("IconUrl between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("IconUrl not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("LinkUrl is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("LinkUrl is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("LinkUrl =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("LinkUrl <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("LinkUrl >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LinkUrl >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("LinkUrl <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("LinkUrl <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("LinkUrl like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("LinkUrl not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("LinkUrl in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("LinkUrl not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("LinkUrl between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("LinkUrl not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNull() {
            addCriterion("IsLock is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("IsLock is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(Boolean value) {
            addCriterion("IsLock =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(Boolean value) {
            addCriterion("IsLock <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(Boolean value) {
            addCriterion("IsLock >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsLock >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(Boolean value) {
            addCriterion("IsLock <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(Boolean value) {
            addCriterion("IsLock <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<Boolean> values) {
            addCriterion("IsLock in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<Boolean> values) {
            addCriterion("IsLock not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(Boolean value1, Boolean value2) {
            addCriterion("IsLock between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsLock not between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNull() {
            addCriterion("ActionType is null");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNotNull() {
            addCriterion("ActionType is not null");
            return (Criteria) this;
        }

        public Criteria andActionTypeEqualTo(String value) {
            addCriterion("ActionType =", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotEqualTo(String value) {
            addCriterion("ActionType <>", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThan(String value) {
            addCriterion("ActionType >", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ActionType >=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThan(String value) {
            addCriterion("ActionType <", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThanOrEqualTo(String value) {
            addCriterion("ActionType <=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLike(String value) {
            addCriterion("ActionType like", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotLike(String value) {
            addCriterion("ActionType not like", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeIn(List<String> values) {
            addCriterion("ActionType in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotIn(List<String> values) {
            addCriterion("ActionType not in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeBetween(String value1, String value2) {
            addCriterion("ActionType between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotBetween(String value1, String value2) {
            addCriterion("ActionType not between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andIsSysIsNull() {
            addCriterion("IsSYS is null");
            return (Criteria) this;
        }

        public Criteria andIsSysIsNotNull() {
            addCriterion("IsSYS is not null");
            return (Criteria) this;
        }

        public Criteria andIsSysEqualTo(Boolean value) {
            addCriterion("IsSYS =", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotEqualTo(Boolean value) {
            addCriterion("IsSYS <>", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysGreaterThan(Boolean value) {
            addCriterion("IsSYS >", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsSYS >=", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysLessThan(Boolean value) {
            addCriterion("IsSYS <", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysLessThanOrEqualTo(Boolean value) {
            addCriterion("IsSYS <=", value, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysIn(List<Boolean> values) {
            addCriterion("IsSYS in", values, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotIn(List<Boolean> values) {
            addCriterion("IsSYS not in", values, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSYS between", value1, value2, "isSys");
            return (Criteria) this;
        }

        public Criteria andIsSysNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsSYS not between", value1, value2, "isSys");
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

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSortCodeIsNull() {
            addCriterion("SortCode is null");
            return (Criteria) this;
        }

        public Criteria andSortCodeIsNotNull() {
            addCriterion("SortCode is not null");
            return (Criteria) this;
        }

        public Criteria andSortCodeEqualTo(Integer value) {
            addCriterion("SortCode =", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeNotEqualTo(Integer value) {
            addCriterion("SortCode <>", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeGreaterThan(Integer value) {
            addCriterion("SortCode >", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SortCode >=", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeLessThan(Integer value) {
            addCriterion("SortCode <", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeLessThanOrEqualTo(Integer value) {
            addCriterion("SortCode <=", value, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeIn(List<Integer> values) {
            addCriterion("SortCode in", values, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeNotIn(List<Integer> values) {
            addCriterion("SortCode not in", values, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeBetween(Integer value1, Integer value2) {
            addCriterion("SortCode between", value1, value2, "sortCode");
            return (Criteria) this;
        }

        public Criteria andSortCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("SortCode not between", value1, value2, "sortCode");
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