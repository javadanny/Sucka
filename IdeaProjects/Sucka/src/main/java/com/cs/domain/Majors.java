package com.cs.domain;

import javax.persistence.*;

@Entity
public class Majors {
    private int majorId;
    private String majorDesc;

    @Column(name = "major_id")
    @Id
    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    @Column(name = "major_desc")
    @Basic
    public String getMajorDesc() {
        return majorDesc;
    }

    public void setMajorDesc(String majorDesc) {
        this.majorDesc = majorDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Majors majors = (Majors) o;

        if (majorId != majors.majorId) return false;
        if (majorDesc != null ? !majorDesc.equals(majors.majorDesc) : majors.majorDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = majorId;
        result = 31 * result + (majorDesc != null ? majorDesc.hashCode() : 0);
        return result;
    }
}
