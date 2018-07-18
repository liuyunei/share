package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OsUserregistrationinfoExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OsUserregistrationinfoExample() {
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

        public Criteria andIdnumberIsNull() {
            addCriterion("IDNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("IDNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("IDNUMBER =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("IDNUMBER <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("IDNUMBER >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("IDNUMBER >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("IDNUMBER <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("IDNUMBER <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("IDNUMBER like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("IDNUMBER not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("IDNUMBER in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("IDNUMBER not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("IDNUMBER between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("IDNUMBER not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("USERPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("USERPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("USERPASSWORD =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("USERPASSWORD <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("USERPASSWORD >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USERPASSWORD >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("USERPASSWORD <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("USERPASSWORD <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("USERPASSWORD like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("USERPASSWORD not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("USERPASSWORD in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("USERPASSWORD not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("USERPASSWORD between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("USERPASSWORD not between", value1, value2, "userpassword");
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

        public Criteria andBankcardIsNull() {
            addCriterion("BANKCARD is null");
            return (Criteria) this;
        }

        public Criteria andBankcardIsNotNull() {
            addCriterion("BANKCARD is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardEqualTo(String value) {
            addCriterion("BANKCARD =", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotEqualTo(String value) {
            addCriterion("BANKCARD <>", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThan(String value) {
            addCriterion("BANKCARD >", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCARD >=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThan(String value) {
            addCriterion("BANKCARD <", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLessThanOrEqualTo(String value) {
            addCriterion("BANKCARD <=", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardLike(String value) {
            addCriterion("BANKCARD like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotLike(String value) {
            addCriterion("BANKCARD not like", value, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardIn(List<String> values) {
            addCriterion("BANKCARD in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotIn(List<String> values) {
            addCriterion("BANKCARD not in", values, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardBetween(String value1, String value2) {
            addCriterion("BANKCARD between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andBankcardNotBetween(String value1, String value2) {
            addCriterion("BANKCARD not between", value1, value2, "bankcard");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNull() {
            addCriterion("ALIPAY is null");
            return (Criteria) this;
        }

        public Criteria andAlipayIsNotNull() {
            addCriterion("ALIPAY is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayEqualTo(String value) {
            addCriterion("ALIPAY =", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotEqualTo(String value) {
            addCriterion("ALIPAY <>", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThan(String value) {
            addCriterion("ALIPAY >", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayGreaterThanOrEqualTo(String value) {
            addCriterion("ALIPAY >=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThan(String value) {
            addCriterion("ALIPAY <", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLessThanOrEqualTo(String value) {
            addCriterion("ALIPAY <=", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayLike(String value) {
            addCriterion("ALIPAY like", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotLike(String value) {
            addCriterion("ALIPAY not like", value, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayIn(List<String> values) {
            addCriterion("ALIPAY in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotIn(List<String> values) {
            addCriterion("ALIPAY not in", values, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayBetween(String value1, String value2) {
            addCriterion("ALIPAY between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andAlipayNotBetween(String value1, String value2) {
            addCriterion("ALIPAY not between", value1, value2, "alipay");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("WECHAT is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("WECHAT is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("WECHAT =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("WECHAT <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("WECHAT >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("WECHAT >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("WECHAT <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("WECHAT <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("WECHAT like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("WECHAT not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("WECHAT in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("WECHAT not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("WECHAT between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("WECHAT not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Integer value) {
            addCriterion("DEPOSIT =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Integer value) {
            addCriterion("DEPOSIT <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Integer value) {
            addCriterion("DEPOSIT >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPOSIT >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Integer value) {
            addCriterion("DEPOSIT <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Integer value) {
            addCriterion("DEPOSIT <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Integer> values) {
            addCriterion("DEPOSIT in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Integer> values) {
            addCriterion("DEPOSIT not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Integer value1, Integer value2) {
            addCriterion("DEPOSIT between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPOSIT not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE	DOUBLE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE	DOUBLE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(String value) {
            addCriterion("BALANCE	DOUBLE =", value, "balance	double");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(String value) {
            addCriterion("BALANCE	DOUBLE <>", value, "balance	double");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(String value) {
            addCriterion("BALANCE	DOUBLE >", value, "balance	double");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCE	DOUBLE >=", value, "balance	double");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(String value) {
            addCriterion("BALANCE	DOUBLE <", value, "balance	double");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(String value) {
            addCriterion("BALANCE	DOUBLE <=", value, "balance	double");
            return (Criteria) this;
        }

        public Criteria andBalanceLike(String value) {
            addCriterion("BALANCE	DOUBLE like", value, "balance	double");
            return (Criteria) this;
        }

        public Criteria andBalanceNotLike(String value) {
            addCriterion("BALANCE	DOUBLE not like", value, "balance	double");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<String> values) {
            addCriterion("BALANCE	DOUBLE in", values, "balance	double");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<String> values) {
            addCriterion("BALANCE	DOUBLE not in", values, "balance	double");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(String value1, String value2) {
            addCriterion("BALANCE	DOUBLE between", value1, value2, "balance	double");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(String value1, String value2) {
            addCriterion("BALANCE	DOUBLE not between", value1, value2, "balance	double");
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