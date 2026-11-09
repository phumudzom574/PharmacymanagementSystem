package com.mycompany.phamarcymanagementsystem;

import java.sql.Connection;

public class PhamarcymanagementSystem {


    public static void main(String[] args) {

        DBConnection.getConnection();

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
 {

        Connection con = DBConnection.getConnection();

        if (con != null) {

            System.out.println("");
            System.out.println("DATABASE CONNECTED SUCCESSFULLY!");
            System.out.println("");

        } else {

            System.out.println("");
            System.out.println("DATABASE CONNECTION FAILED!");
            System.out.println("");
        }
    }
}