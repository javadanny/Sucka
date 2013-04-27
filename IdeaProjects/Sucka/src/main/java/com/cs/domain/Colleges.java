package com.cs.domain;

import javax.persistence.*;

@Entity
@Table(name = "colleges")
public class Colleges {
    private int collegeId;
    private String collegeNm;

    @javax.persistence.Column(name = "college_id")
    @Id
    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    @javax.persistence.Column(name = "college_nm")
    @Basic
    public String getCollegeNm() {
        return collegeNm;
    }

    public void setCollegeNm(String collegeNm) {
        this.collegeNm = collegeNm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Colleges colleges = (Colleges) o;

        if (collegeId != colleges.collegeId) return false;
        if (collegeNm != null ? !collegeNm.equals(colleges.collegeNm) : colleges.collegeNm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = collegeId;
        result = 31 * result + (collegeNm != null ? collegeNm.hashCode() : 0);
        return result;
    }
}
