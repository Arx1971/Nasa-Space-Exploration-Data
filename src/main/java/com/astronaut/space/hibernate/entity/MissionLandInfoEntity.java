package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "mission_land_info", schema = "nasa_space_exploration_database")
public class MissionLandInfoEntity {
    private Integer missionLandId;
    private Integer missionId;
    private Date missionLandDate;
    private Integer missionLandingSiteId;
    private MissionInfoEntity missionInfoByMissionId;
    private MissionLandingSiteEntity missionLandingSiteByMissionLandingSiteId;

    @Id
    @Column(name = "mission_land_id", nullable = false, insertable = false, updatable = false)
    public int getMissionLandId() {
        return missionLandId;
    }

    public void setMissionLandId(int missionLandId) {
        this.missionLandId = missionLandId;
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
    @Column(name = "mission_land_date", nullable = false)
    public Date getMissionLandDate() {
        return missionLandDate;
    }

    public void setMissionLandDate(Date missionLandDate) {
        this.missionLandDate = missionLandDate;
    }

    @Basic
    @Column(name = "mission_landing_site_id", nullable = true, insertable = false, updatable = false)
    public Integer getMissionLandingSiteId() {
        return missionLandingSiteId;
    }

    public void setMissionLandingSiteId(Integer missionLandingSiteId) {
        this.missionLandingSiteId = missionLandingSiteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MissionLandInfoEntity that = (MissionLandInfoEntity) o;

        if (missionLandId != that.missionLandId) return false;
        if (!Objects.equals(missionId, that.missionId)) return false;
        if (!Objects.equals(missionLandDate, that.missionLandDate))
            return false;
        if (!Objects.equals(missionLandingSiteId, that.missionLandingSiteId))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = missionLandId;
        result = 31 * result + (missionId != null ? missionId.hashCode() : 0);
        result = 31 * result + (missionLandDate != null ? missionLandDate.hashCode() : 0);
        result = 31 * result + (missionLandingSiteId != null ? missionLandingSiteId.hashCode() : 0);
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
    @JoinColumn(name = "mission_landing_site_id", referencedColumnName = "mission_landing_site_id")
    public MissionLandingSiteEntity getMissionLandingSiteByMissionLandingSiteId() {
        return missionLandingSiteByMissionLandingSiteId;
    }

    public void setMissionLandingSiteByMissionLandingSiteId(MissionLandingSiteEntity missionLandingSiteByMissionLandingSiteId) {
        this.missionLandingSiteByMissionLandingSiteId = missionLandingSiteByMissionLandingSiteId;
    }
}
