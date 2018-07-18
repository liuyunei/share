package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OsOperationinformation implements Serializable {
    /**
     * 运营信息编号
     *
     * @mbg.generated
     */
    private String operationinformationid;

    /**
     * 里程
     *
     * @mbg.generated
     */
    private String mileage;

    /**
     * 开锁时间
     *
     * @mbg.generated
     */
    private Date unlocktime;

    /**
     * 上锁时间
     *
     * @mbg.generated
     */
    private Date locktime;

    /**
     * 金额
     *
     * @mbg.generated
     */
    private Double aomunt;

    /**
     * 运营类型
     *
     * @mbg.generated
     */
    private String type;

    private static final long serialVersionUID = 1L;

    public String getOperationinformationid() {
        return operationinformationid;
    }

    public void setOperationinformationid(String operationinformationid) {
        this.operationinformationid = operationinformationid;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Date getUnlocktime() {
        return unlocktime;
    }

    public void setUnlocktime(Date unlocktime) {
        this.unlocktime = unlocktime;
    }

    public Date getLocktime() {
        return locktime;
    }

    public void setLocktime(Date locktime) {
        this.locktime = locktime;
    }

    public Double getAomunt	() {
        return aomunt	;
    }

    public void setAomunt	(Double aomunt	) {
        this.aomunt	 = aomunt	;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operationinformationid=").append(operationinformationid);
        sb.append(", mileage=").append(mileage);
        sb.append(", unlocktime=").append(unlocktime);
        sb.append(", locktime=").append(locktime);
        sb.append(", aomunt	floa=").append(aomunt	);
        sb.append(", type=").append(type);
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
        OsOperationinformation other = (OsOperationinformation) that;
        return (this.getOperationinformationid() == null ? other.getOperationinformationid() == null : this.getOperationinformationid().equals(other.getOperationinformationid()))
            && (this.getMileage() == null ? other.getMileage() == null : this.getMileage().equals(other.getMileage()))
            && (this.getUnlocktime() == null ? other.getUnlocktime() == null : this.getUnlocktime().equals(other.getUnlocktime()))
            && (this.getLocktime() == null ? other.getLocktime() == null : this.getLocktime().equals(other.getLocktime()))
            && (this.getAomunt	() == null ? other.getAomunt	() == null : this.getAomunt	().equals(other.getAomunt	()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperationinformationid() == null) ? 0 : getOperationinformationid().hashCode());
        result = prime * result + ((getMileage() == null) ? 0 : getMileage().hashCode());
        result = prime * result + ((getUnlocktime() == null) ? 0 : getUnlocktime().hashCode());
        result = prime * result + ((getLocktime() == null) ? 0 : getLocktime().hashCode());
        result = prime * result + ((getAomunt	() == null) ? 0 : getAomunt	().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }
}