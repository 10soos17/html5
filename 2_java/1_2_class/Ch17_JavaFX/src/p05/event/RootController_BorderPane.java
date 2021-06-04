package p05.event;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;

public class RootController_BorderPane implements Initializable {
	@FXML
	private Label label;
	@FXML
	private Slider slider;
	@FXML
	private Button btn1;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				
				label.setFont(new Font(arg1.doubleValue()));
				
			}
			
		});

	}

}
