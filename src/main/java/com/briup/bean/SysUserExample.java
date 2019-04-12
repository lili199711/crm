package com.briup.bean;

import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public SysUserExample() {
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

        public Criteria andUsrIdIsNull() {
            addCriterion("USR_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsrIdIsNotNull() {
            addCriterion("USR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsrIdEqualTo(Long value) {
            addCriterion("USR_ID =", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotEqualTo(Long value) {
            addCriterion("USR_ID <>", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThan(Long value) {
            addCriterion("USR_ID >", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USR_ID >=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThan(Long value) {
            addCriterion("USR_ID <", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdLessThanOrEqualTo(Long value) {
            addCriterion("USR_ID <=", value, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdIn(List<Long> values) {
            addCriterion("USR_ID in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotIn(List<Long> values) {
            addCriterion("USR_ID not in", values, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdBetween(Long value1, Long value2) {
            addCriterion("USR_ID between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrIdNotBetween(Long value1, Long value2) {
            addCriterion("USR_ID not between", value1, value2, "usrId");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNull() {
            addCriterion("USR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNotNull() {
            addCriterion("USR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNameEqualTo(String value) {
            addCriterion("USR_NAME =", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotEqualTo(String value) {
            addCriterion("USR_NAME <>", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThan(String value) {
            addCriterion("USR_NAME >", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThanOrEqualTo(String value) {
            addCriterion("USR_NAME >=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThan(String value) {
            addCriterion("USR_NAME <", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThanOrEqualTo(String value) {
            addCriterion("USR_NAME <=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLike(String value) {
            addCriterion("USR_NAME like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotLike(String value) {
            addCriterion("USR_NAME not like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameIn(List<String> values) {
            addCriterion("USR_NAME in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotIn(List<String> values) {
            addCriterion("USR_NAME not in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameBetween(String value1, String value2) {
            addCriterion("USR_NAME between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotBetween(String value1, String value2) {
            addCriterion("USR_NAME not between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIsNull() {
            addCriterion("USR_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIsNotNull() {
            addCriterion("USR_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordEqualTo(String value) {
            addCriterion("USR_PASSWORD =", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotEqualTo(String value) {
            addCriterion("USR_PASSWORD <>", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThan(String value) {
            addCriterion("USR_PASSWORD >", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USR_PASSWORD >=", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThan(String value) {
            addCriterion("USR_PASSWORD <", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThanOrEqualTo(String value) {
            addCriterion("USR_PASSWORD <=", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLike(String value) {
            addCriterion("USR_PASSWORD like", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotLike(String value) {
            addCriterion("USR_PASSWORD not like", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIn(List<String> values) {
            addCriterion("USR_PASSWORD in", values, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotIn(List<String> values) {
            addCriterion("USR_PASSWORD not in", values, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordBetween(String value1, String value2) {
            addCriterion("USR_PASSWORD between", value1, value2, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotBetween(String value1, String value2) {
            addCriterion("USR_PASSWORD not between", value1, value2, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrFlagIsNull() {
            addCriterion("USR_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andUsrFlagIsNotNull() {
            addCriterion("USR_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andUsrFlagEqualTo(Long value) {
            addCriterion("USR_FLAG =", value, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagNotEqualTo(Long value) {
            addCriterion("USR_FLAG <>", value, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagGreaterThan(Long value) {
            addCriterion("USR_FLAG >", value, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagGreaterThanOrEqualTo(Long value) {
            addCriterion("USR_FLAG >=", value, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagLessThan(Long value) {
            addCriterion("USR_FLAG <", value, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagLessThanOrEqualTo(Long value) {
            addCriterion("USR_FLAG <=", value, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagIn(List<Long> values) {
            addCriterion("USR_FLAG in", values, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagNotIn(List<Long> values) {
            addCriterion("USR_FLAG not in", values, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagBetween(Long value1, Long value2) {
            addCriterion("USR_FLAG between", value1, value2, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrFlagNotBetween(Long value1, Long value2) {
            addCriterion("USR_FLAG not between", value1, value2, "usrFlag");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdIsNull() {
            addCriterion("USR_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdIsNotNull() {
            addCriterion("USR_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdEqualTo(Long value) {
            addCriterion("USR_ROLE_ID =", value, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdNotEqualTo(Long value) {
            addCriterion("USR_ROLE_ID <>", value, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdGreaterThan(Long value) {
            addCriterion("USR_ROLE_ID >", value, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USR_ROLE_ID >=", value, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdLessThan(Long value) {
            addCriterion("USR_ROLE_ID <", value, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("USR_ROLE_ID <=", value, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdIn(List<Long> values) {
            addCriterion("USR_ROLE_ID in", values, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdNotIn(List<Long> values) {
            addCriterion("USR_ROLE_ID not in", values, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdBetween(Long value1, Long value2) {
            addCriterion("USR_ROLE_ID between", value1, value2, "usrRoleId");
            return (Criteria) this;
        }

        public Criteria andUsrRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("USR_ROLE_ID not between", value1, value2, "usrRoleId");
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