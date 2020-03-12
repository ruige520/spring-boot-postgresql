package com.pangu.foying.web.project.admin.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BaseOrganizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseOrganizeExample() {
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

        public Criteria andOrganizeNameIsNull() {
            addCriterion("OrganizeName is null");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameIsNotNull() {
            addCriterion("OrganizeName is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameEqualTo(String value) {
            addCriterion("OrganizeName =", value, "organizeName");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameNotEqualTo(String value) {
            addCriterion("OrganizeName <>", value, "organizeName");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameGreaterThan(String value) {
            addCriterion("OrganizeName >", value, "organizeName");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("OrganizeName >=", value, "organizeName");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameLessThan(String value) {
            addCriterion("OrganizeName <", value, "organizeName");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameLessThanOrEqualTo(String value) {
            addCriterion("OrganizeName <=", value, "organizeName");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameLike(String value) {
            addCriterion("OrganizeName like", value, "organizeName");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameNotLike(String value) {
            addCriterion("OrganizeName not like", value, "organizeName");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameIn(List<String> values) {
            addCriterion("OrganizeName in", values, "organizeName");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameNotIn(List<String> values) {
            addCriterion("OrganizeName not in", values, "organizeName");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameBetween(String value1, String value2) {
            addCriterion("OrganizeName between", value1, value2, "organizeName");
            return (Criteria) this;
        }

        public Criteria andOrganizeNameNotBetween(String value1, String value2) {
            addCriterion("OrganizeName not between", value1, value2, "organizeName");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeIsNull() {
            addCriterion("OrganizeEnCode is null");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeIsNotNull() {
            addCriterion("OrganizeEnCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeEqualTo(String value) {
            addCriterion("OrganizeEnCode =", value, "organizeEnCode");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeNotEqualTo(String value) {
            addCriterion("OrganizeEnCode <>", value, "organizeEnCode");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeGreaterThan(String value) {
            addCriterion("OrganizeEnCode >", value, "organizeEnCode");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OrganizeEnCode >=", value, "organizeEnCode");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeLessThan(String value) {
            addCriterion("OrganizeEnCode <", value, "organizeEnCode");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeLessThanOrEqualTo(String value) {
            addCriterion("OrganizeEnCode <=", value, "organizeEnCode");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeLike(String value) {
            addCriterion("OrganizeEnCode like", value, "organizeEnCode");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeNotLike(String value) {
            addCriterion("OrganizeEnCode not like", value, "organizeEnCode");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeIn(List<String> values) {
            addCriterion("OrganizeEnCode in", values, "organizeEnCode");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeNotIn(List<String> values) {
            addCriterion("OrganizeEnCode not in", values, "organizeEnCode");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeBetween(String value1, String value2) {
            addCriterion("OrganizeEnCode between", value1, value2, "organizeEnCode");
            return (Criteria) this;
        }

        public Criteria andOrganizeEnCodeNotBetween(String value1, String value2) {
            addCriterion("OrganizeEnCode not between", value1, value2, "organizeEnCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("MobilePhone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("MobilePhone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("MobilePhone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("MobilePhone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("MobilePhone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MobilePhone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("MobilePhone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("MobilePhone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("MobilePhone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("MobilePhone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("MobilePhone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("MobilePhone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("MobilePhone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("MobilePhone not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andWeChatIsNull() {
            addCriterion("WeChat is null");
            return (Criteria) this;
        }

        public Criteria andWeChatIsNotNull() {
            addCriterion("WeChat is not null");
            return (Criteria) this;
        }

        public Criteria andWeChatEqualTo(String value) {
            addCriterion("WeChat =", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatNotEqualTo(String value) {
            addCriterion("WeChat <>", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatGreaterThan(String value) {
            addCriterion("WeChat >", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatGreaterThanOrEqualTo(String value) {
            addCriterion("WeChat >=", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatLessThan(String value) {
            addCriterion("WeChat <", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatLessThanOrEqualTo(String value) {
            addCriterion("WeChat <=", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatLike(String value) {
            addCriterion("WeChat like", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatNotLike(String value) {
            addCriterion("WeChat not like", value, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatIn(List<String> values) {
            addCriterion("WeChat in", values, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatNotIn(List<String> values) {
            addCriterion("WeChat not in", values, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatBetween(String value1, String value2) {
            addCriterion("WeChat between", value1, value2, "weChat");
            return (Criteria) this;
        }

        public Criteria andWeChatNotBetween(String value1, String value2) {
            addCriterion("WeChat not between", value1, value2, "weChat");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("Telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("Telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("Telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("Telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("Telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("Telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("Telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("Telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("Telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("Telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("Telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("Telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("Telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("Telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("Fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("Fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("Fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("Fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("Fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("Fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("Fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("Fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("Fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("Fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("Fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("Fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("Fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("Fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
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