package com.suyu.controller;

import com.suyu.utils.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.event.*;
import java.net.*;
import java.util.*;

public class FofaPwdController implements Initializable {
    @FXML
    private Button fofa_save;
    @FXML
    private TextField key_id;
    @FXML
    private TextArea fofa_acc_text;
    @FXML
    private TextField mail_account;
    private MainController main;

//    public void setMain(final MainController main) {
//        this.main = main;
//    }

    public void syslog(final String log) {
        this.fofa_acc_text.appendText(log + "----" + Tools.getTimeNow() + "\r\n");
    }

    @FXML
    public void savefofa(final Event e) {
        final String pc = this.mail_account.getText() + ":" + this.key_id.getText();
        FileTools.writeFile(Path.getRootPath() + "fofa.ini", pc);
        this.syslog("配置文件修改成功");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
