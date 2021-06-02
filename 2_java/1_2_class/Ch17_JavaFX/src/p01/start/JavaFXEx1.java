package p01.start;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

//JavaFX: Java + GUI
//		: Java 화면 설계 - 투명 구조 

//Stage => Title + Scene(Container => Controller)
public class JavaFXEx1 extends Application {

	// 2.실행
	@Override
	public void start(Stage stage) throws Exception {
		Circle c = new Circle(140, 40, 30);
		Group root = new Group(c);

		Scene s = new Scene(root, 300, 200);
		stage.setTitle("JavaFX...");

		stage.setScene(s);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);// 1.시작

	}

}
