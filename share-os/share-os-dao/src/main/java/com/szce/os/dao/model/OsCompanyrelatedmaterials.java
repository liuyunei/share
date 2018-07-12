package com.szce.os.dao.model;

import java.io.Serializable;

public class OsCompanyrelatedmaterials implements Serializable {
    /**
     * 相关材料表编号
     *
     * @mbg.generated
     */
    private String companyrelatedmaterialsid;

    /**
     * 公司编号
     *
     * @mbg.generated
     */
    private String companyid;

    /**
     * 车辆质检报告证明数据
     *
     * @mbg.generated
     */
    private String bikequalityinspectionreportcertificationdata;

    /**
     * 运营服务协议
     *
     * @mbg.generated
     */
    private String operationalserviceagreement;

    /**
     * 意外伤害险/第三责任险
     *
     * @mbg.generated
     */
    private String accidentalinjuryinsurance;

    /**
     * 服务承诺
     *
     * @mbg.generated
     */
    private String pledge;

    /**
     * 赔偿制度
     *
     * @mbg.generated
     */
    private String compensationsystem;

    private static final long serialVersionUID = 1L;

    public String getCompanyrelatedmaterialsid() {
        return companyrelatedmaterialsid;
    }

    public void setCompanyrelatedmaterialsid(String companyrelatedmaterialsid) {
        this.companyrelatedmaterialsid = companyrelatedmaterialsid;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getBikequalityinspectionreportcertificationdata() {
        return bikequalityinspectionreportcertificationdata;
    }

    public void setBikequalityinspectionreportcertificationdata(String bikequalityinspectionreportcertificationdata) {
        this.bikequalityinspectionreportcertificationdata = bikequalityinspectionreportcertificationdata;
    }

    public String getOperationalserviceagreement() {
        return operationalserviceagreement;
    }

    public void setOperationalserviceagreement(String operationalserviceagreement) {
        this.operationalserviceagreement = operationalserviceagreement;
    }

    public String getAccidentalinjuryinsurance() {
        return accidentalinjuryinsurance;
    }

    public void setAccidentalinjuryinsurance(String accidentalinjuryinsurance) {
        this.accidentalinjuryinsurance = accidentalinjuryinsurance;
    }

    public String getPledge() {
        return pledge;
    }

    public void setPledge(String pledge) {
        this.pledge = pledge;
    }

    public String getCompensationsystem() {
        return compensationsystem;
    }

    public void setCompensationsystem(String compensationsystem) {
        this.compensationsystem = compensationsystem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", companyrelatedmaterialsid=").append(companyrelatedmaterialsid);
        sb.append(", companyid=").append(companyid);
        sb.append(", bikequalityinspectionreportcertificationdata=").append(bikequalityinspectionreportcertificationdata);
        sb.append(", operationalserviceagreement=").append(operationalserviceagreement);
        sb.append(", accidentalinjuryinsurance=").append(accidentalinjuryinsurance);
        sb.append(", pledge=").append(pledge);
        sb.append(", compensationsystem=").append(compensationsystem);
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
        OsCompanyrelatedmaterials other = (OsCompanyrelatedmaterials) that;
        return (this.getCompanyrelatedmaterialsid() == null ? other.getCompanyrelatedmaterialsid() == null : this.getCompanyrelatedmaterialsid().equals(other.getCompanyrelatedmaterialsid()))
            && (this.getCompanyid() == null ? other.getCompanyid() == null : this.getCompanyid().equals(other.getCompanyid()))
            && (this.getBikequalityinspectionreportcertificationdata() == null ? other.getBikequalityinspectionreportcertificationdata() == null : this.getBikequalityinspectionreportcertificationdata().equals(other.getBikequalityinspectionreportcertificationdata()))
            && (this.getOperationalserviceagreement() == null ? other.getOperationalserviceagreement() == null : this.getOperationalserviceagreement().equals(other.getOperationalserviceagreement()))
            && (this.getAccidentalinjuryinsurance() == null ? other.getAccidentalinjuryinsurance() == null : this.getAccidentalinjuryinsurance().equals(other.getAccidentalinjuryinsurance()))
            && (this.getPledge() == null ? other.getPledge() == null : this.getPledge().equals(other.getPledge()))
            && (this.getCompensationsystem() == null ? other.getCompensationsystem() == null : this.getCompensationsystem().equals(other.getCompensationsystem()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompanyrelatedmaterialsid() == null) ? 0 : getCompanyrelatedmaterialsid().hashCode());
        result = prime * result + ((getCompanyid() == null) ? 0 : getCompanyid().hashCode());
        result = prime * result + ((getBikequalityinspectionreportcertificationdata() == null) ? 0 : getBikequalityinspectionreportcertificationdata().hashCode());
        result = prime * result + ((getOperationalserviceagreement() == null) ? 0 : getOperationalserviceagreement().hashCode());
        result = prime * result + ((getAccidentalinjuryinsurance() == null) ? 0 : getAccidentalinjuryinsurance().hashCode());
        result = prime * result + ((getPledge() == null) ? 0 : getPledge().hashCode());
        result = prime * result + ((getCompensationsystem() == null) ? 0 : getCompensationsystem().hashCode());
        return result;
    }
}