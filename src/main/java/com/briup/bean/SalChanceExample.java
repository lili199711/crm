package com.briup.bean;

import java.util.ArrayList;
import java.util.List;

public class SalChanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public SalChanceExample() {
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

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andChcIdIsNull() {
            addCriterion("CHC_ID is null");
            return (Criteria) this;
        }

        public Criteria andChcIdIsNotNull() {
            addCriterion("CHC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChcIdEqualTo(Long value) {
            addCriterion("CHC_ID =", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdNotEqualTo(Long value) {
            addCriterion("CHC_ID <>", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdGreaterThan(Long value) {
            addCriterion("CHC_ID >", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CHC_ID >=", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdLessThan(Long value) {
            addCriterion("CHC_ID <", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdLessThanOrEqualTo(Long value) {
            addCriterion("CHC_ID <=", value, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdIn(List<Long> values) {
            addCriterion("CHC_ID in", values, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdNotIn(List<Long> values) {
            addCriterion("CHC_ID not in", values, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdBetween(Long value1, Long value2) {
            addCriterion("CHC_ID between", value1, value2, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcIdNotBetween(Long value1, Long value2) {
            addCriterion("CHC_ID not between", value1, value2, "chcId");
            return (Criteria) this;
        }

        public Criteria andChcSourceIsNull() {
            addCriterion("CHC_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andChcSourceIsNotNull() {
            addCriterion("CHC_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andChcSourceEqualTo(String value) {
            addCriterion("CHC_SOURCE =", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceNotEqualTo(String value) {
            addCriterion("CHC_SOURCE <>", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceGreaterThan(String value) {
            addCriterion("CHC_SOURCE >", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceGreaterThanOrEqualTo(String value) {
            addCriterion("CHC_SOURCE >=", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceLessThan(String value) {
            addCriterion("CHC_SOURCE <", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceLessThanOrEqualTo(String value) {
            addCriterion("CHC_SOURCE <=", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceLike(String value) {
            addCriterion("CHC_SOURCE like", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceNotLike(String value) {
            addCriterion("CHC_SOURCE not like", value, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceIn(List<String> values) {
            addCriterion("CHC_SOURCE in", values, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceNotIn(List<String> values) {
            addCriterion("CHC_SOURCE not in", values, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceBetween(String value1, String value2) {
            addCriterion("CHC_SOURCE between", value1, value2, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcSourceNotBetween(String value1, String value2) {
            addCriterion("CHC_SOURCE not between", value1, value2, "chcSource");
            return (Criteria) this;
        }

        public Criteria andChcCustNameIsNull() {
            addCriterion("CHC_CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChcCustNameIsNotNull() {
            addCriterion("CHC_CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChcCustNameEqualTo(String value) {
            addCriterion("CHC_CUST_NAME =", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameNotEqualTo(String value) {
            addCriterion("CHC_CUST_NAME <>", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameGreaterThan(String value) {
            addCriterion("CHC_CUST_NAME >", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHC_CUST_NAME >=", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameLessThan(String value) {
            addCriterion("CHC_CUST_NAME <", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameLessThanOrEqualTo(String value) {
            addCriterion("CHC_CUST_NAME <=", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameLike(String value) {
            addCriterion("CHC_CUST_NAME like", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameNotLike(String value) {
            addCriterion("CHC_CUST_NAME not like", value, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameIn(List<String> values) {
            addCriterion("CHC_CUST_NAME in", values, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameNotIn(List<String> values) {
            addCriterion("CHC_CUST_NAME not in", values, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameBetween(String value1, String value2) {
            addCriterion("CHC_CUST_NAME between", value1, value2, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcCustNameNotBetween(String value1, String value2) {
            addCriterion("CHC_CUST_NAME not between", value1, value2, "chcCustName");
            return (Criteria) this;
        }

        public Criteria andChcTitleIsNull() {
            addCriterion("CHC_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andChcTitleIsNotNull() {
            addCriterion("CHC_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andChcTitleEqualTo(String value) {
            addCriterion("CHC_TITLE =", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleNotEqualTo(String value) {
            addCriterion("CHC_TITLE <>", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleGreaterThan(String value) {
            addCriterion("CHC_TITLE >", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CHC_TITLE >=", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleLessThan(String value) {
            addCriterion("CHC_TITLE <", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleLessThanOrEqualTo(String value) {
            addCriterion("CHC_TITLE <=", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleLike(String value) {
            addCriterion("CHC_TITLE like", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleNotLike(String value) {
            addCriterion("CHC_TITLE not like", value, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleIn(List<String> values) {
            addCriterion("CHC_TITLE in", values, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleNotIn(List<String> values) {
            addCriterion("CHC_TITLE not in", values, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleBetween(String value1, String value2) {
            addCriterion("CHC_TITLE between", value1, value2, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcTitleNotBetween(String value1, String value2) {
            addCriterion("CHC_TITLE not between", value1, value2, "chcTitle");
            return (Criteria) this;
        }

        public Criteria andChcRateIsNull() {
            addCriterion("CHC_RATE is null");
            return (Criteria) this;
        }

        public Criteria andChcRateIsNotNull() {
            addCriterion("CHC_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andChcRateEqualTo(Long value) {
            addCriterion("CHC_RATE =", value, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateNotEqualTo(Long value) {
            addCriterion("CHC_RATE <>", value, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateGreaterThan(Long value) {
            addCriterion("CHC_RATE >", value, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateGreaterThanOrEqualTo(Long value) {
            addCriterion("CHC_RATE >=", value, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateLessThan(Long value) {
            addCriterion("CHC_RATE <", value, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateLessThanOrEqualTo(Long value) {
            addCriterion("CHC_RATE <=", value, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateIn(List<Long> values) {
            addCriterion("CHC_RATE in", values, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateNotIn(List<Long> values) {
            addCriterion("CHC_RATE not in", values, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateBetween(Long value1, Long value2) {
            addCriterion("CHC_RATE between", value1, value2, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcRateNotBetween(Long value1, Long value2) {
            addCriterion("CHC_RATE not between", value1, value2, "chcRate");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanIsNull() {
            addCriterion("CHC_LINKMAN is null");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanIsNotNull() {
            addCriterion("CHC_LINKMAN is not null");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanEqualTo(String value) {
            addCriterion("CHC_LINKMAN =", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanNotEqualTo(String value) {
            addCriterion("CHC_LINKMAN <>", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanGreaterThan(String value) {
            addCriterion("CHC_LINKMAN >", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("CHC_LINKMAN >=", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanLessThan(String value) {
            addCriterion("CHC_LINKMAN <", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanLessThanOrEqualTo(String value) {
            addCriterion("CHC_LINKMAN <=", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanLike(String value) {
            addCriterion("CHC_LINKMAN like", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanNotLike(String value) {
            addCriterion("CHC_LINKMAN not like", value, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanIn(List<String> values) {
            addCriterion("CHC_LINKMAN in", values, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanNotIn(List<String> values) {
            addCriterion("CHC_LINKMAN not in", values, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanBetween(String value1, String value2) {
            addCriterion("CHC_LINKMAN between", value1, value2, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcLinkmanNotBetween(String value1, String value2) {
            addCriterion("CHC_LINKMAN not between", value1, value2, "chcLinkman");
            return (Criteria) this;
        }

        public Criteria andChcTelIsNull() {
            addCriterion("CHC_TEL is null");
            return (Criteria) this;
        }

        public Criteria andChcTelIsNotNull() {
            addCriterion("CHC_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andChcTelEqualTo(String value) {
            addCriterion("CHC_TEL =", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelNotEqualTo(String value) {
            addCriterion("CHC_TEL <>", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelGreaterThan(String value) {
            addCriterion("CHC_TEL >", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelGreaterThanOrEqualTo(String value) {
            addCriterion("CHC_TEL >=", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelLessThan(String value) {
            addCriterion("CHC_TEL <", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelLessThanOrEqualTo(String value) {
            addCriterion("CHC_TEL <=", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelLike(String value) {
            addCriterion("CHC_TEL like", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelNotLike(String value) {
            addCriterion("CHC_TEL not like", value, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelIn(List<String> values) {
            addCriterion("CHC_TEL in", values, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelNotIn(List<String> values) {
            addCriterion("CHC_TEL not in", values, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelBetween(String value1, String value2) {
            addCriterion("CHC_TEL between", value1, value2, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcTelNotBetween(String value1, String value2) {
            addCriterion("CHC_TEL not between", value1, value2, "chcTel");
            return (Criteria) this;
        }

        public Criteria andChcAddrIsNull() {
            addCriterion("CHC_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andChcAddrIsNotNull() {
            addCriterion("CHC_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andChcAddrEqualTo(String value) {
            addCriterion("CHC_ADDR =", value, "chcAddr");
            return (Criteria) this;
        }

        public Criteria andChcAddrNotEqualTo(String value) {
            addCriterion("CHC_ADDR <>", value, "chcAddr");
            return (Criteria) this;
        }

        public Criteria andChcAddrGreaterThan(String value) {
            addCriterion("CHC_ADDR >", value, "chcAddr");
            return (Criteria) this;
        }

        public Criteria andChcAddrGreaterThanOrEqualTo(String value) {
            addCriterion("CHC_ADDR >=", value, "chcAddr");
            return (Criteria) this;
        }

        public Criteria andChcAddrLessThan(String value) {
            addCriterion("CHC_ADDR <", value, "chcAddr");
            return (Criteria) this;
        }

        public Criteria andChcAddrLessThanOrEqualTo(String value) {
            addCriterion("CHC_ADDR <=", value, "chcAddr");
            return (Criteria) this;
        }

        public Criteria andChcAddrLike(String value) {
            addCriterion("CHC_ADDR like", value, "chcAddr");
            return (Criteria) this;
        }

        public Criteria andChcAddrNotLike(String value) {
            addCriterion("CHC_ADDR not like", value, "chcAddr");
            return (Criteria) this;
        }

        public Criteria andChcAddrIn(List<String> values) {
            addCriterion("CHC_ADDR in", values, "chcAddr");
            return (Criteria) this;
        }

        public Criteria andChcAddrNotIn(List<String> values) {
            addCriterion("CHC_ADDR not in", values, "chcAddr");
            return (Criteria) this;
        }

        public Criteria andChcAddrBetween(String value1, String value2) {
            addCriterion("CHC_ADDR between", value1, value2, "chcAddr");
            return (Criteria) this;
        }

        public Criteria andChcAddrNotBetween(String value1, String value2) {
            addCriterion("CHC_ADDR not between", value1, value2, "chcAddr");
            return (Criteria) this;
        }

        public Criteria andChcDescIsNull() {
            addCriterion("CHC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andChcDescIsNotNull() {
            addCriterion("CHC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andChcDescEqualTo(String value) {
            addCriterion("CHC_DESC =", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescNotEqualTo(String value) {
            addCriterion("CHC_DESC <>", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescGreaterThan(String value) {
            addCriterion("CHC_DESC >", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescGreaterThanOrEqualTo(String value) {
            addCriterion("CHC_DESC >=", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescLessThan(String value) {
            addCriterion("CHC_DESC <", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescLessThanOrEqualTo(String value) {
            addCriterion("CHC_DESC <=", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescLike(String value) {
            addCriterion("CHC_DESC like", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescNotLike(String value) {
            addCriterion("CHC_DESC not like", value, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescIn(List<String> values) {
            addCriterion("CHC_DESC in", values, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescNotIn(List<String> values) {
            addCriterion("CHC_DESC not in", values, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescBetween(String value1, String value2) {
            addCriterion("CHC_DESC between", value1, value2, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcDescNotBetween(String value1, String value2) {
            addCriterion("CHC_DESC not between", value1, value2, "chcDesc");
            return (Criteria) this;
        }

        public Criteria andChcCreateByIsNull() {
            addCriterion("CHC_CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andChcCreateByIsNotNull() {
            addCriterion("CHC_CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andChcCreateByEqualTo(String value) {
            addCriterion("CHC_CREATE_BY =", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByNotEqualTo(String value) {
            addCriterion("CHC_CREATE_BY <>", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByGreaterThan(String value) {
            addCriterion("CHC_CREATE_BY >", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CHC_CREATE_BY >=", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByLessThan(String value) {
            addCriterion("CHC_CREATE_BY <", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByLessThanOrEqualTo(String value) {
            addCriterion("CHC_CREATE_BY <=", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByLike(String value) {
            addCriterion("CHC_CREATE_BY like", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByNotLike(String value) {
            addCriterion("CHC_CREATE_BY not like", value, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByIn(List<String> values) {
            addCriterion("CHC_CREATE_BY in", values, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByNotIn(List<String> values) {
            addCriterion("CHC_CREATE_BY not in", values, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByBetween(String value1, String value2) {
            addCriterion("CHC_CREATE_BY between", value1, value2, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcCreateByNotBetween(String value1, String value2) {
            addCriterion("CHC_CREATE_BY not between", value1, value2, "chcCreateBy");
            return (Criteria) this;
        }

        public Criteria andChcDueToIsNull() {
            addCriterion("CHC_DUE_TO is null");
            return (Criteria) this;
        }

        public Criteria andChcDueToIsNotNull() {
            addCriterion("CHC_DUE_TO is not null");
            return (Criteria) this;
        }

        public Criteria andChcDueToEqualTo(String value) {
            addCriterion("CHC_DUE_TO =", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToNotEqualTo(String value) {
            addCriterion("CHC_DUE_TO <>", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToGreaterThan(String value) {
            addCriterion("CHC_DUE_TO >", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToGreaterThanOrEqualTo(String value) {
            addCriterion("CHC_DUE_TO >=", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToLessThan(String value) {
            addCriterion("CHC_DUE_TO <", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToLessThanOrEqualTo(String value) {
            addCriterion("CHC_DUE_TO <=", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToLike(String value) {
            addCriterion("CHC_DUE_TO like", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToNotLike(String value) {
            addCriterion("CHC_DUE_TO not like", value, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToIn(List<String> values) {
            addCriterion("CHC_DUE_TO in", values, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToNotIn(List<String> values) {
            addCriterion("CHC_DUE_TO not in", values, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToBetween(String value1, String value2) {
            addCriterion("CHC_DUE_TO between", value1, value2, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcDueToNotBetween(String value1, String value2) {
            addCriterion("CHC_DUE_TO not between", value1, value2, "chcDueTo");
            return (Criteria) this;
        }

        public Criteria andChcStatusIsNull() {
            addCriterion("CHC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andChcStatusIsNotNull() {
            addCriterion("CHC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andChcStatusEqualTo(String value) {
            addCriterion("CHC_STATUS =", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusNotEqualTo(String value) {
            addCriterion("CHC_STATUS <>", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusGreaterThan(String value) {
            addCriterion("CHC_STATUS >", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHC_STATUS >=", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusLessThan(String value) {
            addCriterion("CHC_STATUS <", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusLessThanOrEqualTo(String value) {
            addCriterion("CHC_STATUS <=", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusLike(String value) {
            addCriterion("CHC_STATUS like", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusNotLike(String value) {
            addCriterion("CHC_STATUS not like", value, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusIn(List<String> values) {
            addCriterion("CHC_STATUS in", values, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusNotIn(List<String> values) {
            addCriterion("CHC_STATUS not in", values, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusBetween(String value1, String value2) {
            addCriterion("CHC_STATUS between", value1, value2, "chcStatus");
            return (Criteria) this;
        }

        public Criteria andChcStatusNotBetween(String value1, String value2) {
            addCriterion("CHC_STATUS not between", value1, value2, "chcStatus");
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