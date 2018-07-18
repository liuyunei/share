package com.szce.im.dao.model;

import java.io.Serializable;

public class ImMaintenancesitedata implements Serializable {
    /**
     * 维护场地数据编号
     *
     * @mbg.generated
     */
    private String maintenancesitedataid;

    /**
     * 公司名称
     *
     * @mbg.generated
     */
    private String companyname;

    /**
     * 场地位置
     *
     * @mbg.generated
     */
    private String maintenancesiteposition;

    /**
     * 场地面积
     *
     * @mbg.generated
     */
    private String maintenancesitearea;

    private static final long serialVersionUID = 1L;

    public String getMaintenancesitedataid() {
        return maintenancesitedataid;
    }

    public void setMaintenancesitedataid(String maintenancesitedataid) {
        this.maintenancesitedataid = maintenancesitedataid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getMaintenancesiteposition() {
        return maintenancesiteposition;
    }

    public void setMaintenancesiteposition(String maintenancesiteposition) {
        this.maintenancesiteposition = maintenancesiteposition;
    }

    public String getMaintenancesitearea() {
        return maintenancesitearea;
    }

    public void setMaintenancesitearea(String maintenancesitearea) {
        this.maintenancesitearea = maintenancesitearea;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", maintenancesitedataid=").append(maintenancesitedataid);
        sb.append(", companyname=").append(companyname);
        sb.append(", maintenancesiteposition=").append(maintenancesiteposition);
        sb.append(", maintenancesitearea=").append(maintenancesitearea);
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
        ImMaintenancesitedata other = (ImMaintenancesitedata) that;
        return (this.getMaintenancesitedataid() == null ? other.getMaintenancesitedataid() == null : this.getMaintenancesitedataid().equals(other.getMaintenancesitedataid()))
            && (this.getCompanyname() == null ? other.getCompanyname() == null : this.getCompanyname().equals(other.getCompanyname()))
            && (this.getMaintenancesiteposition() == null ? other.getMaintenancesiteposition() == null : this.getMaintenancesiteposition().equals(other.getMaintenancesiteposition()))
            && (this.getMaintenancesitearea() == null ? other.getMaintenancesitearea() == null : this.getMaintenancesitearea().equals(other.getMaintenancesitearea()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMaintenancesitedataid() == null) ? 0 : getMaintenancesitedataid().hashCode());
        result = prime * result + ((getCompanyname() == null) ? 0 : getCompanyname().hashCode());
        result = prime * result + ((getMaintenancesiteposition() == null) ? 0 : getMaintenancesiteposition().hashCode());
        result = prime * result + ((getMaintenancesitearea() == null) ? 0 : getMaintenancesitearea().hashCode());
        return result;
    }
}