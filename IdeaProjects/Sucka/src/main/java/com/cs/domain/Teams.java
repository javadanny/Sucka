package com.cs.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Teams {
    private int     teamId;
    private String  teamName;
    private Date    callupDate;
    private Integer size;

    @Column(name = "team_id")
    @Id
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Column(name = "team_name")
    @Basic
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @javax.persistence.Column(name = "callup_date")
    @Basic
    public Date getCallupDate() {
        return callupDate;
    }

    public void setCallupDate(Date callupDate) {
        this.callupDate = callupDate;
    }

    @javax.persistence.Column(name = "size")
    @Basic
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teams teams = (Teams) o;

        if (teamId != teams.teamId) return false;
        if (callupDate != null ? !callupDate.equals(teams.callupDate) : teams.callupDate != null) return false;
        if (size != null ? !size.equals(teams.size) : teams.size != null) return false;
        if (teamName != null ? !teamName.equals(teams.teamName) : teams.teamName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teamId;
        result = 31 * result + (teamName != null ? teamName.hashCode() : 0);
        result = 31 * result + (callupDate != null ? callupDate.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }
}
