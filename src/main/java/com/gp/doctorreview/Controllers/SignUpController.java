package com.gp.doctorreview.Controllers;

import com.gp.doctorreview.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    public Label signin_lbl;
    public TextField name_field;
    public TextField email_field;
    public PasswordField password_field;
    public DatePicker date_field;
    public Button create_an_account_btn;
    public Button logout_btn;
    public Label error_msg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        signin_lbl.setOnMouseClicked(mouseEvent -> onSignIn());
        logout_btn.setOnAction(actionEvent -> onLogout());
    }

    private void onSignIn() {
        Stage stage = (Stage) error_msg.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
        Model.getInstance().getViewFactory().showLoginPage();
    }

    private void onLogout() {
        Stage stage = (Stage) error_msg.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);
    }
}
