package com.gp.doctorreview.Views;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ViewFactory {
    // Client Settings
    private final StringProperty patientSelectedHeaderItem;
    private BorderPane homePage;
    private AnchorPane contactUsPage;
    private AnchorPane doctorsPage;

    public ViewFactory(){
        this.patientSelectedHeaderItem = new SimpleStringProperty("");
    }

    /*
     * User Pages
     */

    public StringProperty getPatientSelectedHeaderItem(){
        return patientSelectedHeaderItem;
    }

    public BorderPane getHomePage() {
        if (homePage == null) {
            try {
                homePage = new FXMLLoader(getClass().getResource("/Fxml/Patient/HomePage.fxml")).load();
            } catch (Exception e) {
                e.fillInStackTrace();
            }
        }
        return homePage;
    }

    public AnchorPane getContactUsPage() {
        if (contactUsPage == null) {
            try {
                contactUsPage = new FXMLLoader(getClass().getResource("/Fxml/Patient/ContactUs.fxml")).load();
            } catch (Exception e) {
                e.fillInStackTrace();
            }
        }
        return contactUsPage;
    }

    public AnchorPane getDoctorsPage() {
        if (doctorsPage == null) {
            try {
                doctorsPage = new FXMLLoader(getClass().getResource("/Fxml/Patient/Doctors.fxml")).load();
            } catch (Exception e) {
                e.fillInStackTrace();
            }
        }
        return doctorsPage;
    }

    public void showLoginPage () {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        createStage(loader);
    }

    public void showSignUpPage() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/SignUp.fxml"));
        createStage(loader);
    }

    public void showClientHomePage() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Patient/Patient.fxml"));
        createStage(loader);
    }

    public void closeStage(Stage stage) {
        stage.close();
    }

    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.fillInStackTrace();
        }

        Stage stage = new Stage();
        stage.setTitle("Doctor Review");
        stage.setScene(scene);
        stage.show();
    }

}
