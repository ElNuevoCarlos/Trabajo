module javaFXProject {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.base;
	opens controller;
	opens model to javafx.base;
	opens application to javafx.graphics, javafx.fxml;
}
