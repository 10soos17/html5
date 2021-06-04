package p10.css;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain_External extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root_external.fxml"));

		Scene s = new Scene(root);
		//s.getStylesheets().add(getClass().getResource("app.css").toString());

		stage.setTitle("AppMain");
		stage.setScene(s);
		stage.show();
	}
}
