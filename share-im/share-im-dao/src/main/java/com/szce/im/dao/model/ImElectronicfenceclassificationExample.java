package com.szce.im.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImElectronicfenceclassificationExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ImElectronicfenceclassificationExample() {
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

        public Criteria andElectronicfenceclassificationidIsNull() {
            addCriterion("ElectronicFenceClassificationID is null");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidIsNotNull() {
            addCriterion("ElectronicFenceClassificationID is not null");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidEqualTo(String value) {
            addCriterion("ElectronicFenceClassificationID =", value, "electronicfenceclassificationid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidNotEqualTo(String value) {
            addCriterion("ElectronicFenceClassificationID <>", value, "electronicfenceclassificationid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidGreaterThan(String value) {
            addCriterion("ElectronicFenceClassificationID >", value, "electronicfenceclassificationid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidGreaterThanOrEqualTo(String value) {
            addCriterion("ElectronicFenceClassificationID >=", value, "electronicfenceclassificationid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidLessThan(String value) {
            addCriterion("ElectronicFenceClassificationID <", value, "electronicfenceclassificationid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidLessThanOrEqualTo(String value) {
            addCriterion("ElectronicFenceClassificationID <=", value, "electronicfenceclassificationid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidLike(String value) {
            addCriterion("ElectronicFenceClassificationID like", value, "electronicfenceclassificationid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidNotLike(String value) {
            addCriterion("ElectronicFenceClassificationID not like", value, "electronicfenceclassificationid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidIn(List<String> values) {
            addCriterion("ElectronicFenceClassificationID in", values, "electronicfenceclassificationid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidNotIn(List<String> values) {
            addCriterion("ElectronicFenceClassificationID not in", values, "electronicfenceclassificationid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidBetween(String value1, String value2) {
            addCriterion("ElectronicFenceClassificationID between", value1, value2, "electronicfenceclassificationid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationidNotBetween(String value1, String value2) {
            addCriterion("ElectronicFenceClassificationID not between", value1, value2, "electronicfenceclassificationid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameIsNull() {
            addCriterion("ElectronicFenceClassificationName is null");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameIsNotNull() {
            addCriterion("ElectronicFenceClassificationName is not null");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameEqualTo(String value) {
            addCriterion("ElectronicFenceClassificationName =", value, "electronicfenceclassificationname");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameNotEqualTo(String value) {
            addCriterion("ElectronicFenceClassificationName <>", value, "electronicfenceclassificationname");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameGreaterThan(String value) {
            addCriterion("ElectronicFenceClassificationName >", value, "electronicfenceclassificationname");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameGreaterThanOrEqualTo(String value) {
            addCriterion("ElectronicFenceClassificationName >=", value, "electronicfenceclassificationname");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameLessThan(String value) {
            addCriterion("ElectronicFenceClassificationName <", value, "electronicfenceclassificationname");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameLessThanOrEqualTo(String value) {
            addCriterion("ElectronicFenceClassificationName <=", value, "electronicfenceclassificationname");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameLike(String value) {
            addCriterion("ElectronicFenceClassificationName like", value, "electronicfenceclassificationname");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameNotLike(String value) {
            addCriterion("ElectronicFenceClassificationName not like", value, "electronicfenceclassificationname");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameIn(List<String> values) {
            addCriterion("ElectronicFenceClassificationName in", values, "electronicfenceclassificationname");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameNotIn(List<String> values) {
            addCriterion("ElectronicFenceClassificationName not in", values, "electronicfenceclassificationname");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameBetween(String value1, String value2) {
            addCriterion("ElectronicFenceClassificationName between", value1, value2, "electronicfenceclassificationname");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceclassificationnameNotBetween(String value1, String value2) {
            addCriterion("ElectronicFenceClassificationName not between", value1, value2, "electronicfenceclassificationname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
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