package com.gp.doctorreview.Controllers.General;

import com.gp.doctorreview.Models.Feedback;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class FeedbackCellController implements Initializable {
    public Label date_lbl;
    public Label sender_name;
    public Label review_point;
    public Label doctor_name;
    public Label feedback_title;
    public Label feedback_msg;
    public Button delete_btn;

    private final Feedback feedback;

    public FeedbackCellController(Feedback feedback) {
        this.feedback = feedback;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        date_lbl.textProperty().bind(feedback.dateSentProperty().asString());
        sender_name.textProperty().bind(feedback.senderNameProperty());
        review_point.textProperty().bind(feedback.reviewPointProperty().asString());
        doctor_name.textProperty().bind(feedback.doctorNameProperty());
        feedback_title.textProperty().bind(feedback.feedbackTitleProperty());
        feedback_msg.textProperty().bind(feedback.feedbackMessageProperty());
    }
}
