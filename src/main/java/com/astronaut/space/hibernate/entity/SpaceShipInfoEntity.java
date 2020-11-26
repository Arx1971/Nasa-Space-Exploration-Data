package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "space_ship_info", schema = "nasa_space_exploration_database")
public class SpaceShipInfoEntity {
    private Integer spaceShipId;
    private String spaceShipName;
    private Collection<MissionInfoEntity> missionInfosBySpaceShipId;

    @Id
    @Column(name = "space_ship_id", nullable = false)
    public int getSpaceShipId() {
        return spaceShipId;
    }

    public void setSpaceShipId(int spaceShipId) {
        this.spaceShipId = spaceShipId;
    }

    @Basic
    @Column(name = "space_ship_name", nullable = true, length = 30)
    public String getSpaceShipName() {
        return spaceShipName;
    }

    public void setSpaceShipName(String spaceShipName) {
        this.spaceShipName = spaceShipName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpaceShipInfoEntity that = (SpaceShipInfoEntity) o;

        if (spaceShipId != that.spaceShipId) return false;
        if (!Objects.equals(spaceShipName, that.spaceShipName))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = spaceShipId;
        result = 31 * result + (spaceShipName != null ? spaceShipName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "spaceShipInfoBySpaceShipId")
    public Collection<MissionInfoEntity> getMissionInfosBySpaceShipId() {
        return missionInfosBySpaceShipId;
    }

    public void setMissionInfosBySpaceShipId(Collection<MissionInfoEntity> missionInfosBySpaceShipId) {
        this.missionInfosBySpaceShipId = missionInfosBySpaceShipId;
    }
}
