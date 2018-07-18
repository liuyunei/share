package com.szce.im.dao.model;

import java.io.Serializable;
import java.util.Date;

public class ImElectronicfenceclassification implements Serializable {
    /**
     * 电子围栏分类编号
     *
     * @mbg.generated
     */
    private String electronicfenceclassificationid;

    /**
     * 电子围栏分类名称
     *
     * @mbg.generated
     */
    private String electronicfenceclassificationname;

    /**
     * 记录创建时间
     *
     * @mbg.generated
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public String getElectronicfenceclassificationid() {
        return electronicfenceclassificationid;
    }

    public void setElectronicfenceclassificationid(String electronicfenceclassificationid) {
        this.electronicfenceclassificationid = electronicfenceclassificationid;
    }

    public String getElectronicfenceclassificationname() {
        return electronicfenceclassificationname;
    }

    public void setElectronicfenceclassificationname(String electronicfenceclassificationname) {
        this.electronicfenceclassificationname = electronicfenceclassificationname;
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
        sb.append(", electronicfenceclassificationid=").append(electronicfenceclassificationid);
        sb.append(", electronicfenceclassificationname=").append(electronicfenceclassificationname);
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
        ImElectronicfenceclassification other = (ImElectronicfenceclassification) that;
        return (this.getElectronicfenceclassificationid() == null ? other.getElectronicfenceclassificationid() == null : this.getElectronicfenceclassificationid().equals(other.getElectronicfenceclassificationid()))
            && (this.getElectronicfenceclassificationname() == null ? other.getElectronicfenceclassificationname() == null : this.getElectronicfenceclassificationname().equals(other.getElectronicfenceclassificationname()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getElectronicfenceclassificationid() == null) ? 0 : getElectronicfenceclassificationid().hashCode());
        result = prime * result + ((getElectronicfenceclassificationname() == null) ? 0 : getElectronicfenceclassificationname().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        return result;
    }
}