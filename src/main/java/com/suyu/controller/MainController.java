package com.suyu.controller;

import com.suyu.utils.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.*;
import java.net.*;
import java.util.*;


public class MainController implements Initializable {
    @FXML
    private TabPane mainTabPane;
    @FXML
    public static TextArea txtlog;
    @FXML
    private ToggleButton PortScanStop_btn;
    @FXML
    private static TextField Target_port;
    @FXML
    private TextArea PortScan_ip;
    @FXML
    private ToggleButton PortScanStart_btn;
    @FXML
    private ToggleButton PortImport_btn;
    @FXML
    private MenuItem close;

    public void syslog(final String log) {
        MainController.txtlog.appendText(log + "----" + Tools.getTimeNow() + "\r\n");
    }

    @FXML
    public void about(final Event e) {
        try {
            final DialogPane da = new DialogPane();
            da.setHeaderText("苏宇@涂鸦");
            final Stage stage = new Stage();
            final Scene sc = new Scene((Parent)da);
            stage.setScene(sc);
            stage.initStyle(StageStyle.UTILITY);
            stage.initModality(Modality.WINDOW_MODAL);
            stage.setTitle("关于我");
            stage.setAlwaysOnTop(true);
            stage.show();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void openFofacollect(final Event e) {
        try {
            final FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getClassLoader().getResource("FoFa.fxml"));
            final Parent root = (Parent)fxmlLoader.load();
            final FofaController fo = (FofaController)fxmlLoader.getController();
            fo.setMain(this);
            final Tab tab = new Tab();
            tab.setText("Fofa查询窗口界面");
            tab.setContent((Node)root);
            this.mainTabPane.getTabs().add((Tab) tab);
            this.mainTabPane.getSelectionModel().select(tab);
        }
        catch (Exception var2) {
            this.syslog(var2.getMessage());
        }
    }

    @FXML
    private void fofa_pwd(final Event event) {
        try {
            final FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getClassLoader().getResource("fofa_pwd.fxml"));
            final Parent root = (Parent)fxmlLoader.load();
            final Stage stage = new Stage();
            final Scene sc = new Scene(root);
            stage.setScene(sc);
            stage.setAlwaysOnTop(true);
            stage.show();
        }
        catch (Exception var3) {
            this.syslog(var3.getMessage());
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}