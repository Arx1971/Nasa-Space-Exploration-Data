package com.astronaut.space.jdbc.model;

import java.util.Objects;

public class Astronaut {

    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String country;
    private String gender;

    private Astronaut(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dateOfBirth = builder.dateOfBirth;
        this.country = builder.country;
        this.gender = builder.gender;
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

        public Builder(int id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder firstName(String firstName) {
            return this;
        }

        public Builder lastName(String lastName) {
            return this;
        }

        public Builder dateOfBirth(String dateOfBirth) {
            return this;
        }

        public Builder country(String country) {
            return this;
        }

        public Builder gender(String gender) {
            return this;
        }

        public Astronaut build() {
            return new Astronaut(this);
        }

    }
}
