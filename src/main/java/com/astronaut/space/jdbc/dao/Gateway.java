package com.astronaut.space.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Gateway {

    private static final String url = "jdbc:mysql://localhost:3306/nasa_space_exploration_database?useSSL=false";
    private static final String user = "root";
    private static final String pass = "root";

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }

    private static Connection dbConnection = null;

    public static Connection getDBConnection() throws SQLException {
        if (null == dbConnection) {
            dbConnection = getConnection();
        }
        return dbConnection;
    }
}
