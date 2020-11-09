package com.astronaut.space.jdbc.model;

public class MissionLandingSite {

    private int id;
    private String landingSiteName;
    private String ladingSiteCity;
    private String landingSiteState;
    private String landingSiteCountry;

    private MissionLandingSite(Builder builder) {
        this.id = builder.id;
        this.landingSiteName = builder.landingSiteName;
        this.ladingSiteCity = builder.ladingSiteCity;
        this.landingSiteState = builder.landingSiteState;
        this.landingSiteCountry = builder.landingSiteCountry;
    }

    public MissionLandingSite() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLandingSiteName() {
        return landingSiteName;
    }

    public void setLandingSiteName(String landingSiteName) {
        this.landingSiteName = landingSiteName;
    }

    public String getLadingSiteCity() {
        return ladingSiteCity;
    }

    public void setLadingSiteCity(String ladingSiteCity) {
        this.ladingSiteCity = ladingSiteCity;
    }

    public String getLandingSiteState() {
        return landingSiteState;
    }

    public void setLandingSiteState(String landingSiteState) {
        this.landingSiteState = landingSiteState;
    }

    public String getLandingSiteCountry() {
        return landingSiteCountry;
    }

    public void setLandingSiteCountry(String landingSiteCountry) {
        this.landingSiteCountry = landingSiteCountry;
    }

    @Override
    public String toString() {
        return "MissionLandingSite{" +
                "id=" + id +
                ", landingSiteName='" + landingSiteName + '\'' +
                ", ladingSiteCity='" + ladingSiteCity + '\'' +
                ", landingSiteState='" + landingSiteState + '\'' +
                ", landingSiteCountry='" + landingSiteCountry + '\'' +
                '}';
    }

    public static class Builder {
        private final int id;
        private String landingSiteName;
        private String ladingSiteCity;
        private String landingSiteState;
        private String landingSiteCountry;

        public Builder(int id) {
            this.id = id;
        }

        public Builder landingSiteName(String landingSiteName) {
            this.landingSiteName = landingSiteName;
            return this;
        }

        public Builder ladingSiteCity(String landingSiteCity) {
            this.ladingSiteCity = landingSiteCity;
            return this;
        }

        public Builder landingSiteState(String landingSiteState) {
            this.landingSiteState = landingSiteState;
            return this;
        }

        public Builder landingSiteCountry(String landingSiteCountry) {
            this.landingSiteCountry = landingSiteCountry;
            return this;
        }

        public MissionLandingSite build() {
            return new MissionLandingSite(this);
        }

    }

}
