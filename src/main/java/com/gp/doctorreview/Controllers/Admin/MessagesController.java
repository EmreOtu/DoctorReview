package com.gp.doctorreview.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MessagesController implements Initializable {
    public TextField name_fld;
    public TextField email_fld;
    public TextField message_title_fld;
    public TextArea msg_area;
    public Button delete_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
