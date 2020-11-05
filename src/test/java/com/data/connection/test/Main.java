package com.data.connection.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static com.astronaut.space.jdbc.dao.connection.manager.Gateway Gateway;

    public static void main(String[] args) {
        try {
            Connection connection = com.astronaut.space.jdbc.dao.connection.manager.Gateway.getDBConnection();
            System.out.println("Connection Established . . .");

            Statement statement = connection.createStatement();
            String query = "select * from astronaut_child_info";

            ResultSet rs = statement.executeQuery(query);

            System.out.println(rs);

            while (rs.next()) {
                System.out.println(rs.getString("astronaut_child_name"));
            }


        } catch (SQLException e) {

        }
    }

}
