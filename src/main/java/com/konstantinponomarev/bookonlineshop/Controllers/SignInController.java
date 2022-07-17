package com.konstantinponomarev.bookonlineshop.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.konstantinponomarev.bookonlineshop.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class SignInController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignIn_button;

    @FXML
    private TextArea SignIn_login;

    @FXML
    private PasswordField SignIn_password;

    @FXML
    private Button ToSignUp;



    @FXML
    void initialize() {
        assert SignIn_button != null : "fx:id=\"SignIn_button\" was not injected: check your FXML file 'SignInWindow.fxml'.";
        assert SignIn_login != null : "fx:id=\"SignIn_login\" was not injected: check your FXML file 'SignInWindow.fxml'.";
        assert SignIn_password != null : "fx:id=\"SignIn_password\" was not injected: check your FXML file 'SignInWindow.fxml'.";
    }

    public void ToSignUp_Click(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SignUpWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage newStage = new Stage();
        newStage.setTitle("BookOnlineShop регистрация");
        newStage.setScene(scene);
        newStage.setResizable(false);
        newStage.show();

        Stage stage = (Stage)  ToSignUp.getScene().getWindow();
        stage.close();
    }
}
