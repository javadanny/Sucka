package com.cs.domain;

import javax.persistence.*;

@Entity
@Table(name = "mentors")
public class Mentors {
    private String onepassId;
    private String name;

    @Column(name = "onepass_id")
    @Id
    public String getOnepassId() {
        return onepassId;
    }

    public void setOnepassId(String onepassId) {
        this.onepassId = onepassId;
    }

    @Column(name = "name")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mentors mentors = (Mentors) o;

        if (name != null ? !name.equals(mentors.name) : mentors.name != null) return false;
        if (onepassId != null ? !onepassId.equals(mentors.onepassId) : mentors.onepassId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = onepassId != null ? onepassId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
