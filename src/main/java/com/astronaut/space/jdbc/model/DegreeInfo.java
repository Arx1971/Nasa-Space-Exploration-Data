package com.astronaut.space.jdbc.model;

import java.util.Objects;

public class DegreeInfo {

    private int id;
    private String degreeName;

    public DegreeInfo() {

    }

    public DegreeInfo(Builder builder) {
        this.id = builder.id;
        this.degreeName = builder.degreeName;
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

    public static class Builder {
        private int id;
        String degreeName;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder degreeName(String degreeName) {
            this.degreeName = degreeName;
            return this;
        }

        public DegreeInfo build() {
            return new DegreeInfo(this);
        }
    }

}
