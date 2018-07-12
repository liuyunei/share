package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OsCompanybasicinfo implements Serializable {
    /**
     * 企业编号
     *
     * @mbg.generated
     */
    private String companyid;

    /**
     * 企业名称
     *
     * @mbg.generated
     */
    private String compayname;

    /**
     * 注册资本
     *
     * @mbg.generated
     */
    private Double registeredcapital;

    /**
     * 法人代表
     *
     * @mbg.generated
     */
    private String legalrepresentative;

    /**
     * 注册时间
     *
     * @mbg.generated
     */
    private Date registrationtime;

    /**
     * 工商注册号
     *
     * @mbg.generated
     */
    private String businessregistrationnumber;

    /**
     * 组织机构代码
     *
     * @mbg.generated
     */
    private String organizationcodej;

    /**
     * 统一信用代码
     *
     * @mbg.generated
     */
    private String unifiedcreditcode;

    /**
     * 企业运营状态
     *
     * @mbg.generated
     */
    private String businessoperationstatus;

    /**
     * 企业高管
     *
     * @mbg.generated
     */
    private String businessexecutives;

    /**
     * 城市运营负责人
     *
     * @mbg.generated
     */
    private String cityoperationmanager;

    /**
     * 联系电话
     *
     * @mbg.generated
     */
    private Integer contactnumber;

    /**
     * 企业邮箱
     *
     * @mbg.generated
     */
    private String eMail;

    private static final long serialVersionUID = 1L;

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getCompayname() {
        return compayname;
    }

    public void setCompayname(String compayname) {
        this.compayname = compayname;
    }

    public Double getRegisteredcapital() {
        return registeredcapital;
    }

    public void setRegisteredcapital(Double registeredcapital) {
        this.registeredcapital = registeredcapital;
    }

    public String getLegalrepresentative() {
        return legalrepresentative;
    }

    public void setLegalrepresentative(String legalrepresentative) {
        this.legalrepresentative = legalrepresentative;
    }

    public Date getRegistrationtime() {
        return registrationtime;
    }

    public void setRegistrationtime(Date registrationtime) {
        this.registrationtime = registrationtime;
    }

    public String getBusinessregistrationnumber() {
        return businessregistrationnumber;
    }

    public void setBusinessregistrationnumber(String businessregistrationnumber) {
        this.businessregistrationnumber = businessregistrationnumber;
    }

    public String getOrganizationcodej() {
        return organizationcodej;
    }

    public void setOrganizationcodej(String organizationcodej) {
        this.organizationcodej = organizationcodej;
    }

    public String getUnifiedcreditcode() {
        return unifiedcreditcode;
    }

    public void setUnifiedcreditcode(String unifiedcreditcode) {
        this.unifiedcreditcode = unifiedcreditcode;
    }

    public String getBusinessoperationstatus() {
        return businessoperationstatus;
    }

    public void setBusinessoperationstatus(String businessoperationstatus) {
        this.businessoperationstatus = businessoperationstatus;
    }

    public String getBusinessexecutives() {
        return businessexecutives;
    }

    public void setBusinessexecutives(String businessexecutives) {
        this.businessexecutives = businessexecutives;
    }

    public String getCityoperationmanager() {
        return cityoperationmanager;
    }

    public void setCityoperationmanager(String cityoperationmanager) {
        this.cityoperationmanager = cityoperationmanager;
    }

    public Integer getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(Integer contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyid=").append(companyid);
        sb.append(", compayname=").append(compayname);
        sb.append(", registeredcapital=").append(registeredcapital);
        sb.append(", legalrepresentative=").append(legalrepresentative);
        sb.append(", registrationtime=").append(registrationtime);
        sb.append(", businessregistrationnumber=").append(businessregistrationnumber);
        sb.append(", organizationcodej=").append(organizationcodej);
        sb.append(", unifiedcreditcode=").append(unifiedcreditcode);
        sb.append(", businessoperationstatus=").append(businessoperationstatus);
        sb.append(", businessexecutives=").append(businessexecutives);
        sb.append(", cityoperationmanager=").append(cityoperationmanager);
        sb.append(", contactnumber=").append(contactnumber);
        sb.append(", eMail=").append(eMail);
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
        OsCompanybasicinfo other = (OsCompanybasicinfo) that;
        return (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getCompayname() == null ? other.getCompayname() == null : this.getCompayname().equals(other.getCompayname()))
            && (this.getRegisteredcapital() == null ? other.getRegisteredcapital() == null : this.getRegisteredcapital().equals(other.getRegisteredcapital()))
            && (this.getLegalrepresentative() == null ? other.getLegalrepresentative() == null : this.getLegalrepresentative().equals(other.getLegalrepresentative()))
            && (this.getRegistrationtime() == null ? other.getRegistrationtime() == null : this.getRegistrationtime().equals(other.getRegistrationtime()))
            && (this.getBusinessregistrationnumber() == null ? other.getBusinessregistrationnumber() == null : this.getBusinessregistrationnumber().equals(other.getBusinessregistrationnumber()))
            && (this.getOrganizationcodej() == null ? other.getOrganizationcodej() == null : this.getOrganizationcodej().equals(other.getOrganizationcodej()))
            && (this.getUnifiedcreditcode() == null ? other.getUnifiedcreditcode() == null : this.getUnifiedcreditcode().equals(other.getUnifiedcreditcode()))
            && (this.getBusinessoperationstatus() == null ? other.getBusinessoperationstatus() == null : this.getBusinessoperationstatus().equals(other.getBusinessoperationstatus()))
            && (this.getBusinessexecutives() == null ? other.getBusinessexecutives() == null : this.getBusinessexecutives().equals(other.getBusinessexecutives()))
            && (this.getCityoperationmanager() == null ? other.getCityoperationmanager() == null : this.getCityoperationmanager().equals(other.getCityoperationmanager()))
            && (this.getContactnumber() == null ? other.getContactnumber() == null : this.getContactnumber().equals(other.getContactnumber()))
            && (this.geteMail() == null ? other.geteMail() == null : this.geteMail().equals(other.geteMail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getCompayname() == null) ? 0 : getCompayname().hashCode());
        result = prime * result + ((getRegisteredcapital() == null) ? 0 : getRegisteredcapital().hashCode());
        result = prime * result + ((getLegalrepresentative() == null) ? 0 : getLegalrepresentative().hashCode());
        result = prime * result + ((getRegistrationtime() == null) ? 0 : getRegistrationtime().hashCode());
        result = prime * result + ((getBusinessregistrationnumber() == null) ? 0 : getBusinessregistrationnumber().hashCode());
        result = prime * result + ((getOrganizationcodej() == null) ? 0 : getOrganizationcodej().hashCode());
        result = prime * result + ((getUnifiedcreditcode() == null) ? 0 : getUnifiedcreditcode().hashCode());
        result = prime * result + ((getBusinessoperationstatus() == null) ? 0 : getBusinessoperationstatus().hashCode());
        result = prime * result + ((getBusinessexecutives() == null) ? 0 : getBusinessexecutives().hashCode());
        result = prime * result + ((getCityoperationmanager() == null) ? 0 : getCityoperationmanager().hashCode());
        result = prime * result + ((getContactnumber() == null) ? 0 : getContactnumber().hashCode());
        result = prime * result + ((geteMail() == null) ? 0 : geteMail().hashCode());
        return result;
    }
}