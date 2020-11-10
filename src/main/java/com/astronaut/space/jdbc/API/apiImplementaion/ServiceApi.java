package com.astronaut.space.jdbc.API.apiImplementaion;

import com.astronaut.space.jdbc.API.apiInterface.ApiInterface;
import com.astronaut.space.jdbc.dao.connection.manager.Gateway;
import com.astronaut.space.jdbc.model.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ServiceApi implements ApiInterface {

    public ServiceApi() {
        try {
            Connection connection = Gateway.getDBConnection();
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

                List<AstronautChildInfo> astronautChildInfos = getAstronautChildById(id);

                Astronaut astronaut = new Astronaut.Builder(id, fName, lName).
                        dateOfBirth(dob).gender(gender).country(country).
                        astronautChildrenInfo(astronautChildInfos).build();
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

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return astronautChildInfos;
    }

    @Override
    public List<Astronaut> getAllAstronautsEductionDetails() {

        Map<Integer, Astronaut> astronauts = new HashMap<>();

        try {
            Connection connection = Gateway.getDBConnection();
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

            while (rs.next()) {
                int id = Integer.parseInt(rs.getString("astronaut_id"));
                String fName = rs.getString("astronaut_fname");
                String lName = rs.getString("astronaut_lname");
                String universityName = rs.getString("university_name");
                String degreeName = rs.getString("degree_name");

                Astronaut astronaut = new Astronaut.Builder(id, fName, lName).build();
                List<AstronautEductionInfo> astronautEductionInfos = new ArrayList<>();
                List<UniversityInfo> universityInfoList = new ArrayList<>();
                List<DegreeInfo> degreeInfoList = new ArrayList<>();

                UniversityInfo universityInfo = new UniversityInfo.Builder().universityName(universityName).build();
                universityInfoList.add(universityInfo);
                DegreeInfo degreeInfo = new DegreeInfo.Builder().degreeName(degreeName).build();
                degreeInfoList.add(degreeInfo);

                AstronautEductionInfo astronautEductionInfo = new AstronautEductionInfo.Builder().
                        DegreeInfo(degreeInfoList).UniversityInfo(universityInfoList).build();
                astronautEductionInfos.add(astronautEductionInfo);
                astronaut.setAstronautEductionInfos(astronautEductionInfos);

                if (astronauts.containsKey(id)) {
                    astronauts.get(id).getAstronautEductionInfos().add(astronautEductionInfo);
                } else astronauts.put(id, astronaut);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<Astronaut> list = new ArrayList<>();

        for (Integer a : astronauts.keySet()) {
            list.add(astronauts.get(a));
        }

        return list;
    }

    @Override
    public List<Astronaut> getAstronautMissionMileageInformation() {

        List<Astronaut> astronauts = new ArrayList<>();




        return astronauts;

    }

}
