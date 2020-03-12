package com.pangu.foying.web.project.admin.entity;

import java.util.ArrayList;
import java.util.List;

public class BaseOrganizeRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseOrganizeRoleExample() {
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

        public Criteria andBaseOrganizeIdIsNull() {
            addCriterion("baseorganizeid is null");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdIsNotNull() {
            addCriterion("baseorganizeid is not null");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdEqualTo(String value) {
            addCriterion("baseorganizeid =", value, "baseOrganizeId");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdNotEqualTo(String value) {
            addCriterion("baseorganizeid <>", value, "baseOrganizeId");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdGreaterThan(String value) {
            addCriterion("baseorganizeid >", value, "baseOrganizeId");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdGreaterThanOrEqualTo(String value) {
            addCriterion("baseorganizeid >=", value, "baseOrganizeId");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdLessThan(String value) {
            addCriterion("baseorganizeid <", value, "baseOrganizeId");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdLessThanOrEqualTo(String value) {
            addCriterion("baseorganizeid <=", value, "baseOrganizeId");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdLike(String value) {
            addCriterion("baseorganizeid like", value, "baseOrganizeId");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdNotLike(String value) {
            addCriterion("baseorganizeid not like", value, "baseOrganizeId");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdIn(List<String> values) {
            addCriterion("baseorganizeid in", values, "baseOrganizeId");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdNotIn(List<String> values) {
            addCriterion("baseorganizeid not in", values, "baseOrganizeId");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdBetween(String value1, String value2) {
            addCriterion("baseorganizeid between", value1, value2, "baseOrganizeId");
            return (Criteria) this;
        }

        public Criteria andBaseOrganizeIdNotBetween(String value1, String value2) {
            addCriterion("baseorganizeid not between", value1, value2, "baseOrganizeId");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdIsNull() {
            addCriterion("baseroleid is null");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdIsNotNull() {
            addCriterion("baseroleid is not null");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdEqualTo(String value) {
            addCriterion("baseroleid =", value, "baseRoleId");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdNotEqualTo(String value) {
            addCriterion("baseroleid <>", value, "baseRoleId");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdGreaterThan(String value) {
            addCriterion("baseroleid >", value, "baseRoleId");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("baseroleid >=", value, "baseRoleId");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdLessThan(String value) {
            addCriterion("baseroleid <", value, "baseRoleId");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdLessThanOrEqualTo(String value) {
            addCriterion("baseroleid <=", value, "baseRoleId");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdLike(String value) {
            addCriterion("baseroleid like", value, "baseRoleId");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdNotLike(String value) {
            addCriterion("baseroleid not like", value, "baseRoleId");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdIn(List<String> values) {
            addCriterion("baseroleid in", values, "baseRoleId");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdNotIn(List<String> values) {
            addCriterion("baseroleid not in", values, "baseRoleId");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdBetween(String value1, String value2) {
            addCriterion("baseroleid between", value1, value2, "baseRoleId");
            return (Criteria) this;
        }

        public Criteria andBaseRoleIdNotBetween(String value1, String value2) {
            addCriterion("baseroleid not between", value1, value2, "baseRoleId");
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