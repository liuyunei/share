package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OsCustodyinformation implements Serializable {
    /**
     * 管养信息表编号
     *
     * @mbg.generated
     */
    private String custodyinformationid;

    /**
     * 公司名称
     *
     * @mbg.generated
     */
    private String companyname;

    /**
     * 管养车辆编号
     *
     * @mbg.generated
     */
    private String custodybikeid;

    /**
     * 车辆问题分类
     *
     * @mbg.generated
     */
    private String breakdownsort;

    /**
     * 管养开始时间
     *
     * @mbg.generated
     */
    private Date custodystarttime;

    /**
     * 管养结束时间
     *
     * @mbg.generated
     */
    private Date custodyendtime;

    /**
     * 重新投放时间
     *
     * @mbg.generated
     */
    private Date returntime;

    private static final long serialVersionUID = 1L;

    public String getCustodyinformationid() {
        return custodyinformationid;
    }

    public void setCustodyinformationid(String custodyinformationid) {
        this.custodyinformationid = custodyinformationid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCustodybikeid() {
        return custodybikeid;
    }

    public void setCustodybikeid(String custodybikeid) {
        this.custodybikeid = custodybikeid;
    }

    public String getBreakdownsort() {
        return breakdownsort;
    }

    public void setBreakdownsort(String breakdownsort) {
        this.breakdownsort = breakdownsort;
    }

    public Date getCustodystarttime() {
        return custodystarttime;
    }

    public void setCustodystarttime(Date custodystarttime) {
        this.custodystarttime = custodystarttime;
    }

    public Date getCustodyendtime() {
        return custodyendtime;
    }

    public void setCustodyendtime(Date custodyendtime) {
        this.custodyendtime = custodyendtime;
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custodyinformationid=").append(custodyinformationid);
        sb.append(", companyname=").append(companyname);
        sb.append(", custodybikeid=").append(custodybikeid);
        sb.append(", breakdownsort=").append(breakdownsort);
        sb.append(", custodystarttime=").append(custodystarttime);
        sb.append(", custodyendtime=").append(custodyendtime);
        sb.append(", returntime=").append(returntime);
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
        OsCustodyinformation other = (OsCustodyinformation) that;
        return (this.getCustodyinformationid() == null ? other.getCustodyinformationid() == null : this.getCustodyinformationid().equals(other.getCustodyinformationid()))
            && (this.getCompanyname() == null ? other.getCompanyname() == null : this.getCompanyname().equals(other.getCompanyname()))
            && (this.getCustodybikeid() == null ? other.getCustodybikeid() == null : this.getCustodybikeid().equals(other.getCustodybikeid()))
            && (this.getBreakdownsort() == null ? other.getBreakdownsort() == null : this.getBreakdownsort().equals(other.getBreakdownsort()))
            && (this.getCustodystarttime() == null ? other.getCustodystarttime() == null : this.getCustodystarttime().equals(other.getCustodystarttime()))
            && (this.getCustodyendtime() == null ? other.getCustodyendtime() == null : this.getCustodyendtime().equals(other.getCustodyendtime()))
            && (this.getReturntime() == null ? other.getReturntime() == null : this.getReturntime().equals(other.getReturntime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustodyinformationid() == null) ? 0 : getCustodyinformationid().hashCode());
        result = prime * result + ((getCompanyname() == null) ? 0 : getCompanyname().hashCode());
        result = prime * result + ((getCustodybikeid() == null) ? 0 : getCustodybikeid().hashCode());
        result = prime * result + ((getBreakdownsort() == null) ? 0 : getBreakdownsort().hashCode());
        result = prime * result + ((getCustodystarttime() == null) ? 0 : getCustodystarttime().hashCode());
        result = prime * result + ((getCustodyendtime() == null) ? 0 : getCustodyendtime().hashCode());
        result = prime * result + ((getReturntime() == null) ? 0 : getReturntime().hashCode());
        return result;
    }
}