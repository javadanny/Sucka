package com.cs.domain;

import javax.persistence.*;

@Table(name = "hire_source", schema = "", catalog = "showcase")
@Entity
public class HireSource {
    private int sourceId;
    private String sourceDesc;

    @javax.persistence.Column(name = "source_id")
    @Id
    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    @javax.persistence.Column(name = "source_desc")
    @Basic
    public String getSourceDesc() {
        return sourceDesc;
    }

    public void setSourceDesc(String sourceDesc) {
        this.sourceDesc = sourceDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HireSource that = (HireSource) o;

        if (sourceId != that.sourceId) return false;
        if (sourceDesc != null ? !sourceDesc.equals(that.sourceDesc) : that.sourceDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sourceId;
        result = 31 * result + (sourceDesc != null ? sourceDesc.hashCode() : 0);
        return result;
    }
}
