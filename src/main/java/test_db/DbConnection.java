package test_db;

import java.sql.*;

public class DbConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/nasa_space_exploration_database?useSSL=false";
        String user = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            System.out.println("Connection Established. . . ");

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }

}
