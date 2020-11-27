package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "degree_info", schema = "nasa_space_exploration_database")
public class DegreeInfoEntity {
    private int degreeId;
    private String degreeName;
    private Collection<AstronautEducationInfoEntity> astronautEducationInfosByDegreeId;

    @Id
    @Column(name = "degree_id", nullable = false)
    public int getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(int degreeId) {
        this.degreeId = degreeId;
    }

    @Basic
    @Column(name = "degree_name", nullable = false, length = 30)
    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DegreeInfoEntity that = (DegreeInfoEntity) o;

        if (degreeId != that.degreeId) return false;
        if (!Objects.equals(degreeName, that.degreeName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = degreeId;
        result = 31 * result + (degreeName != null ? degreeName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "degreeInfoByDegreeId")
    public Collection<AstronautEducationInfoEntity> getAstronautEducationInfosByDegreeId() {
        return astronautEducationInfosByDegreeId;
    }

    public void setAstronautEducationInfosByDegreeId(Collection<AstronautEducationInfoEntity> astronautEducationInfosByDegreeId) {
        this.astronautEducationInfosByDegreeId = astronautEducationInfosByDegreeId;
    }

    @Override
    public String toString() {
        return "DegreeInfoEntity{" +
                "degreeId=" + degreeId +
                ", degreeName='" + degreeName + '\'' +
                '}';
    }
}
