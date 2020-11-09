package com.astronaut.space.jdbc.model;

public class MissionObjectiveInfo {

    private int id;
    private String missionObjectiveName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMissionObjectiveName() {
        return missionObjectiveName;
    }

    public void setMissionObjectiveName(String missionObjectiveName) {
        this.missionObjectiveName = missionObjectiveName;
    }

    @Override
    public String toString() {
        return "MissionObjectiveInfo{" +
                "id=" + id +
                ", missionObjectiveName='" + missionObjectiveName + '\'' +
                '}';
    }
}
