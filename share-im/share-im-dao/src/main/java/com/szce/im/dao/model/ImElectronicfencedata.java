package com.szce.im.dao.model;

import java.io.Serializable;
import java.util.Date;

public class ImElectronicfencedata implements Serializable {
    /**
     * 电子围栏编号
     *
     * @mbg.generated
     */
    private String electronicfenceid;

    /**
     * 电子围栏名称
     *
     * @mbg.generated
     */
    private String electronicfencename;

    /**
     * 位置
     *
     * @mbg.generated
     */
    private String location;

    /**
     * 面积
     *
     * @mbg.generated
     */
    private Integer area;

    /**
     * 标准停车位数量
     *
     * @mbg.generated
     */
    private Integer standardparkingnumber;

    /**
     * 电子围栏坐标
     *
     * @mbg.generated
     */
    private String coordinate;

    /**
     * 电子围栏分类编号
     *
     * @mbg.generated
     */
    private String electronicfenceclassificationid;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public String getElectronicfenceid() {
        return electronicfenceid;
    }

    public void setElectronicfenceid(String electronicfenceid) {
        this.electronicfenceid = electronicfenceid;
    }

    public String getElectronicfencename() {
        return electronicfencename;
    }

    public void setElectronicfencename(String electronicfencename) {
        this.electronicfencename = electronicfencename;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getStandardparkingnumber() {
        return standardparkingnumber;
    }

    public void setStandardparkingnumber(Integer standardparkingnumber) {
        this.standardparkingnumber = standardparkingnumber;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getElectronicfenceclassificationid() {
        return electronicfenceclassificationid;
    }

    public void setElectronicfenceclassificationid(String electronicfenceclassificationid) {
        this.electronicfenceclassificationid = electronicfenceclassificationid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", electronicfenceid=").append(electronicfenceid);
        sb.append(", electronicfencename=").append(electronicfencename);
        sb.append(", location=").append(location);
        sb.append(", area=").append(area);
        sb.append(", standardparkingnumber=").append(standardparkingnumber);
        sb.append(", coordinate=").append(coordinate);
        sb.append(", electronicfenceclassificationid=").append(electronicfenceclassificationid);
        sb.append(", createtime=").append(createtime);
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
        ImElectronicfencedata other = (ImElectronicfencedata) that;
        return (this.getElectronicfenceid() == null ? other.getElectronicfenceid() == null : this.getElectronicfenceid().equals(other.getElectronicfenceid()))
            && (this.getElectronicfencename() == null ? other.getElectronicfencename() == null : this.getElectronicfencename().equals(other.getElectronicfencename()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getStandardparkingnumber() == null ? other.getStandardparkingnumber() == null : this.getStandardparkingnumber().equals(other.getStandardparkingnumber()))
            && (this.getCoordinate() == null ? other.getCoordinate() == null : this.getCoordinate().equals(other.getCoordinate()))
            && (this.getElectronicfenceclassificationid() == null ? other.getElectronicfenceclassificationid() == null : this.getElectronicfenceclassificationid().equals(other.getElectronicfenceclassificationid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElectronicfenceid() == null) ? 0 : getElectronicfenceid().hashCode());
        result = prime * result + ((getElectronicfencename() == null) ? 0 : getElectronicfencename().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getStandardparkingnumber() == null) ? 0 : getStandardparkingnumber().hashCode());
        result = prime * result + ((getCoordinate() == null) ? 0 : getCoordinate().hashCode());
        result = prime * result + ((getElectronicfenceclassificationid() == null) ? 0 : getElectronicfenceclassificationid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }
}