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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class SignUpController {

   ///TODO Доделать остальные поля
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SignUp_button;

    @FXML
    private TextArea SignUp_login;

    @FXML
    private TextArea SignUp_password;

    @FXML
    private Button ToSignIn;

    @FXML
    void initialize() {
        assert SignUp_button != null : "fx:id=\"SignUp_button\" was not injected: check your FXML file 'SignUpWindow.fxml'.";
        assert SignUp_login != null : "fx:id=\"SignUp_login\" was not injected: check your FXML file 'SignUpWindow.fxml'.";
        assert SignUp_password != null : "fx:id=\"SignUp_password\" was not injected: check your FXML file 'SignUpWindow.fxml'.";
        assert ToSignIn != null : "fx:id=\"ToSignIn\" was not injected: check your FXML file 'SignUpWindow.fxml'.";

    }

    public void ToSignIn_click(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SignInWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage newStage = new Stage();
        newStage.setTitle("BookOnlineShop авторизация");
        newStage.setScene(scene);
        newStage.setResizable(false);
        newStage.show();

        Stage stage = (Stage)  ToSignIn.getScene().getWindow();
        stage.close();
    }
}
