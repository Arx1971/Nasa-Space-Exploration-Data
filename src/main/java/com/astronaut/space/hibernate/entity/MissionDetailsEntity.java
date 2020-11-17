package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mission_details", schema = "nasa_space_exploration_database")
public class MissionDetailsEntity {
    private int missionDetailsId;
    private Integer missionId;
    private Integer astronautId;
    private MissionInfoEntity missionInfoByMissionId;
    private AstronautInfoEntity astronautInfoByAstronautId;

    @Id
    @Column(name = "mission_details_id", nullable = false)
    public int getMissionDetailsId() {
        return missionDetailsId;
    }

    public void setMissionDetailsId(int missionDetailsId) {
        this.missionDetailsId = missionDetailsId;
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
    @Column(name = "astronaut_id", nullable = true, insertable = false, updatable = false)
    public Integer getAstronautId() {
        return astronautId;
    }

    public void setAstronautId(Integer astronautId) {
        this.astronautId = astronautId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MissionDetailsEntity that = (MissionDetailsEntity) o;

        if (missionDetailsId != that.missionDetailsId) return false;
        if (!Objects.equals(missionId, that.missionId)) return false;
        if (!Objects.equals(astronautId, that.astronautId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = missionDetailsId;
        result = 31 * result + (missionId != null ? missionId.hashCode() : 0);
        result = 31 * result + (astronautId != null ? astronautId.hashCode() : 0);
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
    @JoinColumn(name = "astronaut_id", referencedColumnName = "astronaut_id")
    public AstronautInfoEntity getAstronautInfoByAstronautId() {
        return astronautInfoByAstronautId;
    }

    public void setAstronautInfoByAstronautId(AstronautInfoEntity astronautInfoByAstronautId) {
        this.astronautInfoByAstronautId = astronautInfoByAstronautId;
    }
}
