package controller;

import application.Main;
import data.ArticleDataManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Article;


public class TableViewArticlesControllers {
	private ArticleDataManager bookManager = ArticleDataManager.getInstance();
	@FXML private TableColumn<Article, String> titulo;
	@FXML private TableColumn<Article, String> autor;
	@FXML private TableColumn<Article, Long> ISSN;
	@FXML private TableColumn<Article, Integer> año;
	
	@FXML private TableView<Article> tableBook;
	
	@FXML public void initialize() {
		ObservableList<Article> books = FXCollections.observableArrayList();
		for (Article article : bookManager.getArticles()) {
			books.add(article);
		}
		titulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
		autor.setCellValueFactory(new PropertyValueFactory<>("autor"));
		ISSN.setCellValueFactory(new PropertyValueFactory<>("ISSN"));
		año.setCellValueFactory(new PropertyValueFactory<>("año"));
		tableBook.setItems(books);
	}

	
    @FXML
    void goToMainMenu(ActionEvent event) {
        Main.loadScene("/view/MenuArticle.fxml");
    }
}
