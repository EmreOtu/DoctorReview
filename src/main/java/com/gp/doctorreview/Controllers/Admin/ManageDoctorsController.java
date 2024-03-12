package com.gp.doctorreview.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ManageDoctorsController implements Initializable {
    public TableView doctor_table;
    public TextField id_fld;
    public TextField name_fld;
    public TextField spec_fld;
    public TextField rating_fld;
    public TextField total_rew_fld;
    public Button add_doctor_btn;
    public Button update_doctor_btn;
    public Button delete_doctor_btn;
    public Label err_msg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
