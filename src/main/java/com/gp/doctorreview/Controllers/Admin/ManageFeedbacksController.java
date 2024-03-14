package com.gp.doctorreview.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ManageFeedbacksController implements Initializable {
    public TableView feedback_table;
    public TextField id_fld;
    public TextField sender_id_fld;
    public TextField sender_name_fld;
    public TextField doctor_id_fld;
    public TextField doctor_name_fld;
    public TextField date_sent_fld;
    public TextField msg_text_fld;
    public TextField review_point_fld;
    public Button delete_feedback_btn;
    public Label err_msg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
