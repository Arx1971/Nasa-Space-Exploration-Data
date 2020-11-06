package com.astronaut.space.jdbc.model;

import java.util.Objects;

public class AstronautChildInfo {

    private int childId;
    private String childName;
    private int astronautId;

    public AstronautChildInfo(Builder builder) {
        this.childId = builder.childId;
        this.childName = builder.childName;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public int getAstronautId() {
        return astronautId;
    }

    public void setAstronautId(int astronautId) {
        this.astronautId = astronautId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AstronautChildInfo)) return false;
        AstronautChildInfo that = (AstronautChildInfo) o;
        return getChildId() == that.getChildId() &&
                getAstronautId() == that.getAstronautId() &&
                getChildName().equals(that.getChildName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChildId(), getChildName(), getAstronautId());
    }

    @Override
    public String toString() {
        return "AstronautChildInfo{" +
                "childId=" + childId +
                ", childName='" + childName + '\'' +
                '}';
    }

    public static class Builder {
        private int childId;
        private String childName;

        public Builder childId(int childId) {
            this.childId = childId;
            return this;
        }

        public Builder childName(String childName) {
            this.childName = childName;
            return this;
        }

        public AstronautChildInfo build() {
            return new AstronautChildInfo(this);
        }

    }

}
