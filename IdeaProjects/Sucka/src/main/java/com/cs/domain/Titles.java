package com.cs.domain;

import javax.persistence.*;

@Entity
@Table(name = "titles")
public class Titles {
    private int titleId;
    private String titleDesc;
    private String jobCode;
    private Integer minPay;
    private Integer midPay;
    private Integer maxPay;
    private String payGrade;

    @javax.persistence.Column(name = "title_id")
    @Id
    int getTitleId() {
        return titleId;
    }

    void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    @javax.persistence.Column(name = "title_desc")
    @Basic
    String getTitleDesc() {
        return titleDesc;
    }

    void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc;
    }

    @javax.persistence.Column(name = "job_code")
    @Basic
    String getJobCode() {
        return jobCode;
    }

    void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    @javax.persistence.Column(name = "min_pay")
    @Basic
    Integer getMinPay() {
        return minPay;
    }

    void setMinPay(Integer minPay) {
        this.minPay = minPay;
    }

    @javax.persistence.Column(name = "mid_pay")
    @Basic
    Integer getMidPay() {
        return midPay;
    }

    void setMidPay(Integer midPay) {
        this.midPay = midPay;
    }

    @javax.persistence.Column(name = "max_pay")
    @Basic
    Integer getMaxPay() {
        return maxPay;
    }

    void setMaxPay(Integer maxPay) {
        this.maxPay = maxPay;
    }

    @javax.persistence.Column(name = "pay_grade")
    @Basic
    String getPayGrade() {
        return payGrade;
    }

    void setPayGrade(String payGrade) {
        this.payGrade = payGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Titles titles = (Titles) o;

        if (titleId != titles.titleId) return false;
        if (jobCode != null ? !jobCode.equals(titles.jobCode) : titles.jobCode != null) return false;
        if (maxPay != null ? !maxPay.equals(titles.maxPay) : titles.maxPay != null) return false;
        if (midPay != null ? !midPay.equals(titles.midPay) : titles.midPay != null) return false;
        if (minPay != null ? !minPay.equals(titles.minPay) : titles.minPay != null) return false;
        if (payGrade != null ? !payGrade.equals(titles.payGrade) : titles.payGrade != null) return false;
        if (titleDesc != null ? !titleDesc.equals(titles.titleDesc) : titles.titleDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = titleId;
        result = 31 * result + (titleDesc != null ? titleDesc.hashCode() : 0);
        result = 31 * result + (jobCode != null ? jobCode.hashCode() : 0);
        result = 31 * result + (minPay != null ? minPay.hashCode() : 0);
        result = 31 * result + (midPay != null ? midPay.hashCode() : 0);
        result = 31 * result + (maxPay != null ? maxPay.hashCode() : 0);
        result = 31 * result + (payGrade != null ? payGrade.hashCode() : 0);
        return result;
    }
}
