package com.zenjava;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public class HelloController {

    public void showAlertWindow() {
        Alert a = new Alert(AlertType.CONFIRMATION);
        a.show();
    }

    public void showCustomizedAlertWindow() {
        Alert a = new Alert(AlertType.CONFIRMATION, "some content text", ButtonType.OK, ButtonType.CANCEL, ButtonType.FINISH);
        ((Button) a.getDialogPane().lookupButton(ButtonType.FINISH)).setText("_finished");
        a.show();
    }

}
