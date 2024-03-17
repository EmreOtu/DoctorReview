package com.gp.doctorreview.Models;

import java.sql.*;
import java.time.LocalDate;

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
    public void createNewUser(String name, String email, String password, LocalDate date) {
        Statement statement;

        try {
            statement = this.conn.createStatement();
            statement.executeUpdate("INSERT INTO " +
                    "User (name, role, email, password, dateOfBirth)" +
                    "VALUES ('"+name+"', 'PATIENT', '"+email+"', '"+password+"', '"+date.toString()+"');");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // Admin Section

    // General Section
    public ResultSet getUserData(String email, String password) {
        Statement statement;
        ResultSet resultSet = null;
        String query = "SELECT * FROM User WHERE email='"+email+"' AND password='"+password+"';";

        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("SQL Exception");
        }
        return resultSet;
    }

    public ResultSet userExist(String email) {
        Statement statement;
        ResultSet resultSet = null;
        String query = "SELECT * FROM User WHERE email='"+email+"';";

        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("SQL Exception");
        }
        return resultSet;
    }

    public ResultSet getAllDoctorsData() {
        Statement statement;
        ResultSet resultSet = null;
        String query = "SELECT * FROM Doctor";

        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultSet;
    }
}
