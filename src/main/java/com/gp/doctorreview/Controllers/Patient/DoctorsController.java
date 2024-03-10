package com.gp.doctorreview.Controllers.Patient;

import com.gp.doctorreview.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class DoctorsController implements Initializable {
    public ListView specializations_listview;
    public TextField search_bar_fld;
    public Button search_btn;
    public RadioButton name_asc;
    public ToggleGroup sorting_toggle;
    public RadioButton name_desc;
    public RadioButton review_asc;
    public RadioButton review_desc;
    public ListView doctor_cards_listview;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        search_btn.setOnAction(actionEvent -> onDoctorDetail());
    }

    private void onDoctorDetail() {
        Model.getInstance().getViewFactory().getPatientSelectedHeaderItem().set("DoctorDetail");
    }
}