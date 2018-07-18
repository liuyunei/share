package com.szce.im.dao.model;

import java.io.Serializable;

public class ImBikeway implements Serializable {
    /**
     * 自行车道名称
     *
     * @mbg.generated
     */
    private String bikewayid;

    private String bikewayname;

    /**
     * 自行车道类型
     *
     * @mbg.generated
     */
    private String bikewaycategory;

    /**
     * 铺装
     *
     * @mbg.generated
     */
    private String pavement;

    /**
     * 运维主体
     *
     * @mbg.generated
     */
    private String operationsubject;

    /**
     * 设施状况
     *
     * @mbg.generated
     */
    private String facilitystatus;

    private static final long serialVersionUID = 1L;

    public String getBikewayid() {
        return bikewayid;
    }

    public void setBikewayid(String bikewayid) {
        this.bikewayid = bikewayid;
    }

    public String getBikewayname() {
        return bikewayname;
    }

    public void setBikewayname(String bikewayname) {
        this.bikewayname = bikewayname;
    }

    public String getBikewaycategory() {
        return bikewaycategory;
    }

    public void setBikewaycategory(String bikewaycategory) {
        this.bikewaycategory = bikewaycategory;
    }

    public String getPavement() {
        return pavement;
    }

    public void setPavement(String pavement) {
        this.pavement = pavement;
    }

    public String getOperationsubject() {
        return operationsubject;
    }

    public void setOperationsubject(String operationsubject) {
        this.operationsubject = operationsubject;
    }

    public String getFacilitystatus() {
        return facilitystatus;
    }

    public void setFacilitystatus(String facilitystatus) {
        this.facilitystatus = facilitystatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bikewayid=").append(bikewayid);
        sb.append(", bikewayname=").append(bikewayname);
        sb.append(", bikewaycategory=").append(bikewaycategory);
        sb.append(", pavement=").append(pavement);
        sb.append(", operationsubject=").append(operationsubject);
        sb.append(", facilitystatus=").append(facilitystatus);
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
        ImBikeway other = (ImBikeway) that;
        return (this.getBikewayid() == null ? other.getBikewayid() == null : this.getBikewayid().equals(other.getBikewayid()))
            && (this.getBikewayname() == null ? other.getBikewayname() == null : this.getBikewayname().equals(other.getBikewayname()))
            && (this.getBikewaycategory() == null ? other.getBikewaycategory() == null : this.getBikewaycategory().equals(other.getBikewaycategory()))
            && (this.getPavement() == null ? other.getPavement() == null : this.getPavement().equals(other.getPavement()))
            && (this.getOperationsubject() == null ? other.getOperationsubject() == null : this.getOperationsubject().equals(other.getOperationsubject()))
            && (this.getFacilitystatus() == null ? other.getFacilitystatus() == null : this.getFacilitystatus().equals(other.getFacilitystatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBikewayid() == null) ? 0 : getBikewayid().hashCode());
        result = prime * result + ((getBikewayname() == null) ? 0 : getBikewayname().hashCode());
        result = prime * result + ((getBikewaycategory() == null) ? 0 : getBikewaycategory().hashCode());
        result = prime * result + ((getPavement() == null) ? 0 : getPavement().hashCode());
        result = prime * result + ((getOperationsubject() == null) ? 0 : getOperationsubject().hashCode());
        result = prime * result + ((getFacilitystatus() == null) ? 0 : getFacilitystatus().hashCode());
        return result;
    }
}