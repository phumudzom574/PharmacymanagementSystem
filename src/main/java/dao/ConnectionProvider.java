package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    public static Connection getcon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/pharmacy?useSSL=false",
                "root",
                "Pharmacy@2026"
            );

            System.out.println("DATABASE CONNECTED SUCCESSFULLY!");
            return con;

        } catch (Exception e) {
            System.out.println("Database Connection Error: " + e);
            return null;
        }
    }
}