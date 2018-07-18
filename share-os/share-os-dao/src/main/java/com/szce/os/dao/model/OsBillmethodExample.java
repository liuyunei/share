package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OsBillmethodExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OsBillmethodExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andBillmethodidIsNull() {
            addCriterion("BILLMETHODID is null");
            return (Criteria) this;
        }

        public Criteria andBillmethodidIsNotNull() {
            addCriterion("BILLMETHODID is not null");
            return (Criteria) this;
        }

        public Criteria andBillmethodidEqualTo(String value) {
            addCriterion("BILLMETHODID =", value, "billmethodid");
            return (Criteria) this;
        }

        public Criteria andBillmethodidNotEqualTo(String value) {
            addCriterion("BILLMETHODID <>", value, "billmethodid");
            return (Criteria) this;
        }

        public Criteria andBillmethodidGreaterThan(String value) {
            addCriterion("BILLMETHODID >", value, "billmethodid");
            return (Criteria) this;
        }

        public Criteria andBillmethodidGreaterThanOrEqualTo(String value) {
            addCriterion("BILLMETHODID >=", value, "billmethodid");
            return (Criteria) this;
        }

        public Criteria andBillmethodidLessThan(String value) {
            addCriterion("BILLMETHODID <", value, "billmethodid");
            return (Criteria) this;
        }

        public Criteria andBillmethodidLessThanOrEqualTo(String value) {
            addCriterion("BILLMETHODID <=", value, "billmethodid");
            return (Criteria) this;
        }

        public Criteria andBillmethodidLike(String value) {
            addCriterion("BILLMETHODID like", value, "billmethodid");
            return (Criteria) this;
        }

        public Criteria andBillmethodidNotLike(String value) {
            addCriterion("BILLMETHODID not like", value, "billmethodid");
            return (Criteria) this;
        }

        public Criteria andBillmethodidIn(List<String> values) {
            addCriterion("BILLMETHODID in", values, "billmethodid");
            return (Criteria) this;
        }

        public Criteria andBillmethodidNotIn(List<String> values) {
            addCriterion("BILLMETHODID not in", values, "billmethodid");
            return (Criteria) this;
        }

        public Criteria andBillmethodidBetween(String value1, String value2) {
            addCriterion("BILLMETHODID between", value1, value2, "billmethodid");
            return (Criteria) this;
        }

        public Criteria andBillmethodidNotBetween(String value1, String value2) {
            addCriterion("BILLMETHODID not between", value1, value2, "billmethodid");
            return (Criteria) this;
        }

        public Criteria andBillmethodIsNull() {
            addCriterion("BILLMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andBillmethodIsNotNull() {
            addCriterion("BILLMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andBillmethodEqualTo(String value) {
            addCriterion("BILLMETHOD =", value, "billmethod");
            return (Criteria) this;
        }

        public Criteria andBillmethodNotEqualTo(String value) {
            addCriterion("BILLMETHOD <>", value, "billmethod");
            return (Criteria) this;
        }

        public Criteria andBillmethodGreaterThan(String value) {
            addCriterion("BILLMETHOD >", value, "billmethod");
            return (Criteria) this;
        }

        public Criteria andBillmethodGreaterThanOrEqualTo(String value) {
            addCriterion("BILLMETHOD >=", value, "billmethod");
            return (Criteria) this;
        }

        public Criteria andBillmethodLessThan(String value) {
            addCriterion("BILLMETHOD <", value, "billmethod");
            return (Criteria) this;
        }

        public Criteria andBillmethodLessThanOrEqualTo(String value) {
            addCriterion("BILLMETHOD <=", value, "billmethod");
            return (Criteria) this;
        }

        public Criteria andBillmethodLike(String value) {
            addCriterion("BILLMETHOD like", value, "billmethod");
            return (Criteria) this;
        }

        public Criteria andBillmethodNotLike(String value) {
            addCriterion("BILLMETHOD not like", value, "billmethod");
            return (Criteria) this;
        }

        public Criteria andBillmethodIn(List<String> values) {
            addCriterion("BILLMETHOD in", values, "billmethod");
            return (Criteria) this;
        }

        public Criteria andBillmethodNotIn(List<String> values) {
            addCriterion("BILLMETHOD not in", values, "billmethod");
            return (Criteria) this;
        }

        public Criteria andBillmethodBetween(String value1, String value2) {
            addCriterion("BILLMETHOD between", value1, value2, "billmethod");
            return (Criteria) this;
        }

        public Criteria andBillmethodNotBetween(String value1, String value2) {
            addCriterion("BILLMETHOD not between", value1, value2, "billmethod");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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