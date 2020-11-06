package com.astronaut.space.jdbc.API.serviceAPI;

import com.astronaut.space.jdbc.dao.connection.manager.Gateway;
import com.astronaut.space.jdbc.model.Astronaut;
import com.astronaut.space.jdbc.model.AstronautChildInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceApi implements ApiInterface {

    private Connection connection;

    public ServiceApi() {
        try {
            connection = Gateway.getDBConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Astronaut> getAllAstronauts() {

        List<Astronaut> astronauts = new ArrayList<>();

        try {
            Connection connection = Gateway.getDBConnection();
            Statement statement = connection.createStatement();
            String query = "select * from astronaut_info";

            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("astronaut_id"));
                String fName = rs.getString("astronaut_fname");
                String lName = rs.getString("astronaut_lname");
                String dob = rs.getString("astronaut_dob");
                String country = rs.getString("astronaut_country");
                String gender = rs.getString("astronaut_gender");

                Astronaut astronaut = new Astronaut.Builder(id, fName, lName).
                        dateOfBirth(dob).gender(gender).country(country).build();
                astronauts.add(astronaut);
            }

            for (Astronaut astronaut : astronauts) {
                System.out.println(astronaut);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return astronauts;
    }

    @Override
    public List<AstronautChildInfo> getAstronautChildById(int id) {
        List<AstronautChildInfo> astronautChildInfos = new ArrayList<>();
        try {
            Connection connection = Gateway.getDBConnection();
            Statement statement = connection.createStatement();
            String sql = "select astronaut_child_name\n" +
                    "from astronaut_info, astronaut_child_info\n" +
                    "where astronaut_info.astronaut_id = 9 and\n" +
                    "astronaut_info.astronaut_id = astronaut_child_info.astronaut_id;";

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                rs.getString("astronaut_child_name");
            }

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return astronautChildInfos;
    }

}
