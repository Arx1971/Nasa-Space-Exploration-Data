package com.astronaut.space.hibernate.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "astronaut_info", schema = "nasa_space_exploration_database")
public class AstronautInfoEntity {
    private int astronautId;
    private String astronautFname;
    private String astronautLname;
    private Date astronautDob;
    private String astronautCountry;
    private String astronautGender;
    private Collection<AstronautChildInfoEntity> astronautChildInfosByAstronautId;
    private Collection<AstronautEducationInfoEntity> astronautEducationInfosByAstronautId;
    private Collection<AstronautSpouseInfoEntity> astronautSpouseInfosByAstronautId;
    private Collection<MissionDetailsEntity> missionDetailsByAstronautId;

    @Id
    @Column(name = "astronaut_id", nullable = false)
    public int getAstronautId() {
        return astronautId;
    }

    public void setAstronautId(int astronautId) {
        this.astronautId = astronautId;
    }

    @Basic
    @Column(name = "astronaut_fname", nullable = false, length = 20)
    public String getAstronautFname() {
        return astronautFname;
    }

    public void setAstronautFname(String astronautFname) {
        this.astronautFname = astronautFname;
    }

    @Basic
    @Column(name = "astronaut_lname", nullable = false, length = 20)
    public String getAstronautLname() {
        return astronautLname;
    }

    public void setAstronautLname(String astronautLname) {
        this.astronautLname = astronautLname;
    }

    @Basic
    @Column(name = "astronaut_dob", nullable = false)
    public Date getAstronautDob() {
        return astronautDob;
    }

    public void setAstronautDob(Date astronautDob) {
        this.astronautDob = astronautDob;
    }

    @Basic
    @Column(name = "astronaut_country", nullable = false, length = 20)
    public String getAstronautCountry() {
        return astronautCountry;
    }

    public void setAstronautCountry(String astronautCountry) {
        this.astronautCountry = astronautCountry;
    }

    @Basic
    @Column(name = "astronaut_gender", nullable = true, length = 1)
    public String getAstronautGender() {
        return astronautGender;
    }

    public void setAstronautGender(String astronautGender) {
        this.astronautGender = astronautGender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AstronautInfoEntity that = (AstronautInfoEntity) o;

        if (astronautId != that.astronautId) return false;
        if (!Objects.equals(astronautFname, that.astronautFname))
            return false;
        if (!Objects.equals(astronautLname, that.astronautLname))
            return false;
        if (!Objects.equals(astronautDob, that.astronautDob)) return false;
        if (!Objects.equals(astronautCountry, that.astronautCountry))
            return false;
        if (!Objects.equals(astronautGender, that.astronautGender))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = astronautId;
        result = 31 * result + (astronautFname != null ? astronautFname.hashCode() : 0);
        result = 31 * result + (astronautLname != null ? astronautLname.hashCode() : 0);
        result = 31 * result + (astronautDob != null ? astronautDob.hashCode() : 0);
        result = 31 * result + (astronautCountry != null ? astronautCountry.hashCode() : 0);
        result = 31 * result + (astronautGender != null ? astronautGender.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "astronautInfoByAstronautId")
    public Collection<AstronautChildInfoEntity> getAstronautChildInfosByAstronautId() {
        return astronautChildInfosByAstronautId;
    }

    public void setAstronautChildInfosByAstronautId(Collection<AstronautChildInfoEntity> astronautChildInfosByAstronautId) {
        this.astronautChildInfosByAstronautId = astronautChildInfosByAstronautId;
    }

    @OneToMany(mappedBy = "astronautInfoByAstronautId")
    public Collection<AstronautEducationInfoEntity> getAstronautEducationInfosByAstronautId() {
        return astronautEducationInfosByAstronautId;
    }

    public void setAstronautEducationInfosByAstronautId(Collection<AstronautEducationInfoEntity> astronautEducationInfosByAstronautId) {
        this.astronautEducationInfosByAstronautId = astronautEducationInfosByAstronautId;
    }

    @OneToMany(mappedBy = "astronautInfoByAstronautId")
    public Collection<AstronautSpouseInfoEntity> getAstronautSpouseInfosByAstronautId() {
        return astronautSpouseInfosByAstronautId;
    }

    public void setAstronautSpouseInfosByAstronautId(Collection<AstronautSpouseInfoEntity> astronautSpouseInfosByAstronautId) {
        this.astronautSpouseInfosByAstronautId = astronautSpouseInfosByAstronautId;
    }

    @OneToMany(mappedBy = "astronautInfoByAstronautId")
    public Collection<MissionDetailsEntity> getMissionDetailsByAstronautId() {
        return missionDetailsByAstronautId;
    }

    public void setMissionDetailsByAstronautId(Collection<MissionDetailsEntity> missionDetailsByAstronautId) {
        this.missionDetailsByAstronautId = missionDetailsByAstronautId;
    }
}
