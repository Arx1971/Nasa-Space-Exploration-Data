package com.astronaut.space.jdbc.application;

import com.astronaut.space.jdbc.dao.connection.manager.Gateway;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AstronautChildInformation {

    public static void main(String[] args) {

        try {
            int id = 9;
            Connection connection = Gateway.getDBConnection();
            Statement statement = connection.createStatement();
            String sql = "select astronaut_child_name\n" +
                    "from astronaut_info, astronaut_child_info\n" +
                    "where astronaut_info.astronaut_id = " + Integer.toString(id) + " and\n" +
                    "astronaut_info.astronaut_id = astronaut_child_info.astronaut_id;";

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getString("astronaut_child_name"));
            }

            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
