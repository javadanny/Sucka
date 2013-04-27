package com.cs.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "partners")
public class Partners {
    private String  onepassId;
    private String  firstName;
    private String  lastName;
    private Integer sadcTeamId;
    private Integer collegeId;
    private Integer titleId;
    private Date    startDt;
    private Integer sourceId;
    private Integer majorId;
    private Integer psId;
    private Integer teamRank;
    private Integer sadcRank;

    @Column(name = "onepass_id")
    @Id
    public String getOnepassId() {
        return onepassId;
    }

    public void setOnepassId(String onepassId) {
        this.onepassId = onepassId;
    }

    @Column(name = "first_name")
    @Basic
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    @Basic
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "sadc_team_id")
    @Basic
    public Integer getSadcTeamId() {
        return sadcTeamId;
    }

    public void setSadcTeamId(Integer sadcTeamId) {
        this.sadcTeamId = sadcTeamId;
    }

    @Column(name = "college_id")
    @Basic
    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    @Column(name = "team_rank")
    @Basic
    public Integer getTeamRank() {
        return teamRank;
    }

    public void setTeamRank(Integer teamRank) {
        this.teamRank = teamRank;
    }

    @Column(name = "sadc_rank")
    @Basic
    public Integer getSadcRank() {
        return sadcRank;
    }

    public void setSadcRank(Integer sadcRank) {
        this.sadcRank = sadcRank;
    }

    @Column(name = "title_id")
    @Basic
    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }


    @Column(name = "start_dt")
    @Basic
    public Date getStartDt() {
        return startDt;
    }

    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }


    @Column(name = "source_id")
    @Basic
    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }


    @Column(name = "major_id")
    @Basic
    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }


    @Column(name = "ps_id")
    @Basic
    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public String displayFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    public String toString() {
        return this.getOnepassId() + ": " + this.displayFullName() + " Team " + this.getSadcTeamId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Partners partners = (Partners) o;

        if (collegeId != null ? !collegeId.equals(partners.collegeId) : partners.collegeId != null) return false;
        if (firstName != null ? !firstName.equals(partners.firstName) : partners.firstName != null) return false;
        if (lastName != null ? !lastName.equals(partners.lastName) : partners.lastName != null) return false;
        if (majorId != null ? !majorId.equals(partners.majorId) : partners.majorId != null) return false;
        if (onepassId != null ? !onepassId.equals(partners.onepassId) : partners.onepassId != null) return false;
        if (psId != null ? !psId.equals(partners.psId) : partners.psId != null) return false;
        if (sadcRank != null ? !sadcRank.equals(partners.sadcRank) : partners.sadcRank != null) return false;
        if (sadcTeamId != null ? !sadcTeamId.equals(partners.sadcTeamId) : partners.sadcTeamId != null) return false;
        if (sourceId != null ? !sourceId.equals(partners.sourceId) : partners.sourceId != null) return false;
        if (startDt != null ? !startDt.equals(partners.startDt) : partners.startDt != null) return false;
        if (teamRank != null ? !teamRank.equals(partners.teamRank) : partners.teamRank != null) return false;
        if (titleId != null ? !titleId.equals(partners.titleId) : partners.titleId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = onepassId != null ? onepassId.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (sadcTeamId != null ? sadcTeamId.hashCode() : 0);
        result = 31 * result + (collegeId != null ? collegeId.hashCode() : 0);
        result = 31 * result + (teamRank != null ? teamRank.hashCode() : 0);
        result = 31 * result + (sadcRank != null ? sadcRank.hashCode() : 0);
        result = 31 * result + (titleId != null ? titleId.hashCode() : 0);
        result = 31 * result + (startDt != null ? startDt.hashCode() : 0);
        result = 31 * result + (sourceId != null ? sourceId.hashCode() : 0);
        result = 31 * result + (majorId != null ? majorId.hashCode() : 0);
        result = 31 * result + (psId != null ? psId.hashCode() : 0);
        return result;
    }
}
