package com.szce.os.dao.model;

import java.io.Serializable;

public class OsUserreview implements Serializable {
    /**
     * 用户评价编号
     *
     * @mbg.generated
     */
    private String reviewid;

    /**
     * 订单编号（外键，MC_USERORDER）
     *
     * @mbg.generated
     */
    private String orderid;

    /**
     * 评价类型
     *
     * @mbg.generated
     */
    private String reviewtype;

    /**
     * 评分
     *
     * @mbg.generated
     */
    private Integer rating;

    /**
     * 评价内容
     *
     * @mbg.generated
     */
    private String reviewcontent;

    private static final long serialVersionUID = 1L;

    public String getReviewid() {
        return reviewid;
    }

    public void setReviewid(String reviewid) {
        this.reviewid = reviewid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getReviewtype() {
        return reviewtype;
    }

    public void setReviewtype(String reviewtype) {
        this.reviewtype = reviewtype;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReviewcontent() {
        return reviewcontent;
    }

    public void setReviewcontent(String reviewcontent) {
        this.reviewcontent = reviewcontent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", reviewid=").append(reviewid);
        sb.append(", orderid=").append(orderid);
        sb.append(", reviewtype=").append(reviewtype);
        sb.append(", rating=").append(rating);
        sb.append(", reviewcontent=").append(reviewcontent);
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
        OsUserreview other = (OsUserreview) that;
        return (this.getReviewid() == null ? other.getReviewid() == null : this.getReviewid().equals(other.getReviewid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getReviewtype() == null ? other.getReviewtype() == null : this.getReviewtype().equals(other.getReviewtype()))
            && (this.getRating() == null ? other.getRating() == null : this.getRating().equals(other.getRating()))
            && (this.getReviewcontent() == null ? other.getReviewcontent() == null : this.getReviewcontent().equals(other.getReviewcontent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReviewid() == null) ? 0 : getReviewid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getReviewtype() == null) ? 0 : getReviewtype().hashCode());
        result = prime * result + ((getRating() == null) ? 0 : getRating().hashCode());
        result = prime * result + ((getReviewcontent() == null) ? 0 : getReviewcontent().hashCode());
        return result;
    }
}