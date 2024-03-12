package com.gp.doctorreview.Controllers.Admin;

import com.gp.doctorreview.Models.Model;
import com.gp.doctorreview.Views.AdminHeaderOptions;
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
        addListeners();
    }

    private void addListeners() {
        manage_users_btn.setOnAction(actionEvent -> onManageUsers());
        manage_doctors_btn.setOnAction(actionEvent -> onManageDoctors());
        manage_feedbacks_btn.setOnAction(actionEvent -> onManageFeedbacks());
    }

    private void onManageUsers() {
        Model.getInstance().getViewFactory().getAdminSelectedHeaderItem().set(AdminHeaderOptions.MANAGE_USERS);
    }

    private void onManageDoctors() {
        Model.getInstance().getViewFactory().getAdminSelectedHeaderItem().set(AdminHeaderOptions.MANAGE_DOCTORS);
    }

    private void onManageFeedbacks() {
        Model.getInstance().getViewFactory().getAdminSelectedHeaderItem().set(AdminHeaderOptions.MANAGE_FEEDBACKS);
    }
}
