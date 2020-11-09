package com.astronaut.space.jdbc.model;

public class SpaceShipInfo {

    private int id;
    private String spaceShipName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpaceShipName() {
        return spaceShipName;
    }

    public void setSpaceShipName(String spaceShipName) {
        this.spaceShipName = spaceShipName;
    }

    @Override
    public String toString() {
        return "SpaceShipInfo{" +
                "id=" + id +
                ", spaceShipName='" + spaceShipName + '\'' +
                '}';
    }
}
