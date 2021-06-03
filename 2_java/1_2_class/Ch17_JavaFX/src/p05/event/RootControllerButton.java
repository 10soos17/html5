package p05.event;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootControllerButton implements Initializable{
	
	@FXML private CheckBox chk1;
	@FXML private CheckBox chk2;
	@FXML private ImageView checkImageView;
	@FXML private ToggleGroup group;
	@FXML private ImageView radioImageView;
	@FXML private Button btnExit;
	
	
	@Override
	public void initialize(URL loacation, ResourceBundle resources) {
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
		
			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				Image image = new Image(getClass().getResource("FX_images/"+newValue.getUserData().toString()+".png").toString());
				
				radioImageView.setImage(image);
			}
		});
		
	
	}
	
	public void handleChkAction(ActionEvent e) {
		if(chk1.isSelected() && chk2.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("FX_images/geek-glasses-hair.gif").toString()));
		}else if(chk1.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("FX_images/geek-glasses.gif").toString()));
		}else if(chk2.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("FX_images/geek-hair.gif").toString()));
		}else {
			checkImageView.setImage(new Image(getClass().getResource("FX_images/geek.gif").toString()));
		}
	}
	
	public void handleBtnExitAction(ActionEvent e) {
		Platform.exit();
	}

}
