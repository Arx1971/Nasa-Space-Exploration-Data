package com.astronaut.space.jdbc.model;

import java.util.List;

public class AstronautEductionInfo {

    private int id;

    private List<UniversityInfo> universityInfos;
    private List<DegreeInfo> degreeInfos;

    public AstronautEductionInfo(int id, List<UniversityInfo> universityInfos,
                                 List<DegreeInfo> degreeInfos) {
        this.id = id;
        this.universityInfos = universityInfos;
        this.degreeInfos = degreeInfos;
    }

    public AstronautEductionInfo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<UniversityInfo> getUniversityInfos() {
        return universityInfos;
    }

    public void setUniversityInfos(List<UniversityInfo> universityInfos) {
        this.universityInfos = universityInfos;
    }

    public List<DegreeInfo> getDegreeInfos() {
        return degreeInfos;
    }

    public void setDegreeInfos(List<DegreeInfo> degreeInfos) {
        this.degreeInfos = degreeInfos;
    }

}
