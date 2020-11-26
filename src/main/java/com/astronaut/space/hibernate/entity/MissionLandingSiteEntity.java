package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "mission_landing_site", schema = "nasa_space_exploration_database")
public class MissionLandingSiteEntity {
    private int missionLandingSiteId;
    private String missionLandingSiteName;
    private String missionLandingSiteCity;
    private String missionLandingSiteState;
    private String missionLandingSiteCountry;
    private Collection<MissionLandInfoEntity> missionLandInfosByMissionLandingSiteId;

    @Id
    @Column(name = "mission_landing_site_id", nullable = false, insertable = false, updatable = false)
    public int getMissionLandingSiteId() {
        return missionLandingSiteId;
    }

    public void setMissionLandingSiteId(int missionLandingSiteId) {
        this.missionLandingSiteId = missionLandingSiteId;
    }

    @Basic
    @Column(name = "mission_landing_site_name", nullable = false, length = 50)
    public String getMissionLandingSiteName() {
        return missionLandingSiteName;
    }

    public void setMissionLandingSiteName(String missionLandingSiteName) {
        this.missionLandingSiteName = missionLandingSiteName;
    }

    @Basic
    @Column(name = "mission_landing_site_city", nullable = false, length = 50)
    public String getMissionLandingSiteCity() {
        return missionLandingSiteCity;
    }

    public void setMissionLandingSiteCity(String missionLandingSiteCity) {
        this.missionLandingSiteCity = missionLandingSiteCity;
    }

    @Basic
    @Column(name = "mission_landing_site_state", nullable = false, length = 50)
    public String getMissionLandingSiteState() {
        return missionLandingSiteState;
    }

    public void setMissionLandingSiteState(String missionLandingSiteState) {
        this.missionLandingSiteState = missionLandingSiteState;
    }

    @Basic
    @Column(name = "mission_landing_site_country", nullable = false, length = 50)
    public String getMissionLandingSiteCountry() {
        return missionLandingSiteCountry;
    }

    public void setMissionLandingSiteCountry(String missionLandingSiteCountry) {
        this.missionLandingSiteCountry = missionLandingSiteCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MissionLandingSiteEntity that = (MissionLandingSiteEntity) o;

        if (missionLandingSiteId != that.missionLandingSiteId) return false;
        if (!Objects.equals(missionLandingSiteName, that.missionLandingSiteName))
            return false;
        if (!Objects.equals(missionLandingSiteCity, that.missionLandingSiteCity))
            return false;
        if (!Objects.equals(missionLandingSiteState, that.missionLandingSiteState))
            return false;
        if (!Objects.equals(missionLandingSiteCountry, that.missionLandingSiteCountry))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = missionLandingSiteId;
        result = 31 * result + (missionLandingSiteName != null ? missionLandingSiteName.hashCode() : 0);
        result = 31 * result + (missionLandingSiteCity != null ? missionLandingSiteCity.hashCode() : 0);
        result = 31 * result + (missionLandingSiteState != null ? missionLandingSiteState.hashCode() : 0);
        result = 31 * result + (missionLandingSiteCountry != null ? missionLandingSiteCountry.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "missionLandingSiteByMissionLandingSiteId")
    public Collection<MissionLandInfoEntity> getMissionLandInfosByMissionLandingSiteId() {
        return missionLandInfosByMissionLandingSiteId;
    }

    public void setMissionLandInfosByMissionLandingSiteId(Collection<MissionLandInfoEntity> missionLandInfosByMissionLandingSiteId) {
        this.missionLandInfosByMissionLandingSiteId = missionLandInfosByMissionLandingSiteId;
    }
}
