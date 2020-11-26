package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "university_info", schema = "nasa_space_exploration_database")
public class UniversityInfoEntity {
    private int universityId;
    private String universityName;
    private Collection<AstronautEducationInfoEntity> astronautEducationInfosByUniversityId;

    @Id
    @Column(name = "university_id", nullable = false)
    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    @Basic
    @Column(name = "university_name", nullable = false, length = 30)
    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UniversityInfoEntity that = (UniversityInfoEntity) o;

        if (universityId != that.universityId) return false;
        if (!Objects.equals(universityName, that.universityName))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = universityId;
        result = 31 * result + (universityName != null ? universityName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "universityInfoByUniversityId")
    public Collection<AstronautEducationInfoEntity> getAstronautEducationInfosByUniversityId() {
        return astronautEducationInfosByUniversityId;
    }

    public void setAstronautEducationInfosByUniversityId(Collection<AstronautEducationInfoEntity> astronautEducationInfosByUniversityId) {
        this.astronautEducationInfosByUniversityId = astronautEducationInfosByUniversityId;
    }
}
