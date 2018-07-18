package com.szce.os.dao.model;

import java.io.Serializable;

public class OsBillmethod implements Serializable {
    /**
     * 计费方式表编号
     *
     * @mbg.generated
     */
    private String billmethodid;

    /**
     * 计费方式
     *
     * @mbg.generated
     */
    private String billmethod;

    private static final long serialVersionUID = 1L;

    public String getBillmethodid() {
        return billmethodid;
    }

    public void setBillmethodid(String billmethodid) {
        this.billmethodid = billmethodid;
    }

    public String getBillmethod() {
        return billmethod;
    }

    public void setBillmethod(String billmethod) {
        this.billmethod = billmethod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", billmethodid=").append(billmethodid);
        sb.append(", billmethod=").append(billmethod);
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
        OsBillmethod other = (OsBillmethod) that;
        return (this.getBillmethodid() == null ? other.getBillmethodid() == null : this.getBillmethodid().equals(other.getBillmethodid()))
            && (this.getBillmethod() == null ? other.getBillmethod() == null : this.getBillmethod().equals(other.getBillmethod()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBillmethodid() == null) ? 0 : getBillmethodid().hashCode());
        result = prime * result + ((getBillmethod() == null) ? 0 : getBillmethod().hashCode());
        return result;
    }
}