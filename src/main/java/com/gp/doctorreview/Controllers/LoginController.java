package com.gp.doctorreview.Controllers;

import com.gp.doctorreview.Models.Model;
import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public Label create_account_lbl;
    public TextField email_field;
    public PasswordField password_field;
    public Button signin_btn;
    public Button logout_btn;
    public Label error_msg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        signin_btn.setOnAction(actionEvent -> onLogin());
        logout_btn.setOnAction(actionEvent -> Platform.exit());
        create_account_lbl.setOnMouseClicked(mouseEvent -> onCreateAccount());
    }

    private void onLogin() {
        Stage stage = (Stage) error_msg.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showClientHomePage();
    }

    private void onCreateAccount() {
        Stage stage = (Stage) error_msg.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showSignUpPage();
    }
}
