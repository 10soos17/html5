package p02.basic;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	// Stage(Scene(Container(Controller))))
	@Override
	public void start(Stage stage) throws Exception {

		// Container
		VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);

		// Controller
		// 1
		Label label = new Label();
		label.setText("Hello, JavaFX");
		label.setFont(new Font(50));
		// 2
		Button btn = new Button();
		btn.setText("확인");
		btn.setOnAction(event -> Platform.exit()); // 버튼이 눌려지면 동작

		// Container(root)에 만든 Controller 장착
		root.getChildren().add(label);
		root.getChildren().add(btn);

		// Scene에 장착
		Scene s = new Scene(root);

		stage.setTitle("AppMain");
		stage.setScene(s);
		stage.show();

	}

}
