package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "astronaut_spouse_info", schema = "nasa_space_exploration_database")
public class AstronautSpouseInfoEntity {
    private int astronautSpouseId;
    private String astronautSpouseName;
    private Integer astronautId;
    private AstronautInfoEntity astronautInfoByAstronautId;

    @Id
    @Column(name = "astronaut_spouse_id", nullable = false)
    public int getAstronautSpouseId() {
        return astronautSpouseId;
    }

    public void setAstronautSpouseId(int astronautSpouseId) {
        this.astronautSpouseId = astronautSpouseId;
    }

    @Basic
    @Column(name = "astronaut_spouse_name", nullable = false, length = 30)
    public String getAstronautSpouseName() {
        return astronautSpouseName;
    }

    public void setAstronautSpouseName(String astronautSpouseName) {
        this.astronautSpouseName = astronautSpouseName;
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

        AstronautSpouseInfoEntity that = (AstronautSpouseInfoEntity) o;

        if (astronautSpouseId != that.astronautSpouseId) return false;
        if (!Objects.equals(astronautSpouseName, that.astronautSpouseName))
            return false;
        return Objects.equals(astronautId, that.astronautId);
    }

    @Override
    public int hashCode() {
        int result = astronautSpouseId;
        result = 31 * result + (astronautSpouseName != null ? astronautSpouseName.hashCode() : 0);
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

    @Override
    public String toString() {
        return "AstronautSpouseInfoEntity{" +
                "astronautSpouseId=" + astronautSpouseId +
                ", astronautSpouseName='" + astronautSpouseName + '\'' +
                '}';
    }
}
