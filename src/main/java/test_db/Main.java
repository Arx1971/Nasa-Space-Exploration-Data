package test_db;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/nasa_space_exploration_database?useSSL=false";
        String user = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String query = "select * from astronaut_child_info";

            ResultSet rs = statement.executeQuery(query);

            System.out.println(rs);

            while (rs.next()) {
                System.out.println(rs.getString("astronaut_child_name"));
            }

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }

    }

}
