package com.gp.doctorreview.Controllers.Patient;

import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileController implements Initializable {
    public Label name_lbl;
    public Label email_lbl;
    public Label date_lbl;
    public Label address_line_lbl;
    public Label post_code_lbl;
    public ListView feedbacks_history;
    public TextField name_fld;
    public TextField email_fld;
    public TextField dob_fld;
    public TextField address_line_fld;
    public TextField postcode_fld;
    public Button change_btn;
    public Label err_msg;
    public TextField current_password_fld;
    public TextField new_password_fld;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
