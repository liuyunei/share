package com.szce.im.dao.model;

import java.io.Serializable;

public class ImLogosign implements Serializable {
    /**
     * 标识标牌编号
     *
     * @mbg.generated
     */
    private String logosignid;

    /**
     * 标识标牌名称
     *
     * @mbg.generated
     */
    private String logosignname;

    /**
     * 标识标牌归属
     *
     * @mbg.generated
     */
    private String logosignbelong;

    /**
     * 标识标牌维护
     *
     * @mbg.generated
     */
    private String logosignmaintain;

    private static final long serialVersionUID = 1L;

    public String getLogosignid() {
        return logosignid;
    }

    public void setLogosignid(String logosignid) {
        this.logosignid = logosignid;
    }

    public String getLogosignname() {
        return logosignname;
    }

    public void setLogosignname(String logosignname) {
        this.logosignname = logosignname;
    }

    public String getLogosignbelong() {
        return logosignbelong;
    }

    public void setLogosignbelong(String logosignbelong) {
        this.logosignbelong = logosignbelong;
    }

    public String getLogosignmaintain() {
        return logosignmaintain;
    }

    public void setLogosignmaintain(String logosignmaintain) {
        this.logosignmaintain = logosignmaintain;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logosignid=").append(logosignid);
        sb.append(", logosignname=").append(logosignname);
        sb.append(", logosignbelong=").append(logosignbelong);
        sb.append(", logosignmaintain=").append(logosignmaintain);
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
        ImLogosign other = (ImLogosign) that;
        return (this.getLogosignid() == null ? other.getLogosignid() == null : this.getLogosignid().equals(other.getLogosignid()))
            && (this.getLogosignname() == null ? other.getLogosignname() == null : this.getLogosignname().equals(other.getLogosignname()))
            && (this.getLogosignbelong() == null ? other.getLogosignbelong() == null : this.getLogosignbelong().equals(other.getLogosignbelong()))
            && (this.getLogosignmaintain() == null ? other.getLogosignmaintain() == null : this.getLogosignmaintain().equals(other.getLogosignmaintain()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogosignid() == null) ? 0 : getLogosignid().hashCode());
        result = prime * result + ((getLogosignname() == null) ? 0 : getLogosignname().hashCode());
        result = prime * result + ((getLogosignbelong() == null) ? 0 : getLogosignbelong().hashCode());
        result = prime * result + ((getLogosignmaintain() == null) ? 0 : getLogosignmaintain().hashCode());
        return result;
    }
}