package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "astronaut_education_info", schema = "nasa_space_exploration_database")
public class AstronautEducationInfoEntity {
    private int astronautEducationId;
    private Integer universityId;
    private Integer degreeId;
    private Integer astronautId;
    private UniversityInfoEntity universityInfoByUniversityId;
    private DegreeInfoEntity degreeInfoByDegreeId;
    private AstronautInfoEntity astronautInfoByAstronautId;

    @Id
    @Column(name = "astronaut_education_id", nullable = false)
    public int getAstronautEducationId() {
        return astronautEducationId;
    }

    public void setAstronautEducationId(int astronautEducationId) {
        this.astronautEducationId = astronautEducationId;
    }

    @Basic
    @Column(name = "university_id", nullable = true, insertable = false, updatable = false)
    public Integer getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    @Basic
    @Column(name = "degree_id", nullable = true, insertable = false, updatable = false)
    public Integer getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Integer degreeId) {
        this.degreeId = degreeId;
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

        AstronautEducationInfoEntity that = (AstronautEducationInfoEntity) o;

        if (astronautEducationId != that.astronautEducationId) return false;
        if (!Objects.equals(universityId, that.universityId)) return false;
        if (!Objects.equals(degreeId, that.degreeId)) return false;
        if (!Objects.equals(astronautId, that.astronautId)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = astronautEducationId;
        result = 31 * result + (universityId != null ? universityId.hashCode() : 0);
        result = 31 * result + (degreeId != null ? degreeId.hashCode() : 0);
        result = 31 * result + (astronautId != null ? astronautId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "university_id", referencedColumnName = "university_id")
    public UniversityInfoEntity getUniversityInfoByUniversityId() {
        return universityInfoByUniversityId;
    }

    public void setUniversityInfoByUniversityId(UniversityInfoEntity universityInfoByUniversityId) {
        this.universityInfoByUniversityId = universityInfoByUniversityId;
    }

    @ManyToOne
    @JoinColumn(name = "degree_id", referencedColumnName = "degree_id")
    public DegreeInfoEntity getDegreeInfoByDegreeId() {
        return degreeInfoByDegreeId;
    }

    public void setDegreeInfoByDegreeId(DegreeInfoEntity degreeInfoByDegreeId) {
        this.degreeInfoByDegreeId = degreeInfoByDegreeId;
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
        return "AstronautEducationInfoEntity{" +
                "universityInfoByUniversityId=" + universityInfoByUniversityId +
                ", degreeInfoByDegreeId=" + degreeInfoByDegreeId +
                '}';
    }
}
