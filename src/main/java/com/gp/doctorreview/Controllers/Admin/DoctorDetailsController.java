package com.gp.doctorreview.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class DoctorDetailsController implements Initializable {
    public Label doctor_name;
    public Label doctor_spec;
    public Label review_point;
    public Label total_viewers;
    public Button change_details_btn;
    public Button delete_doctor_btn;
    public ListView feedbacks;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
