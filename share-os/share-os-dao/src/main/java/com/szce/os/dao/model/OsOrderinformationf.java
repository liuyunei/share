package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OsOrderinformationf implements Serializable {
    /**
     * 订单编号
     *
     * @mbg.generated
     */
    private String orderid;

    /**
     * 订单时间
     *
     * @mbg.generated
     */
    private Date ordertime;

    /**
     * 用户编号
     *
     * @mbg.generated
     */
    private String userid;

    /**
     * 车辆信息

     *
     * @mbg.generated
     */
    private String bikeid;

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getBikeid() {
        return bikeid;
    }

    public void setBikeid(String bikeid) {
        this.bikeid = bikeid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", userid=").append(userid);
        sb.append(", bikeid=").append(bikeid);
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
        OsOrderinformationf other = (OsOrderinformationf) that;
        return (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getOrdertime() == null ? other.getOrdertime() == null : this.getOrdertime().equals(other.getOrdertime()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getBikeid() == null ? other.getBikeid() == null : this.getBikeid().equals(other.getBikeid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getOrdertime() == null) ? 0 : getOrdertime().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getBikeid() == null) ? 0 : getBikeid().hashCode());
        return result;
    }
}