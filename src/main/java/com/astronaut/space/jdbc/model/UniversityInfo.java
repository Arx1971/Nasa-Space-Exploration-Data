package com.astronaut.space.jdbc.model;

import java.util.Objects;

public class UniversityInfo {

    private int id;
    private String universityName;

    public UniversityInfo(Builder builder) {
        this.id = builder.id;
        this.universityName = builder.universityName;
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

    public static class Builder {
        private int id;
        private String universityName;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public UniversityInfo build() {
            return new UniversityInfo(this);
        }

    }

}
