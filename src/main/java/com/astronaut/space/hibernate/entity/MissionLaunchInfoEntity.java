package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "mission_launch_info", schema = "nasa_space_exploration_database")
public class MissionLaunchInfoEntity {
    private int missionLaunchId;
    private Integer missionId;
    private Date missionLaunchDate;
    private int missionSiteId;
    private MissionInfoEntity missionInfoByMissionId;
    private MissionSiteInfoEntity missionSiteInfoByMissionSiteId;

    @Id
    @Column(name = "mission_launch_id", nullable = false)
    public int getMissionLaunchId() {
        return missionLaunchId;
    }

    public void setMissionLaunchId(int missionLaunchId) {
        this.missionLaunchId = missionLaunchId;
    }

    @Basic
    @Column(name = "mission_id", nullable = true, insertable = false, updatable = false)
    public Integer getMissionId() {
        return missionId;
    }

    public void setMissionId(Integer missionId) {
        this.missionId = missionId;
    }

    @Basic
    @Column(name = "mission_launch_date", nullable = false)
    public Date getMissionLaunchDate() {
        return missionLaunchDate;
    }

    public void setMissionLaunchDate(Date missionLaunchDate) {
        this.missionLaunchDate = missionLaunchDate;
    }

    @Basic
    @Column(name = "mission_site_id", nullable = false, insertable = false, updatable = false)
    public int getMissionSiteId() {
        return missionSiteId;
    }

    public void setMissionSiteId(int missionSiteId) {
        this.missionSiteId = missionSiteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MissionLaunchInfoEntity that = (MissionLaunchInfoEntity) o;

        if (missionLaunchId != that.missionLaunchId) return false;
        if (missionSiteId != that.missionSiteId) return false;
        if (!Objects.equals(missionId, that.missionId)) return false;
        if (!Objects.equals(missionLaunchDate, that.missionLaunchDate))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = missionLaunchId;
        result = 31 * result + (missionId != null ? missionId.hashCode() : 0);
        result = 31 * result + (missionLaunchDate != null ? missionLaunchDate.hashCode() : 0);
        result = 31 * result + missionSiteId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "mission_id", referencedColumnName = "mission_id")
    public MissionInfoEntity getMissionInfoByMissionId() {
        return missionInfoByMissionId;
    }

    public void setMissionInfoByMissionId(MissionInfoEntity missionInfoByMissionId) {
        this.missionInfoByMissionId = missionInfoByMissionId;
    }

    @ManyToOne
    @JoinColumn(name = "mission_site_id", referencedColumnName = "mission_site_id", nullable = false)
    public MissionSiteInfoEntity getMissionSiteInfoByMissionSiteId() {
        return missionSiteInfoByMissionSiteId;
    }

    public void setMissionSiteInfoByMissionSiteId(MissionSiteInfoEntity missionSiteInfoByMissionSiteId) {
        this.missionSiteInfoByMissionSiteId = missionSiteInfoByMissionSiteId;
    }
}
