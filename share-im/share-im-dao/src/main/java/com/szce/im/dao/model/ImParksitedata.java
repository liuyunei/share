package com.szce.im.dao.model;

import java.io.Serializable;

public class ImParksitedata implements Serializable {
    /**
     * 停放站点编号
     *
     * @mbg.generated
     */
    private String parksitedataid;

    /**
     * 站点名称
     *
     * @mbg.generated
     */
    private String sitename;

    /**
     * 位置信息
     *
     * @mbg.generated
     */
    private String locationinfo;

    private static final long serialVersionUID = 1L;

    public String getParksitedataid() {
        return parksitedataid;
    }

    public void setParksitedataid(String parksitedataid) {
        this.parksitedataid = parksitedataid;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getLocationinfo() {
        return locationinfo;
    }

    public void setLocationinfo(String locationinfo) {
        this.locationinfo = locationinfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", parksitedataid=").append(parksitedataid);
        sb.append(", sitename=").append(sitename);
        sb.append(", locationinfo=").append(locationinfo);
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
        ImParksitedata other = (ImParksitedata) that;
        return (this.getParksitedataid() == null ? other.getParksitedataid() == null : this.getParksitedataid().equals(other.getParksitedataid()))
            && (this.getSitename() == null ? other.getSitename() == null : this.getSitename().equals(other.getSitename()))
            && (this.getLocationinfo() == null ? other.getLocationinfo() == null : this.getLocationinfo().equals(other.getLocationinfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getParksitedataid() == null) ? 0 : getParksitedataid().hashCode());
        result = prime * result + ((getSitename() == null) ? 0 : getSitename().hashCode());
        result = prime * result + ((getLocationinfo() == null) ? 0 : getLocationinfo().hashCode());
        return result;
    }
}