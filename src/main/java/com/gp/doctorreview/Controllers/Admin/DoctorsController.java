package com.gp.doctorreview.Controllers.Admin;

import com.gp.doctorreview.Models.Model;
import com.gp.doctorreview.Views.AdminHeaderOptions;
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
    public Button add_doctor_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        add_doctor_btn.setOnAction(actionEvent -> onDoctorDetails());
    }

    private void onDoctorDetails() {
        Model.getInstance().getViewFactory().getAdminSelectedHeaderItem().set(AdminHeaderOptions.DOCTORS_DETAILS_PAGE);
    }
}
