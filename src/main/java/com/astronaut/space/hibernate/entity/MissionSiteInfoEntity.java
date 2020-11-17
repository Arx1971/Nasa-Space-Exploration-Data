package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "mission_site_info", schema = "nasa_space_exploration_database", catalog = "")
public class MissionSiteInfoEntity {
    private int missionSiteId;
    private String missionSiteName;
    private String missionSiteCity;
    private String missionSiteState;
    private String missionSiteCountry;
    private Collection<MissionLaunchInfoEntity> missionLaunchInfosByMissionSiteId;

    @Id
    @Column(name = "mission_site_id", nullable = false)
    public int getMissionSiteId() {
        return missionSiteId;
    }

    public void setMissionSiteId(int missionSiteId) {
        this.missionSiteId = missionSiteId;
    }

    @Basic
    @Column(name = "mission_site_name", nullable = false, length = 40)
    public String getMissionSiteName() {
        return missionSiteName;
    }

    public void setMissionSiteName(String missionSiteName) {
        this.missionSiteName = missionSiteName;
    }

    @Basic
    @Column(name = "mission_site_city", nullable = false, length = 40)
    public String getMissionSiteCity() {
        return missionSiteCity;
    }

    public void setMissionSiteCity(String missionSiteCity) {
        this.missionSiteCity = missionSiteCity;
    }

    @Basic
    @Column(name = "mission_site_state", nullable = true, length = 10)
    public String getMissionSiteState() {
        return missionSiteState;
    }

    public void setMissionSiteState(String missionSiteState) {
        this.missionSiteState = missionSiteState;
    }

    @Basic
    @Column(name = "mission_site_country", nullable = false, length = 20)
    public String getMissionSiteCountry() {
        return missionSiteCountry;
    }

    public void setMissionSiteCountry(String missionSiteCountry) {
        this.missionSiteCountry = missionSiteCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MissionSiteInfoEntity that = (MissionSiteInfoEntity) o;

        if (missionSiteId != that.missionSiteId) return false;
        if (missionSiteName != null ? !missionSiteName.equals(that.missionSiteName) : that.missionSiteName != null)
            return false;
        if (missionSiteCity != null ? !missionSiteCity.equals(that.missionSiteCity) : that.missionSiteCity != null)
            return false;
        if (missionSiteState != null ? !missionSiteState.equals(that.missionSiteState) : that.missionSiteState != null)
            return false;
        if (missionSiteCountry != null ? !missionSiteCountry.equals(that.missionSiteCountry) : that.missionSiteCountry != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = missionSiteId;
        result = 31 * result + (missionSiteName != null ? missionSiteName.hashCode() : 0);
        result = 31 * result + (missionSiteCity != null ? missionSiteCity.hashCode() : 0);
        result = 31 * result + (missionSiteState != null ? missionSiteState.hashCode() : 0);
        result = 31 * result + (missionSiteCountry != null ? missionSiteCountry.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "missionSiteInfoByMissionSiteId")
    public Collection<MissionLaunchInfoEntity> getMissionLaunchInfosByMissionSiteId() {
        return missionLaunchInfosByMissionSiteId;
    }

    public void setMissionLaunchInfosByMissionSiteId(Collection<MissionLaunchInfoEntity> missionLaunchInfosByMissionSiteId) {
        this.missionLaunchInfosByMissionSiteId = missionLaunchInfosByMissionSiteId;
    }
}
