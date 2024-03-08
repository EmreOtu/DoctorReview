package com.gp.doctorreview.Views;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ViewFactory {
    // Client Settings
    private BorderPane homePage;

    public ViewFactory(){}

    public BorderPane getHomePage() {
        if (homePage == null) {
            try {
                homePage = new FXMLLoader(getClass().getResource("/Fxml/Patient/HomePage.fxml")).load();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
        return homePage;
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
            System.out.println(e.toString());
        }

        Stage stage = new Stage();
        stage.setTitle("Doctor Review");
        stage.setScene(scene);
        stage.show();
    }

}
