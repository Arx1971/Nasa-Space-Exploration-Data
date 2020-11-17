package com.astronaut.space.hibernate.testEntity;

import javax.persistence.*;

@Entity
@Table(name = "astronaut_info")
public class AstronautInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "astronaut_id")
    private Integer id;
    @Column(name = "astronaut_fname")
    private String fName;
    @Column(name = "astronaut_lname")
    private String lName;
    @Column(name = "astronaut_dob")
    private String dob;
    @Column(name = "astronaut_country")
    private String country;
    @Column(name = "astronaut_Gender")
    private String astronautGender;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAstronautGender() {
        return astronautGender;
    }

    public void setAstronautGender(String astronautGender) {
        this.astronautGender = astronautGender;
    }

    @Override
    public String toString() {
        return "AstronautInfo{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", dob='" + dob + '\'' +
                ", country='" + country + '\'' +
                ", astronautGender='" + astronautGender + '\'' +
                '}';
    }
}
