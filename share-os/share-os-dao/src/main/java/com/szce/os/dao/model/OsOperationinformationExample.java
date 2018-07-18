package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OsOperationinformationExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OsOperationinformationExample() {
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

        public Criteria andOperationinformationidIsNull() {
            addCriterion("OPERATIONINFORMATIONID is null");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidIsNotNull() {
            addCriterion("OPERATIONINFORMATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidEqualTo(String value) {
            addCriterion("OPERATIONINFORMATIONID =", value, "operationinformationid");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidNotEqualTo(String value) {
            addCriterion("OPERATIONINFORMATIONID <>", value, "operationinformationid");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidGreaterThan(String value) {
            addCriterion("OPERATIONINFORMATIONID >", value, "operationinformationid");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATIONINFORMATIONID >=", value, "operationinformationid");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidLessThan(String value) {
            addCriterion("OPERATIONINFORMATIONID <", value, "operationinformationid");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidLessThanOrEqualTo(String value) {
            addCriterion("OPERATIONINFORMATIONID <=", value, "operationinformationid");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidLike(String value) {
            addCriterion("OPERATIONINFORMATIONID like", value, "operationinformationid");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidNotLike(String value) {
            addCriterion("OPERATIONINFORMATIONID not like", value, "operationinformationid");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidIn(List<String> values) {
            addCriterion("OPERATIONINFORMATIONID in", values, "operationinformationid");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidNotIn(List<String> values) {
            addCriterion("OPERATIONINFORMATIONID not in", values, "operationinformationid");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidBetween(String value1, String value2) {
            addCriterion("OPERATIONINFORMATIONID between", value1, value2, "operationinformationid");
            return (Criteria) this;
        }

        public Criteria andOperationinformationidNotBetween(String value1, String value2) {
            addCriterion("OPERATIONINFORMATIONID not between", value1, value2, "operationinformationid");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("MILEAGE is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("MILEAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(String value) {
            addCriterion("MILEAGE =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(String value) {
            addCriterion("MILEAGE <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(String value) {
            addCriterion("MILEAGE >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(String value) {
            addCriterion("MILEAGE >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(String value) {
            addCriterion("MILEAGE <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(String value) {
            addCriterion("MILEAGE <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLike(String value) {
            addCriterion("MILEAGE like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotLike(String value) {
            addCriterion("MILEAGE not like", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<String> values) {
            addCriterion("MILEAGE in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<String> values) {
            addCriterion("MILEAGE not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(String value1, String value2) {
            addCriterion("MILEAGE between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(String value1, String value2) {
            addCriterion("MILEAGE not between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andUnlocktimeIsNull() {
            addCriterion("UNLOCKTIME is null");
            return (Criteria) this;
        }

        public Criteria andUnlocktimeIsNotNull() {
            addCriterion("UNLOCKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUnlocktimeEqualTo(Date value) {
            addCriterion("UNLOCKTIME =", value, "unlocktime");
            return (Criteria) this;
        }

        public Criteria andUnlocktimeNotEqualTo(Date value) {
            addCriterion("UNLOCKTIME <>", value, "unlocktime");
            return (Criteria) this;
        }

        public Criteria andUnlocktimeGreaterThan(Date value) {
            addCriterion("UNLOCKTIME >", value, "unlocktime");
            return (Criteria) this;
        }

        public Criteria andUnlocktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UNLOCKTIME >=", value, "unlocktime");
            return (Criteria) this;
        }

        public Criteria andUnlocktimeLessThan(Date value) {
            addCriterion("UNLOCKTIME <", value, "unlocktime");
            return (Criteria) this;
        }

        public Criteria andUnlocktimeLessThanOrEqualTo(Date value) {
            addCriterion("UNLOCKTIME <=", value, "unlocktime");
            return (Criteria) this;
        }

        public Criteria andUnlocktimeIn(List<Date> values) {
            addCriterion("UNLOCKTIME in", values, "unlocktime");
            return (Criteria) this;
        }

        public Criteria andUnlocktimeNotIn(List<Date> values) {
            addCriterion("UNLOCKTIME not in", values, "unlocktime");
            return (Criteria) this;
        }

        public Criteria andUnlocktimeBetween(Date value1, Date value2) {
            addCriterion("UNLOCKTIME between", value1, value2, "unlocktime");
            return (Criteria) this;
        }

        public Criteria andUnlocktimeNotBetween(Date value1, Date value2) {
            addCriterion("UNLOCKTIME not between", value1, value2, "unlocktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeIsNull() {
            addCriterion("LOCKTIME is null");
            return (Criteria) this;
        }

        public Criteria andLocktimeIsNotNull() {
            addCriterion("LOCKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLocktimeEqualTo(Date value) {
            addCriterion("LOCKTIME =", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeNotEqualTo(Date value) {
            addCriterion("LOCKTIME <>", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeGreaterThan(Date value) {
            addCriterion("LOCKTIME >", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCKTIME >=", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeLessThan(Date value) {
            addCriterion("LOCKTIME <", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeLessThanOrEqualTo(Date value) {
            addCriterion("LOCKTIME <=", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeIn(List<Date> values) {
            addCriterion("LOCKTIME in", values, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeNotIn(List<Date> values) {
            addCriterion("LOCKTIME not in", values, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeBetween(Date value1, Date value2) {
            addCriterion("LOCKTIME between", value1, value2, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeNotBetween(Date value1, Date value2) {
            addCriterion("LOCKTIME not between", value1, value2, "locktime");
            return (Criteria) this;
        }

        public Criteria andAomuntIsNull() {
            addCriterion("AOMUNT	FLOA is null");
            return (Criteria) this;
        }

        public Criteria andAomuntIsNotNull() {
            addCriterion("AOMUNT	FLOA is not null");
            return (Criteria) this;
        }

        public Criteria andAomuntEqualTo(Double value) {
            addCriterion("AOMUNT	FLOA =", value, "aomunt	floa");
            return (Criteria) this;
        }

        public Criteria andAomuntNotEqualTo(Double value) {
            addCriterion("AOMUNT	FLOA <>", value, "aomunt	floa");
            return (Criteria) this;
        }

        public Criteria andAomuntGreaterThan(Double value) {
            addCriterion("AOMUNT	FLOA >", value, "aomunt	floa");
            return (Criteria) this;
        }

        public Criteria andAomuntGreaterThanOrEqualTo(Double value) {
            addCriterion("AOMUNT	FLOA >=", value, "aomunt	floa");
            return (Criteria) this;
        }

        public Criteria andAomuntLessThan(Double value) {
            addCriterion("AOMUNT	FLOA <", value, "aomunt	floa");
            return (Criteria) this;
        }

        public Criteria andAomuntLessThanOrEqualTo(Double value) {
            addCriterion("AOMUNT	FLOA <=", value, "aomunt	floa");
            return (Criteria) this;
        }

        public Criteria andAomuntaIn(List<Double> values) {
            addCriterion("AOMUNT	FLOA in", values, "aomunt	floa");
            return (Criteria) this;
        }

        public Criteria andAomuntNotIn(List<Double> values) {
            addCriterion("AOMUNT	FLOA not in", values, "aomunt	floa");
            return (Criteria) this;
        }

        public Criteria andAomuntBetween(Double value1, Double value2) {
            addCriterion("AOMUNT	FLOA between", value1, value2, "aomunt	floa");
            return (Criteria) this;
        }

        public Criteria andAomuntNotBetween(Double value1, Double value2) {
            addCriterion("AOMUNT	FLOA not between", value1, value2, "aomunt	floa");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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