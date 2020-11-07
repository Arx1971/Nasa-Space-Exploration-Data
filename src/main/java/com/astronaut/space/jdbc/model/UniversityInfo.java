package com.astronaut.space.jdbc.model;

import java.util.Objects;

public class UniversityInfo {

    private int id;
    private String universityName;

    public UniversityInfo(int id, String universityName) {
        this.id = id;
        this.universityName = universityName;
    }

    public UniversityInfo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniversityInfo)) return false;
        UniversityInfo that = (UniversityInfo) o;
        return getId() == that.getId() &&
                getUniversityName().equals(that.getUniversityName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUniversityName());
    }

    @Override
    public String toString() {
        return "UniversityInfo{" +
                "id=" + id +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
