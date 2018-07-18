package com.szce.im.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ImBikewayExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ImBikewayExample() {
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

        public Criteria andBikewayidIsNull() {
            addCriterion("BikeWayID is null");
            return (Criteria) this;
        }

        public Criteria andBikewayidIsNotNull() {
            addCriterion("BikeWayID is not null");
            return (Criteria) this;
        }

        public Criteria andBikewayidEqualTo(String value) {
            addCriterion("BikeWayID =", value, "bikewayid");
            return (Criteria) this;
        }

        public Criteria andBikewayidNotEqualTo(String value) {
            addCriterion("BikeWayID <>", value, "bikewayid");
            return (Criteria) this;
        }

        public Criteria andBikewayidGreaterThan(String value) {
            addCriterion("BikeWayID >", value, "bikewayid");
            return (Criteria) this;
        }

        public Criteria andBikewayidGreaterThanOrEqualTo(String value) {
            addCriterion("BikeWayID >=", value, "bikewayid");
            return (Criteria) this;
        }

        public Criteria andBikewayidLessThan(String value) {
            addCriterion("BikeWayID <", value, "bikewayid");
            return (Criteria) this;
        }

        public Criteria andBikewayidLessThanOrEqualTo(String value) {
            addCriterion("BikeWayID <=", value, "bikewayid");
            return (Criteria) this;
        }

        public Criteria andBikewayidLike(String value) {
            addCriterion("BikeWayID like", value, "bikewayid");
            return (Criteria) this;
        }

        public Criteria andBikewayidNotLike(String value) {
            addCriterion("BikeWayID not like", value, "bikewayid");
            return (Criteria) this;
        }

        public Criteria andBikewayidIn(List<String> values) {
            addCriterion("BikeWayID in", values, "bikewayid");
            return (Criteria) this;
        }

        public Criteria andBikewayidNotIn(List<String> values) {
            addCriterion("BikeWayID not in", values, "bikewayid");
            return (Criteria) this;
        }

        public Criteria andBikewayidBetween(String value1, String value2) {
            addCriterion("BikeWayID between", value1, value2, "bikewayid");
            return (Criteria) this;
        }

        public Criteria andBikewayidNotBetween(String value1, String value2) {
            addCriterion("BikeWayID not between", value1, value2, "bikewayid");
            return (Criteria) this;
        }

        public Criteria andBikewaynameIsNull() {
            addCriterion("BikeWayName is null");
            return (Criteria) this;
        }

        public Criteria andBikewaynameIsNotNull() {
            addCriterion("BikeWayName is not null");
            return (Criteria) this;
        }

        public Criteria andBikewaynameEqualTo(String value) {
            addCriterion("BikeWayName =", value, "bikewayname");
            return (Criteria) this;
        }

        public Criteria andBikewaynameNotEqualTo(String value) {
            addCriterion("BikeWayName <>", value, "bikewayname");
            return (Criteria) this;
        }

        public Criteria andBikewaynameGreaterThan(String value) {
            addCriterion("BikeWayName >", value, "bikewayname");
            return (Criteria) this;
        }

        public Criteria andBikewaynameGreaterThanOrEqualTo(String value) {
            addCriterion("BikeWayName >=", value, "bikewayname");
            return (Criteria) this;
        }

        public Criteria andBikewaynameLessThan(String value) {
            addCriterion("BikeWayName <", value, "bikewayname");
            return (Criteria) this;
        }

        public Criteria andBikewaynameLessThanOrEqualTo(String value) {
            addCriterion("BikeWayName <=", value, "bikewayname");
            return (Criteria) this;
        }

        public Criteria andBikewaynameLike(String value) {
            addCriterion("BikeWayName like", value, "bikewayname");
            return (Criteria) this;
        }

        public Criteria andBikewaynameNotLike(String value) {
            addCriterion("BikeWayName not like", value, "bikewayname");
            return (Criteria) this;
        }

        public Criteria andBikewaynameIn(List<String> values) {
            addCriterion("BikeWayName in", values, "bikewayname");
            return (Criteria) this;
        }

        public Criteria andBikewaynameNotIn(List<String> values) {
            addCriterion("BikeWayName not in", values, "bikewayname");
            return (Criteria) this;
        }

        public Criteria andBikewaynameBetween(String value1, String value2) {
            addCriterion("BikeWayName between", value1, value2, "bikewayname");
            return (Criteria) this;
        }

        public Criteria andBikewaynameNotBetween(String value1, String value2) {
            addCriterion("BikeWayName not between", value1, value2, "bikewayname");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryIsNull() {
            addCriterion("BikeWayCategory is null");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryIsNotNull() {
            addCriterion("BikeWayCategory is not null");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryEqualTo(String value) {
            addCriterion("BikeWayCategory =", value, "bikewaycategory");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryNotEqualTo(String value) {
            addCriterion("BikeWayCategory <>", value, "bikewaycategory");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryGreaterThan(String value) {
            addCriterion("BikeWayCategory >", value, "bikewaycategory");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryGreaterThanOrEqualTo(String value) {
            addCriterion("BikeWayCategory >=", value, "bikewaycategory");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryLessThan(String value) {
            addCriterion("BikeWayCategory <", value, "bikewaycategory");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryLessThanOrEqualTo(String value) {
            addCriterion("BikeWayCategory <=", value, "bikewaycategory");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryLike(String value) {
            addCriterion("BikeWayCategory like", value, "bikewaycategory");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryNotLike(String value) {
            addCriterion("BikeWayCategory not like", value, "bikewaycategory");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryIn(List<String> values) {
            addCriterion("BikeWayCategory in", values, "bikewaycategory");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryNotIn(List<String> values) {
            addCriterion("BikeWayCategory not in", values, "bikewaycategory");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryBetween(String value1, String value2) {
            addCriterion("BikeWayCategory between", value1, value2, "bikewaycategory");
            return (Criteria) this;
        }

        public Criteria andBikewaycategoryNotBetween(String value1, String value2) {
            addCriterion("BikeWayCategory not between", value1, value2, "bikewaycategory");
            return (Criteria) this;
        }

        public Criteria andPavementIsNull() {
            addCriterion("Pavement is null");
            return (Criteria) this;
        }

        public Criteria andPavementIsNotNull() {
            addCriterion("Pavement is not null");
            return (Criteria) this;
        }

        public Criteria andPavementEqualTo(String value) {
            addCriterion("Pavement =", value, "pavement");
            return (Criteria) this;
        }

        public Criteria andPavementNotEqualTo(String value) {
            addCriterion("Pavement <>", value, "pavement");
            return (Criteria) this;
        }

        public Criteria andPavementGreaterThan(String value) {
            addCriterion("Pavement >", value, "pavement");
            return (Criteria) this;
        }

        public Criteria andPavementGreaterThanOrEqualTo(String value) {
            addCriterion("Pavement >=", value, "pavement");
            return (Criteria) this;
        }

        public Criteria andPavementLessThan(String value) {
            addCriterion("Pavement <", value, "pavement");
            return (Criteria) this;
        }

        public Criteria andPavementLessThanOrEqualTo(String value) {
            addCriterion("Pavement <=", value, "pavement");
            return (Criteria) this;
        }

        public Criteria andPavementLike(String value) {
            addCriterion("Pavement like", value, "pavement");
            return (Criteria) this;
        }

        public Criteria andPavementNotLike(String value) {
            addCriterion("Pavement not like", value, "pavement");
            return (Criteria) this;
        }

        public Criteria andPavementIn(List<String> values) {
            addCriterion("Pavement in", values, "pavement");
            return (Criteria) this;
        }

        public Criteria andPavementNotIn(List<String> values) {
            addCriterion("Pavement not in", values, "pavement");
            return (Criteria) this;
        }

        public Criteria andPavementBetween(String value1, String value2) {
            addCriterion("Pavement between", value1, value2, "pavement");
            return (Criteria) this;
        }

        public Criteria andPavementNotBetween(String value1, String value2) {
            addCriterion("Pavement not between", value1, value2, "pavement");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectIsNull() {
            addCriterion("OperationSubject is null");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectIsNotNull() {
            addCriterion("OperationSubject is not null");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectEqualTo(String value) {
            addCriterion("OperationSubject =", value, "operationsubject");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectNotEqualTo(String value) {
            addCriterion("OperationSubject <>", value, "operationsubject");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectGreaterThan(String value) {
            addCriterion("OperationSubject >", value, "operationsubject");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectGreaterThanOrEqualTo(String value) {
            addCriterion("OperationSubject >=", value, "operationsubject");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectLessThan(String value) {
            addCriterion("OperationSubject <", value, "operationsubject");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectLessThanOrEqualTo(String value) {
            addCriterion("OperationSubject <=", value, "operationsubject");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectLike(String value) {
            addCriterion("OperationSubject like", value, "operationsubject");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectNotLike(String value) {
            addCriterion("OperationSubject not like", value, "operationsubject");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectIn(List<String> values) {
            addCriterion("OperationSubject in", values, "operationsubject");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectNotIn(List<String> values) {
            addCriterion("OperationSubject not in", values, "operationsubject");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectBetween(String value1, String value2) {
            addCriterion("OperationSubject between", value1, value2, "operationsubject");
            return (Criteria) this;
        }

        public Criteria andOperationsubjectNotBetween(String value1, String value2) {
            addCriterion("OperationSubject not between", value1, value2, "operationsubject");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusIsNull() {
            addCriterion("FacilityStatus is null");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusIsNotNull() {
            addCriterion("FacilityStatus is not null");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusEqualTo(String value) {
            addCriterion("FacilityStatus =", value, "facilitystatus");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusNotEqualTo(String value) {
            addCriterion("FacilityStatus <>", value, "facilitystatus");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusGreaterThan(String value) {
            addCriterion("FacilityStatus >", value, "facilitystatus");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusGreaterThanOrEqualTo(String value) {
            addCriterion("FacilityStatus >=", value, "facilitystatus");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusLessThan(String value) {
            addCriterion("FacilityStatus <", value, "facilitystatus");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusLessThanOrEqualTo(String value) {
            addCriterion("FacilityStatus <=", value, "facilitystatus");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusLike(String value) {
            addCriterion("FacilityStatus like", value, "facilitystatus");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusNotLike(String value) {
            addCriterion("FacilityStatus not like", value, "facilitystatus");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusIn(List<String> values) {
            addCriterion("FacilityStatus in", values, "facilitystatus");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusNotIn(List<String> values) {
            addCriterion("FacilityStatus not in", values, "facilitystatus");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusBetween(String value1, String value2) {
            addCriterion("FacilityStatus between", value1, value2, "facilitystatus");
            return (Criteria) this;
        }

        public Criteria andFacilitystatusNotBetween(String value1, String value2) {
            addCriterion("FacilityStatus not between", value1, value2, "facilitystatus");
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