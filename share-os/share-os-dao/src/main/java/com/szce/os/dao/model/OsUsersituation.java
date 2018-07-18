package com.szce.os.dao.model;

import java.io.Serializable;

public class OsUsersituation implements Serializable {
    /**
     * 用户情况表编号
     *
     * @mbg.generated
     */
    private String usersituationid;

    /**
     * 公司名称
     *
     * @mbg.generated
     */
    private String companyname;

    /**
     * 用户数量
     *
     * @mbg.generated
     */
    private Integer usernumber;

    private static final long serialVersionUID = 1L;

    public String getUsersituationid() {
        return usersituationid;
    }

    public void setUsersituationid(String usersituationid) {
        this.usersituationid = usersituationid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public Integer getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(Integer usernumber) {
        this.usernumber = usernumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usersituationid=").append(usersituationid);
        sb.append(", companyname=").append(companyname);
        sb.append(", usernumber=").append(usernumber);
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
        OsUsersituation other = (OsUsersituation) that;
        return (this.getUsersituationid() == null ? other.getUsersituationid() == null : this.getUsersituationid().equals(other.getUsersituationid()))
            && (this.getCompanyname() == null ? other.getCompanyname() == null : this.getCompanyname().equals(other.getCompanyname()))
            && (this.getUsernumber() == null ? other.getUsernumber() == null : this.getUsernumber().equals(other.getUsernumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsersituationid() == null) ? 0 : getUsersituationid().hashCode());
        result = prime * result + ((getCompanyname() == null) ? 0 : getCompanyname().hashCode());
        result = prime * result + ((getUsernumber() == null) ? 0 : getUsernumber().hashCode());
        return result;
    }
}