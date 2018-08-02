package com.mcelrea;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    Button button1;
    @FXML
    TextArea textArea;

    @FXML
    public void handleButtonPress(MouseEvent e) {
        textArea.setText("Button pressed");
    }
}
