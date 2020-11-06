package com.astronaut.space.jdbc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Astronaut {

    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String country;
    private String gender;

    private List<AstronautChildInfo> astronautChildInfos = new ArrayList<>();

    private Astronaut(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dateOfBirth = builder.dateOfBirth;
        this.country = builder.country;
        this.gender = builder.gender;
        this.astronautChildInfos = builder.astronautChildInfos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<AstronautChildInfo> getAstronautChildInfos() {
        return astronautChildInfos;
    }

    public void setAstronautChildInfos(List<AstronautChildInfo> astronautChildInfos) {
        this.astronautChildInfos = astronautChildInfos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Astronaut)) return false;
        Astronaut astronaut = (Astronaut) o;
        return getId() == astronaut.getId() &&
                getFirstName().equals(astronaut.getFirstName()) &&
                getLastName().equals(astronaut.getLastName()) &&
                Objects.equals(getDateOfBirth(), astronaut.getDateOfBirth()) &&
                Objects.equals(getCountry(), astronaut.getCountry()) &&
                Objects.equals(getGender(), astronaut.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getDateOfBirth(), getCountry(), getGender());
    }

    @Override
    public String toString() {
        return "Astronaut{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static class Builder {
        private final int id;
        private final String firstName;
        private final String lastName;
        private String dateOfBirth;
        private String country;
        private String gender;
        private List<AstronautChildInfo> astronautChildInfos;

        public Builder(int id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder dateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder astronautChildrenInfo(List<AstronautChildInfo> astronautChildInfos) {
            this.astronautChildInfos = astronautChildInfos;
            return this;
        }

        public Astronaut build() {
            return new Astronaut(this);
        }

    }
}
