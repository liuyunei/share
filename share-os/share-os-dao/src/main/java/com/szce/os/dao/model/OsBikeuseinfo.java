package com.szce.os.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OsBikeuseinfo implements Serializable {
    /**
     * 当前状态（0为闲置/1为使用/2为故障）
     *
     * @mbg.generated
     */
    private Integer currentstatue;

    /**
     * 历史使用时间
     *
     * @mbg.generated
     */
    private Date historicalusetime;

    /**
     * 历史行驶里程
     *
     * @mbg.generated
     */
    private String historicaldistance;

    /**
     * 历史收费
     *
     * @mbg.generated
     */
    private String historicalfee;

    private static final long serialVersionUID = 1L;

    public Integer getCurrentstatue() {
        return currentstatue;
    }

    public void setCurrentstatue(Integer currentstatue) {
        this.currentstatue = currentstatue;
    }

    public Date getHistoricalusetime() {
        return historicalusetime;
    }

    public void setHistoricalusetime(Date historicalusetime) {
        this.historicalusetime = historicalusetime;
    }

    public String getHistoricaldistance() {
        return historicaldistance;
    }

    public void setHistoricaldistance(String historicaldistance) {
        this.historicaldistance = historicaldistance;
    }

    public String getHistoricalfee() {
        return historicalfee;
    }

    public void setHistoricalfee(String historicalfee) {
        this.historicalfee = historicalfee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", currentstatue=").append(currentstatue);
        sb.append(", historicalusetime=").append(historicalusetime);
        sb.append(", historicaldistance=").append(historicaldistance);
        sb.append(", historicalfee=").append(historicalfee);
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
        OsBikeuseinfo other = (OsBikeuseinfo) that;
        return (this.getCurrentstatue() == null ? other.getCurrentstatue() == null : this.getCurrentstatue().equals(other.getCurrentstatue()))
            && (this.getHistoricalusetime() == null ? other.getHistoricalusetime() == null : this.getHistoricalusetime().equals(other.getHistoricalusetime()))
            && (this.getHistoricaldistance() == null ? other.getHistoricaldistance() == null : this.getHistoricaldistance().equals(other.getHistoricaldistance()))
            && (this.getHistoricalfee() == null ? other.getHistoricalfee() == null : this.getHistoricalfee().equals(other.getHistoricalfee()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCurrentstatue() == null) ? 0 : getCurrentstatue().hashCode());
        result = prime * result + ((getHistoricalusetime() == null) ? 0 : getHistoricalusetime().hashCode());
        result = prime * result + ((getHistoricaldistance() == null) ? 0 : getHistoricaldistance().hashCode());
        result = prime * result + ((getHistoricalfee() == null) ? 0 : getHistoricalfee().hashCode());
        return result;
    }
}