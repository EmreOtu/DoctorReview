package com.gp.doctorreview.Controllers.Patient;

import com.gp.doctorreview.Models.Feedback;
import com.gp.doctorreview.Models.Model;
import com.gp.doctorreview.Views.FeedbackCellFactory;
import javafx.beans.binding.Bindings;
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
    public ListView<Feedback> feedbacks;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initData();
        doctor_name.textProperty().bind(Model.getInstance().getSelectedDoctor().nameProperty());
        doctor_spec.textProperty().bind(Model.getInstance().getSelectedDoctor().specializationProperty());
        review_point.textProperty().bind(Bindings.concat(Model.getInstance().getSelectedDoctor().reviewPointProperty()).concat(" / 5.0"));
        total_viewers.textProperty().bind(Bindings.concat(Model.getInstance().getSelectedDoctor().totalViewerProperty()).concat(" Total View"));

        feedbacks.setItems(Model.getInstance().getDoctorFeedbacks());
        feedbacks.setCellFactory(f -> new FeedbackCellFactory());

    }

    private void initData() {
        if (Model.getInstance().getDoctorFeedbacks().isEmpty()) {
            Model.getInstance().setDoctorFeedbacks(Model.getInstance().getSelectedDoctor().IDProperty().get());
        }
    }
}
