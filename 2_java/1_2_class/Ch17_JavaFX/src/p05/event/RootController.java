package p05.event;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

//Event 동작 작성하기 
public class RootController implements Initializable {

	@FXML
	private Button btn1;
	@FXML
	private Button btn2;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				handleButton1Action(e);
			}
		});

		btn2.setOnAction(e -> handleButton2Action(e));
		// btn3.setOnAction(e->handleButton3Action(e));
	}

	public void handleButton1Action(ActionEvent e) {
		System.out.println("버튼1 클릭");
	}

	public void handleButton2Action(ActionEvent e) {
		System.out.println("버튼2 클릭");
	}

	public void handleButton3Action(ActionEvent e) {
		System.out.println("버튼3 클릭");
	}

}
