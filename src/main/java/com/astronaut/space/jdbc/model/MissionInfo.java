package com.astronaut.space.jdbc.model;

public class MissionInfo {

    private int id;
    private String missionName;
    private String destinationName;
    private double missionDistance;
    private MissionObjectiveInfo missionObjectiveInfo;
    private SpaceShipInfo spaceShipInfo;

    public MissionInfo(Builder builder) {
        this.id = builder.id;
        this.missionName = builder.missionName;
        this.destinationName = builder.destinationName;
        this.missionObjectiveInfo = builder.missionObjectiveInfo;
        this.spaceShipInfo = builder.spaceShipInfo;
        this.missionDistance = builder.missionDistance;
    }

    public double getMissionDistance() {
        return missionDistance;
    }

    public void setMissionDistance(double missionDistance) {
        this.missionDistance = missionDistance;
    }

    public MissionInfo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public MissionObjectiveInfo getMissionObjectiveInfo() {
        return missionObjectiveInfo;
    }

    public void setMissionObjectiveInfo(MissionObjectiveInfo missionObjectiveInfo) {
        this.missionObjectiveInfo = missionObjectiveInfo;
    }

    public SpaceShipInfo getSpaceShipInfo() {
        return spaceShipInfo;
    }

    public void setSpaceShipInfo(SpaceShipInfo spaceShipInfo) {
        this.spaceShipInfo = spaceShipInfo;
    }

    @Override
    public String toString() {
        return "MissionInfo{" +
                "id=" + id +
                ", missionName='" + missionName + '\'' +
                ", destinationName='" + destinationName + '\'' +
                ", missionDistance=" + missionDistance +
                ", missionObjectiveInfo=" + missionObjectiveInfo +
                ", spaceShipInfo=" + spaceShipInfo +
                '}';
    }

    public static class Builder {
        private int id;
        private String missionName;
        private String destinationName;
        private double missionDistance;
        private MissionObjectiveInfo missionObjectiveInfo;
        private SpaceShipInfo spaceShipInfo;

        public Builder(int id) {
            this.id = id;
        }

        public Builder missionName(String missionName) {
            this.missionName = missionName;
            return this;
        }

        public Builder destinationName(String destinationName) {
            this.destinationName = destinationName;
            return this;
        }

        public Builder missionObjectiveInfo(MissionObjectiveInfo missionObjectiveInfo) {
            this.missionObjectiveInfo = missionObjectiveInfo;
            return this;
        }

        public Builder spaceShipInfo(SpaceShipInfo spaceShipInfo) {
            this.spaceShipInfo = spaceShipInfo;
            return this;
        }

        public Builder missionDistance(double missionDistance) {
            this.missionDistance = missionDistance;
            return this;
        }

        public MissionInfo build() {
            return new MissionInfo(this);
        }

    }

}
