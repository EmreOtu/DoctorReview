package com.gp.doctorreview.Models;

import com.gp.doctorreview.Views.ViewFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;
    private final DatabaseDriver databaseDriver;

    // User Section
    private final User user;
    private boolean userLoginSuccessFlag;

    // General Section
    private final ObservableList<Doctor> doctors;

    private Model() {
        this.viewFactory = new ViewFactory();
        this.databaseDriver = new DatabaseDriver();
        // User Section
        this.user = new User(0, "", "", "", null, "", "");
        this.userLoginSuccessFlag = false;

        // General Section
        this.doctors = FXCollections.observableArrayList();
    }

    public static synchronized Model getInstance() {
        if (model == null) {
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }
    public DatabaseDriver getDatabaseDriver() {return databaseDriver;}

    // User Methods Section
    public User getUser() {
        return user;
    }

    public boolean isUserLoginSuccessFlag() {
        return userLoginSuccessFlag;
    }

    public void setUserLoginSuccessFlag(boolean userLoginSuccessFlag) {
        this.userLoginSuccessFlag = userLoginSuccessFlag;
    }

    public void evaluateUserCredentials(String email, String password) {
        ResultSet resultSet = databaseDriver.getUserData(email, password);
        try {
            if (resultSet.isBeforeFirst()) {
                this.user.IDProperty().set(resultSet.getInt("userID"));
                this.user.nameProperty().set(resultSet.getString("name"));
                this.user.roleProperty().set(resultSet.getString("role"));
                this.user.emailProperty().set(resultSet.getString("email"));
                String[] dateParts = resultSet.getString("dateOfBirth").split("-");
                int year = Integer.parseInt(dateParts[0]);
                int month = Integer.parseInt(dateParts[1]);
                int day = Integer.parseInt(dateParts[2]);
                LocalDate dob = LocalDate.of(year, month, day);
                this.user.dateOfBirthProperty().set(dob);
                this.user.addressLineProperty().set(resultSet.getString("addressLine1"));
                this.user.postcodeProperty().set(resultSet.getString("postcode"));

                this.userLoginSuccessFlag = true;
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception");
        }
    }

    public boolean isUserExist(String email) {
        boolean exist;
        ResultSet resultSet = databaseDriver.userExist(email);

        try {
            exist = resultSet.isBeforeFirst();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return exist;
    }

    // General Methods Section
    public ObservableList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors() {
        ResultSet resultSet = databaseDriver.getAllDoctorsData();

        try {
            while (resultSet.next()) {
                int doctorID = resultSet.getInt("doctorID");
                String doctorName = resultSet.getString("doctorName");
                String specialization = resultSet.getString("specialization");
                Double reviewRating = resultSet.getDouble("reviewRating");
                int totalReviews = resultSet.getInt("totalReviews");

                doctors.add(new Doctor(doctorID, doctorName, specialization, reviewRating, totalReviews));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
