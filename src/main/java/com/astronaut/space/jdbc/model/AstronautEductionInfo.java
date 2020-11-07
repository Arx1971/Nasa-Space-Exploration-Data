package com.astronaut.space.jdbc.model;

import java.util.List;

public class AstronautEductionInfo {

    private int id;

    private List<UniversityInfo> universityInfoList;
    private List<DegreeInfo> degreeInfoList;

    public AstronautEductionInfo(int id, List<UniversityInfo> universityInfos,
                                 List<DegreeInfo> degreeInfos) {
        this.id = id;
        this.universityInfoList = universityInfos;
        this.degreeInfoList = degreeInfos;
    }

    private AstronautEductionInfo(Builder builder) {
        this.id = builder.id;
        this.universityInfoList = builder.universityInfosList;
        this.degreeInfoList = builder.degreeInfoList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<UniversityInfo> getUniversityInfos() {
        return universityInfoList;
    }

    public void setUniversityInfos(List<UniversityInfo> universityInfos) {
        this.universityInfoList = universityInfos;
    }

    public List<DegreeInfo> getDegreeInfoList() {
        return degreeInfoList;
    }

    public void setDegreeInfoList(List<DegreeInfo> degreeInfoList) {
        this.degreeInfoList = degreeInfoList;
    }

    @Override
    public String toString() {
        return "AstronautEductionInfo{" +
                "id=" + id +
                ", universityInfos=" + universityInfoList +
                ", degreeInfos=" + degreeInfoList +
                '}';
    }

    public static class Builder {
        private int id;

        private List<UniversityInfo> universityInfosList;
        private List<DegreeInfo> degreeInfoList;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder UniversityInfo(List<UniversityInfo> universityInfosList) {
            this.universityInfosList = universityInfosList;
            return this;
        }

        public Builder DegreeInfo(List<DegreeInfo> degreeInfoList) {
            this.degreeInfoList = degreeInfoList;
            return this;
        }

        public AstronautEductionInfo build() {
            return new AstronautEductionInfo(this);
        }

    }

}
