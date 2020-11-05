package com.astronaut.space.jdbc.application;

import com.astronaut.space.jdbc.dao.connection.manager.Gateway;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AstronautChildRetrieve {

    public static void main(String[] args) {

        try {
            Connection connection = Gateway.getDBConnection();
            Statement statement = connection.createStatement();
            String query = "select * from astronaut_child_info";

            ResultSet rs = statement.executeQuery(query);

            System.out.println(rs);

            while (rs.next()) {
                System.out.println(rs.getString("astronaut_child_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
