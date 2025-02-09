package com.example.testingstreamingplatform;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;

public class StreamControl1  {

    private Stage stage;
    private Scene scene2;
    private Scene scene3;
    @FXML
    private TextField emailField;

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setScene2(Scene scene2) {
        this.scene2 = scene2;
    }
    public void setScene3(Scene scene3) {
        this.scene3 = scene3;
    }

    @FXML
    private void switchToScene2() {
        String email = emailField.getText();
        StreamControl2 scene2Controller = (StreamControl2) scene2.getUserData();
        StreamControl3 scene3Controller = (StreamControl3) scene3.getUserData();// Hent eksisterende controller
        scene2Controller.setUserEmail(email);
        scene3Controller.setUserEmail(email);

        stage.setScene(scene3);
        stage.setScene(scene2);
    }

}
