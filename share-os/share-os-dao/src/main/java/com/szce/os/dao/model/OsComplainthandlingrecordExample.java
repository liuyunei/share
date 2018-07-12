package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OsComplainthandlingrecordExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OsComplainthandlingrecordExample() {
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

        public Criteria andComplainthandlingrecordidIsNull() {
            addCriterion("COMPLAINTHANDLINGRECORDID is null");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidIsNotNull() {
            addCriterion("COMPLAINTHANDLINGRECORDID is not null");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidEqualTo(String value) {
            addCriterion("COMPLAINTHANDLINGRECORDID =", value, "complainthandlingrecordid");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidNotEqualTo(String value) {
            addCriterion("COMPLAINTHANDLINGRECORDID <>", value, "complainthandlingrecordid");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidGreaterThan(String value) {
            addCriterion("COMPLAINTHANDLINGRECORDID >", value, "complainthandlingrecordid");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLAINTHANDLINGRECORDID >=", value, "complainthandlingrecordid");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidLessThan(String value) {
            addCriterion("COMPLAINTHANDLINGRECORDID <", value, "complainthandlingrecordid");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidLessThanOrEqualTo(String value) {
            addCriterion("COMPLAINTHANDLINGRECORDID <=", value, "complainthandlingrecordid");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidLike(String value) {
            addCriterion("COMPLAINTHANDLINGRECORDID like", value, "complainthandlingrecordid");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidNotLike(String value) {
            addCriterion("COMPLAINTHANDLINGRECORDID not like", value, "complainthandlingrecordid");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidIn(List<String> values) {
            addCriterion("COMPLAINTHANDLINGRECORDID in", values, "complainthandlingrecordid");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidNotIn(List<String> values) {
            addCriterion("COMPLAINTHANDLINGRECORDID not in", values, "complainthandlingrecordid");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidBetween(String value1, String value2) {
            addCriterion("COMPLAINTHANDLINGRECORDID between", value1, value2, "complainthandlingrecordid");
            return (Criteria) this;
        }

        public Criteria andComplainthandlingrecordidNotBetween(String value1, String value2) {
            addCriterion("COMPLAINTHANDLINGRECORDID not between", value1, value2, "complainthandlingrecordid");
            return (Criteria) this;
        }

        public Criteria andUseraccountIsNull() {
            addCriterion("USERACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUseraccountIsNotNull() {
            addCriterion("USERACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUseraccountEqualTo(String value) {
            addCriterion("USERACCOUNT =", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotEqualTo(String value) {
            addCriterion("USERACCOUNT <>", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountGreaterThan(String value) {
            addCriterion("USERACCOUNT >", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountGreaterThanOrEqualTo(String value) {
            addCriterion("USERACCOUNT >=", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLessThan(String value) {
            addCriterion("USERACCOUNT <", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLessThanOrEqualTo(String value) {
            addCriterion("USERACCOUNT <=", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountLike(String value) {
            addCriterion("USERACCOUNT like", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotLike(String value) {
            addCriterion("USERACCOUNT not like", value, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountIn(List<String> values) {
            addCriterion("USERACCOUNT in", values, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotIn(List<String> values) {
            addCriterion("USERACCOUNT not in", values, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountBetween(String value1, String value2) {
            addCriterion("USERACCOUNT between", value1, value2, "useraccount");
            return (Criteria) this;
        }

        public Criteria andUseraccountNotBetween(String value1, String value2) {
            addCriterion("USERACCOUNT not between", value1, value2, "useraccount");
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

        public Criteria andComplainttypeIsNull() {
            addCriterion("COMPLAINTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andComplainttypeIsNotNull() {
            addCriterion("COMPLAINTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andComplainttypeEqualTo(String value) {
            addCriterion("COMPLAINTTYPE =", value, "complainttype");
            return (Criteria) this;
        }

        public Criteria andComplainttypeNotEqualTo(String value) {
            addCriterion("COMPLAINTTYPE <>", value, "complainttype");
            return (Criteria) this;
        }

        public Criteria andComplainttypeGreaterThan(String value) {
            addCriterion("COMPLAINTTYPE >", value, "complainttype");
            return (Criteria) this;
        }

        public Criteria andComplainttypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLAINTTYPE >=", value, "complainttype");
            return (Criteria) this;
        }

        public Criteria andComplainttypeLessThan(String value) {
            addCriterion("COMPLAINTTYPE <", value, "complainttype");
            return (Criteria) this;
        }

        public Criteria andComplainttypeLessThanOrEqualTo(String value) {
            addCriterion("COMPLAINTTYPE <=", value, "complainttype");
            return (Criteria) this;
        }

        public Criteria andComplainttypeLike(String value) {
            addCriterion("COMPLAINTTYPE like", value, "complainttype");
            return (Criteria) this;
        }

        public Criteria andComplainttypeNotLike(String value) {
            addCriterion("COMPLAINTTYPE not like", value, "complainttype");
            return (Criteria) this;
        }

        public Criteria andComplainttypeIn(List<String> values) {
            addCriterion("COMPLAINTTYPE in", values, "complainttype");
            return (Criteria) this;
        }

        public Criteria andComplainttypeNotIn(List<String> values) {
            addCriterion("COMPLAINTTYPE not in", values, "complainttype");
            return (Criteria) this;
        }

        public Criteria andComplainttypeBetween(String value1, String value2) {
            addCriterion("COMPLAINTTYPE between", value1, value2, "complainttype");
            return (Criteria) this;
        }

        public Criteria andComplainttypeNotBetween(String value1, String value2) {
            addCriterion("COMPLAINTTYPE not between", value1, value2, "complainttype");
            return (Criteria) this;
        }

        public Criteria andComplaintissueIsNull() {
            addCriterion("COMPLAINTISSUE is null");
            return (Criteria) this;
        }

        public Criteria andComplaintissueIsNotNull() {
            addCriterion("COMPLAINTISSUE is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintissueEqualTo(String value) {
            addCriterion("COMPLAINTISSUE =", value, "complaintissue");
            return (Criteria) this;
        }

        public Criteria andComplaintissueNotEqualTo(String value) {
            addCriterion("COMPLAINTISSUE <>", value, "complaintissue");
            return (Criteria) this;
        }

        public Criteria andComplaintissueGreaterThan(String value) {
            addCriterion("COMPLAINTISSUE >", value, "complaintissue");
            return (Criteria) this;
        }

        public Criteria andComplaintissueGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLAINTISSUE >=", value, "complaintissue");
            return (Criteria) this;
        }

        public Criteria andComplaintissueLessThan(String value) {
            addCriterion("COMPLAINTISSUE <", value, "complaintissue");
            return (Criteria) this;
        }

        public Criteria andComplaintissueLessThanOrEqualTo(String value) {
            addCriterion("COMPLAINTISSUE <=", value, "complaintissue");
            return (Criteria) this;
        }

        public Criteria andComplaintissueLike(String value) {
            addCriterion("COMPLAINTISSUE like", value, "complaintissue");
            return (Criteria) this;
        }

        public Criteria andComplaintissueNotLike(String value) {
            addCriterion("COMPLAINTISSUE not like", value, "complaintissue");
            return (Criteria) this;
        }

        public Criteria andComplaintissueIn(List<String> values) {
            addCriterion("COMPLAINTISSUE in", values, "complaintissue");
            return (Criteria) this;
        }

        public Criteria andComplaintissueNotIn(List<String> values) {
            addCriterion("COMPLAINTISSUE not in", values, "complaintissue");
            return (Criteria) this;
        }

        public Criteria andComplaintissueBetween(String value1, String value2) {
            addCriterion("COMPLAINTISSUE between", value1, value2, "complaintissue");
            return (Criteria) this;
        }

        public Criteria andComplaintissueNotBetween(String value1, String value2) {
            addCriterion("COMPLAINTISSUE not between", value1, value2, "complaintissue");
            return (Criteria) this;
        }

        public Criteria andCompainttimeIsNull() {
            addCriterion("COMPAINTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCompainttimeIsNotNull() {
            addCriterion("COMPAINTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCompainttimeEqualTo(Date value) {
            addCriterion("COMPAINTTIME =", value, "compainttime");
            return (Criteria) this;
        }

        public Criteria andCompainttimeNotEqualTo(Date value) {
            addCriterion("COMPAINTTIME <>", value, "compainttime");
            return (Criteria) this;
        }

        public Criteria andCompainttimeGreaterThan(Date value) {
            addCriterion("COMPAINTTIME >", value, "compainttime");
            return (Criteria) this;
        }

        public Criteria andCompainttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("COMPAINTTIME >=", value, "compainttime");
            return (Criteria) this;
        }

        public Criteria andCompainttimeLessThan(Date value) {
            addCriterion("COMPAINTTIME <", value, "compainttime");
            return (Criteria) this;
        }

        public Criteria andCompainttimeLessThanOrEqualTo(Date value) {
            addCriterion("COMPAINTTIME <=", value, "compainttime");
            return (Criteria) this;
        }

        public Criteria andCompainttimeIn(List<Date> values) {
            addCriterion("COMPAINTTIME in", values, "compainttime");
            return (Criteria) this;
        }

        public Criteria andCompainttimeNotIn(List<Date> values) {
            addCriterion("COMPAINTTIME not in", values, "compainttime");
            return (Criteria) this;
        }

        public Criteria andCompainttimeBetween(Date value1, Date value2) {
            addCriterion("COMPAINTTIME between", value1, value2, "compainttime");
            return (Criteria) this;
        }

        public Criteria andCompainttimeNotBetween(Date value1, Date value2) {
            addCriterion("COMPAINTTIME not between", value1, value2, "compainttime");
            return (Criteria) this;
        }

        public Criteria andDealeridIsNull() {
            addCriterion("DEALERID is null");
            return (Criteria) this;
        }

        public Criteria andDealeridIsNotNull() {
            addCriterion("DEALERID is not null");
            return (Criteria) this;
        }

        public Criteria andDealeridEqualTo(String value) {
            addCriterion("DEALERID =", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridNotEqualTo(String value) {
            addCriterion("DEALERID <>", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridGreaterThan(String value) {
            addCriterion("DEALERID >", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridGreaterThanOrEqualTo(String value) {
            addCriterion("DEALERID >=", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridLessThan(String value) {
            addCriterion("DEALERID <", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridLessThanOrEqualTo(String value) {
            addCriterion("DEALERID <=", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridLike(String value) {
            addCriterion("DEALERID like", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridNotLike(String value) {
            addCriterion("DEALERID not like", value, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridIn(List<String> values) {
            addCriterion("DEALERID in", values, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridNotIn(List<String> values) {
            addCriterion("DEALERID not in", values, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridBetween(String value1, String value2) {
            addCriterion("DEALERID between", value1, value2, "dealerid");
            return (Criteria) this;
        }

        public Criteria andDealeridNotBetween(String value1, String value2) {
            addCriterion("DEALERID not between", value1, value2, "dealerid");
            return (Criteria) this;
        }

        public Criteria andHandleresultIsNull() {
            addCriterion("HANDLERESULT is null");
            return (Criteria) this;
        }

        public Criteria andHandleresultIsNotNull() {
            addCriterion("HANDLERESULT is not null");
            return (Criteria) this;
        }

        public Criteria andHandleresultEqualTo(String value) {
            addCriterion("HANDLERESULT =", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultNotEqualTo(String value) {
            addCriterion("HANDLERESULT <>", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultGreaterThan(String value) {
            addCriterion("HANDLERESULT >", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLERESULT >=", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultLessThan(String value) {
            addCriterion("HANDLERESULT <", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultLessThanOrEqualTo(String value) {
            addCriterion("HANDLERESULT <=", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultLike(String value) {
            addCriterion("HANDLERESULT like", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultNotLike(String value) {
            addCriterion("HANDLERESULT not like", value, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultIn(List<String> values) {
            addCriterion("HANDLERESULT in", values, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultNotIn(List<String> values) {
            addCriterion("HANDLERESULT not in", values, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultBetween(String value1, String value2) {
            addCriterion("HANDLERESULT between", value1, value2, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandleresultNotBetween(String value1, String value2) {
            addCriterion("HANDLERESULT not between", value1, value2, "handleresult");
            return (Criteria) this;
        }

        public Criteria andHandletimeIsNull() {
            addCriterion("HANDLETIME is null");
            return (Criteria) this;
        }

        public Criteria andHandletimeIsNotNull() {
            addCriterion("HANDLETIME is not null");
            return (Criteria) this;
        }

        public Criteria andHandletimeEqualTo(Date value) {
            addCriterion("HANDLETIME =", value, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeNotEqualTo(Date value) {
            addCriterion("HANDLETIME <>", value, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeGreaterThan(Date value) {
            addCriterion("HANDLETIME >", value, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HANDLETIME >=", value, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeLessThan(Date value) {
            addCriterion("HANDLETIME <", value, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeLessThanOrEqualTo(Date value) {
            addCriterion("HANDLETIME <=", value, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeIn(List<Date> values) {
            addCriterion("HANDLETIME in", values, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeNotIn(List<Date> values) {
            addCriterion("HANDLETIME not in", values, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeBetween(Date value1, Date value2) {
            addCriterion("HANDLETIME between", value1, value2, "handletime");
            return (Criteria) this;
        }

        public Criteria andHandletimeNotBetween(Date value1, Date value2) {
            addCriterion("HANDLETIME not between", value1, value2, "handletime");
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