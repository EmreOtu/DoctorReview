package com.gp.doctorreview.Controllers.Admin;

import com.gp.doctorreview.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
    public BorderPane admin_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getAdminSelectedHeaderItem()
                .addListener((observableValue, oldVal, newVal) -> {
                    switch (newVal) {
                        case DOCTORS_PAGE -> admin_parent.setCenter(Model.getInstance().getViewFactory().getAdminDoctorPage());
                        default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getAdminHomePage());
                    }
                });
    }
}
