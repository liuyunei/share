package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OsBikeuseinfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OsBikeuseinfoExample() {
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

        public Criteria andCurrentstatueIsNull() {
            addCriterion("CURRENTSTATUE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentstatueIsNotNull() {
            addCriterion("CURRENTSTATUE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentstatueEqualTo(Integer value) {
            addCriterion("CURRENTSTATUE =", value, "currentstatue");
            return (Criteria) this;
        }

        public Criteria andCurrentstatueNotEqualTo(Integer value) {
            addCriterion("CURRENTSTATUE <>", value, "currentstatue");
            return (Criteria) this;
        }

        public Criteria andCurrentstatueGreaterThan(Integer value) {
            addCriterion("CURRENTSTATUE >", value, "currentstatue");
            return (Criteria) this;
        }

        public Criteria andCurrentstatueGreaterThanOrEqualTo(Integer value) {
            addCriterion("CURRENTSTATUE >=", value, "currentstatue");
            return (Criteria) this;
        }

        public Criteria andCurrentstatueLessThan(Integer value) {
            addCriterion("CURRENTSTATUE <", value, "currentstatue");
            return (Criteria) this;
        }

        public Criteria andCurrentstatueLessThanOrEqualTo(Integer value) {
            addCriterion("CURRENTSTATUE <=", value, "currentstatue");
            return (Criteria) this;
        }

        public Criteria andCurrentstatueIn(List<Integer> values) {
            addCriterion("CURRENTSTATUE in", values, "currentstatue");
            return (Criteria) this;
        }

        public Criteria andCurrentstatueNotIn(List<Integer> values) {
            addCriterion("CURRENTSTATUE not in", values, "currentstatue");
            return (Criteria) this;
        }

        public Criteria andCurrentstatueBetween(Integer value1, Integer value2) {
            addCriterion("CURRENTSTATUE between", value1, value2, "currentstatue");
            return (Criteria) this;
        }

        public Criteria andCurrentstatueNotBetween(Integer value1, Integer value2) {
            addCriterion("CURRENTSTATUE not between", value1, value2, "currentstatue");
            return (Criteria) this;
        }

        public Criteria andHistoricalusetimeIsNull() {
            addCriterion("HISTORICALUSETIME is null");
            return (Criteria) this;
        }

        public Criteria andHistoricalusetimeIsNotNull() {
            addCriterion("HISTORICALUSETIME is not null");
            return (Criteria) this;
        }

        public Criteria andHistoricalusetimeEqualTo(Date value) {
            addCriterion("HISTORICALUSETIME =", value, "historicalusetime");
            return (Criteria) this;
        }

        public Criteria andHistoricalusetimeNotEqualTo(Date value) {
            addCriterion("HISTORICALUSETIME <>", value, "historicalusetime");
            return (Criteria) this;
        }

        public Criteria andHistoricalusetimeGreaterThan(Date value) {
            addCriterion("HISTORICALUSETIME >", value, "historicalusetime");
            return (Criteria) this;
        }

        public Criteria andHistoricalusetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HISTORICALUSETIME >=", value, "historicalusetime");
            return (Criteria) this;
        }

        public Criteria andHistoricalusetimeLessThan(Date value) {
            addCriterion("HISTORICALUSETIME <", value, "historicalusetime");
            return (Criteria) this;
        }

        public Criteria andHistoricalusetimeLessThanOrEqualTo(Date value) {
            addCriterion("HISTORICALUSETIME <=", value, "historicalusetime");
            return (Criteria) this;
        }

        public Criteria andHistoricalusetimeIn(List<Date> values) {
            addCriterion("HISTORICALUSETIME in", values, "historicalusetime");
            return (Criteria) this;
        }

        public Criteria andHistoricalusetimeNotIn(List<Date> values) {
            addCriterion("HISTORICALUSETIME not in", values, "historicalusetime");
            return (Criteria) this;
        }

        public Criteria andHistoricalusetimeBetween(Date value1, Date value2) {
            addCriterion("HISTORICALUSETIME between", value1, value2, "historicalusetime");
            return (Criteria) this;
        }

        public Criteria andHistoricalusetimeNotBetween(Date value1, Date value2) {
            addCriterion("HISTORICALUSETIME not between", value1, value2, "historicalusetime");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceIsNull() {
            addCriterion("HISTORICALDISTANCE is null");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceIsNotNull() {
            addCriterion("HISTORICALDISTANCE is not null");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceEqualTo(String value) {
            addCriterion("HISTORICALDISTANCE =", value, "historicaldistance");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceNotEqualTo(String value) {
            addCriterion("HISTORICALDISTANCE <>", value, "historicaldistance");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceGreaterThan(String value) {
            addCriterion("HISTORICALDISTANCE >", value, "historicaldistance");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORICALDISTANCE >=", value, "historicaldistance");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceLessThan(String value) {
            addCriterion("HISTORICALDISTANCE <", value, "historicaldistance");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceLessThanOrEqualTo(String value) {
            addCriterion("HISTORICALDISTANCE <=", value, "historicaldistance");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceLike(String value) {
            addCriterion("HISTORICALDISTANCE like", value, "historicaldistance");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceNotLike(String value) {
            addCriterion("HISTORICALDISTANCE not like", value, "historicaldistance");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceIn(List<String> values) {
            addCriterion("HISTORICALDISTANCE in", values, "historicaldistance");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceNotIn(List<String> values) {
            addCriterion("HISTORICALDISTANCE not in", values, "historicaldistance");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceBetween(String value1, String value2) {
            addCriterion("HISTORICALDISTANCE between", value1, value2, "historicaldistance");
            return (Criteria) this;
        }

        public Criteria andHistoricaldistanceNotBetween(String value1, String value2) {
            addCriterion("HISTORICALDISTANCE not between", value1, value2, "historicaldistance");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeIsNull() {
            addCriterion("HISTORICALFEE is null");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeIsNotNull() {
            addCriterion("HISTORICALFEE is not null");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeEqualTo(String value) {
            addCriterion("HISTORICALFEE =", value, "historicalfee");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeNotEqualTo(String value) {
            addCriterion("HISTORICALFEE <>", value, "historicalfee");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeGreaterThan(String value) {
            addCriterion("HISTORICALFEE >", value, "historicalfee");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORICALFEE >=", value, "historicalfee");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeLessThan(String value) {
            addCriterion("HISTORICALFEE <", value, "historicalfee");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeLessThanOrEqualTo(String value) {
            addCriterion("HISTORICALFEE <=", value, "historicalfee");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeLike(String value) {
            addCriterion("HISTORICALFEE like", value, "historicalfee");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeNotLike(String value) {
            addCriterion("HISTORICALFEE not like", value, "historicalfee");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeIn(List<String> values) {
            addCriterion("HISTORICALFEE in", values, "historicalfee");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeNotIn(List<String> values) {
            addCriterion("HISTORICALFEE not in", values, "historicalfee");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeBetween(String value1, String value2) {
            addCriterion("HISTORICALFEE between", value1, value2, "historicalfee");
            return (Criteria) this;
        }

        public Criteria andHistoricalfeeNotBetween(String value1, String value2) {
            addCriterion("HISTORICALFEE not between", value1, value2, "historicalfee");
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