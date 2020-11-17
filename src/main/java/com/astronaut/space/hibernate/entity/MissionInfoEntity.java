package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "mission_info", schema = "nasa_space_exploration_database")
public class MissionInfoEntity {
    private int missionId;
    private String missionName;
    private String missionDestination;
    private Integer missionObjectiveId;
    private double missionDistance;
    private Integer spaceShipId;
    private Collection<MissionDetailsEntity> missionDetailsByMissionId;
    private MissionObjectiveInfoEntity missionObjectiveInfoByMissionObjectiveId;
    private SpaceShipInfoEntity spaceShipInfoBySpaceShipId;
    private Collection<MissionLandInfoEntity> missionLandInfosByMissionId;
    private Collection<MissionLaunchInfoEntity> missionLaunchInfosByMissionId;

    @Id
    @Column(name = "mission_id", nullable = false)
    public int getMissionId() {
        return missionId;
    }

    public void setMissionId(int missionId) {
        this.missionId = missionId;
    }

    @Basic
    @Column(name = "mission_name", nullable = false, length = 30)
    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    @Basic
    @Column(name = "mission_destination", nullable = false, length = 30)
    public String getMissionDestination() {
        return missionDestination;
    }

    public void setMissionDestination(String missionDestination) {
        this.missionDestination = missionDestination;
    }

    @Basic
    @Column(name = "mission_objective_id", nullable = true, insertable = false, updatable = false)
    public Integer getMissionObjectiveId() {
        return missionObjectiveId;
    }

    public void setMissionObjectiveId(Integer missionObjectiveId) {
        this.missionObjectiveId = missionObjectiveId;
    }

    @Basic
    @Column(name = "mission_distance", nullable = false, precision = 0)
    public double getMissionDistance() {
        return missionDistance;
    }

    public void setMissionDistance(double missionDistance) {
        this.missionDistance = missionDistance;
    }

    @Basic
    @Column(name = "space_ship_id", nullable = true, insertable = false, updatable = false)
    public Integer getSpaceShipId() {
        return spaceShipId;
    }

    public void setSpaceShipId(Integer spaceShipId) {
        this.spaceShipId = spaceShipId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MissionInfoEntity that = (MissionInfoEntity) o;

        if (missionId != that.missionId) return false;
        if (Double.compare(that.missionDistance, missionDistance) != 0) return false;
        if (!Objects.equals(missionName, that.missionName)) return false;
        if (!Objects.equals(missionDestination, that.missionDestination))
            return false;
        if (!Objects.equals(missionObjectiveId, that.missionObjectiveId))
            return false;
        if (!Objects.equals(spaceShipId, that.spaceShipId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = missionId;
        result = 31 * result + (missionName != null ? missionName.hashCode() : 0);
        result = 31 * result + (missionDestination != null ? missionDestination.hashCode() : 0);
        result = 31 * result + (missionObjectiveId != null ? missionObjectiveId.hashCode() : 0);
        temp = Double.doubleToLongBits(missionDistance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (spaceShipId != null ? spaceShipId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "missionInfoByMissionId")
    public Collection<MissionDetailsEntity> getMissionDetailsByMissionId() {
        return missionDetailsByMissionId;
    }

    public void setMissionDetailsByMissionId(Collection<MissionDetailsEntity> missionDetailsByMissionId) {
        this.missionDetailsByMissionId = missionDetailsByMissionId;
    }

    @ManyToOne
    @JoinColumn(name = "mission_objective_id", referencedColumnName = "mission_objective_id")
    public MissionObjectiveInfoEntity getMissionObjectiveInfoByMissionObjectiveId() {
        return missionObjectiveInfoByMissionObjectiveId;
    }

    public void setMissionObjectiveInfoByMissionObjectiveId(MissionObjectiveInfoEntity missionObjectiveInfoByMissionObjectiveId) {
        this.missionObjectiveInfoByMissionObjectiveId = missionObjectiveInfoByMissionObjectiveId;
    }

    @ManyToOne
    @JoinColumn(name = "space_ship_id", referencedColumnName = "space_ship_id")
    public SpaceShipInfoEntity getSpaceShipInfoBySpaceShipId() {
        return spaceShipInfoBySpaceShipId;
    }

    public void setSpaceShipInfoBySpaceShipId(SpaceShipInfoEntity spaceShipInfoBySpaceShipId) {
        this.spaceShipInfoBySpaceShipId = spaceShipInfoBySpaceShipId;
    }

    @OneToMany(mappedBy = "missionInfoByMissionId")
    public Collection<MissionLandInfoEntity> getMissionLandInfosByMissionId() {
        return missionLandInfosByMissionId;
    }

    public void setMissionLandInfosByMissionId(Collection<MissionLandInfoEntity> missionLandInfosByMissionId) {
        this.missionLandInfosByMissionId = missionLandInfosByMissionId;
    }

    @OneToMany(mappedBy = "missionInfoByMissionId")
    public Collection<MissionLaunchInfoEntity> getMissionLaunchInfosByMissionId() {
        return missionLaunchInfosByMissionId;
    }

    public void setMissionLaunchInfosByMissionId(Collection<MissionLaunchInfoEntity> missionLaunchInfosByMissionId) {
        this.missionLaunchInfosByMissionId = missionLaunchInfosByMissionId;
    }
}
