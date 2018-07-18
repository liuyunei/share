package com.szce.im.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ImMaintenancesitedataExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ImMaintenancesitedataExample() {
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

        public Criteria andMaintenancesitedataidIsNull() {
            addCriterion("MAINTENANCESITEDATAID is null");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidIsNotNull() {
            addCriterion("MAINTENANCESITEDATAID is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidEqualTo(String value) {
            addCriterion("MAINTENANCESITEDATAID =", value, "maintenancesitedataid");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidNotEqualTo(String value) {
            addCriterion("MAINTENANCESITEDATAID <>", value, "maintenancesitedataid");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidGreaterThan(String value) {
            addCriterion("MAINTENANCESITEDATAID >", value, "maintenancesitedataid");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidGreaterThanOrEqualTo(String value) {
            addCriterion("MAINTENANCESITEDATAID >=", value, "maintenancesitedataid");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidLessThan(String value) {
            addCriterion("MAINTENANCESITEDATAID <", value, "maintenancesitedataid");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidLessThanOrEqualTo(String value) {
            addCriterion("MAINTENANCESITEDATAID <=", value, "maintenancesitedataid");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidLike(String value) {
            addCriterion("MAINTENANCESITEDATAID like", value, "maintenancesitedataid");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidNotLike(String value) {
            addCriterion("MAINTENANCESITEDATAID not like", value, "maintenancesitedataid");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidIn(List<String> values) {
            addCriterion("MAINTENANCESITEDATAID in", values, "maintenancesitedataid");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidNotIn(List<String> values) {
            addCriterion("MAINTENANCESITEDATAID not in", values, "maintenancesitedataid");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidBetween(String value1, String value2) {
            addCriterion("MAINTENANCESITEDATAID between", value1, value2, "maintenancesitedataid");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitedataidNotBetween(String value1, String value2) {
            addCriterion("MAINTENANCESITEDATAID not between", value1, value2, "maintenancesitedataid");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("COMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("COMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("COMPANYNAME =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("COMPANYNAME <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("COMPANYNAME >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYNAME >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("COMPANYNAME <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("COMPANYNAME <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("COMPANYNAME like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("COMPANYNAME not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("COMPANYNAME in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("COMPANYNAME not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("COMPANYNAME between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("COMPANYNAME not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionIsNull() {
            addCriterion("MAINTENANCESITEPOSITION is null");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionIsNotNull() {
            addCriterion("MAINTENANCESITEPOSITION is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionEqualTo(String value) {
            addCriterion("MAINTENANCESITEPOSITION =", value, "maintenancesiteposition");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionNotEqualTo(String value) {
            addCriterion("MAINTENANCESITEPOSITION <>", value, "maintenancesiteposition");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionGreaterThan(String value) {
            addCriterion("MAINTENANCESITEPOSITION >", value, "maintenancesiteposition");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionGreaterThanOrEqualTo(String value) {
            addCriterion("MAINTENANCESITEPOSITION >=", value, "maintenancesiteposition");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionLessThan(String value) {
            addCriterion("MAINTENANCESITEPOSITION <", value, "maintenancesiteposition");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionLessThanOrEqualTo(String value) {
            addCriterion("MAINTENANCESITEPOSITION <=", value, "maintenancesiteposition");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionLike(String value) {
            addCriterion("MAINTENANCESITEPOSITION like", value, "maintenancesiteposition");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionNotLike(String value) {
            addCriterion("MAINTENANCESITEPOSITION not like", value, "maintenancesiteposition");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionIn(List<String> values) {
            addCriterion("MAINTENANCESITEPOSITION in", values, "maintenancesiteposition");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionNotIn(List<String> values) {
            addCriterion("MAINTENANCESITEPOSITION not in", values, "maintenancesiteposition");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionBetween(String value1, String value2) {
            addCriterion("MAINTENANCESITEPOSITION between", value1, value2, "maintenancesiteposition");
            return (Criteria) this;
        }

        public Criteria andMaintenancesitepositionNotBetween(String value1, String value2) {
            addCriterion("MAINTENANCESITEPOSITION not between", value1, value2, "maintenancesiteposition");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaIsNull() {
            addCriterion("MAINTENANCESITEAREA is null");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaIsNotNull() {
            addCriterion("MAINTENANCESITEAREA is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaEqualTo(String value) {
            addCriterion("MAINTENANCESITEAREA =", value, "maintenancesitearea");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaNotEqualTo(String value) {
            addCriterion("MAINTENANCESITEAREA <>", value, "maintenancesitearea");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaGreaterThan(String value) {
            addCriterion("MAINTENANCESITEAREA >", value, "maintenancesitearea");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaGreaterThanOrEqualTo(String value) {
            addCriterion("MAINTENANCESITEAREA >=", value, "maintenancesitearea");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaLessThan(String value) {
            addCriterion("MAINTENANCESITEAREA <", value, "maintenancesitearea");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaLessThanOrEqualTo(String value) {
            addCriterion("MAINTENANCESITEAREA <=", value, "maintenancesitearea");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaLike(String value) {
            addCriterion("MAINTENANCESITEAREA like", value, "maintenancesitearea");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaNotLike(String value) {
            addCriterion("MAINTENANCESITEAREA not like", value, "maintenancesitearea");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaIn(List<String> values) {
            addCriterion("MAINTENANCESITEAREA in", values, "maintenancesitearea");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaNotIn(List<String> values) {
            addCriterion("MAINTENANCESITEAREA not in", values, "maintenancesitearea");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaBetween(String value1, String value2) {
            addCriterion("MAINTENANCESITEAREA between", value1, value2, "maintenancesitearea");
            return (Criteria) this;
        }

        public Criteria andMaintenancesiteareaNotBetween(String value1, String value2) {
            addCriterion("MAINTENANCESITEAREA not between", value1, value2, "maintenancesitearea");
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