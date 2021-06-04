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

public class RootController897 implements Initializable {

	@FXML
	private CheckBox chk1; // CheckButton1
	@FXML
	private CheckBox chk2; // CheckButton2
	@FXML
	private ImageView checkImageView; // CheckButton ImageView
	@FXML
	private ToggleGroup group; // RadioButton ToggleButton
	@FXML
	private ImageView radioImageView; // RadioButton ToggleButton ImageView(Bubble, Bar, AreaChart)
	@FXML
	private Button btnExit; // 종료이미지

	@Override
	public void initialize(URL loacation, ResourceBundle resources) {
		// RadioButton 또는 ToggleButton 그룹 내에서 선택 변경을 감시하기
		// 선택이 변경되면 changed() 메소드 실행되고 세번째 매개값인 newValue에 마지막으로 선택된 컨트롤이 대입된다.
		// ToggleGroup 의 selecteToggle 속성감시 리스너 설정
		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
				Image image = new Image(getClass()
						.getResource("../../images/" + newValue.getUserData().toString() + ".png").toString());

				radioImageView.setImage(image);
			}
		});

	}

	// CheckBox 이벤트 처리
	public void handleChkAction(ActionEvent e) {
		if (chk1.isSelected() && chk2.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("../../images/geek-glasses-hair.gif").toString()));
		} else if (chk1.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("../../images/geek-glasses.gif").toString()));
		} else if (chk2.isSelected()) {
			checkImageView.setImage(new Image(getClass().getResource("../../images/geek-hair.gif").toString()));
		} else {
			checkImageView.setImage(new Image(getClass().getResource("../../images/geek.gif").toString()));
		}
	}

	// Button 이벤트 처리
	public void handleBtnExitAction(ActionEvent e) {
		Platform.exit();
	}

}
