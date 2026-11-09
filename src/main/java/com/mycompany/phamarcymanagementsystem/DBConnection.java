package com.mycompany.phamarcymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

   private static final String URL =
        "jdbc:mysql://localhost:3307/pharmacy?useSSL=false&allowPublicKeyRetrieval=true";

    private static final String USER = "root";

    private static final String PASSWORD = "Pharmacy@2026";

    public static Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println("MySQL connected successfully");

            return conn;

        } catch (ClassNotFoundException e) {

            System.out.println("MySQL Driver not found");
            e.printStackTrace();

            return null;

        } catch (SQLException e) {

            System.out.println("MySQL connection failed");
            e.printStackTrace();

            return null;
        }
    }
}