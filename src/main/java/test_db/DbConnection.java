package test_db;

import com.astronaut.space.jdbc.model.MissionLandingSite;

import java.sql.*;

public class DbConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/nasa_space_exploration_database?useSSL=false";
        String user = "root";
        String password = "root";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            String sql = "select * from mission_landing_site";

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("mission_landing_site_id"));
                String landingSiteName = rs.getString("mission_landing_site_name");
                String landingSiteCity = rs.getString("mission_landing_site_city");
                String landingSiteState = rs.getString("mission_landing_site_state");
                String landingSiteCountry = rs.getString("mission_landing_site_country");

                MissionLandingSite missionLandingSite = new MissionLandingSite.Builder(id).
                        landingSiteName(landingSiteName).ladingSiteCity(landingSiteCity)
                        .landingSiteState(landingSiteState).landingSiteCountry(landingSiteCountry).build();

                System.out.println(missionLandingSite);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
