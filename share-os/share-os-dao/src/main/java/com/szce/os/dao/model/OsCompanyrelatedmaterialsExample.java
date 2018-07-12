package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OsCompanyrelatedmaterialsExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OsCompanyrelatedmaterialsExample() {
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

        public Criteria andCompanyrelatedmaterialsidIsNull() {
            addCriterion("COMPANYRELATEDMATERIALSID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidIsNotNull() {
            addCriterion("COMPANYRELATEDMATERIALSID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidEqualTo(String value) {
            addCriterion("COMPANYRELATEDMATERIALSID =", value, "companyrelatedmaterialsid");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidNotEqualTo(String value) {
            addCriterion("COMPANYRELATEDMATERIALSID <>", value, "companyrelatedmaterialsid");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidGreaterThan(String value) {
            addCriterion("COMPANYRELATEDMATERIALSID >", value, "companyrelatedmaterialsid");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYRELATEDMATERIALSID >=", value, "companyrelatedmaterialsid");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidLessThan(String value) {
            addCriterion("COMPANYRELATEDMATERIALSID <", value, "companyrelatedmaterialsid");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidLessThanOrEqualTo(String value) {
            addCriterion("COMPANYRELATEDMATERIALSID <=", value, "companyrelatedmaterialsid");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidLike(String value) {
            addCriterion("COMPANYRELATEDMATERIALSID like", value, "companyrelatedmaterialsid");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidNotLike(String value) {
            addCriterion("COMPANYRELATEDMATERIALSID not like", value, "companyrelatedmaterialsid");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidIn(List<String> values) {
            addCriterion("COMPANYRELATEDMATERIALSID in", values, "companyrelatedmaterialsid");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidNotIn(List<String> values) {
            addCriterion("COMPANYRELATEDMATERIALSID not in", values, "companyrelatedmaterialsid");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidBetween(String value1, String value2) {
            addCriterion("COMPANYRELATEDMATERIALSID between", value1, value2, "companyrelatedmaterialsid");
            return (Criteria) this;
        }

        public Criteria andCompanyrelatedmaterialsidNotBetween(String value1, String value2) {
            addCriterion("COMPANYRELATEDMATERIALSID not between", value1, value2, "companyrelatedmaterialsid");
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

        public Criteria andBikequalityinspectionreportcertificationdataIsNull() {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA is null");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataIsNotNull() {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA is not null");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataEqualTo(String value) {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA =", value, "bikequalityinspectionreportcertificationdata");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataNotEqualTo(String value) {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA <>", value, "bikequalityinspectionreportcertificationdata");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataGreaterThan(String value) {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA >", value, "bikequalityinspectionreportcertificationdata");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataGreaterThanOrEqualTo(String value) {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA >=", value, "bikequalityinspectionreportcertificationdata");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataLessThan(String value) {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA <", value, "bikequalityinspectionreportcertificationdata");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataLessThanOrEqualTo(String value) {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA <=", value, "bikequalityinspectionreportcertificationdata");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataLike(String value) {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA like", value, "bikequalityinspectionreportcertificationdata");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataNotLike(String value) {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA not like", value, "bikequalityinspectionreportcertificationdata");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataIn(List<String> values) {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA in", values, "bikequalityinspectionreportcertificationdata");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataNotIn(List<String> values) {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA not in", values, "bikequalityinspectionreportcertificationdata");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataBetween(String value1, String value2) {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA between", value1, value2, "bikequalityinspectionreportcertificationdata");
            return (Criteria) this;
        }

        public Criteria andBikequalityinspectionreportcertificationdataNotBetween(String value1, String value2) {
            addCriterion("BIKEQUALITYINSPECTIONREPORTCERTIFICATIONDATA not between", value1, value2, "bikequalityinspectionreportcertificationdata");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementIsNull() {
            addCriterion("OPERATIONALSERVICEAGREEMENT is null");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementIsNotNull() {
            addCriterion("OPERATIONALSERVICEAGREEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementEqualTo(String value) {
            addCriterion("OPERATIONALSERVICEAGREEMENT =", value, "operationalserviceagreement");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementNotEqualTo(String value) {
            addCriterion("OPERATIONALSERVICEAGREEMENT <>", value, "operationalserviceagreement");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementGreaterThan(String value) {
            addCriterion("OPERATIONALSERVICEAGREEMENT >", value, "operationalserviceagreement");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATIONALSERVICEAGREEMENT >=", value, "operationalserviceagreement");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementLessThan(String value) {
            addCriterion("OPERATIONALSERVICEAGREEMENT <", value, "operationalserviceagreement");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementLessThanOrEqualTo(String value) {
            addCriterion("OPERATIONALSERVICEAGREEMENT <=", value, "operationalserviceagreement");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementLike(String value) {
            addCriterion("OPERATIONALSERVICEAGREEMENT like", value, "operationalserviceagreement");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementNotLike(String value) {
            addCriterion("OPERATIONALSERVICEAGREEMENT not like", value, "operationalserviceagreement");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementIn(List<String> values) {
            addCriterion("OPERATIONALSERVICEAGREEMENT in", values, "operationalserviceagreement");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementNotIn(List<String> values) {
            addCriterion("OPERATIONALSERVICEAGREEMENT not in", values, "operationalserviceagreement");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementBetween(String value1, String value2) {
            addCriterion("OPERATIONALSERVICEAGREEMENT between", value1, value2, "operationalserviceagreement");
            return (Criteria) this;
        }

        public Criteria andOperationalserviceagreementNotBetween(String value1, String value2) {
            addCriterion("OPERATIONALSERVICEAGREEMENT not between", value1, value2, "operationalserviceagreement");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceIsNull() {
            addCriterion("ACCIDENTALINJURYINSURANCE is null");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceIsNotNull() {
            addCriterion("ACCIDENTALINJURYINSURANCE is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceEqualTo(String value) {
            addCriterion("ACCIDENTALINJURYINSURANCE =", value, "accidentalinjuryinsurance");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceNotEqualTo(String value) {
            addCriterion("ACCIDENTALINJURYINSURANCE <>", value, "accidentalinjuryinsurance");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceGreaterThan(String value) {
            addCriterion("ACCIDENTALINJURYINSURANCE >", value, "accidentalinjuryinsurance");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("ACCIDENTALINJURYINSURANCE >=", value, "accidentalinjuryinsurance");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceLessThan(String value) {
            addCriterion("ACCIDENTALINJURYINSURANCE <", value, "accidentalinjuryinsurance");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceLessThanOrEqualTo(String value) {
            addCriterion("ACCIDENTALINJURYINSURANCE <=", value, "accidentalinjuryinsurance");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceLike(String value) {
            addCriterion("ACCIDENTALINJURYINSURANCE like", value, "accidentalinjuryinsurance");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceNotLike(String value) {
            addCriterion("ACCIDENTALINJURYINSURANCE not like", value, "accidentalinjuryinsurance");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceIn(List<String> values) {
            addCriterion("ACCIDENTALINJURYINSURANCE in", values, "accidentalinjuryinsurance");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceNotIn(List<String> values) {
            addCriterion("ACCIDENTALINJURYINSURANCE not in", values, "accidentalinjuryinsurance");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceBetween(String value1, String value2) {
            addCriterion("ACCIDENTALINJURYINSURANCE between", value1, value2, "accidentalinjuryinsurance");
            return (Criteria) this;
        }

        public Criteria andAccidentalinjuryinsuranceNotBetween(String value1, String value2) {
            addCriterion("ACCIDENTALINJURYINSURANCE not between", value1, value2, "accidentalinjuryinsurance");
            return (Criteria) this;
        }

        public Criteria andPledgeIsNull() {
            addCriterion("PLEDGE is null");
            return (Criteria) this;
        }

        public Criteria andPledgeIsNotNull() {
            addCriterion("PLEDGE is not null");
            return (Criteria) this;
        }

        public Criteria andPledgeEqualTo(String value) {
            addCriterion("PLEDGE =", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeNotEqualTo(String value) {
            addCriterion("PLEDGE <>", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeGreaterThan(String value) {
            addCriterion("PLEDGE >", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeGreaterThanOrEqualTo(String value) {
            addCriterion("PLEDGE >=", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeLessThan(String value) {
            addCriterion("PLEDGE <", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeLessThanOrEqualTo(String value) {
            addCriterion("PLEDGE <=", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeLike(String value) {
            addCriterion("PLEDGE like", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeNotLike(String value) {
            addCriterion("PLEDGE not like", value, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeIn(List<String> values) {
            addCriterion("PLEDGE in", values, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeNotIn(List<String> values) {
            addCriterion("PLEDGE not in", values, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeBetween(String value1, String value2) {
            addCriterion("PLEDGE between", value1, value2, "pledge");
            return (Criteria) this;
        }

        public Criteria andPledgeNotBetween(String value1, String value2) {
            addCriterion("PLEDGE not between", value1, value2, "pledge");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemIsNull() {
            addCriterion("COMPENSATIONSYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemIsNotNull() {
            addCriterion("COMPENSATIONSYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemEqualTo(String value) {
            addCriterion("COMPENSATIONSYSTEM =", value, "compensationsystem");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemNotEqualTo(String value) {
            addCriterion("COMPENSATIONSYSTEM <>", value, "compensationsystem");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemGreaterThan(String value) {
            addCriterion("COMPENSATIONSYSTEM >", value, "compensationsystem");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemGreaterThanOrEqualTo(String value) {
            addCriterion("COMPENSATIONSYSTEM >=", value, "compensationsystem");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemLessThan(String value) {
            addCriterion("COMPENSATIONSYSTEM <", value, "compensationsystem");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemLessThanOrEqualTo(String value) {
            addCriterion("COMPENSATIONSYSTEM <=", value, "compensationsystem");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemLike(String value) {
            addCriterion("COMPENSATIONSYSTEM like", value, "compensationsystem");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemNotLike(String value) {
            addCriterion("COMPENSATIONSYSTEM not like", value, "compensationsystem");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemIn(List<String> values) {
            addCriterion("COMPENSATIONSYSTEM in", values, "compensationsystem");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemNotIn(List<String> values) {
            addCriterion("COMPENSATIONSYSTEM not in", values, "compensationsystem");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemBetween(String value1, String value2) {
            addCriterion("COMPENSATIONSYSTEM between", value1, value2, "compensationsystem");
            return (Criteria) this;
        }

        public Criteria andCompensationsystemNotBetween(String value1, String value2) {
            addCriterion("COMPENSATIONSYSTEM not between", value1, value2, "compensationsystem");
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