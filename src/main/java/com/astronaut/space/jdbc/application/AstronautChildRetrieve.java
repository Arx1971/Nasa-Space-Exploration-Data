package com.astronaut.space.jdbc.application;

import com.astronaut.space.jdbc.dao.connection.manager.Gateway;
import com.astronaut.space.jdbc.model.Astronaut;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AstronautChildRetrieve {

    public static void main(String[] args) {

        try {
            Connection connection = Gateway.getDBConnection();
            Statement statement = connection.createStatement();
            String query = "select * from astronaut_info";

            ResultSet rs = statement.executeQuery(query);

            List<Astronaut> astronauts = new ArrayList<>();

            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("astronaut_id"));
                String fName = rs.getString("astronaut_fname");
                String lName = rs.getString("astronaut_lname");
                String dob = rs.getString("astronaut_fname");
                String country = rs.getString("astronaut_country");
                String gender = rs.getString("astronaut_gender");
                Astronaut astronaut = new Astronaut.Builder(id, fName, lName).country(country).build();
                astronauts.add(astronaut);
            }

            for(Astronaut astronaut: astronauts){
                System.out.println(astronaut);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
