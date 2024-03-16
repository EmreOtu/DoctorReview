package com.gp.doctorreview.Controllers.General;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class FeedbackCellContainer implements Initializable {
    public Label date_lbl;
    public Label sender_name;
    public Label review_point;
    public Label doctor_name;
    public Label feedback_title;
    public Label feedback_msg;
    public Button delete_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
