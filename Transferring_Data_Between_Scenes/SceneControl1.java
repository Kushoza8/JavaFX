package com.example.javafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class SceneControl1 {
    @FXML
    TextField textField=new TextField();
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void login(ActionEvent actionEvent)throws Exception {
        String username = textField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("log2.fxml"));
        root = loader.load();
        SceneControl2 sceneControl2 = loader.getController();
        sceneControl2.display(username);
        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
