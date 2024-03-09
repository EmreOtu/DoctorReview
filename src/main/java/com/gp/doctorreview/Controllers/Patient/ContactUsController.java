package com.gp.doctorreview.Controllers.Patient;

import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class ContactUsController implements Initializable {
    public TextField name_fld;
    public TextField email_fld;
    public ChoiceBox msg_type_box;
    public TextArea msg_area;
    public Button send_btn;
    public Label err_msg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
