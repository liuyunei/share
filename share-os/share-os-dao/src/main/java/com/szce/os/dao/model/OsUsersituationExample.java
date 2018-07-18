package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OsUsersituationExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OsUsersituationExample() {
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

        public Criteria andUsersituationidIsNull() {
            addCriterion("USERSITUATIONID is null");
            return (Criteria) this;
        }

        public Criteria andUsersituationidIsNotNull() {
            addCriterion("USERSITUATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andUsersituationidEqualTo(String value) {
            addCriterion("USERSITUATIONID =", value, "usersituationid");
            return (Criteria) this;
        }

        public Criteria andUsersituationidNotEqualTo(String value) {
            addCriterion("USERSITUATIONID <>", value, "usersituationid");
            return (Criteria) this;
        }

        public Criteria andUsersituationidGreaterThan(String value) {
            addCriterion("USERSITUATIONID >", value, "usersituationid");
            return (Criteria) this;
        }

        public Criteria andUsersituationidGreaterThanOrEqualTo(String value) {
            addCriterion("USERSITUATIONID >=", value, "usersituationid");
            return (Criteria) this;
        }

        public Criteria andUsersituationidLessThan(String value) {
            addCriterion("USERSITUATIONID <", value, "usersituationid");
            return (Criteria) this;
        }

        public Criteria andUsersituationidLessThanOrEqualTo(String value) {
            addCriterion("USERSITUATIONID <=", value, "usersituationid");
            return (Criteria) this;
        }

        public Criteria andUsersituationidLike(String value) {
            addCriterion("USERSITUATIONID like", value, "usersituationid");
            return (Criteria) this;
        }

        public Criteria andUsersituationidNotLike(String value) {
            addCriterion("USERSITUATIONID not like", value, "usersituationid");
            return (Criteria) this;
        }

        public Criteria andUsersituationidIn(List<String> values) {
            addCriterion("USERSITUATIONID in", values, "usersituationid");
            return (Criteria) this;
        }

        public Criteria andUsersituationidNotIn(List<String> values) {
            addCriterion("USERSITUATIONID not in", values, "usersituationid");
            return (Criteria) this;
        }

        public Criteria andUsersituationidBetween(String value1, String value2) {
            addCriterion("USERSITUATIONID between", value1, value2, "usersituationid");
            return (Criteria) this;
        }

        public Criteria andUsersituationidNotBetween(String value1, String value2) {
            addCriterion("USERSITUATIONID not between", value1, value2, "usersituationid");
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

        public Criteria andUsernumberIsNull() {
            addCriterion("USERNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andUsernumberIsNotNull() {
            addCriterion("USERNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andUsernumberEqualTo(Integer value) {
            addCriterion("USERNUMBER =", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotEqualTo(Integer value) {
            addCriterion("USERNUMBER <>", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberGreaterThan(Integer value) {
            addCriterion("USERNUMBER >", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERNUMBER >=", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLessThan(Integer value) {
            addCriterion("USERNUMBER <", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberLessThanOrEqualTo(Integer value) {
            addCriterion("USERNUMBER <=", value, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberIn(List<Integer> values) {
            addCriterion("USERNUMBER in", values, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotIn(List<Integer> values) {
            addCriterion("USERNUMBER not in", values, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberBetween(Integer value1, Integer value2) {
            addCriterion("USERNUMBER between", value1, value2, "usernumber");
            return (Criteria) this;
        }

        public Criteria andUsernumberNotBetween(Integer value1, Integer value2) {
            addCriterion("USERNUMBER not between", value1, value2, "usernumber");
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