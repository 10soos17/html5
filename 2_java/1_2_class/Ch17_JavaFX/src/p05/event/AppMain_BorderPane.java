package p05.event;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain_BorderPane extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root_BorderPane.fxml"));

		Scene s = new Scene(root);

		stage.setTitle("AppMain");
		stage.setScene(s);
		stage.show();
	}

}
