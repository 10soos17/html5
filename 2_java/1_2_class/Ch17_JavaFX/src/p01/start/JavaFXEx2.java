package p01.start;

import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class JavaFXEx2 extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Button btn = new Button();
		btn.setText("버튼");
		
		//1. 익명 구현 객체
//		EventHandler<ActionEvent> arg0 = new EventHandler<ActionEvent>(){
//			@Override
//			public void handle(ActionEvent arg0) {
//				System.out.println("Hello World!");
//			}
//		};
//		arg0.handle(arg0);
		
		//2. 익명 구현 객체 
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent arg0) {
//				System.out.println("Hello World!");//console 창 출력 내용 
//			}
//		});
		
		//3. Lambda Expression
		btn.setOnAction(arg0 -> System.out.println("Hello World!"));//console 창 출력 내용 
			

		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene s = new Scene(root, 300, 250);
		stage.setScene(s);
		stage.setTitle("버튼 클릭!");
		stage.show();
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		launch(args);
	}

}
