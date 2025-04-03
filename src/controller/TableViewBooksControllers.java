package controller;

import application.Main;
import data.BookDataManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Book;


public class TableViewBooksControllers {
	private BookDataManager bookManager = BookDataManager.getInstance();
	@FXML private TableColumn<Book, String> titulo;
	@FXML private TableColumn<Book, String> autor;
	@FXML private TableColumn<Book, Long> ISBN;
	@FXML private TableColumn<Book, Integer> año;
	
	@FXML private TableView<Book> tableBook;
	
	@FXML public void initialize() {
		ObservableList<Book> books = FXCollections.observableArrayList();
		for (Book book : bookManager.getBooks()) {
			books.add(book);
		}
		titulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
		autor.setCellValueFactory(new PropertyValueFactory<>("autor"));
		autor.setCellValueFactory(new PropertyValueFactory<>("ISBN"));
		autor.setCellValueFactory(new PropertyValueFactory<>("año"));
		tableBook.setItems(books);
	}

	
    @FXML
    void goToMainMenu(ActionEvent event) {
        Main.loadScene("/view/MenuBook.fxml");
    }
}
