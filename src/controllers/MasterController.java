package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public interface MasterController {

	default public void switchScene(Node element, String path) {
		try {
			FXMLLoader page = new FXMLLoader(getClass().getResource(path));
			Stage mainStage = (Stage) element.getScene().getWindow();
			mainStage.setScene(new Scene(page.load()));
			mainStage.show();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	default public void setTitle(Node element, String name) {
		Stage mainStage = (Stage) element.getScene().getWindow();
		mainStage.setTitle(name);
	}
	
}
