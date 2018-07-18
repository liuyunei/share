package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OsCustodyinformationExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OsCustodyinformationExample() {
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

        public Criteria andCustodyinformationidIsNull() {
            addCriterion("CUSTODYINFORMATIONID is null");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidIsNotNull() {
            addCriterion("CUSTODYINFORMATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidEqualTo(String value) {
            addCriterion("CUSTODYINFORMATIONID =", value, "custodyinformationid");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidNotEqualTo(String value) {
            addCriterion("CUSTODYINFORMATIONID <>", value, "custodyinformationid");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidGreaterThan(String value) {
            addCriterion("CUSTODYINFORMATIONID >", value, "custodyinformationid");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTODYINFORMATIONID >=", value, "custodyinformationid");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidLessThan(String value) {
            addCriterion("CUSTODYINFORMATIONID <", value, "custodyinformationid");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidLessThanOrEqualTo(String value) {
            addCriterion("CUSTODYINFORMATIONID <=", value, "custodyinformationid");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidLike(String value) {
            addCriterion("CUSTODYINFORMATIONID like", value, "custodyinformationid");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidNotLike(String value) {
            addCriterion("CUSTODYINFORMATIONID not like", value, "custodyinformationid");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidIn(List<String> values) {
            addCriterion("CUSTODYINFORMATIONID in", values, "custodyinformationid");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidNotIn(List<String> values) {
            addCriterion("CUSTODYINFORMATIONID not in", values, "custodyinformationid");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidBetween(String value1, String value2) {
            addCriterion("CUSTODYINFORMATIONID between", value1, value2, "custodyinformationid");
            return (Criteria) this;
        }

        public Criteria andCustodyinformationidNotBetween(String value1, String value2) {
            addCriterion("CUSTODYINFORMATIONID not between", value1, value2, "custodyinformationid");
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

        public Criteria andCustodybikeidIsNull() {
            addCriterion("CUSTODYBIKEID is null");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidIsNotNull() {
            addCriterion("CUSTODYBIKEID is not null");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidEqualTo(String value) {
            addCriterion("CUSTODYBIKEID =", value, "custodybikeid");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidNotEqualTo(String value) {
            addCriterion("CUSTODYBIKEID <>", value, "custodybikeid");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidGreaterThan(String value) {
            addCriterion("CUSTODYBIKEID >", value, "custodybikeid");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTODYBIKEID >=", value, "custodybikeid");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidLessThan(String value) {
            addCriterion("CUSTODYBIKEID <", value, "custodybikeid");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidLessThanOrEqualTo(String value) {
            addCriterion("CUSTODYBIKEID <=", value, "custodybikeid");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidLike(String value) {
            addCriterion("CUSTODYBIKEID like", value, "custodybikeid");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidNotLike(String value) {
            addCriterion("CUSTODYBIKEID not like", value, "custodybikeid");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidIn(List<String> values) {
            addCriterion("CUSTODYBIKEID in", values, "custodybikeid");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidNotIn(List<String> values) {
            addCriterion("CUSTODYBIKEID not in", values, "custodybikeid");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidBetween(String value1, String value2) {
            addCriterion("CUSTODYBIKEID between", value1, value2, "custodybikeid");
            return (Criteria) this;
        }

        public Criteria andCustodybikeidNotBetween(String value1, String value2) {
            addCriterion("CUSTODYBIKEID not between", value1, value2, "custodybikeid");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortIsNull() {
            addCriterion("BREAKDOWNSORT is null");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortIsNotNull() {
            addCriterion("BREAKDOWNSORT is not null");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortEqualTo(String value) {
            addCriterion("BREAKDOWNSORT =", value, "breakdownsort");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortNotEqualTo(String value) {
            addCriterion("BREAKDOWNSORT <>", value, "breakdownsort");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortGreaterThan(String value) {
            addCriterion("BREAKDOWNSORT >", value, "breakdownsort");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortGreaterThanOrEqualTo(String value) {
            addCriterion("BREAKDOWNSORT >=", value, "breakdownsort");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortLessThan(String value) {
            addCriterion("BREAKDOWNSORT <", value, "breakdownsort");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortLessThanOrEqualTo(String value) {
            addCriterion("BREAKDOWNSORT <=", value, "breakdownsort");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortLike(String value) {
            addCriterion("BREAKDOWNSORT like", value, "breakdownsort");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortNotLike(String value) {
            addCriterion("BREAKDOWNSORT not like", value, "breakdownsort");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortIn(List<String> values) {
            addCriterion("BREAKDOWNSORT in", values, "breakdownsort");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortNotIn(List<String> values) {
            addCriterion("BREAKDOWNSORT not in", values, "breakdownsort");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortBetween(String value1, String value2) {
            addCriterion("BREAKDOWNSORT between", value1, value2, "breakdownsort");
            return (Criteria) this;
        }

        public Criteria andBreakdownsortNotBetween(String value1, String value2) {
            addCriterion("BREAKDOWNSORT not between", value1, value2, "breakdownsort");
            return (Criteria) this;
        }

        public Criteria andCustodystarttimeIsNull() {
            addCriterion("CUSTODYSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCustodystarttimeIsNotNull() {
            addCriterion("CUSTODYSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCustodystarttimeEqualTo(Date value) {
            addCriterion("CUSTODYSTARTTIME =", value, "custodystarttime");
            return (Criteria) this;
        }

        public Criteria andCustodystarttimeNotEqualTo(Date value) {
            addCriterion("CUSTODYSTARTTIME <>", value, "custodystarttime");
            return (Criteria) this;
        }

        public Criteria andCustodystarttimeGreaterThan(Date value) {
            addCriterion("CUSTODYSTARTTIME >", value, "custodystarttime");
            return (Criteria) this;
        }

        public Criteria andCustodystarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CUSTODYSTARTTIME >=", value, "custodystarttime");
            return (Criteria) this;
        }

        public Criteria andCustodystarttimeLessThan(Date value) {
            addCriterion("CUSTODYSTARTTIME <", value, "custodystarttime");
            return (Criteria) this;
        }

        public Criteria andCustodystarttimeLessThanOrEqualTo(Date value) {
            addCriterion("CUSTODYSTARTTIME <=", value, "custodystarttime");
            return (Criteria) this;
        }

        public Criteria andCustodystarttimeIn(List<Date> values) {
            addCriterion("CUSTODYSTARTTIME in", values, "custodystarttime");
            return (Criteria) this;
        }

        public Criteria andCustodystarttimeNotIn(List<Date> values) {
            addCriterion("CUSTODYSTARTTIME not in", values, "custodystarttime");
            return (Criteria) this;
        }

        public Criteria andCustodystarttimeBetween(Date value1, Date value2) {
            addCriterion("CUSTODYSTARTTIME between", value1, value2, "custodystarttime");
            return (Criteria) this;
        }

        public Criteria andCustodystarttimeNotBetween(Date value1, Date value2) {
            addCriterion("CUSTODYSTARTTIME not between", value1, value2, "custodystarttime");
            return (Criteria) this;
        }

        public Criteria andCustodyendtimeIsNull() {
            addCriterion("CUSTODYENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andCustodyendtimeIsNotNull() {
            addCriterion("CUSTODYENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCustodyendtimeEqualTo(Date value) {
            addCriterion("CUSTODYENDTIME =", value, "custodyendtime");
            return (Criteria) this;
        }

        public Criteria andCustodyendtimeNotEqualTo(Date value) {
            addCriterion("CUSTODYENDTIME <>", value, "custodyendtime");
            return (Criteria) this;
        }

        public Criteria andCustodyendtimeGreaterThan(Date value) {
            addCriterion("CUSTODYENDTIME >", value, "custodyendtime");
            return (Criteria) this;
        }

        public Criteria andCustodyendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CUSTODYENDTIME >=", value, "custodyendtime");
            return (Criteria) this;
        }

        public Criteria andCustodyendtimeLessThan(Date value) {
            addCriterion("CUSTODYENDTIME <", value, "custodyendtime");
            return (Criteria) this;
        }

        public Criteria andCustodyendtimeLessThanOrEqualTo(Date value) {
            addCriterion("CUSTODYENDTIME <=", value, "custodyendtime");
            return (Criteria) this;
        }

        public Criteria andCustodyendtimeIn(List<Date> values) {
            addCriterion("CUSTODYENDTIME in", values, "custodyendtime");
            return (Criteria) this;
        }

        public Criteria andCustodyendtimeNotIn(List<Date> values) {
            addCriterion("CUSTODYENDTIME not in", values, "custodyendtime");
            return (Criteria) this;
        }

        public Criteria andCustodyendtimeBetween(Date value1, Date value2) {
            addCriterion("CUSTODYENDTIME between", value1, value2, "custodyendtime");
            return (Criteria) this;
        }

        public Criteria andCustodyendtimeNotBetween(Date value1, Date value2) {
            addCriterion("CUSTODYENDTIME not between", value1, value2, "custodyendtime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNull() {
            addCriterion("RETURNTIME is null");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNotNull() {
            addCriterion("RETURNTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReturntimeEqualTo(Date value) {
            addCriterion("RETURNTIME =", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotEqualTo(Date value) {
            addCriterion("RETURNTIME <>", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThan(Date value) {
            addCriterion("RETURNTIME >", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RETURNTIME >=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThan(Date value) {
            addCriterion("RETURNTIME <", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThanOrEqualTo(Date value) {
            addCriterion("RETURNTIME <=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIn(List<Date> values) {
            addCriterion("RETURNTIME in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotIn(List<Date> values) {
            addCriterion("RETURNTIME not in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeBetween(Date value1, Date value2) {
            addCriterion("RETURNTIME between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotBetween(Date value1, Date value2) {
            addCriterion("RETURNTIME not between", value1, value2, "returntime");
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