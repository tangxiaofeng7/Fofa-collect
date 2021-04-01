package com.suyu.controller;

import com.suyu.Main;
import com.suyu.utils.*;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.collections.*;
import com.r4v3zn.fofa.core.client.*;
import javafx.event.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.*;
import java.util.*;

public class FofaController extends Main implements Initializable {
    @FXML
    private Button stop_btn;
    @FXML
    private TextArea result_text;
    @FXML
    private ComboBox<?> page_cbx;
    @FXML
    private TextField fofa_q;
    @FXML
    private Button search_btn;
    @FXML
    private Button clear_btn;
    @FXML
    private ProgressBar processbar;

    private MainController main;
    private GoThread t;

    public FofaController() {
    }

    public MainController getMain() {
        return this.main;
    }

    public void setMain(MainController main) {
        ObservableList products = FXCollections.observableArrayList((Object[])new String[] { "1", "99", "1000" });
        this.page_cbx.setItems(products);
        this.page_cbx.getSelectionModel().select(2);
        this.main = main;
        this.syslog("在使用本工具前，请先在配置您的Fofa账号和KEY");
    }


    public void syslog(String log) {
        this.result_text.appendText(log + "\r\n");
    }

    private void go() {
            String pa = Path.getRootPath() + "fofa.ini";
            String pstr = FileTools.readFileAllContent(pa, "utf-8");
            String[] ps = pstr.split(":");
            String email = ps[0];
            String key = ps[1].replace("\n", "");
            String q = this.fofa_q.getText();
            int p = Integer.parseInt(this.page_cbx.getValue().toString());
            FofaClient client = new FofaClient(email, key);

            for (int i = 1; i < p; ++i) {
                processbar.setProgress((float)i/(float)p);
                String a = null;
                try {
                    a = String.valueOf(client.getData(String.valueOf(client.getData(q, i)))).trim();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                String b = a.substring(a.indexOf("[") + 1, a.indexOf("]")).replace(", ", "\n").replace("https://", "").replace("http://", ".");
                this.syslog(b);
            }

    }

    public void fofa_search(ActionEvent actionEvent) {
        this.result_text.setText("");
        (t = new GoThread()).start();
    }


    public void fofa_search_stop(ActionEvent actionEvent) {
        t.stop();
        processbar.setProgress(1);
    }

    public void fofa_clear(ActionEvent actionEvent) {
        this.result_text.setText("");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    class GoThread extends Thread{
        @Override
        public void run() {
            go();
        }
    }
}
