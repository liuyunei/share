package com.szce.os.dao.model;

import java.io.Serializable;

public class OsDeposit implements Serializable {
    /**
     * 押金表编号
     *
     * @mbg.generated
     */
    private String depositid;

    /**
     * 押金总额
     *
     * @mbg.generated
     */
    private Integer depositnumber;

    /**
     * 押金来源
     *
     * @mbg.generated
     */
    private String depositsource;

    private static final long serialVersionUID = 1L;

    public String getDepositid() {
        return depositid;
    }

    public void setDepositid(String depositid) {
        this.depositid = depositid;
    }

    public Integer getDepositnumber() {
        return depositnumber;
    }

    public void setDepositnumber(Integer depositnumber) {
        this.depositnumber = depositnumber;
    }

    public String getDepositsource() {
        return depositsource;
    }

    public void setDepositsource(String depositsource) {
        this.depositsource = depositsource;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", depositid=").append(depositid);
        sb.append(", depositnumber=").append(depositnumber);
        sb.append(", depositsource=").append(depositsource);
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
        OsDeposit other = (OsDeposit) that;
        return (this.getDepositid() == null ? other.getDepositid() == null : this.getDepositid().equals(other.getDepositid()))
            && (this.getDepositnumber() == null ? other.getDepositnumber() == null : this.getDepositnumber().equals(other.getDepositnumber()))
            && (this.getDepositsource() == null ? other.getDepositsource() == null : this.getDepositsource().equals(other.getDepositsource()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDepositid() == null) ? 0 : getDepositid().hashCode());
        result = prime * result + ((getDepositnumber() == null) ? 0 : getDepositnumber().hashCode());
        result = prime * result + ((getDepositsource() == null) ? 0 : getDepositsource().hashCode());
        return result;
    }
}