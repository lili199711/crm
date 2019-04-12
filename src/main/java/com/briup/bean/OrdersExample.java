package com.briup.bean;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public OrdersExample() {
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

        public Criteria andOdrIdIsNull() {
            addCriterion("ODR_ID is null");
            return (Criteria) this;
        }

        public Criteria andOdrIdIsNotNull() {
            addCriterion("ODR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOdrIdEqualTo(Long value) {
            addCriterion("ODR_ID =", value, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdNotEqualTo(Long value) {
            addCriterion("ODR_ID <>", value, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdGreaterThan(Long value) {
            addCriterion("ODR_ID >", value, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ODR_ID >=", value, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdLessThan(Long value) {
            addCriterion("ODR_ID <", value, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdLessThanOrEqualTo(Long value) {
            addCriterion("ODR_ID <=", value, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdIn(List<Long> values) {
            addCriterion("ODR_ID in", values, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdNotIn(List<Long> values) {
            addCriterion("ODR_ID not in", values, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdBetween(Long value1, Long value2) {
            addCriterion("ODR_ID between", value1, value2, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrIdNotBetween(Long value1, Long value2) {
            addCriterion("ODR_ID not between", value1, value2, "odrId");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerIsNull() {
            addCriterion("ODR_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerIsNotNull() {
            addCriterion("ODR_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerEqualTo(String value) {
            addCriterion("ODR_CUSTOMER =", value, "odrCustomer");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerNotEqualTo(String value) {
            addCriterion("ODR_CUSTOMER <>", value, "odrCustomer");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerGreaterThan(String value) {
            addCriterion("ODR_CUSTOMER >", value, "odrCustomer");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("ODR_CUSTOMER >=", value, "odrCustomer");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerLessThan(String value) {
            addCriterion("ODR_CUSTOMER <", value, "odrCustomer");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerLessThanOrEqualTo(String value) {
            addCriterion("ODR_CUSTOMER <=", value, "odrCustomer");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerLike(String value) {
            addCriterion("ODR_CUSTOMER like", value, "odrCustomer");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerNotLike(String value) {
            addCriterion("ODR_CUSTOMER not like", value, "odrCustomer");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerIn(List<String> values) {
            addCriterion("ODR_CUSTOMER in", values, "odrCustomer");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerNotIn(List<String> values) {
            addCriterion("ODR_CUSTOMER not in", values, "odrCustomer");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerBetween(String value1, String value2) {
            addCriterion("ODR_CUSTOMER between", value1, value2, "odrCustomer");
            return (Criteria) this;
        }

        public Criteria andOdrCustomerNotBetween(String value1, String value2) {
            addCriterion("ODR_CUSTOMER not between", value1, value2, "odrCustomer");
            return (Criteria) this;
        }

        public Criteria andOdrAddrIsNull() {
            addCriterion("ODR_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andOdrAddrIsNotNull() {
            addCriterion("ODR_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andOdrAddrEqualTo(String value) {
            addCriterion("ODR_ADDR =", value, "odrAddr");
            return (Criteria) this;
        }

        public Criteria andOdrAddrNotEqualTo(String value) {
            addCriterion("ODR_ADDR <>", value, "odrAddr");
            return (Criteria) this;
        }

        public Criteria andOdrAddrGreaterThan(String value) {
            addCriterion("ODR_ADDR >", value, "odrAddr");
            return (Criteria) this;
        }

        public Criteria andOdrAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ODR_ADDR >=", value, "odrAddr");
            return (Criteria) this;
        }

        public Criteria andOdrAddrLessThan(String value) {
            addCriterion("ODR_ADDR <", value, "odrAddr");
            return (Criteria) this;
        }

        public Criteria andOdrAddrLessThanOrEqualTo(String value) {
            addCriterion("ODR_ADDR <=", value, "odrAddr");
            return (Criteria) this;
        }

        public Criteria andOdrAddrLike(String value) {
            addCriterion("ODR_ADDR like", value, "odrAddr");
            return (Criteria) this;
        }

        public Criteria andOdrAddrNotLike(String value) {
            addCriterion("ODR_ADDR not like", value, "odrAddr");
            return (Criteria) this;
        }

        public Criteria andOdrAddrIn(List<String> values) {
            addCriterion("ODR_ADDR in", values, "odrAddr");
            return (Criteria) this;
        }

        public Criteria andOdrAddrNotIn(List<String> values) {
            addCriterion("ODR_ADDR not in", values, "odrAddr");
            return (Criteria) this;
        }

        public Criteria andOdrAddrBetween(String value1, String value2) {
            addCriterion("ODR_ADDR between", value1, value2, "odrAddr");
            return (Criteria) this;
        }

        public Criteria andOdrAddrNotBetween(String value1, String value2) {
            addCriterion("ODR_ADDR not between", value1, value2, "odrAddr");
            return (Criteria) this;
        }

        public Criteria andOdrStatusIsNull() {
            addCriterion("ODR_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOdrStatusIsNotNull() {
            addCriterion("ODR_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOdrStatusEqualTo(String value) {
            addCriterion("ODR_STATUS =", value, "odrStatus");
            return (Criteria) this;
        }

        public Criteria andOdrStatusNotEqualTo(String value) {
            addCriterion("ODR_STATUS <>", value, "odrStatus");
            return (Criteria) this;
        }

        public Criteria andOdrStatusGreaterThan(String value) {
            addCriterion("ODR_STATUS >", value, "odrStatus");
            return (Criteria) this;
        }

        public Criteria andOdrStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ODR_STATUS >=", value, "odrStatus");
            return (Criteria) this;
        }

        public Criteria andOdrStatusLessThan(String value) {
            addCriterion("ODR_STATUS <", value, "odrStatus");
            return (Criteria) this;
        }

        public Criteria andOdrStatusLessThanOrEqualTo(String value) {
            addCriterion("ODR_STATUS <=", value, "odrStatus");
            return (Criteria) this;
        }

        public Criteria andOdrStatusLike(String value) {
            addCriterion("ODR_STATUS like", value, "odrStatus");
            return (Criteria) this;
        }

        public Criteria andOdrStatusNotLike(String value) {
            addCriterion("ODR_STATUS not like", value, "odrStatus");
            return (Criteria) this;
        }

        public Criteria andOdrStatusIn(List<String> values) {
            addCriterion("ODR_STATUS in", values, "odrStatus");
            return (Criteria) this;
        }

        public Criteria andOdrStatusNotIn(List<String> values) {
            addCriterion("ODR_STATUS not in", values, "odrStatus");
            return (Criteria) this;
        }

        public Criteria andOdrStatusBetween(String value1, String value2) {
            addCriterion("ODR_STATUS between", value1, value2, "odrStatus");
            return (Criteria) this;
        }

        public Criteria andOdrStatusNotBetween(String value1, String value2) {
            addCriterion("ODR_STATUS not between", value1, value2, "odrStatus");
            return (Criteria) this;
        }

        public Criteria andOdrCustIdIsNull() {
            addCriterion("ODR_CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andOdrCustIdIsNotNull() {
            addCriterion("ODR_CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOdrCustIdEqualTo(Long value) {
            addCriterion("ODR_CUST_ID =", value, "odrCustId");
            return (Criteria) this;
        }

        public Criteria andOdrCustIdNotEqualTo(Long value) {
            addCriterion("ODR_CUST_ID <>", value, "odrCustId");
            return (Criteria) this;
        }

        public Criteria andOdrCustIdGreaterThan(Long value) {
            addCriterion("ODR_CUST_ID >", value, "odrCustId");
            return (Criteria) this;
        }

        public Criteria andOdrCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ODR_CUST_ID >=", value, "odrCustId");
            return (Criteria) this;
        }

        public Criteria andOdrCustIdLessThan(Long value) {
            addCriterion("ODR_CUST_ID <", value, "odrCustId");
            return (Criteria) this;
        }

        public Criteria andOdrCustIdLessThanOrEqualTo(Long value) {
            addCriterion("ODR_CUST_ID <=", value, "odrCustId");
            return (Criteria) this;
        }

        public Criteria andOdrCustIdIn(List<Long> values) {
            addCriterion("ODR_CUST_ID in", values, "odrCustId");
            return (Criteria) this;
        }

        public Criteria andOdrCustIdNotIn(List<Long> values) {
            addCriterion("ODR_CUST_ID not in", values, "odrCustId");
            return (Criteria) this;
        }

        public Criteria andOdrCustIdBetween(Long value1, Long value2) {
            addCriterion("ODR_CUST_ID between", value1, value2, "odrCustId");
            return (Criteria) this;
        }

        public Criteria andOdrCustIdNotBetween(Long value1, Long value2) {
            addCriterion("ODR_CUST_ID not between", value1, value2, "odrCustId");
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