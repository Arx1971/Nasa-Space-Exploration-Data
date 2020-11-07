package com.astronaut.space.jdbc.model;

import java.util.Objects;

public class DegreeInfo {

    private int id;
    private String degreeName;

    public DegreeInfo() {
        
    }

    public DegreeInfo(int id, String degreeName) {
        this.id = id;
        this.degreeName = degreeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    @Override
    public String toString() {
        return "DegreeInfo{" +
                "id=" + id +
                ", degreeName='" + degreeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DegreeInfo)) return false;
        DegreeInfo that = (DegreeInfo) o;
        return getId() == that.getId() &&
                getDegreeName().equals(that.getDegreeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDegreeName());
    }
}
