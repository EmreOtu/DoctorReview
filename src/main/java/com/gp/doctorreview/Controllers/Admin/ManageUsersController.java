package com.gp.doctorreview.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ManageUsersController implements Initializable {
    public TableView user_table;
    public TextField id_fld;
    public TextField name_fld;
    public TextField role_fld;
    public TextField email_fld;
    public TextField password_fld;
    public TextField dob_fld;
    public TextField address_line_fld;
    public TextField postcode_fld;
    public Button add_user_btn;
    public Button update_user_btn;
    public Button delete_user_btn;
    public Label err_msg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
