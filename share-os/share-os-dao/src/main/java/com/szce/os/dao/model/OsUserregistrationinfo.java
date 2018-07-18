package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class OsUserregistrationinfo implements Serializable {
    /**
     * 用户账号
     *
     * @mbg.generated
     */
    private String useraccount;

    /**
     * 身份证号
     *
     * @mbg.generated
     */
    private String idnumber;

    /**
     * 用户名字
     *
     * @mbg.generated
     */
    private String username;

    /**
     * 用户密码
     *
     * @mbg.generated
     */
    private String userpassword;

    /**
     * 企业编号（外键、MC_COMPANYBASICINFO）
     *
     * @mbg.generated
     */
    private String companyid;

    /**
     * 用户与企业之间的对应关系
     */
    private ArrayList<OsRegisterAndCompanyInfo> osRegisterAndCompanyInfos;

    /**
     * 注册时间
     *
     * @mbg.generated
     */
    private Date registrationtime;

    /**
     * 绑定银行卡号
     *
     * @mbg.generated
     */
    private String bankcard;

    /**
     * 绑定支付宝号
     *
     * @mbg.generated
     */
    private String alipay;

    /**
     * 绑定微信号
     *
     * @mbg.generated
     */
    private String wechat;

    /**
     * 押金
     *
     * @mbg.generated
     */
    private Integer deposit;

    /**
     * 余额
余额
余额
     *
     * @mbg.generated
     */
    private String balance;

    private static final long serialVersionUID = 1L;

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public Date getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(Date registrationtime) {
        this.registrationtime = registrationtime;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance	) {
        this.balance= balance	;
    }

    public ArrayList<OsRegisterAndCompanyInfo> getOsRegisterAndCompanyInfos() {
        return osRegisterAndCompanyInfos;
    }

    public void setOsRegisterAndCompanyInfos(ArrayList<OsRegisterAndCompanyInfo> osRegisterAndCompanyInfos) {
        this.osRegisterAndCompanyInfos = osRegisterAndCompanyInfos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", useraccount=").append(useraccount);
        sb.append(", idnumber=").append(idnumber);
        sb.append(", username=").append(username);
        sb.append(", userpassword=").append(userpassword);
        sb.append(", companyid=").append(companyid);
        sb.append(", registrationtime=").append(registrationtime);
        sb.append(", bankcard=").append(bankcard);
        sb.append(", alipay=").append(alipay);
        sb.append(", wechat=").append(wechat);
        sb.append(", deposit=").append(deposit);
        sb.append(", balance	double=").append(balance	);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OsUserregistrationinfo other = (OsUserregistrationinfo) that;
        return (this.getUseraccount() == null ? other.getUseraccount() == null : this.getUseraccount().equals(other.getUseraccount()))
            && (this.getIdnumber() == null ? other.getIdnumber() == null : this.getIdnumber().equals(other.getIdnumber()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getUserpassword() == null ? other.getUserpassword() == null : this.getUserpassword().equals(other.getUserpassword()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getRegistrationtime() == null ? other.getRegistrationtime() == null : this.getRegistrationtime().equals(other.getRegistrationtime()))
            && (this.getBankcard() == null ? other.getBankcard() == null : this.getBankcard().equals(other.getBankcard()))
            && (this.getAlipay() == null ? other.getAlipay() == null : this.getAlipay().equals(other.getAlipay()))
            && (this.getWechat() == null ? other.getWechat() == null : this.getWechat().equals(other.getWechat()))
            && (this.getDeposit() == null ? other.getDeposit() == null : this.getDeposit().equals(other.getDeposit()))
            && (this.getBalance	() == null ? other.getBalance	() == null : this.getBalance	().equals(other.getBalance	()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUseraccount() == null) ? 0 : getUseraccount().hashCode());
        result = prime * result + ((getIdnumber() == null) ? 0 : getIdnumber().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getUserpassword() == null) ? 0 : getUserpassword().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getRegistrationtime() == null) ? 0 : getRegistrationtime().hashCode());
        result = prime * result + ((getBankcard() == null) ? 0 : getBankcard().hashCode());
        result = prime * result + ((getAlipay() == null) ? 0 : getAlipay().hashCode());
        result = prime * result + ((getWechat() == null) ? 0 : getWechat().hashCode());
        result = prime * result + ((getDeposit() == null) ? 0 : getDeposit().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        return result;
    }
}