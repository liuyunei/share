package com.szce.vtm.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VtmBikebasicinfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public VtmBikebasicinfoExample() {
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

        public Criteria andBikeidIsNull() {
            addCriterion("BIKEID is null");
            return (Criteria) this;
        }

        public Criteria andBikeidIsNotNull() {
            addCriterion("BIKEID is not null");
            return (Criteria) this;
        }

        public Criteria andBikeidEqualTo(String value) {
            addCriterion("BIKEID =", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidNotEqualTo(String value) {
            addCriterion("BIKEID <>", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidGreaterThan(String value) {
            addCriterion("BIKEID >", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidGreaterThanOrEqualTo(String value) {
            addCriterion("BIKEID >=", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidLessThan(String value) {
            addCriterion("BIKEID <", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidLessThanOrEqualTo(String value) {
            addCriterion("BIKEID <=", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidLike(String value) {
            addCriterion("BIKEID like", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidNotLike(String value) {
            addCriterion("BIKEID not like", value, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidIn(List<String> values) {
            addCriterion("BIKEID in", values, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidNotIn(List<String> values) {
            addCriterion("BIKEID not in", values, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidBetween(String value1, String value2) {
            addCriterion("BIKEID between", value1, value2, "bikeid");
            return (Criteria) this;
        }

        public Criteria andBikeidNotBetween(String value1, String value2) {
            addCriterion("BIKEID not between", value1, value2, "bikeid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("COMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("COMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(String value) {
            addCriterion("COMPANYID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(String value) {
            addCriterion("COMPANYID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(String value) {
            addCriterion("COMPANYID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(String value) {
            addCriterion("COMPANYID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(String value) {
            addCriterion("COMPANYID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLike(String value) {
            addCriterion("COMPANYID like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotLike(String value) {
            addCriterion("COMPANYID not like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<String> values) {
            addCriterion("COMPANYID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<String> values) {
            addCriterion("COMPANYID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(String value1, String value2) {
            addCriterion("COMPANYID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(String value1, String value2) {
            addCriterion("COMPANYID not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNull() {
            addCriterion("DELIVERYTIME is null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNotNull() {
            addCriterion("DELIVERYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeEqualTo(Date value) {
            addCriterion("DELIVERYTIME =", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotEqualTo(Date value) {
            addCriterion("DELIVERYTIME <>", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThan(Date value) {
            addCriterion("DELIVERYTIME >", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERYTIME >=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThan(Date value) {
            addCriterion("DELIVERYTIME <", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERYTIME <=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIn(List<Date> values) {
            addCriterion("DELIVERYTIME in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotIn(List<Date> values) {
            addCriterion("DELIVERYTIME not in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeBetween(Date value1, Date value2) {
            addCriterion("DELIVERYTIME between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERYTIME not between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoIsNull() {
            addCriterion("CONFIGEINFO is null");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoIsNotNull() {
            addCriterion("CONFIGEINFO is not null");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoEqualTo(String value) {
            addCriterion("CONFIGEINFO =", value, "configeinfo");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoNotEqualTo(String value) {
            addCriterion("CONFIGEINFO <>", value, "configeinfo");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoGreaterThan(String value) {
            addCriterion("CONFIGEINFO >", value, "configeinfo");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGEINFO >=", value, "configeinfo");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoLessThan(String value) {
            addCriterion("CONFIGEINFO <", value, "configeinfo");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoLessThanOrEqualTo(String value) {
            addCriterion("CONFIGEINFO <=", value, "configeinfo");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoLike(String value) {
            addCriterion("CONFIGEINFO like", value, "configeinfo");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoNotLike(String value) {
            addCriterion("CONFIGEINFO not like", value, "configeinfo");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoIn(List<String> values) {
            addCriterion("CONFIGEINFO in", values, "configeinfo");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoNotIn(List<String> values) {
            addCriterion("CONFIGEINFO not in", values, "configeinfo");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoBetween(String value1, String value2) {
            addCriterion("CONFIGEINFO between", value1, value2, "configeinfo");
            return (Criteria) this;
        }

        public Criteria andConfigeinfoNotBetween(String value1, String value2) {
            addCriterion("CONFIGEINFO not between", value1, value2, "configeinfo");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeIsNull() {
            addCriterion("STATICLONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeIsNotNull() {
            addCriterion("STATICLONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeEqualTo(String value) {
            addCriterion("STATICLONGITUDE =", value, "staticlongitude");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeNotEqualTo(String value) {
            addCriterion("STATICLONGITUDE <>", value, "staticlongitude");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeGreaterThan(String value) {
            addCriterion("STATICLONGITUDE >", value, "staticlongitude");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("STATICLONGITUDE >=", value, "staticlongitude");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeLessThan(String value) {
            addCriterion("STATICLONGITUDE <", value, "staticlongitude");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeLessThanOrEqualTo(String value) {
            addCriterion("STATICLONGITUDE <=", value, "staticlongitude");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeLike(String value) {
            addCriterion("STATICLONGITUDE like", value, "staticlongitude");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeNotLike(String value) {
            addCriterion("STATICLONGITUDE not like", value, "staticlongitude");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeIn(List<String> values) {
            addCriterion("STATICLONGITUDE in", values, "staticlongitude");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeNotIn(List<String> values) {
            addCriterion("STATICLONGITUDE not in", values, "staticlongitude");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeBetween(String value1, String value2) {
            addCriterion("STATICLONGITUDE between", value1, value2, "staticlongitude");
            return (Criteria) this;
        }

        public Criteria andStaticlongitudeNotBetween(String value1, String value2) {
            addCriterion("STATICLONGITUDE not between", value1, value2, "staticlongitude");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeIsNull() {
            addCriterion("STATICLATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeIsNotNull() {
            addCriterion("STATICLATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeEqualTo(String value) {
            addCriterion("STATICLATITUDE =", value, "staticlatitude");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeNotEqualTo(String value) {
            addCriterion("STATICLATITUDE <>", value, "staticlatitude");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeGreaterThan(String value) {
            addCriterion("STATICLATITUDE >", value, "staticlatitude");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("STATICLATITUDE >=", value, "staticlatitude");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeLessThan(String value) {
            addCriterion("STATICLATITUDE <", value, "staticlatitude");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeLessThanOrEqualTo(String value) {
            addCriterion("STATICLATITUDE <=", value, "staticlatitude");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeLike(String value) {
            addCriterion("STATICLATITUDE like", value, "staticlatitude");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeNotLike(String value) {
            addCriterion("STATICLATITUDE not like", value, "staticlatitude");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeIn(List<String> values) {
            addCriterion("STATICLATITUDE in", values, "staticlatitude");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeNotIn(List<String> values) {
            addCriterion("STATICLATITUDE not in", values, "staticlatitude");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeBetween(String value1, String value2) {
            addCriterion("STATICLATITUDE between", value1, value2, "staticlatitude");
            return (Criteria) this;
        }

        public Criteria andStaticlatitudeNotBetween(String value1, String value2) {
            addCriterion("STATICLATITUDE not between", value1, value2, "staticlatitude");
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