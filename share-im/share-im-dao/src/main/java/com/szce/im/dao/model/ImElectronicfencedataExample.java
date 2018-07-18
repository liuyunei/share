package com.szce.im.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImElectronicfencedataExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ImElectronicfencedataExample() {
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

        public Criteria andElectronicfenceidIsNull() {
            addCriterion("ElectronicFenceID is null");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidIsNotNull() {
            addCriterion("ElectronicFenceID is not null");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidEqualTo(String value) {
            addCriterion("ElectronicFenceID =", value, "electronicfenceid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidNotEqualTo(String value) {
            addCriterion("ElectronicFenceID <>", value, "electronicfenceid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidGreaterThan(String value) {
            addCriterion("ElectronicFenceID >", value, "electronicfenceid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidGreaterThanOrEqualTo(String value) {
            addCriterion("ElectronicFenceID >=", value, "electronicfenceid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidLessThan(String value) {
            addCriterion("ElectronicFenceID <", value, "electronicfenceid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidLessThanOrEqualTo(String value) {
            addCriterion("ElectronicFenceID <=", value, "electronicfenceid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidLike(String value) {
            addCriterion("ElectronicFenceID like", value, "electronicfenceid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidNotLike(String value) {
            addCriterion("ElectronicFenceID not like", value, "electronicfenceid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidIn(List<String> values) {
            addCriterion("ElectronicFenceID in", values, "electronicfenceid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidNotIn(List<String> values) {
            addCriterion("ElectronicFenceID not in", values, "electronicfenceid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidBetween(String value1, String value2) {
            addCriterion("ElectronicFenceID between", value1, value2, "electronicfenceid");
            return (Criteria) this;
        }

        public Criteria andElectronicfenceidNotBetween(String value1, String value2) {
            addCriterion("ElectronicFenceID not between", value1, value2, "electronicfenceid");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameIsNull() {
            addCriterion("ElectronicFenceName is null");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameIsNotNull() {
            addCriterion("ElectronicFenceName is not null");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameEqualTo(String value) {
            addCriterion("ElectronicFenceName =", value, "electronicfencename");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameNotEqualTo(String value) {
            addCriterion("ElectronicFenceName <>", value, "electronicfencename");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameGreaterThan(String value) {
            addCriterion("ElectronicFenceName >", value, "electronicfencename");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameGreaterThanOrEqualTo(String value) {
            addCriterion("ElectronicFenceName >=", value, "electronicfencename");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameLessThan(String value) {
            addCriterion("ElectronicFenceName <", value, "electronicfencename");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameLessThanOrEqualTo(String value) {
            addCriterion("ElectronicFenceName <=", value, "electronicfencename");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameLike(String value) {
            addCriterion("ElectronicFenceName like", value, "electronicfencename");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameNotLike(String value) {
            addCriterion("ElectronicFenceName not like", value, "electronicfencename");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameIn(List<String> values) {
            addCriterion("ElectronicFenceName in", values, "electronicfencename");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameNotIn(List<String> values) {
            addCriterion("ElectronicFenceName not in", values, "electronicfencename");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameBetween(String value1, String value2) {
            addCriterion("ElectronicFenceName between", value1, value2, "electronicfencename");
            return (Criteria) this;
        }

        public Criteria andElectronicfencenameNotBetween(String value1, String value2) {
            addCriterion("ElectronicFenceName not between", value1, value2, "electronicfencename");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andStandardparkingnumberIsNull() {
            addCriterion("StandardParkingNumber is null");
            return (Criteria) this;
        }

        public Criteria andStandardparkingnumberIsNotNull() {
            addCriterion("StandardParkingNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStandardparkingnumberEqualTo(Integer value) {
            addCriterion("StandardParkingNumber =", value, "standardparkingnumber");
            return (Criteria) this;
        }

        public Criteria andStandardparkingnumberNotEqualTo(Integer value) {
            addCriterion("StandardParkingNumber <>", value, "standardparkingnumber");
            return (Criteria) this;
        }

        public Criteria andStandardparkingnumberGreaterThan(Integer value) {
            addCriterion("StandardParkingNumber >", value, "standardparkingnumber");
            return (Criteria) this;
        }

        public Criteria andStandardparkingnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("StandardParkingNumber >=", value, "standardparkingnumber");
            return (Criteria) this;
        }

        public Criteria andStandardparkingnumberLessThan(Integer value) {
            addCriterion("StandardParkingNumber <", value, "standardparkingnumber");
            return (Criteria) this;
        }

        public Criteria andStandardparkingnumberLessThanOrEqualTo(Integer value) {
            addCriterion("StandardParkingNumber <=", value, "standardparkingnumber");
            return (Criteria) this;
        }

        public Criteria andStandardparkingnumberIn(List<Integer> values) {
            addCriterion("StandardParkingNumber in", values, "standardparkingnumber");
            return (Criteria) this;
        }

        public Criteria andStandardparkingnumberNotIn(List<Integer> values) {
            addCriterion("StandardParkingNumber not in", values, "standardparkingnumber");
            return (Criteria) this;
        }

        public Criteria andStandardparkingnumberBetween(Integer value1, Integer value2) {
            addCriterion("StandardParkingNumber between", value1, value2, "standardparkingnumber");
            return (Criteria) this;
        }

        public Criteria andStandardparkingnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("StandardParkingNumber not between", value1, value2, "standardparkingnumber");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNull() {
            addCriterion("coordinate is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNotNull() {
            addCriterion("coordinate is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateEqualTo(String value) {
            addCriterion("coordinate =", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotEqualTo(String value) {
            addCriterion("coordinate <>", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThan(String value) {
            addCriterion("coordinate >", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("coordinate >=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThan(String value) {
            addCriterion("coordinate <", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThanOrEqualTo(String value) {
            addCriterion("coordinate <=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLike(String value) {
            addCriterion("coordinate like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotLike(String value) {
            addCriterion("coordinate not like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateIn(List<String> values) {
            addCriterion("coordinate in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotIn(List<String> values) {
            addCriterion("coordinate not in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateBetween(String value1, String value2) {
            addCriterion("coordinate between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotBetween(String value1, String value2) {
            addCriterion("coordinate not between", value1, value2, "coordinate");
            return (Criteria) this;
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