package dataBaseConnectionTest;

import com.astronaut.space.jdbc.dao.databaseGateway;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    private static databaseGateway Gateway;

    public static void main(String[] args) {
        try {
            Connection connection = databaseGateway.getDBConnection();
            System.out.println("Connection Established . . .");

            

        } catch (SQLException e) {

        }
    }

}
