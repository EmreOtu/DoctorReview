package com.gp.doctorreview.Controllers.Patient;

import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class DoctorsDetailControl implements Initializable {
    public Label doctor_name;
    public Label doctor_spec;
    public Label review_point;
    public Label total_viewers;
    public TextField name_fld;
    public TextField date_fld;
    public TextArea feedback_text_area;
    public Slider feedback_slider;
    public Button submit_btn;
    public Label err_msg;
    public ListView feedbacks;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
}
