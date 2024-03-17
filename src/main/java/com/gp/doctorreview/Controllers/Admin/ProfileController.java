package com.gp.doctorreview.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileController implements Initializable {
    public Label name_lbl;
    public Label email_lbl;
    public Label date_lbl;
    public Label address_line_lbl;
    public Label post_code_lbl;
    public Button manage_users_btn;
    public Button manage_doctors_btn;
    public Button manage_feedbacks_btn;
    public TextField current_password_fld;
    public TextField new_password_fld;
    public TextField confirm_password_fld;
    public Button change_password_btn;
    public Label error_msg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
