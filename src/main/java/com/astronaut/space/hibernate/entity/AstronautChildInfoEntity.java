package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "astronaut_child_info", schema = "nasa_space_exploration_database")
public class AstronautChildInfoEntity {
    private int astronautChildId;
    private String astronautChildName;
    private Integer astronautId;
    private AstronautInfoEntity astronautInfoByAstronautId;

    @Id
    @Column(name = "astronaut_child_id", nullable = false)
    public int getAstronautChildId() {
        return astronautChildId;
    }

    public void setAstronautChildId(int astronautChildId) {
        this.astronautChildId = astronautChildId;
    }

    @Basic
    @Column(name = "astronaut_child_name", nullable = false, length = 30)
    public String getAstronautChildName() {
        return astronautChildName;
    }

    public void setAstronautChildName(String astronautChildName) {
        this.astronautChildName = astronautChildName;
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

        AstronautChildInfoEntity that = (AstronautChildInfoEntity) o;

        if (astronautChildId != that.astronautChildId) return false;
        if (!Objects.equals(astronautChildName, that.astronautChildName))
            return false;
        if (!Objects.equals(astronautId, that.astronautId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = astronautChildId;
        result = 31 * result + (astronautChildName != null ? astronautChildName.hashCode() : 0);
        result = 31 * result + (astronautId != null ? astronautId.hashCode() : 0);
        return result;
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
