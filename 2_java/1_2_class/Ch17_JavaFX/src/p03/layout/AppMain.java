package p03.layout;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//858
public class AppMain extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		// Container 종류 : 871
		// HBox: 수평으로 배치하는 layout
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(10, 10, 10, 10));// 상우하좌
		hbox.setSpacing(10);

		// Controller: 895
		TextField textField = new TextField();
		textField.setPrefWidth(200);

		Button btn = new Button();
		btn.setText("확인");
		btn.setOnAction(obj -> System.out.println(textField.getText()));

		ObservableList list = hbox.getChildren();
		list.add(textField);
		list.add(btn);

		Scene s = new Scene(hbox);
		stage.setTitle("AppMain");
		stage.setScene(s);
		stage.show();

	}

}
