package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OsUserreviewExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OsUserreviewExample() {
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

        public Criteria andReviewidIsNull() {
            addCriterion("REVIEWID is null");
            return (Criteria) this;
        }

        public Criteria andReviewidIsNotNull() {
            addCriterion("REVIEWID is not null");
            return (Criteria) this;
        }

        public Criteria andReviewidEqualTo(String value) {
            addCriterion("REVIEWID =", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotEqualTo(String value) {
            addCriterion("REVIEWID <>", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidGreaterThan(String value) {
            addCriterion("REVIEWID >", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEWID >=", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidLessThan(String value) {
            addCriterion("REVIEWID <", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidLessThanOrEqualTo(String value) {
            addCriterion("REVIEWID <=", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidLike(String value) {
            addCriterion("REVIEWID like", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotLike(String value) {
            addCriterion("REVIEWID not like", value, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidIn(List<String> values) {
            addCriterion("REVIEWID in", values, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotIn(List<String> values) {
            addCriterion("REVIEWID not in", values, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidBetween(String value1, String value2) {
            addCriterion("REVIEWID between", value1, value2, "reviewid");
            return (Criteria) this;
        }

        public Criteria andReviewidNotBetween(String value1, String value2) {
            addCriterion("REVIEWID not between", value1, value2, "reviewid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("ORDERID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("ORDERID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andReviewtypeIsNull() {
            addCriterion("REVIEWTYPE is null");
            return (Criteria) this;
        }

        public Criteria andReviewtypeIsNotNull() {
            addCriterion("REVIEWTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewtypeEqualTo(String value) {
            addCriterion("REVIEWTYPE =", value, "reviewtype");
            return (Criteria) this;
        }

        public Criteria andReviewtypeNotEqualTo(String value) {
            addCriterion("REVIEWTYPE <>", value, "reviewtype");
            return (Criteria) this;
        }

        public Criteria andReviewtypeGreaterThan(String value) {
            addCriterion("REVIEWTYPE >", value, "reviewtype");
            return (Criteria) this;
        }

        public Criteria andReviewtypeGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEWTYPE >=", value, "reviewtype");
            return (Criteria) this;
        }

        public Criteria andReviewtypeLessThan(String value) {
            addCriterion("REVIEWTYPE <", value, "reviewtype");
            return (Criteria) this;
        }

        public Criteria andReviewtypeLessThanOrEqualTo(String value) {
            addCriterion("REVIEWTYPE <=", value, "reviewtype");
            return (Criteria) this;
        }

        public Criteria andReviewtypeLike(String value) {
            addCriterion("REVIEWTYPE like", value, "reviewtype");
            return (Criteria) this;
        }

        public Criteria andReviewtypeNotLike(String value) {
            addCriterion("REVIEWTYPE not like", value, "reviewtype");
            return (Criteria) this;
        }

        public Criteria andReviewtypeIn(List<String> values) {
            addCriterion("REVIEWTYPE in", values, "reviewtype");
            return (Criteria) this;
        }

        public Criteria andReviewtypeNotIn(List<String> values) {
            addCriterion("REVIEWTYPE not in", values, "reviewtype");
            return (Criteria) this;
        }

        public Criteria andReviewtypeBetween(String value1, String value2) {
            addCriterion("REVIEWTYPE between", value1, value2, "reviewtype");
            return (Criteria) this;
        }

        public Criteria andReviewtypeNotBetween(String value1, String value2) {
            addCriterion("REVIEWTYPE not between", value1, value2, "reviewtype");
            return (Criteria) this;
        }

        public Criteria andRatingIsNull() {
            addCriterion("RATING is null");
            return (Criteria) this;
        }

        public Criteria andRatingIsNotNull() {
            addCriterion("RATING is not null");
            return (Criteria) this;
        }

        public Criteria andRatingEqualTo(Integer value) {
            addCriterion("RATING =", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotEqualTo(Integer value) {
            addCriterion("RATING <>", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThan(Integer value) {
            addCriterion("RATING >", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("RATING >=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThan(Integer value) {
            addCriterion("RATING <", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThanOrEqualTo(Integer value) {
            addCriterion("RATING <=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingIn(List<Integer> values) {
            addCriterion("RATING in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotIn(List<Integer> values) {
            addCriterion("RATING not in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingBetween(Integer value1, Integer value2) {
            addCriterion("RATING between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotBetween(Integer value1, Integer value2) {
            addCriterion("RATING not between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andReviewcontentIsNull() {
            addCriterion("REVIEWCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andReviewcontentIsNotNull() {
            addCriterion("REVIEWCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andReviewcontentEqualTo(String value) {
            addCriterion("REVIEWCONTENT =", value, "reviewcontent");
            return (Criteria) this;
        }

        public Criteria andReviewcontentNotEqualTo(String value) {
            addCriterion("REVIEWCONTENT <>", value, "reviewcontent");
            return (Criteria) this;
        }

        public Criteria andReviewcontentGreaterThan(String value) {
            addCriterion("REVIEWCONTENT >", value, "reviewcontent");
            return (Criteria) this;
        }

        public Criteria andReviewcontentGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEWCONTENT >=", value, "reviewcontent");
            return (Criteria) this;
        }

        public Criteria andReviewcontentLessThan(String value) {
            addCriterion("REVIEWCONTENT <", value, "reviewcontent");
            return (Criteria) this;
        }

        public Criteria andReviewcontentLessThanOrEqualTo(String value) {
            addCriterion("REVIEWCONTENT <=", value, "reviewcontent");
            return (Criteria) this;
        }

        public Criteria andReviewcontentLike(String value) {
            addCriterion("REVIEWCONTENT like", value, "reviewcontent");
            return (Criteria) this;
        }

        public Criteria andReviewcontentNotLike(String value) {
            addCriterion("REVIEWCONTENT not like", value, "reviewcontent");
            return (Criteria) this;
        }

        public Criteria andReviewcontentIn(List<String> values) {
            addCriterion("REVIEWCONTENT in", values, "reviewcontent");
            return (Criteria) this;
        }

        public Criteria andReviewcontentNotIn(List<String> values) {
            addCriterion("REVIEWCONTENT not in", values, "reviewcontent");
            return (Criteria) this;
        }

        public Criteria andReviewcontentBetween(String value1, String value2) {
            addCriterion("REVIEWCONTENT between", value1, value2, "reviewcontent");
            return (Criteria) this;
        }

        public Criteria andReviewcontentNotBetween(String value1, String value2) {
            addCriterion("REVIEWCONTENT not between", value1, value2, "reviewcontent");
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