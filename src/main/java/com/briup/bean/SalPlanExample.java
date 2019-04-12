package com.briup.bean;

import java.util.ArrayList;
import java.util.List;

public class SalPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public SalPlanExample() {
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

        public Criteria andPlaIdIsNull() {
            addCriterion("PLA_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlaIdIsNotNull() {
            addCriterion("PLA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlaIdEqualTo(Long value) {
            addCriterion("PLA_ID =", value, "plaId");
            return (Criteria) this;
        }

        public Criteria andPlaIdNotEqualTo(Long value) {
            addCriterion("PLA_ID <>", value, "plaId");
            return (Criteria) this;
        }

        public Criteria andPlaIdGreaterThan(Long value) {
            addCriterion("PLA_ID >", value, "plaId");
            return (Criteria) this;
        }

        public Criteria andPlaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PLA_ID >=", value, "plaId");
            return (Criteria) this;
        }

        public Criteria andPlaIdLessThan(Long value) {
            addCriterion("PLA_ID <", value, "plaId");
            return (Criteria) this;
        }

        public Criteria andPlaIdLessThanOrEqualTo(Long value) {
            addCriterion("PLA_ID <=", value, "plaId");
            return (Criteria) this;
        }

        public Criteria andPlaIdIn(List<Long> values) {
            addCriterion("PLA_ID in", values, "plaId");
            return (Criteria) this;
        }

        public Criteria andPlaIdNotIn(List<Long> values) {
            addCriterion("PLA_ID not in", values, "plaId");
            return (Criteria) this;
        }

        public Criteria andPlaIdBetween(Long value1, Long value2) {
            addCriterion("PLA_ID between", value1, value2, "plaId");
            return (Criteria) this;
        }

        public Criteria andPlaIdNotBetween(Long value1, Long value2) {
            addCriterion("PLA_ID not between", value1, value2, "plaId");
            return (Criteria) this;
        }

        public Criteria andPlaChcIdIsNull() {
            addCriterion("PLA_CHC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlaChcIdIsNotNull() {
            addCriterion("PLA_CHC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlaChcIdEqualTo(Long value) {
            addCriterion("PLA_CHC_ID =", value, "plaChcId");
            return (Criteria) this;
        }

        public Criteria andPlaChcIdNotEqualTo(Long value) {
            addCriterion("PLA_CHC_ID <>", value, "plaChcId");
            return (Criteria) this;
        }

        public Criteria andPlaChcIdGreaterThan(Long value) {
            addCriterion("PLA_CHC_ID >", value, "plaChcId");
            return (Criteria) this;
        }

        public Criteria andPlaChcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PLA_CHC_ID >=", value, "plaChcId");
            return (Criteria) this;
        }

        public Criteria andPlaChcIdLessThan(Long value) {
            addCriterion("PLA_CHC_ID <", value, "plaChcId");
            return (Criteria) this;
        }

        public Criteria andPlaChcIdLessThanOrEqualTo(Long value) {
            addCriterion("PLA_CHC_ID <=", value, "plaChcId");
            return (Criteria) this;
        }

        public Criteria andPlaChcIdIn(List<Long> values) {
            addCriterion("PLA_CHC_ID in", values, "plaChcId");
            return (Criteria) this;
        }

        public Criteria andPlaChcIdNotIn(List<Long> values) {
            addCriterion("PLA_CHC_ID not in", values, "plaChcId");
            return (Criteria) this;
        }

        public Criteria andPlaChcIdBetween(Long value1, Long value2) {
            addCriterion("PLA_CHC_ID between", value1, value2, "plaChcId");
            return (Criteria) this;
        }

        public Criteria andPlaChcIdNotBetween(Long value1, Long value2) {
            addCriterion("PLA_CHC_ID not between", value1, value2, "plaChcId");
            return (Criteria) this;
        }

        public Criteria andPlaTodoIsNull() {
            addCriterion("PLA_TODO is null");
            return (Criteria) this;
        }

        public Criteria andPlaTodoIsNotNull() {
            addCriterion("PLA_TODO is not null");
            return (Criteria) this;
        }

        public Criteria andPlaTodoEqualTo(String value) {
            addCriterion("PLA_TODO =", value, "plaTodo");
            return (Criteria) this;
        }

        public Criteria andPlaTodoNotEqualTo(String value) {
            addCriterion("PLA_TODO <>", value, "plaTodo");
            return (Criteria) this;
        }

        public Criteria andPlaTodoGreaterThan(String value) {
            addCriterion("PLA_TODO >", value, "plaTodo");
            return (Criteria) this;
        }

        public Criteria andPlaTodoGreaterThanOrEqualTo(String value) {
            addCriterion("PLA_TODO >=", value, "plaTodo");
            return (Criteria) this;
        }

        public Criteria andPlaTodoLessThan(String value) {
            addCriterion("PLA_TODO <", value, "plaTodo");
            return (Criteria) this;
        }

        public Criteria andPlaTodoLessThanOrEqualTo(String value) {
            addCriterion("PLA_TODO <=", value, "plaTodo");
            return (Criteria) this;
        }

        public Criteria andPlaTodoLike(String value) {
            addCriterion("PLA_TODO like", value, "plaTodo");
            return (Criteria) this;
        }

        public Criteria andPlaTodoNotLike(String value) {
            addCriterion("PLA_TODO not like", value, "plaTodo");
            return (Criteria) this;
        }

        public Criteria andPlaTodoIn(List<String> values) {
            addCriterion("PLA_TODO in", values, "plaTodo");
            return (Criteria) this;
        }

        public Criteria andPlaTodoNotIn(List<String> values) {
            addCriterion("PLA_TODO not in", values, "plaTodo");
            return (Criteria) this;
        }

        public Criteria andPlaTodoBetween(String value1, String value2) {
            addCriterion("PLA_TODO between", value1, value2, "plaTodo");
            return (Criteria) this;
        }

        public Criteria andPlaTodoNotBetween(String value1, String value2) {
            addCriterion("PLA_TODO not between", value1, value2, "plaTodo");
            return (Criteria) this;
        }

        public Criteria andPlaResultIsNull() {
            addCriterion("PLA_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPlaResultIsNotNull() {
            addCriterion("PLA_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPlaResultEqualTo(String value) {
            addCriterion("PLA_RESULT =", value, "plaResult");
            return (Criteria) this;
        }

        public Criteria andPlaResultNotEqualTo(String value) {
            addCriterion("PLA_RESULT <>", value, "plaResult");
            return (Criteria) this;
        }

        public Criteria andPlaResultGreaterThan(String value) {
            addCriterion("PLA_RESULT >", value, "plaResult");
            return (Criteria) this;
        }

        public Criteria andPlaResultGreaterThanOrEqualTo(String value) {
            addCriterion("PLA_RESULT >=", value, "plaResult");
            return (Criteria) this;
        }

        public Criteria andPlaResultLessThan(String value) {
            addCriterion("PLA_RESULT <", value, "plaResult");
            return (Criteria) this;
        }

        public Criteria andPlaResultLessThanOrEqualTo(String value) {
            addCriterion("PLA_RESULT <=", value, "plaResult");
            return (Criteria) this;
        }

        public Criteria andPlaResultLike(String value) {
            addCriterion("PLA_RESULT like", value, "plaResult");
            return (Criteria) this;
        }

        public Criteria andPlaResultNotLike(String value) {
            addCriterion("PLA_RESULT not like", value, "plaResult");
            return (Criteria) this;
        }

        public Criteria andPlaResultIn(List<String> values) {
            addCriterion("PLA_RESULT in", values, "plaResult");
            return (Criteria) this;
        }

        public Criteria andPlaResultNotIn(List<String> values) {
            addCriterion("PLA_RESULT not in", values, "plaResult");
            return (Criteria) this;
        }

        public Criteria andPlaResultBetween(String value1, String value2) {
            addCriterion("PLA_RESULT between", value1, value2, "plaResult");
            return (Criteria) this;
        }

        public Criteria andPlaResultNotBetween(String value1, String value2) {
            addCriterion("PLA_RESULT not between", value1, value2, "plaResult");
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