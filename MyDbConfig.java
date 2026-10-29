
package iplproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConfig {

    public static Connection getSQLDbConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url =
                "jdbc:mysql://localhost:3306/ipl_1340?createDatabaseIfNotExist=true";

            String userName = "root";
            String pass = "Mohit@12345"; // 

            Connection con = DriverManager.getConnection(
                url, userName, pass
            );

            return con; // Main fix: connection return karo

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {

        Connection con = getSQLDbConnection();

        if (con != null) {
            System.out.println("Connection test successful!");

            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Connection failed!");
        }
    }
}