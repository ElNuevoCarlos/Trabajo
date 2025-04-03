package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuOptionsController {
    @FXML
    void registerArticle(ActionEvent event) {
    	Main.loadScene("/view/MenuArticle.fxml");
    }
    @FXML
    void registerBook(ActionEvent event) {
    	Main.loadScene("/view/MenuBook.fxml");
    }
    @FXML
    void goToMainMenu(ActionEvent event) {
    	Main.loadScene("/view/MenuPrincipal.fxml");
    }
}
