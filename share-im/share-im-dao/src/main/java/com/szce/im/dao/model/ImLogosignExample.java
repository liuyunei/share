package com.szce.im.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ImLogosignExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ImLogosignExample() {
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

        public Criteria andLogosignidIsNull() {
            addCriterion("LogoSignID is null");
            return (Criteria) this;
        }

        public Criteria andLogosignidIsNotNull() {
            addCriterion("LogoSignID is not null");
            return (Criteria) this;
        }

        public Criteria andLogosignidEqualTo(String value) {
            addCriterion("LogoSignID =", value, "logosignid");
            return (Criteria) this;
        }

        public Criteria andLogosignidNotEqualTo(String value) {
            addCriterion("LogoSignID <>", value, "logosignid");
            return (Criteria) this;
        }

        public Criteria andLogosignidGreaterThan(String value) {
            addCriterion("LogoSignID >", value, "logosignid");
            return (Criteria) this;
        }

        public Criteria andLogosignidGreaterThanOrEqualTo(String value) {
            addCriterion("LogoSignID >=", value, "logosignid");
            return (Criteria) this;
        }

        public Criteria andLogosignidLessThan(String value) {
            addCriterion("LogoSignID <", value, "logosignid");
            return (Criteria) this;
        }

        public Criteria andLogosignidLessThanOrEqualTo(String value) {
            addCriterion("LogoSignID <=", value, "logosignid");
            return (Criteria) this;
        }

        public Criteria andLogosignidLike(String value) {
            addCriterion("LogoSignID like", value, "logosignid");
            return (Criteria) this;
        }

        public Criteria andLogosignidNotLike(String value) {
            addCriterion("LogoSignID not like", value, "logosignid");
            return (Criteria) this;
        }

        public Criteria andLogosignidIn(List<String> values) {
            addCriterion("LogoSignID in", values, "logosignid");
            return (Criteria) this;
        }

        public Criteria andLogosignidNotIn(List<String> values) {
            addCriterion("LogoSignID not in", values, "logosignid");
            return (Criteria) this;
        }

        public Criteria andLogosignidBetween(String value1, String value2) {
            addCriterion("LogoSignID between", value1, value2, "logosignid");
            return (Criteria) this;
        }

        public Criteria andLogosignidNotBetween(String value1, String value2) {
            addCriterion("LogoSignID not between", value1, value2, "logosignid");
            return (Criteria) this;
        }

        public Criteria andLogosignnameIsNull() {
            addCriterion("LogoSignName is null");
            return (Criteria) this;
        }

        public Criteria andLogosignnameIsNotNull() {
            addCriterion("LogoSignName is not null");
            return (Criteria) this;
        }

        public Criteria andLogosignnameEqualTo(String value) {
            addCriterion("LogoSignName =", value, "logosignname");
            return (Criteria) this;
        }

        public Criteria andLogosignnameNotEqualTo(String value) {
            addCriterion("LogoSignName <>", value, "logosignname");
            return (Criteria) this;
        }

        public Criteria andLogosignnameGreaterThan(String value) {
            addCriterion("LogoSignName >", value, "logosignname");
            return (Criteria) this;
        }

        public Criteria andLogosignnameGreaterThanOrEqualTo(String value) {
            addCriterion("LogoSignName >=", value, "logosignname");
            return (Criteria) this;
        }

        public Criteria andLogosignnameLessThan(String value) {
            addCriterion("LogoSignName <", value, "logosignname");
            return (Criteria) this;
        }

        public Criteria andLogosignnameLessThanOrEqualTo(String value) {
            addCriterion("LogoSignName <=", value, "logosignname");
            return (Criteria) this;
        }

        public Criteria andLogosignnameLike(String value) {
            addCriterion("LogoSignName like", value, "logosignname");
            return (Criteria) this;
        }

        public Criteria andLogosignnameNotLike(String value) {
            addCriterion("LogoSignName not like", value, "logosignname");
            return (Criteria) this;
        }

        public Criteria andLogosignnameIn(List<String> values) {
            addCriterion("LogoSignName in", values, "logosignname");
            return (Criteria) this;
        }

        public Criteria andLogosignnameNotIn(List<String> values) {
            addCriterion("LogoSignName not in", values, "logosignname");
            return (Criteria) this;
        }

        public Criteria andLogosignnameBetween(String value1, String value2) {
            addCriterion("LogoSignName between", value1, value2, "logosignname");
            return (Criteria) this;
        }

        public Criteria andLogosignnameNotBetween(String value1, String value2) {
            addCriterion("LogoSignName not between", value1, value2, "logosignname");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongIsNull() {
            addCriterion("LogoSignBelong is null");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongIsNotNull() {
            addCriterion("LogoSignBelong is not null");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongEqualTo(String value) {
            addCriterion("LogoSignBelong =", value, "logosignbelong");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongNotEqualTo(String value) {
            addCriterion("LogoSignBelong <>", value, "logosignbelong");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongGreaterThan(String value) {
            addCriterion("LogoSignBelong >", value, "logosignbelong");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongGreaterThanOrEqualTo(String value) {
            addCriterion("LogoSignBelong >=", value, "logosignbelong");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongLessThan(String value) {
            addCriterion("LogoSignBelong <", value, "logosignbelong");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongLessThanOrEqualTo(String value) {
            addCriterion("LogoSignBelong <=", value, "logosignbelong");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongLike(String value) {
            addCriterion("LogoSignBelong like", value, "logosignbelong");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongNotLike(String value) {
            addCriterion("LogoSignBelong not like", value, "logosignbelong");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongIn(List<String> values) {
            addCriterion("LogoSignBelong in", values, "logosignbelong");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongNotIn(List<String> values) {
            addCriterion("LogoSignBelong not in", values, "logosignbelong");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongBetween(String value1, String value2) {
            addCriterion("LogoSignBelong between", value1, value2, "logosignbelong");
            return (Criteria) this;
        }

        public Criteria andLogosignbelongNotBetween(String value1, String value2) {
            addCriterion("LogoSignBelong not between", value1, value2, "logosignbelong");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainIsNull() {
            addCriterion("LogoSignMaintain is null");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainIsNotNull() {
            addCriterion("LogoSignMaintain is not null");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainEqualTo(String value) {
            addCriterion("LogoSignMaintain =", value, "logosignmaintain");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainNotEqualTo(String value) {
            addCriterion("LogoSignMaintain <>", value, "logosignmaintain");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainGreaterThan(String value) {
            addCriterion("LogoSignMaintain >", value, "logosignmaintain");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainGreaterThanOrEqualTo(String value) {
            addCriterion("LogoSignMaintain >=", value, "logosignmaintain");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainLessThan(String value) {
            addCriterion("LogoSignMaintain <", value, "logosignmaintain");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainLessThanOrEqualTo(String value) {
            addCriterion("LogoSignMaintain <=", value, "logosignmaintain");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainLike(String value) {
            addCriterion("LogoSignMaintain like", value, "logosignmaintain");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainNotLike(String value) {
            addCriterion("LogoSignMaintain not like", value, "logosignmaintain");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainIn(List<String> values) {
            addCriterion("LogoSignMaintain in", values, "logosignmaintain");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainNotIn(List<String> values) {
            addCriterion("LogoSignMaintain not in", values, "logosignmaintain");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainBetween(String value1, String value2) {
            addCriterion("LogoSignMaintain between", value1, value2, "logosignmaintain");
            return (Criteria) this;
        }

        public Criteria andLogosignmaintainNotBetween(String value1, String value2) {
            addCriterion("LogoSignMaintain not between", value1, value2, "logosignmaintain");
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