package test_db;

import com.astronaut.space.jdbc.model.MissionLandingSite;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/nasa_space_exploration_database?useSSL=false";
        String user = "root";
        String password = "root";

        List<Map<String, Object>> resultList = new ArrayList<>();
        Map<String, Object> row = new HashMap<>();

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            String sql = "select astronaut_info.astronaut_id,\n" +
                    "astronaut_info.astronaut_fname,\n" +
                    "astronaut_info.astronaut_lname,\n" +
                    "university_info.university_name,\n" +
                    "degree_info.degree_name\n" +
                    "from astronaut_info,\n" +
                    "university_info,\n" +
                    "degree_info,\n" +
                    "astronaut_education_info\n" +
                    "where astronaut_info.astronaut_id = astronaut_education_info.astronaut_id\n" +
                    "and degree_info.degree_id = astronaut_education_info.degree_id\n" +
                    "and university_info.university_id = astronaut_education_info.university_id;\n";

            ResultSet rs = statement.executeQuery(sql);


            ResultSetMetaData metaData = rs.getMetaData();
            Integer columnCount = metaData.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    row.put(metaData.getColumnName(i), rs.getObject(i));
                }
                resultList.add(row);
            }

            System.out.println(resultList);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}