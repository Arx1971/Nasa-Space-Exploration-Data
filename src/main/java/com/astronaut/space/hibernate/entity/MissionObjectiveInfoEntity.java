package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "mission_objective_info", schema = "nasa_space_exploration_database", catalog = "")
public class MissionObjectiveInfoEntity {
    private int missionObjectiveId;
    private String missionObjectiveName;
    private Collection<MissionInfoEntity> missionInfosByMissionObjectiveId;

    @Id
    @Column(name = "mission_objective_id", nullable = false)
    public int getMissionObjectiveId() {
        return missionObjectiveId;
    }

    public void setMissionObjectiveId(int missionObjectiveId) {
        this.missionObjectiveId = missionObjectiveId;
    }

    @Basic
    @Column(name = "mission_objective_name", nullable = false, length = 30)
    public String getMissionObjectiveName() {
        return missionObjectiveName;
    }

    public void setMissionObjectiveName(String missionObjectiveName) {
        this.missionObjectiveName = missionObjectiveName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MissionObjectiveInfoEntity that = (MissionObjectiveInfoEntity) o;

        if (missionObjectiveId != that.missionObjectiveId) return false;
        if (missionObjectiveName != null ? !missionObjectiveName.equals(that.missionObjectiveName) : that.missionObjectiveName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = missionObjectiveId;
        result = 31 * result + (missionObjectiveName != null ? missionObjectiveName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "missionObjectiveInfoByMissionObjectiveId")
    public Collection<MissionInfoEntity> getMissionInfosByMissionObjectiveId() {
        return missionInfosByMissionObjectiveId;
    }

    public void setMissionInfosByMissionObjectiveId(Collection<MissionInfoEntity> missionInfosByMissionObjectiveId) {
        this.missionInfosByMissionObjectiveId = missionInfosByMissionObjectiveId;
    }
}
