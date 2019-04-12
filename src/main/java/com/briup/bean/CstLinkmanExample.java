package com.briup.bean;

import java.util.ArrayList;
import java.util.List;

public class CstLinkmanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public CstLinkmanExample() {
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

        public Criteria andLkmIdIsNull() {
            addCriterion("LKM_ID is null");
            return (Criteria) this;
        }

        public Criteria andLkmIdIsNotNull() {
            addCriterion("LKM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLkmIdEqualTo(Long value) {
            addCriterion("LKM_ID =", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdNotEqualTo(Long value) {
            addCriterion("LKM_ID <>", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdGreaterThan(Long value) {
            addCriterion("LKM_ID >", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LKM_ID >=", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdLessThan(Long value) {
            addCriterion("LKM_ID <", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdLessThanOrEqualTo(Long value) {
            addCriterion("LKM_ID <=", value, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdIn(List<Long> values) {
            addCriterion("LKM_ID in", values, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdNotIn(List<Long> values) {
            addCriterion("LKM_ID not in", values, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdBetween(Long value1, Long value2) {
            addCriterion("LKM_ID between", value1, value2, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmIdNotBetween(Long value1, Long value2) {
            addCriterion("LKM_ID not between", value1, value2, "lkmId");
            return (Criteria) this;
        }

        public Criteria andLkmCustIdIsNull() {
            addCriterion("LKM_CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andLkmCustIdIsNotNull() {
            addCriterion("LKM_CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLkmCustIdEqualTo(Long value) {
            addCriterion("LKM_CUST_ID =", value, "lkmCustId");
            return (Criteria) this;
        }

        public Criteria andLkmCustIdNotEqualTo(Long value) {
            addCriterion("LKM_CUST_ID <>", value, "lkmCustId");
            return (Criteria) this;
        }

        public Criteria andLkmCustIdGreaterThan(Long value) {
            addCriterion("LKM_CUST_ID >", value, "lkmCustId");
            return (Criteria) this;
        }

        public Criteria andLkmCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LKM_CUST_ID >=", value, "lkmCustId");
            return (Criteria) this;
        }

        public Criteria andLkmCustIdLessThan(Long value) {
            addCriterion("LKM_CUST_ID <", value, "lkmCustId");
            return (Criteria) this;
        }

        public Criteria andLkmCustIdLessThanOrEqualTo(Long value) {
            addCriterion("LKM_CUST_ID <=", value, "lkmCustId");
            return (Criteria) this;
        }

        public Criteria andLkmCustIdIn(List<Long> values) {
            addCriterion("LKM_CUST_ID in", values, "lkmCustId");
            return (Criteria) this;
        }

        public Criteria andLkmCustIdNotIn(List<Long> values) {
            addCriterion("LKM_CUST_ID not in", values, "lkmCustId");
            return (Criteria) this;
        }

        public Criteria andLkmCustIdBetween(Long value1, Long value2) {
            addCriterion("LKM_CUST_ID between", value1, value2, "lkmCustId");
            return (Criteria) this;
        }

        public Criteria andLkmCustIdNotBetween(Long value1, Long value2) {
            addCriterion("LKM_CUST_ID not between", value1, value2, "lkmCustId");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoIsNull() {
            addCriterion("LKM_CUST_NO is null");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoIsNotNull() {
            addCriterion("LKM_CUST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoEqualTo(String value) {
            addCriterion("LKM_CUST_NO =", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoNotEqualTo(String value) {
            addCriterion("LKM_CUST_NO <>", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoGreaterThan(String value) {
            addCriterion("LKM_CUST_NO >", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("LKM_CUST_NO >=", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoLessThan(String value) {
            addCriterion("LKM_CUST_NO <", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoLessThanOrEqualTo(String value) {
            addCriterion("LKM_CUST_NO <=", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoLike(String value) {
            addCriterion("LKM_CUST_NO like", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoNotLike(String value) {
            addCriterion("LKM_CUST_NO not like", value, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoIn(List<String> values) {
            addCriterion("LKM_CUST_NO in", values, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoNotIn(List<String> values) {
            addCriterion("LKM_CUST_NO not in", values, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoBetween(String value1, String value2) {
            addCriterion("LKM_CUST_NO between", value1, value2, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNoNotBetween(String value1, String value2) {
            addCriterion("LKM_CUST_NO not between", value1, value2, "lkmCustNo");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameIsNull() {
            addCriterion("LKM_CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameIsNotNull() {
            addCriterion("LKM_CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameEqualTo(String value) {
            addCriterion("LKM_CUST_NAME =", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameNotEqualTo(String value) {
            addCriterion("LKM_CUST_NAME <>", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameGreaterThan(String value) {
            addCriterion("LKM_CUST_NAME >", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("LKM_CUST_NAME >=", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameLessThan(String value) {
            addCriterion("LKM_CUST_NAME <", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameLessThanOrEqualTo(String value) {
            addCriterion("LKM_CUST_NAME <=", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameLike(String value) {
            addCriterion("LKM_CUST_NAME like", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameNotLike(String value) {
            addCriterion("LKM_CUST_NAME not like", value, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameIn(List<String> values) {
            addCriterion("LKM_CUST_NAME in", values, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameNotIn(List<String> values) {
            addCriterion("LKM_CUST_NAME not in", values, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameBetween(String value1, String value2) {
            addCriterion("LKM_CUST_NAME between", value1, value2, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmCustNameNotBetween(String value1, String value2) {
            addCriterion("LKM_CUST_NAME not between", value1, value2, "lkmCustName");
            return (Criteria) this;
        }

        public Criteria andLkmNameIsNull() {
            addCriterion("LKM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLkmNameIsNotNull() {
            addCriterion("LKM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLkmNameEqualTo(String value) {
            addCriterion("LKM_NAME =", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameNotEqualTo(String value) {
            addCriterion("LKM_NAME <>", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameGreaterThan(String value) {
            addCriterion("LKM_NAME >", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameGreaterThanOrEqualTo(String value) {
            addCriterion("LKM_NAME >=", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameLessThan(String value) {
            addCriterion("LKM_NAME <", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameLessThanOrEqualTo(String value) {
            addCriterion("LKM_NAME <=", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameLike(String value) {
            addCriterion("LKM_NAME like", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameNotLike(String value) {
            addCriterion("LKM_NAME not like", value, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameIn(List<String> values) {
            addCriterion("LKM_NAME in", values, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameNotIn(List<String> values) {
            addCriterion("LKM_NAME not in", values, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameBetween(String value1, String value2) {
            addCriterion("LKM_NAME between", value1, value2, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmNameNotBetween(String value1, String value2) {
            addCriterion("LKM_NAME not between", value1, value2, "lkmName");
            return (Criteria) this;
        }

        public Criteria andLkmSexIsNull() {
            addCriterion("LKM_SEX is null");
            return (Criteria) this;
        }

        public Criteria andLkmSexIsNotNull() {
            addCriterion("LKM_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andLkmSexEqualTo(String value) {
            addCriterion("LKM_SEX =", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexNotEqualTo(String value) {
            addCriterion("LKM_SEX <>", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexGreaterThan(String value) {
            addCriterion("LKM_SEX >", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexGreaterThanOrEqualTo(String value) {
            addCriterion("LKM_SEX >=", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexLessThan(String value) {
            addCriterion("LKM_SEX <", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexLessThanOrEqualTo(String value) {
            addCriterion("LKM_SEX <=", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexLike(String value) {
            addCriterion("LKM_SEX like", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexNotLike(String value) {
            addCriterion("LKM_SEX not like", value, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexIn(List<String> values) {
            addCriterion("LKM_SEX in", values, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexNotIn(List<String> values) {
            addCriterion("LKM_SEX not in", values, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexBetween(String value1, String value2) {
            addCriterion("LKM_SEX between", value1, value2, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmSexNotBetween(String value1, String value2) {
            addCriterion("LKM_SEX not between", value1, value2, "lkmSex");
            return (Criteria) this;
        }

        public Criteria andLkmPostionIsNull() {
            addCriterion("LKM_POSTION is null");
            return (Criteria) this;
        }

        public Criteria andLkmPostionIsNotNull() {
            addCriterion("LKM_POSTION is not null");
            return (Criteria) this;
        }

        public Criteria andLkmPostionEqualTo(String value) {
            addCriterion("LKM_POSTION =", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionNotEqualTo(String value) {
            addCriterion("LKM_POSTION <>", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionGreaterThan(String value) {
            addCriterion("LKM_POSTION >", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionGreaterThanOrEqualTo(String value) {
            addCriterion("LKM_POSTION >=", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionLessThan(String value) {
            addCriterion("LKM_POSTION <", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionLessThanOrEqualTo(String value) {
            addCriterion("LKM_POSTION <=", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionLike(String value) {
            addCriterion("LKM_POSTION like", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionNotLike(String value) {
            addCriterion("LKM_POSTION not like", value, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionIn(List<String> values) {
            addCriterion("LKM_POSTION in", values, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionNotIn(List<String> values) {
            addCriterion("LKM_POSTION not in", values, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionBetween(String value1, String value2) {
            addCriterion("LKM_POSTION between", value1, value2, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmPostionNotBetween(String value1, String value2) {
            addCriterion("LKM_POSTION not between", value1, value2, "lkmPostion");
            return (Criteria) this;
        }

        public Criteria andLkmTelIsNull() {
            addCriterion("LKM_TEL is null");
            return (Criteria) this;
        }

        public Criteria andLkmTelIsNotNull() {
            addCriterion("LKM_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andLkmTelEqualTo(String value) {
            addCriterion("LKM_TEL =", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelNotEqualTo(String value) {
            addCriterion("LKM_TEL <>", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelGreaterThan(String value) {
            addCriterion("LKM_TEL >", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelGreaterThanOrEqualTo(String value) {
            addCriterion("LKM_TEL >=", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelLessThan(String value) {
            addCriterion("LKM_TEL <", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelLessThanOrEqualTo(String value) {
            addCriterion("LKM_TEL <=", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelLike(String value) {
            addCriterion("LKM_TEL like", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelNotLike(String value) {
            addCriterion("LKM_TEL not like", value, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelIn(List<String> values) {
            addCriterion("LKM_TEL in", values, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelNotIn(List<String> values) {
            addCriterion("LKM_TEL not in", values, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelBetween(String value1, String value2) {
            addCriterion("LKM_TEL between", value1, value2, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmTelNotBetween(String value1, String value2) {
            addCriterion("LKM_TEL not between", value1, value2, "lkmTel");
            return (Criteria) this;
        }

        public Criteria andLkmMobileIsNull() {
            addCriterion("LKM_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andLkmMobileIsNotNull() {
            addCriterion("LKM_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andLkmMobileEqualTo(String value) {
            addCriterion("LKM_MOBILE =", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileNotEqualTo(String value) {
            addCriterion("LKM_MOBILE <>", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileGreaterThan(String value) {
            addCriterion("LKM_MOBILE >", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileGreaterThanOrEqualTo(String value) {
            addCriterion("LKM_MOBILE >=", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileLessThan(String value) {
            addCriterion("LKM_MOBILE <", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileLessThanOrEqualTo(String value) {
            addCriterion("LKM_MOBILE <=", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileLike(String value) {
            addCriterion("LKM_MOBILE like", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileNotLike(String value) {
            addCriterion("LKM_MOBILE not like", value, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileIn(List<String> values) {
            addCriterion("LKM_MOBILE in", values, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileNotIn(List<String> values) {
            addCriterion("LKM_MOBILE not in", values, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileBetween(String value1, String value2) {
            addCriterion("LKM_MOBILE between", value1, value2, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMobileNotBetween(String value1, String value2) {
            addCriterion("LKM_MOBILE not between", value1, value2, "lkmMobile");
            return (Criteria) this;
        }

        public Criteria andLkmMemoIsNull() {
            addCriterion("LKM_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andLkmMemoIsNotNull() {
            addCriterion("LKM_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andLkmMemoEqualTo(String value) {
            addCriterion("LKM_MEMO =", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoNotEqualTo(String value) {
            addCriterion("LKM_MEMO <>", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoGreaterThan(String value) {
            addCriterion("LKM_MEMO >", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoGreaterThanOrEqualTo(String value) {
            addCriterion("LKM_MEMO >=", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoLessThan(String value) {
            addCriterion("LKM_MEMO <", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoLessThanOrEqualTo(String value) {
            addCriterion("LKM_MEMO <=", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoLike(String value) {
            addCriterion("LKM_MEMO like", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoNotLike(String value) {
            addCriterion("LKM_MEMO not like", value, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoIn(List<String> values) {
            addCriterion("LKM_MEMO in", values, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoNotIn(List<String> values) {
            addCriterion("LKM_MEMO not in", values, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoBetween(String value1, String value2) {
            addCriterion("LKM_MEMO between", value1, value2, "lkmMemo");
            return (Criteria) this;
        }

        public Criteria andLkmMemoNotBetween(String value1, String value2) {
            addCriterion("LKM_MEMO not between", value1, value2, "lkmMemo");
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