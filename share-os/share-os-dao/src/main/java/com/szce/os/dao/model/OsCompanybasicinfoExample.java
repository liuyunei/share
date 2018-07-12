package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OsCompanybasicinfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OsCompanybasicinfoExample() {
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

        public Criteria andCompaynameIsNull() {
            addCriterion("COMPAYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCompaynameIsNotNull() {
            addCriterion("COMPAYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompaynameEqualTo(String value) {
            addCriterion("COMPAYNAME =", value, "compayname");
            return (Criteria) this;
        }

        public Criteria andCompaynameNotEqualTo(String value) {
            addCriterion("COMPAYNAME <>", value, "compayname");
            return (Criteria) this;
        }

        public Criteria andCompaynameGreaterThan(String value) {
            addCriterion("COMPAYNAME >", value, "compayname");
            return (Criteria) this;
        }

        public Criteria andCompaynameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPAYNAME >=", value, "compayname");
            return (Criteria) this;
        }

        public Criteria andCompaynameLessThan(String value) {
            addCriterion("COMPAYNAME <", value, "compayname");
            return (Criteria) this;
        }

        public Criteria andCompaynameLessThanOrEqualTo(String value) {
            addCriterion("COMPAYNAME <=", value, "compayname");
            return (Criteria) this;
        }

        public Criteria andCompaynameLike(String value) {
            addCriterion("COMPAYNAME like", value, "compayname");
            return (Criteria) this;
        }

        public Criteria andCompaynameNotLike(String value) {
            addCriterion("COMPAYNAME not like", value, "compayname");
            return (Criteria) this;
        }

        public Criteria andCompaynameIn(List<String> values) {
            addCriterion("COMPAYNAME in", values, "compayname");
            return (Criteria) this;
        }

        public Criteria andCompaynameNotIn(List<String> values) {
            addCriterion("COMPAYNAME not in", values, "compayname");
            return (Criteria) this;
        }

        public Criteria andCompaynameBetween(String value1, String value2) {
            addCriterion("COMPAYNAME between", value1, value2, "compayname");
            return (Criteria) this;
        }

        public Criteria andCompaynameNotBetween(String value1, String value2) {
            addCriterion("COMPAYNAME not between", value1, value2, "compayname");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalIsNull() {
            addCriterion("REGISTEREDCAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalIsNotNull() {
            addCriterion("REGISTEREDCAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalEqualTo(Double value) {
            addCriterion("REGISTEREDCAPITAL =", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotEqualTo(Double value) {
            addCriterion("REGISTEREDCAPITAL <>", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalGreaterThan(Double value) {
            addCriterion("REGISTEREDCAPITAL >", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalGreaterThanOrEqualTo(Double value) {
            addCriterion("REGISTEREDCAPITAL >=", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalLessThan(Double value) {
            addCriterion("REGISTEREDCAPITAL <", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalLessThanOrEqualTo(Double value) {
            addCriterion("REGISTEREDCAPITAL <=", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalIn(List<Double> values) {
            addCriterion("REGISTEREDCAPITAL in", values, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotIn(List<Double> values) {
            addCriterion("REGISTEREDCAPITAL not in", values, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalBetween(Double value1, Double value2) {
            addCriterion("REGISTEREDCAPITAL between", value1, value2, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotBetween(Double value1, Double value2) {
            addCriterion("REGISTEREDCAPITAL not between", value1, value2, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIsNull() {
            addCriterion("LEGALREPRESENTATIVE is null");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIsNotNull() {
            addCriterion("LEGALREPRESENTATIVE is not null");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeEqualTo(String value) {
            addCriterion("LEGALREPRESENTATIVE =", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotEqualTo(String value) {
            addCriterion("LEGALREPRESENTATIVE <>", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeGreaterThan(String value) {
            addCriterion("LEGALREPRESENTATIVE >", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("LEGALREPRESENTATIVE >=", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeLessThan(String value) {
            addCriterion("LEGALREPRESENTATIVE <", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeLessThanOrEqualTo(String value) {
            addCriterion("LEGALREPRESENTATIVE <=", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeLike(String value) {
            addCriterion("LEGALREPRESENTATIVE like", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotLike(String value) {
            addCriterion("LEGALREPRESENTATIVE not like", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIn(List<String> values) {
            addCriterion("LEGALREPRESENTATIVE in", values, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotIn(List<String> values) {
            addCriterion("LEGALREPRESENTATIVE not in", values, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeBetween(String value1, String value2) {
            addCriterion("LEGALREPRESENTATIVE between", value1, value2, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotBetween(String value1, String value2) {
            addCriterion("LEGALREPRESENTATIVE not between", value1, value2, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIsNull() {
            addCriterion("REGISTRATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIsNotNull() {
            addCriterion("REGISTRATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeEqualTo(Date value) {
            addCriterion("REGISTRATIONTIME =", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotEqualTo(Date value) {
            addCriterion("REGISTRATIONTIME <>", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeGreaterThan(Date value) {
            addCriterion("REGISTRATIONTIME >", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTRATIONTIME >=", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeLessThan(Date value) {
            addCriterion("REGISTRATIONTIME <", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeLessThanOrEqualTo(Date value) {
            addCriterion("REGISTRATIONTIME <=", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIn(List<Date> values) {
            addCriterion("REGISTRATIONTIME in", values, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotIn(List<Date> values) {
            addCriterion("REGISTRATIONTIME not in", values, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeBetween(Date value1, Date value2) {
            addCriterion("REGISTRATIONTIME between", value1, value2, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotBetween(Date value1, Date value2) {
            addCriterion("REGISTRATIONTIME not between", value1, value2, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberIsNull() {
            addCriterion("BUSINESSREGISTRATIONNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberIsNotNull() {
            addCriterion("BUSINESSREGISTRATIONNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberEqualTo(String value) {
            addCriterion("BUSINESSREGISTRATIONNUMBER =", value, "businessregistrationnumber");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberNotEqualTo(String value) {
            addCriterion("BUSINESSREGISTRATIONNUMBER <>", value, "businessregistrationnumber");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberGreaterThan(String value) {
            addCriterion("BUSINESSREGISTRATIONNUMBER >", value, "businessregistrationnumber");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSREGISTRATIONNUMBER >=", value, "businessregistrationnumber");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberLessThan(String value) {
            addCriterion("BUSINESSREGISTRATIONNUMBER <", value, "businessregistrationnumber");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSREGISTRATIONNUMBER <=", value, "businessregistrationnumber");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberLike(String value) {
            addCriterion("BUSINESSREGISTRATIONNUMBER like", value, "businessregistrationnumber");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberNotLike(String value) {
            addCriterion("BUSINESSREGISTRATIONNUMBER not like", value, "businessregistrationnumber");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberIn(List<String> values) {
            addCriterion("BUSINESSREGISTRATIONNUMBER in", values, "businessregistrationnumber");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberNotIn(List<String> values) {
            addCriterion("BUSINESSREGISTRATIONNUMBER not in", values, "businessregistrationnumber");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberBetween(String value1, String value2) {
            addCriterion("BUSINESSREGISTRATIONNUMBER between", value1, value2, "businessregistrationnumber");
            return (Criteria) this;
        }

        public Criteria andBusinessregistrationnumberNotBetween(String value1, String value2) {
            addCriterion("BUSINESSREGISTRATIONNUMBER not between", value1, value2, "businessregistrationnumber");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejIsNull() {
            addCriterion("ORGANIZATIONCODEj is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejIsNotNull() {
            addCriterion("ORGANIZATIONCODEj is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejEqualTo(String value) {
            addCriterion("ORGANIZATIONCODEj =", value, "organizationcodej");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejNotEqualTo(String value) {
            addCriterion("ORGANIZATIONCODEj <>", value, "organizationcodej");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejGreaterThan(String value) {
            addCriterion("ORGANIZATIONCODEj >", value, "organizationcodej");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONCODEj >=", value, "organizationcodej");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejLessThan(String value) {
            addCriterion("ORGANIZATIONCODEj <", value, "organizationcodej");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONCODEj <=", value, "organizationcodej");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejLike(String value) {
            addCriterion("ORGANIZATIONCODEj like", value, "organizationcodej");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejNotLike(String value) {
            addCriterion("ORGANIZATIONCODEj not like", value, "organizationcodej");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejIn(List<String> values) {
            addCriterion("ORGANIZATIONCODEj in", values, "organizationcodej");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejNotIn(List<String> values) {
            addCriterion("ORGANIZATIONCODEj not in", values, "organizationcodej");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONCODEj between", value1, value2, "organizationcodej");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodejNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONCODEj not between", value1, value2, "organizationcodej");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeIsNull() {
            addCriterion("UNIFIEDCREDITCODE is null");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeIsNotNull() {
            addCriterion("UNIFIEDCREDITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeEqualTo(String value) {
            addCriterion("UNIFIEDCREDITCODE =", value, "unifiedcreditcode");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeNotEqualTo(String value) {
            addCriterion("UNIFIEDCREDITCODE <>", value, "unifiedcreditcode");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeGreaterThan(String value) {
            addCriterion("UNIFIEDCREDITCODE >", value, "unifiedcreditcode");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("UNIFIEDCREDITCODE >=", value, "unifiedcreditcode");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeLessThan(String value) {
            addCriterion("UNIFIEDCREDITCODE <", value, "unifiedcreditcode");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeLessThanOrEqualTo(String value) {
            addCriterion("UNIFIEDCREDITCODE <=", value, "unifiedcreditcode");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeLike(String value) {
            addCriterion("UNIFIEDCREDITCODE like", value, "unifiedcreditcode");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeNotLike(String value) {
            addCriterion("UNIFIEDCREDITCODE not like", value, "unifiedcreditcode");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeIn(List<String> values) {
            addCriterion("UNIFIEDCREDITCODE in", values, "unifiedcreditcode");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeNotIn(List<String> values) {
            addCriterion("UNIFIEDCREDITCODE not in", values, "unifiedcreditcode");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeBetween(String value1, String value2) {
            addCriterion("UNIFIEDCREDITCODE between", value1, value2, "unifiedcreditcode");
            return (Criteria) this;
        }

        public Criteria andUnifiedcreditcodeNotBetween(String value1, String value2) {
            addCriterion("UNIFIEDCREDITCODE not between", value1, value2, "unifiedcreditcode");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusIsNull() {
            addCriterion("BUSINESSOPERATIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusIsNotNull() {
            addCriterion("BUSINESSOPERATIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusEqualTo(String value) {
            addCriterion("BUSINESSOPERATIONSTATUS =", value, "businessoperationstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusNotEqualTo(String value) {
            addCriterion("BUSINESSOPERATIONSTATUS <>", value, "businessoperationstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusGreaterThan(String value) {
            addCriterion("BUSINESSOPERATIONSTATUS >", value, "businessoperationstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSOPERATIONSTATUS >=", value, "businessoperationstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusLessThan(String value) {
            addCriterion("BUSINESSOPERATIONSTATUS <", value, "businessoperationstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSOPERATIONSTATUS <=", value, "businessoperationstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusLike(String value) {
            addCriterion("BUSINESSOPERATIONSTATUS like", value, "businessoperationstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusNotLike(String value) {
            addCriterion("BUSINESSOPERATIONSTATUS not like", value, "businessoperationstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusIn(List<String> values) {
            addCriterion("BUSINESSOPERATIONSTATUS in", values, "businessoperationstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusNotIn(List<String> values) {
            addCriterion("BUSINESSOPERATIONSTATUS not in", values, "businessoperationstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusBetween(String value1, String value2) {
            addCriterion("BUSINESSOPERATIONSTATUS between", value1, value2, "businessoperationstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessoperationstatusNotBetween(String value1, String value2) {
            addCriterion("BUSINESSOPERATIONSTATUS not between", value1, value2, "businessoperationstatus");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesIsNull() {
            addCriterion("BUSINESSEXECUTIVES is null");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesIsNotNull() {
            addCriterion("BUSINESSEXECUTIVES is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesEqualTo(String value) {
            addCriterion("BUSINESSEXECUTIVES =", value, "businessexecutives");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesNotEqualTo(String value) {
            addCriterion("BUSINESSEXECUTIVES <>", value, "businessexecutives");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesGreaterThan(String value) {
            addCriterion("BUSINESSEXECUTIVES >", value, "businessexecutives");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSEXECUTIVES >=", value, "businessexecutives");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesLessThan(String value) {
            addCriterion("BUSINESSEXECUTIVES <", value, "businessexecutives");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSEXECUTIVES <=", value, "businessexecutives");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesLike(String value) {
            addCriterion("BUSINESSEXECUTIVES like", value, "businessexecutives");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesNotLike(String value) {
            addCriterion("BUSINESSEXECUTIVES not like", value, "businessexecutives");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesIn(List<String> values) {
            addCriterion("BUSINESSEXECUTIVES in", values, "businessexecutives");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesNotIn(List<String> values) {
            addCriterion("BUSINESSEXECUTIVES not in", values, "businessexecutives");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesBetween(String value1, String value2) {
            addCriterion("BUSINESSEXECUTIVES between", value1, value2, "businessexecutives");
            return (Criteria) this;
        }

        public Criteria andBusinessexecutivesNotBetween(String value1, String value2) {
            addCriterion("BUSINESSEXECUTIVES not between", value1, value2, "businessexecutives");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerIsNull() {
            addCriterion("CITYOPERATIONMANAGER is null");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerIsNotNull() {
            addCriterion("CITYOPERATIONMANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerEqualTo(String value) {
            addCriterion("CITYOPERATIONMANAGER =", value, "cityoperationmanager");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerNotEqualTo(String value) {
            addCriterion("CITYOPERATIONMANAGER <>", value, "cityoperationmanager");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerGreaterThan(String value) {
            addCriterion("CITYOPERATIONMANAGER >", value, "cityoperationmanager");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("CITYOPERATIONMANAGER >=", value, "cityoperationmanager");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerLessThan(String value) {
            addCriterion("CITYOPERATIONMANAGER <", value, "cityoperationmanager");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerLessThanOrEqualTo(String value) {
            addCriterion("CITYOPERATIONMANAGER <=", value, "cityoperationmanager");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerLike(String value) {
            addCriterion("CITYOPERATIONMANAGER like", value, "cityoperationmanager");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerNotLike(String value) {
            addCriterion("CITYOPERATIONMANAGER not like", value, "cityoperationmanager");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerIn(List<String> values) {
            addCriterion("CITYOPERATIONMANAGER in", values, "cityoperationmanager");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerNotIn(List<String> values) {
            addCriterion("CITYOPERATIONMANAGER not in", values, "cityoperationmanager");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerBetween(String value1, String value2) {
            addCriterion("CITYOPERATIONMANAGER between", value1, value2, "cityoperationmanager");
            return (Criteria) this;
        }

        public Criteria andCityoperationmanagerNotBetween(String value1, String value2) {
            addCriterion("CITYOPERATIONMANAGER not between", value1, value2, "cityoperationmanager");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNull() {
            addCriterion("CONTACTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNotNull() {
            addCriterion("CONTACTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andContactnumberEqualTo(Integer value) {
            addCriterion("CONTACTNUMBER =", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotEqualTo(Integer value) {
            addCriterion("CONTACTNUMBER <>", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThan(Integer value) {
            addCriterion("CONTACTNUMBER >", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONTACTNUMBER >=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThan(Integer value) {
            addCriterion("CONTACTNUMBER <", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThanOrEqualTo(Integer value) {
            addCriterion("CONTACTNUMBER <=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberIn(List<Integer> values) {
            addCriterion("CONTACTNUMBER in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotIn(List<Integer> values) {
            addCriterion("CONTACTNUMBER not in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberBetween(Integer value1, Integer value2) {
            addCriterion("CONTACTNUMBER between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("CONTACTNUMBER not between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andEMailIsNull() {
            addCriterion("E-MAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("E-MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("E-MAIL =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("E-MAIL <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("E-MAIL >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("E-MAIL >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("E-MAIL <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("E-MAIL <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("E-MAIL like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("E-MAIL not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("E-MAIL in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("E-MAIL not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("E-MAIL between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("E-MAIL not between", value1, value2, "eMail");
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