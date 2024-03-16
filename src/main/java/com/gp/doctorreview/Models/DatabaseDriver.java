package com.gp.doctorreview.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseDriver {

    private Connection conn;

    public DatabaseDriver() {
        try {
            this.conn = DriverManager.getConnection("jdbc:sqlite:data.db");
        } catch (SQLException e) {
            System.out.println("Exception :change:");
        }
    }

    // Patient Section

    // Admin Section

    // General Section

}
