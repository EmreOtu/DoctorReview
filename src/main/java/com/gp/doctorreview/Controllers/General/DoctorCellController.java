package com.gp.doctorreview.Controllers.General;

import com.gp.doctorreview.Models.Doctor;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DoctorCellController implements Initializable {
    public Label name_lbl;
    public Label spec_lbl;
    public Label review_point_lbl;
    public Label total_view_lbl;
    public Button delete_btn;

    private final Doctor doctor;

    public DoctorCellController(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
