package com.szce.vtm.dao.model;

import java.io.Serializable;
import java.util.Date;

public class VtmBikebasicinfo implements Serializable {
    /**
     * 车辆编号
     *
     * @mbg.generated
     */
    private String bikeid;

    /**
     * 企业编号（外键、MC_COMPANYBASICINFO）
     *
     * @mbg.generated
     */
    private String companyid;

    /**
     * 投放时间
     *
     * @mbg.generated
     */
    private Date deliverytime;

    /**
     * 零部件配置信息
     *
     * @mbg.generated
     */
    private String configeinfo;

    /**
     * 投放静态经度
     *
     * @mbg.generated
     */
    private String staticlongitude;

    /**
     * 投放静态纬度
     *
     * @mbg.generated
     */
    private String staticlatitude;

    private static final long serialVersionUID = 1L;

    public String getBikeid() {
        return bikeid;
    }

    public void setBikeid(String bikeid) {
        this.bikeid = bikeid;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getConfigeinfo() {
        return configeinfo;
    }

    public void setConfigeinfo(String configeinfo) {
        this.configeinfo = configeinfo;
    }

    public String getStaticlongitude() {
        return staticlongitude;
    }

    public void setStaticlongitude(String staticlongitude) {
        this.staticlongitude = staticlongitude;
    }

    public String getStaticlatitude() {
        return staticlatitude;
    }

    public void setStaticlatitude(String staticlatitude) {
        this.staticlatitude = staticlatitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bikeid=").append(bikeid);
        sb.append(", companyid=").append(companyid);
        sb.append(", deliverytime=").append(deliverytime);
        sb.append(", configeinfo=").append(configeinfo);
        sb.append(", staticlongitude=").append(staticlongitude);
        sb.append(", staticlatitude=").append(staticlatitude);
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
        VtmBikebasicinfo other = (VtmBikebasicinfo) that;
        return (this.getBikeid() == null ? other.getBikeid() == null : this.getBikeid().equals(other.getBikeid()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getDeliverytime() == null ? other.getDeliverytime() == null : this.getDeliverytime().equals(other.getDeliverytime()))
            && (this.getConfigeinfo() == null ? other.getConfigeinfo() == null : this.getConfigeinfo().equals(other.getConfigeinfo()))
            && (this.getStaticlongitude() == null ? other.getStaticlongitude() == null : this.getStaticlongitude().equals(other.getStaticlongitude()))
            && (this.getStaticlatitude() == null ? other.getStaticlatitude() == null : this.getStaticlatitude().equals(other.getStaticlatitude()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBikeid() == null) ? 0 : getBikeid().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getDeliverytime() == null) ? 0 : getDeliverytime().hashCode());
        result = prime * result + ((getConfigeinfo() == null) ? 0 : getConfigeinfo().hashCode());
        result = prime * result + ((getStaticlongitude() == null) ? 0 : getStaticlongitude().hashCode());
        result = prime * result + ((getStaticlatitude() == null) ? 0 : getStaticlatitude().hashCode());
        return result;
    }
}