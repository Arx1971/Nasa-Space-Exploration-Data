package com.astronaut.space.jdbc.model;

import java.util.Objects;

public class Astronaut {

    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String country;
    private String gender;


    public Astronaut(int id, String firstName, String lastName, String dateOfBirth, String country, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
        this.gender = gender;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Astronaut)) return false;
        Astronaut astronaut = (Astronaut) o;
        return getId() == astronaut.getId() &&
                Objects.equals(getFirstName(), astronaut.getFirstName()) &&
                Objects.equals(getLastName(), astronaut.getLastName()) &&
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
}
