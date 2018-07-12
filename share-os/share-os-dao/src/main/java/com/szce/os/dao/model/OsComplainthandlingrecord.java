package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OsComplainthandlingrecord implements Serializable {
    /**
     * 投诉处理记录编号
     *
     * @mbg.generated
     */
    private String complainthandlingrecordid;

    /**
     * 用户账号（外键，MC_USERREGISTRATIONINFO）
     *
     * @mbg.generated
     */
    private String useraccount;

    /**
     * 企业编号（外键、MC_COMPANYBASICINFO）
     *
     * @mbg.generated
     */
    private String companyid;

    /**
     * 投诉类型
     *
     * @mbg.generated
     */
    private String complainttype;

    /**
     * 投诉问题
     *
     * @mbg.generated
     */
    private String complaintissue;

    /**
     * 投诉时间
     *
     * @mbg.generated
     */
    private Date compainttime;

    /**
     * 投诉处理人员编号
     *
     * @mbg.generated
     */
    private String dealerid;

    /**
     * 处理结果
     *
     * @mbg.generated
     */
    private String handleresult;

    /**
     * 处理时间
     *
     * @mbg.generated
     */
    private Date handletime;

    private static final long serialVersionUID = 1L;

    public String getComplainthandlingrecordid() {
        return complainthandlingrecordid;
    }

    public void setComplainthandlingrecordid(String complainthandlingrecordid) {
        this.complainthandlingrecordid = complainthandlingrecordid;
    }

    public String getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(String useraccount) {
        this.useraccount = useraccount;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getComplainttype() {
        return complainttype;
    }

    public void setComplainttype(String complainttype) {
        this.complainttype = complainttype;
    }

    public String getComplaintissue() {
        return complaintissue;
    }

    public void setComplaintissue(String complaintissue) {
        this.complaintissue = complaintissue;
    }

    public Date getCompainttime() {
        return compainttime;
    }

    public void setCompainttime(Date compainttime) {
        this.compainttime = compainttime;
    }

    public String getDealerid() {
        return dealerid;
    }

    public void setDealerid(String dealerid) {
        this.dealerid = dealerid;
    }

    public String getHandleresult() {
        return handleresult;
    }

    public void setHandleresult(String handleresult) {
        this.handleresult = handleresult;
    }

    public Date getHandletime() {
        return handletime;
    }

    public void setHandletime(Date handletime) {
        this.handletime = handletime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", complainthandlingrecordid=").append(complainthandlingrecordid);
        sb.append(", useraccount=").append(useraccount);
        sb.append(", companyid=").append(companyid);
        sb.append(", complainttype=").append(complainttype);
        sb.append(", complaintissue=").append(complaintissue);
        sb.append(", compainttime=").append(compainttime);
        sb.append(", dealerid=").append(dealerid);
        sb.append(", handleresult=").append(handleresult);
        sb.append(", handletime=").append(handletime);
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
        OsComplainthandlingrecord other = (OsComplainthandlingrecord) that;
        return (this.getComplainthandlingrecordid() == null ? other.getComplainthandlingrecordid() == null : this.getComplainthandlingrecordid().equals(other.getComplainthandlingrecordid()))
            && (this.getUseraccount() == null ? other.getUseraccount() == null : this.getUseraccount().equals(other.getUseraccount()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getComplainttype() == null ? other.getComplainttype() == null : this.getComplainttype().equals(other.getComplainttype()))
            && (this.getComplaintissue() == null ? other.getComplaintissue() == null : this.getComplaintissue().equals(other.getComplaintissue()))
            && (this.getCompainttime() == null ? other.getCompainttime() == null : this.getCompainttime().equals(other.getCompainttime()))
            && (this.getDealerid() == null ? other.getDealerid() == null : this.getDealerid().equals(other.getDealerid()))
            && (this.getHandleresult() == null ? other.getHandleresult() == null : this.getHandleresult().equals(other.getHandleresult()))
            && (this.getHandletime() == null ? other.getHandletime() == null : this.getHandletime().equals(other.getHandletime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getComplainthandlingrecordid() == null) ? 0 : getComplainthandlingrecordid().hashCode());
        result = prime * result + ((getUseraccount() == null) ? 0 : getUseraccount().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getComplainttype() == null) ? 0 : getComplainttype().hashCode());
        result = prime * result + ((getComplaintissue() == null) ? 0 : getComplaintissue().hashCode());
        result = prime * result + ((getCompainttime() == null) ? 0 : getCompainttime().hashCode());
        result = prime * result + ((getDealerid() == null) ? 0 : getDealerid().hashCode());
        result = prime * result + ((getHandleresult() == null) ? 0 : getHandleresult().hashCode());
        result = prime * result + ((getHandletime() == null) ? 0 : getHandletime().hashCode());
        return result;
    }
}