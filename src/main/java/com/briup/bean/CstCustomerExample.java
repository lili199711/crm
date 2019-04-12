package com.briup.bean;

import java.util.ArrayList;
import java.util.List;

public class CstCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public CstCustomerExample() {
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

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Long value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Long value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Long value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Long value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Long value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Long> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Long> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Long value1, Long value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Long value1, Long value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNull() {
            addCriterion("CUST_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNotNull() {
            addCriterion("CUST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustNoEqualTo(String value) {
            addCriterion("CUST_NO =", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotEqualTo(String value) {
            addCriterion("CUST_NO <>", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThan(String value) {
            addCriterion("CUST_NO >", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NO >=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThan(String value) {
            addCriterion("CUST_NO <", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_NO <=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLike(String value) {
            addCriterion("CUST_NO like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotLike(String value) {
            addCriterion("CUST_NO not like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoIn(List<String> values) {
            addCriterion("CUST_NO in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotIn(List<String> values) {
            addCriterion("CUST_NO not in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoBetween(String value1, String value2) {
            addCriterion("CUST_NO between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotBetween(String value1, String value2) {
            addCriterion("CUST_NO not between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustRegionIsNull() {
            addCriterion("CUST_REGION is null");
            return (Criteria) this;
        }

        public Criteria andCustRegionIsNotNull() {
            addCriterion("CUST_REGION is not null");
            return (Criteria) this;
        }

        public Criteria andCustRegionEqualTo(String value) {
            addCriterion("CUST_REGION =", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionNotEqualTo(String value) {
            addCriterion("CUST_REGION <>", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionGreaterThan(String value) {
            addCriterion("CUST_REGION >", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_REGION >=", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionLessThan(String value) {
            addCriterion("CUST_REGION <", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionLessThanOrEqualTo(String value) {
            addCriterion("CUST_REGION <=", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionLike(String value) {
            addCriterion("CUST_REGION like", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionNotLike(String value) {
            addCriterion("CUST_REGION not like", value, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionIn(List<String> values) {
            addCriterion("CUST_REGION in", values, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionNotIn(List<String> values) {
            addCriterion("CUST_REGION not in", values, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionBetween(String value1, String value2) {
            addCriterion("CUST_REGION between", value1, value2, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustRegionNotBetween(String value1, String value2) {
            addCriterion("CUST_REGION not between", value1, value2, "custRegion");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdIsNull() {
            addCriterion("CUST_MANAGER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdIsNotNull() {
            addCriterion("CUST_MANAGER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdEqualTo(Long value) {
            addCriterion("CUST_MANAGER_ID =", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdNotEqualTo(Long value) {
            addCriterion("CUST_MANAGER_ID <>", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdGreaterThan(Long value) {
            addCriterion("CUST_MANAGER_ID >", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CUST_MANAGER_ID >=", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdLessThan(Long value) {
            addCriterion("CUST_MANAGER_ID <", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdLessThanOrEqualTo(Long value) {
            addCriterion("CUST_MANAGER_ID <=", value, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdIn(List<Long> values) {
            addCriterion("CUST_MANAGER_ID in", values, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdNotIn(List<Long> values) {
            addCriterion("CUST_MANAGER_ID not in", values, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdBetween(Long value1, Long value2) {
            addCriterion("CUST_MANAGER_ID between", value1, value2, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerIdNotBetween(Long value1, Long value2) {
            addCriterion("CUST_MANAGER_ID not between", value1, value2, "custManagerId");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameIsNull() {
            addCriterion("CUST_MANAGER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameIsNotNull() {
            addCriterion("CUST_MANAGER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameEqualTo(String value) {
            addCriterion("CUST_MANAGER_NAME =", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameNotEqualTo(String value) {
            addCriterion("CUST_MANAGER_NAME <>", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameGreaterThan(String value) {
            addCriterion("CUST_MANAGER_NAME >", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_MANAGER_NAME >=", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameLessThan(String value) {
            addCriterion("CUST_MANAGER_NAME <", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_MANAGER_NAME <=", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameLike(String value) {
            addCriterion("CUST_MANAGER_NAME like", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameNotLike(String value) {
            addCriterion("CUST_MANAGER_NAME not like", value, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameIn(List<String> values) {
            addCriterion("CUST_MANAGER_NAME in", values, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameNotIn(List<String> values) {
            addCriterion("CUST_MANAGER_NAME not in", values, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameBetween(String value1, String value2) {
            addCriterion("CUST_MANAGER_NAME between", value1, value2, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustManagerNameNotBetween(String value1, String value2) {
            addCriterion("CUST_MANAGER_NAME not between", value1, value2, "custManagerName");
            return (Criteria) this;
        }

        public Criteria andCustLevelIsNull() {
            addCriterion("CUST_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCustLevelIsNotNull() {
            addCriterion("CUST_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustLevelEqualTo(Long value) {
            addCriterion("CUST_LEVEL =", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotEqualTo(Long value) {
            addCriterion("CUST_LEVEL <>", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelGreaterThan(Long value) {
            addCriterion("CUST_LEVEL >", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("CUST_LEVEL >=", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLessThan(Long value) {
            addCriterion("CUST_LEVEL <", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLessThanOrEqualTo(Long value) {
            addCriterion("CUST_LEVEL <=", value, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelIn(List<Long> values) {
            addCriterion("CUST_LEVEL in", values, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotIn(List<Long> values) {
            addCriterion("CUST_LEVEL not in", values, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelBetween(Long value1, Long value2) {
            addCriterion("CUST_LEVEL between", value1, value2, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelNotBetween(Long value1, Long value2) {
            addCriterion("CUST_LEVEL not between", value1, value2, "custLevel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelIsNull() {
            addCriterion("CUST_LEVEL_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelIsNotNull() {
            addCriterion("CUST_LEVEL_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelEqualTo(String value) {
            addCriterion("CUST_LEVEL_LABEL =", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelNotEqualTo(String value) {
            addCriterion("CUST_LEVEL_LABEL <>", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelGreaterThan(String value) {
            addCriterion("CUST_LEVEL_LABEL >", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_LEVEL_LABEL >=", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelLessThan(String value) {
            addCriterion("CUST_LEVEL_LABEL <", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelLessThanOrEqualTo(String value) {
            addCriterion("CUST_LEVEL_LABEL <=", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelLike(String value) {
            addCriterion("CUST_LEVEL_LABEL like", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelNotLike(String value) {
            addCriterion("CUST_LEVEL_LABEL not like", value, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelIn(List<String> values) {
            addCriterion("CUST_LEVEL_LABEL in", values, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelNotIn(List<String> values) {
            addCriterion("CUST_LEVEL_LABEL not in", values, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelBetween(String value1, String value2) {
            addCriterion("CUST_LEVEL_LABEL between", value1, value2, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustLevelLabelNotBetween(String value1, String value2) {
            addCriterion("CUST_LEVEL_LABEL not between", value1, value2, "custLevelLabel");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyIsNull() {
            addCriterion("CUST_SATISFY is null");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyIsNotNull() {
            addCriterion("CUST_SATISFY is not null");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyEqualTo(Long value) {
            addCriterion("CUST_SATISFY =", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyNotEqualTo(Long value) {
            addCriterion("CUST_SATISFY <>", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyGreaterThan(Long value) {
            addCriterion("CUST_SATISFY >", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyGreaterThanOrEqualTo(Long value) {
            addCriterion("CUST_SATISFY >=", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyLessThan(Long value) {
            addCriterion("CUST_SATISFY <", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyLessThanOrEqualTo(Long value) {
            addCriterion("CUST_SATISFY <=", value, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyIn(List<Long> values) {
            addCriterion("CUST_SATISFY in", values, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyNotIn(List<Long> values) {
            addCriterion("CUST_SATISFY not in", values, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyBetween(Long value1, Long value2) {
            addCriterion("CUST_SATISFY between", value1, value2, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustSatisfyNotBetween(Long value1, Long value2) {
            addCriterion("CUST_SATISFY not between", value1, value2, "custSatisfy");
            return (Criteria) this;
        }

        public Criteria andCustCreditIsNull() {
            addCriterion("CUST_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andCustCreditIsNotNull() {
            addCriterion("CUST_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andCustCreditEqualTo(Long value) {
            addCriterion("CUST_CREDIT =", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditNotEqualTo(Long value) {
            addCriterion("CUST_CREDIT <>", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditGreaterThan(Long value) {
            addCriterion("CUST_CREDIT >", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditGreaterThanOrEqualTo(Long value) {
            addCriterion("CUST_CREDIT >=", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditLessThan(Long value) {
            addCriterion("CUST_CREDIT <", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditLessThanOrEqualTo(Long value) {
            addCriterion("CUST_CREDIT <=", value, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditIn(List<Long> values) {
            addCriterion("CUST_CREDIT in", values, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditNotIn(List<Long> values) {
            addCriterion("CUST_CREDIT not in", values, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditBetween(Long value1, Long value2) {
            addCriterion("CUST_CREDIT between", value1, value2, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustCreditNotBetween(Long value1, Long value2) {
            addCriterion("CUST_CREDIT not between", value1, value2, "custCredit");
            return (Criteria) this;
        }

        public Criteria andCustAddrIsNull() {
            addCriterion("CUST_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCustAddrIsNotNull() {
            addCriterion("CUST_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCustAddrEqualTo(String value) {
            addCriterion("CUST_ADDR =", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotEqualTo(String value) {
            addCriterion("CUST_ADDR <>", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrGreaterThan(String value) {
            addCriterion("CUST_ADDR >", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ADDR >=", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLessThan(String value) {
            addCriterion("CUST_ADDR <", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLessThanOrEqualTo(String value) {
            addCriterion("CUST_ADDR <=", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLike(String value) {
            addCriterion("CUST_ADDR like", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotLike(String value) {
            addCriterion("CUST_ADDR not like", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrIn(List<String> values) {
            addCriterion("CUST_ADDR in", values, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotIn(List<String> values) {
            addCriterion("CUST_ADDR not in", values, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrBetween(String value1, String value2) {
            addCriterion("CUST_ADDR between", value1, value2, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotBetween(String value1, String value2) {
            addCriterion("CUST_ADDR not between", value1, value2, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustZipIsNull() {
            addCriterion("CUST_ZIP is null");
            return (Criteria) this;
        }

        public Criteria andCustZipIsNotNull() {
            addCriterion("CUST_ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andCustZipEqualTo(String value) {
            addCriterion("CUST_ZIP =", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotEqualTo(String value) {
            addCriterion("CUST_ZIP <>", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipGreaterThan(String value) {
            addCriterion("CUST_ZIP >", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ZIP >=", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipLessThan(String value) {
            addCriterion("CUST_ZIP <", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipLessThanOrEqualTo(String value) {
            addCriterion("CUST_ZIP <=", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipLike(String value) {
            addCriterion("CUST_ZIP like", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotLike(String value) {
            addCriterion("CUST_ZIP not like", value, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipIn(List<String> values) {
            addCriterion("CUST_ZIP in", values, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotIn(List<String> values) {
            addCriterion("CUST_ZIP not in", values, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipBetween(String value1, String value2) {
            addCriterion("CUST_ZIP between", value1, value2, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustZipNotBetween(String value1, String value2) {
            addCriterion("CUST_ZIP not between", value1, value2, "custZip");
            return (Criteria) this;
        }

        public Criteria andCustTelIsNull() {
            addCriterion("CUST_TEL is null");
            return (Criteria) this;
        }

        public Criteria andCustTelIsNotNull() {
            addCriterion("CUST_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustTelEqualTo(String value) {
            addCriterion("CUST_TEL =", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotEqualTo(String value) {
            addCriterion("CUST_TEL <>", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelGreaterThan(String value) {
            addCriterion("CUST_TEL >", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_TEL >=", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLessThan(String value) {
            addCriterion("CUST_TEL <", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLessThanOrEqualTo(String value) {
            addCriterion("CUST_TEL <=", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLike(String value) {
            addCriterion("CUST_TEL like", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotLike(String value) {
            addCriterion("CUST_TEL not like", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelIn(List<String> values) {
            addCriterion("CUST_TEL in", values, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotIn(List<String> values) {
            addCriterion("CUST_TEL not in", values, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelBetween(String value1, String value2) {
            addCriterion("CUST_TEL between", value1, value2, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotBetween(String value1, String value2) {
            addCriterion("CUST_TEL not between", value1, value2, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustFaxIsNull() {
            addCriterion("CUST_FAX is null");
            return (Criteria) this;
        }

        public Criteria andCustFaxIsNotNull() {
            addCriterion("CUST_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andCustFaxEqualTo(String value) {
            addCriterion("CUST_FAX =", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxNotEqualTo(String value) {
            addCriterion("CUST_FAX <>", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxGreaterThan(String value) {
            addCriterion("CUST_FAX >", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_FAX >=", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxLessThan(String value) {
            addCriterion("CUST_FAX <", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxLessThanOrEqualTo(String value) {
            addCriterion("CUST_FAX <=", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxLike(String value) {
            addCriterion("CUST_FAX like", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxNotLike(String value) {
            addCriterion("CUST_FAX not like", value, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxIn(List<String> values) {
            addCriterion("CUST_FAX in", values, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxNotIn(List<String> values) {
            addCriterion("CUST_FAX not in", values, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxBetween(String value1, String value2) {
            addCriterion("CUST_FAX between", value1, value2, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustFaxNotBetween(String value1, String value2) {
            addCriterion("CUST_FAX not between", value1, value2, "custFax");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteIsNull() {
            addCriterion("CUST_WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteIsNotNull() {
            addCriterion("CUST_WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteEqualTo(String value) {
            addCriterion("CUST_WEBSITE =", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteNotEqualTo(String value) {
            addCriterion("CUST_WEBSITE <>", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteGreaterThan(String value) {
            addCriterion("CUST_WEBSITE >", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_WEBSITE >=", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteLessThan(String value) {
            addCriterion("CUST_WEBSITE <", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteLessThanOrEqualTo(String value) {
            addCriterion("CUST_WEBSITE <=", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteLike(String value) {
            addCriterion("CUST_WEBSITE like", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteNotLike(String value) {
            addCriterion("CUST_WEBSITE not like", value, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteIn(List<String> values) {
            addCriterion("CUST_WEBSITE in", values, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteNotIn(List<String> values) {
            addCriterion("CUST_WEBSITE not in", values, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteBetween(String value1, String value2) {
            addCriterion("CUST_WEBSITE between", value1, value2, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustWebsiteNotBetween(String value1, String value2) {
            addCriterion("CUST_WEBSITE not between", value1, value2, "custWebsite");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoIsNull() {
            addCriterion("CUST_LICENCE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoIsNotNull() {
            addCriterion("CUST_LICENCE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoEqualTo(String value) {
            addCriterion("CUST_LICENCE_NO =", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoNotEqualTo(String value) {
            addCriterion("CUST_LICENCE_NO <>", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoGreaterThan(String value) {
            addCriterion("CUST_LICENCE_NO >", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_LICENCE_NO >=", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoLessThan(String value) {
            addCriterion("CUST_LICENCE_NO <", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_LICENCE_NO <=", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoLike(String value) {
            addCriterion("CUST_LICENCE_NO like", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoNotLike(String value) {
            addCriterion("CUST_LICENCE_NO not like", value, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoIn(List<String> values) {
            addCriterion("CUST_LICENCE_NO in", values, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoNotIn(List<String> values) {
            addCriterion("CUST_LICENCE_NO not in", values, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoBetween(String value1, String value2) {
            addCriterion("CUST_LICENCE_NO between", value1, value2, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustLicenceNoNotBetween(String value1, String value2) {
            addCriterion("CUST_LICENCE_NO not between", value1, value2, "custLicenceNo");
            return (Criteria) this;
        }

        public Criteria andCustChieftainIsNull() {
            addCriterion("CUST_CHIEFTAIN is null");
            return (Criteria) this;
        }

        public Criteria andCustChieftainIsNotNull() {
            addCriterion("CUST_CHIEFTAIN is not null");
            return (Criteria) this;
        }

        public Criteria andCustChieftainEqualTo(String value) {
            addCriterion("CUST_CHIEFTAIN =", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainNotEqualTo(String value) {
            addCriterion("CUST_CHIEFTAIN <>", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainGreaterThan(String value) {
            addCriterion("CUST_CHIEFTAIN >", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_CHIEFTAIN >=", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainLessThan(String value) {
            addCriterion("CUST_CHIEFTAIN <", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainLessThanOrEqualTo(String value) {
            addCriterion("CUST_CHIEFTAIN <=", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainLike(String value) {
            addCriterion("CUST_CHIEFTAIN like", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainNotLike(String value) {
            addCriterion("CUST_CHIEFTAIN not like", value, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainIn(List<String> values) {
            addCriterion("CUST_CHIEFTAIN in", values, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainNotIn(List<String> values) {
            addCriterion("CUST_CHIEFTAIN not in", values, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainBetween(String value1, String value2) {
            addCriterion("CUST_CHIEFTAIN between", value1, value2, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustChieftainNotBetween(String value1, String value2) {
            addCriterion("CUST_CHIEFTAIN not between", value1, value2, "custChieftain");
            return (Criteria) this;
        }

        public Criteria andCustBankrollIsNull() {
            addCriterion("CUST_BANKROLL is null");
            return (Criteria) this;
        }

        public Criteria andCustBankrollIsNotNull() {
            addCriterion("CUST_BANKROLL is not null");
            return (Criteria) this;
        }

        public Criteria andCustBankrollEqualTo(Long value) {
            addCriterion("CUST_BANKROLL =", value, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollNotEqualTo(Long value) {
            addCriterion("CUST_BANKROLL <>", value, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollGreaterThan(Long value) {
            addCriterion("CUST_BANKROLL >", value, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollGreaterThanOrEqualTo(Long value) {
            addCriterion("CUST_BANKROLL >=", value, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollLessThan(Long value) {
            addCriterion("CUST_BANKROLL <", value, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollLessThanOrEqualTo(Long value) {
            addCriterion("CUST_BANKROLL <=", value, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollIn(List<Long> values) {
            addCriterion("CUST_BANKROLL in", values, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollNotIn(List<Long> values) {
            addCriterion("CUST_BANKROLL not in", values, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollBetween(Long value1, Long value2) {
            addCriterion("CUST_BANKROLL between", value1, value2, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustBankrollNotBetween(Long value1, Long value2) {
            addCriterion("CUST_BANKROLL not between", value1, value2, "custBankroll");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverIsNull() {
            addCriterion("CUST_TURNOVER is null");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverIsNotNull() {
            addCriterion("CUST_TURNOVER is not null");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverEqualTo(Long value) {
            addCriterion("CUST_TURNOVER =", value, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverNotEqualTo(Long value) {
            addCriterion("CUST_TURNOVER <>", value, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverGreaterThan(Long value) {
            addCriterion("CUST_TURNOVER >", value, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverGreaterThanOrEqualTo(Long value) {
            addCriterion("CUST_TURNOVER >=", value, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverLessThan(Long value) {
            addCriterion("CUST_TURNOVER <", value, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverLessThanOrEqualTo(Long value) {
            addCriterion("CUST_TURNOVER <=", value, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverIn(List<Long> values) {
            addCriterion("CUST_TURNOVER in", values, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverNotIn(List<Long> values) {
            addCriterion("CUST_TURNOVER not in", values, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverBetween(Long value1, Long value2) {
            addCriterion("CUST_TURNOVER between", value1, value2, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustTurnoverNotBetween(Long value1, Long value2) {
            addCriterion("CUST_TURNOVER not between", value1, value2, "custTurnover");
            return (Criteria) this;
        }

        public Criteria andCustBankIsNull() {
            addCriterion("CUST_BANK is null");
            return (Criteria) this;
        }

        public Criteria andCustBankIsNotNull() {
            addCriterion("CUST_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andCustBankEqualTo(String value) {
            addCriterion("CUST_BANK =", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankNotEqualTo(String value) {
            addCriterion("CUST_BANK <>", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankGreaterThan(String value) {
            addCriterion("CUST_BANK >", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_BANK >=", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankLessThan(String value) {
            addCriterion("CUST_BANK <", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankLessThanOrEqualTo(String value) {
            addCriterion("CUST_BANK <=", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankLike(String value) {
            addCriterion("CUST_BANK like", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankNotLike(String value) {
            addCriterion("CUST_BANK not like", value, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankIn(List<String> values) {
            addCriterion("CUST_BANK in", values, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankNotIn(List<String> values) {
            addCriterion("CUST_BANK not in", values, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankBetween(String value1, String value2) {
            addCriterion("CUST_BANK between", value1, value2, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankNotBetween(String value1, String value2) {
            addCriterion("CUST_BANK not between", value1, value2, "custBank");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountIsNull() {
            addCriterion("CUST_BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountIsNotNull() {
            addCriterion("CUST_BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountEqualTo(String value) {
            addCriterion("CUST_BANK_ACCOUNT =", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountNotEqualTo(String value) {
            addCriterion("CUST_BANK_ACCOUNT <>", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountGreaterThan(String value) {
            addCriterion("CUST_BANK_ACCOUNT >", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_BANK_ACCOUNT >=", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountLessThan(String value) {
            addCriterion("CUST_BANK_ACCOUNT <", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountLessThanOrEqualTo(String value) {
            addCriterion("CUST_BANK_ACCOUNT <=", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountLike(String value) {
            addCriterion("CUST_BANK_ACCOUNT like", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountNotLike(String value) {
            addCriterion("CUST_BANK_ACCOUNT not like", value, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountIn(List<String> values) {
            addCriterion("CUST_BANK_ACCOUNT in", values, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountNotIn(List<String> values) {
            addCriterion("CUST_BANK_ACCOUNT not in", values, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountBetween(String value1, String value2) {
            addCriterion("CUST_BANK_ACCOUNT between", value1, value2, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustBankAccountNotBetween(String value1, String value2) {
            addCriterion("CUST_BANK_ACCOUNT not between", value1, value2, "custBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoIsNull() {
            addCriterion("CUST_LOCAL_TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoIsNotNull() {
            addCriterion("CUST_LOCAL_TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoEqualTo(String value) {
            addCriterion("CUST_LOCAL_TAX_NO =", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoNotEqualTo(String value) {
            addCriterion("CUST_LOCAL_TAX_NO <>", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoGreaterThan(String value) {
            addCriterion("CUST_LOCAL_TAX_NO >", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_LOCAL_TAX_NO >=", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoLessThan(String value) {
            addCriterion("CUST_LOCAL_TAX_NO <", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_LOCAL_TAX_NO <=", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoLike(String value) {
            addCriterion("CUST_LOCAL_TAX_NO like", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoNotLike(String value) {
            addCriterion("CUST_LOCAL_TAX_NO not like", value, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoIn(List<String> values) {
            addCriterion("CUST_LOCAL_TAX_NO in", values, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoNotIn(List<String> values) {
            addCriterion("CUST_LOCAL_TAX_NO not in", values, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoBetween(String value1, String value2) {
            addCriterion("CUST_LOCAL_TAX_NO between", value1, value2, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustLocalTaxNoNotBetween(String value1, String value2) {
            addCriterion("CUST_LOCAL_TAX_NO not between", value1, value2, "custLocalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoIsNull() {
            addCriterion("CUST_NATIONAL_TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoIsNotNull() {
            addCriterion("CUST_NATIONAL_TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoEqualTo(String value) {
            addCriterion("CUST_NATIONAL_TAX_NO =", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoNotEqualTo(String value) {
            addCriterion("CUST_NATIONAL_TAX_NO <>", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoGreaterThan(String value) {
            addCriterion("CUST_NATIONAL_TAX_NO >", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NATIONAL_TAX_NO >=", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoLessThan(String value) {
            addCriterion("CUST_NATIONAL_TAX_NO <", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_NATIONAL_TAX_NO <=", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoLike(String value) {
            addCriterion("CUST_NATIONAL_TAX_NO like", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoNotLike(String value) {
            addCriterion("CUST_NATIONAL_TAX_NO not like", value, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoIn(List<String> values) {
            addCriterion("CUST_NATIONAL_TAX_NO in", values, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoNotIn(List<String> values) {
            addCriterion("CUST_NATIONAL_TAX_NO not in", values, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoBetween(String value1, String value2) {
            addCriterion("CUST_NATIONAL_TAX_NO between", value1, value2, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNationalTaxNoNotBetween(String value1, String value2) {
            addCriterion("CUST_NATIONAL_TAX_NO not between", value1, value2, "custNationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustStatusIsNull() {
            addCriterion("CUST_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCustStatusIsNotNull() {
            addCriterion("CUST_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCustStatusEqualTo(String value) {
            addCriterion("CUST_STATUS =", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotEqualTo(String value) {
            addCriterion("CUST_STATUS <>", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusGreaterThan(String value) {
            addCriterion("CUST_STATUS >", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_STATUS >=", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusLessThan(String value) {
            addCriterion("CUST_STATUS <", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusLessThanOrEqualTo(String value) {
            addCriterion("CUST_STATUS <=", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusLike(String value) {
            addCriterion("CUST_STATUS like", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotLike(String value) {
            addCriterion("CUST_STATUS not like", value, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusIn(List<String> values) {
            addCriterion("CUST_STATUS in", values, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotIn(List<String> values) {
            addCriterion("CUST_STATUS not in", values, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusBetween(String value1, String value2) {
            addCriterion("CUST_STATUS between", value1, value2, "custStatus");
            return (Criteria) this;
        }

        public Criteria andCustStatusNotBetween(String value1, String value2) {
            addCriterion("CUST_STATUS not between", value1, value2, "custStatus");
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