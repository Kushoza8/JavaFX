package com.example.javafx;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SceneControl2 {
    @FXML
    TextArea textArea=new TextArea();
    public void display(String username){
        textArea.setText("Hello "+username);
    }
}
