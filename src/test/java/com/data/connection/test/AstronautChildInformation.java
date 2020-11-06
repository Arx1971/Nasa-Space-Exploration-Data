package com.data.connection.test;

import com.astronaut.space.jdbc.dao.connection.manager.Gateway;
import com.astronaut.space.jdbc.model.AstronautChildInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AstronautChildInformation {

    public static void main(String[] args) {

        List<AstronautChildInfo> astronautChildInfos = new ArrayList<>();

        try {
            int id = 9;
            Connection connection = Gateway.getDBConnection();
            Statement statement = connection.createStatement();
            String sql = "select astronaut_child_id, astronaut_child_name\n" +
                    "from astronaut_info, astronaut_child_info\n" +
                    "where astronaut_info.astronaut_id = " + Integer.toString(id) + " and\n" +
                    "astronaut_info.astronaut_id = astronaut_child_info.astronaut_id;";

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                int childId = Integer.parseInt(rs.getString("astronaut_child_id"));
                String childName = rs.getString("astronaut_child_name");
                AstronautChildInfo astronautChildInfo = new AstronautChildInfo.Builder().
                        childId(childId).childName(childName).build();
                astronautChildInfos.add(astronautChildInfo);
            }

            for (AstronautChildInfo astronautChildInfo : astronautChildInfos) {
                System.out.println(astronautChildInfo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
