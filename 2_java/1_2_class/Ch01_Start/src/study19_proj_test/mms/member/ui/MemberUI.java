package study19_proj_test.mms.member.ui;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import study19_proj_test.mms.member.action.Action;
import study19_proj_test.mms.member.action.MemberAddAction;
import study19_proj_test.mms.member.action.MemberListAction;
import study19_proj_test.mms.member.action.MemberModifyAction;
import study19_proj_test.mms.member.action.MemberRemoveAction;
import study19_proj_test.mms.member.controller.MemberController;
import study19_proj_test.mms.member.db.jdbcUtil;

public class MemberUI extends Application {

	MemberController memberController = new MemberController();
	Scanner sc;

	public void startProgram() {

		System.out.println("start");
		displayText("1.회원등록\n2.회원목록보기\n3.회원정보수정\n4.회원정보삭제\n5.프로그램종료\n");
		btnSend.setDisable(false);
		send("3");
		/*
		 * Platform.runLater(()->{ displayText("[연결 완료: " +
		 * socket.getRemoteSocketAddress() + "]"); btnConn.setText("stop");
		 * btnSend.setDisable(false); });
		 */
	}

	public void send(String text) {

		switch (text) {

		case "1":
			System.out.println("1");
			displayText("메뉴번호: 1");
			txtInput.setText("");

			break;
		case "2":
			System.out.println("2");
			displayText("메뉴번호: 2");
			txtInput.setText("");
			break;
		case "3":
			System.out.println("3");
			displayText("메뉴번호: 3");
			txtInput.setText("");
			memberController.processRequest(new MemberListAction(), sc);
			
			break;
		case "4":
			System.out.println("4");
			displayText("메뉴번호: 4");
			txtInput.setText("");

			break;
		case "5":
			System.out.println("5");
			displayText("프로그램 종료.");
			txtInput.setText("");
			System.exit(0);
			break;

		}
	}

	public boolean stopProgram() {

		return false;
	}

	//// JavaFX를 이용한 UI 생성 코드
	static TextArea txtDisplay;
	static TextField txtInput;
	static Button btnConn, btnSend;

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);

		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);

		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);

		BorderPane bottom = new BorderPane();
		txtInput = new TextField();
		txtInput.setPrefSize(60, 30);
		BorderPane.setMargin(txtInput, new Insets(0, 1, 1, 1));

		btnConn = new Button("start");
		btnConn.setPrefSize(60, 30);
		btnConn.setOnAction(e -> {
			if (btnConn.getText().equals("start")) {
				startProgram();
			} else if (btnConn.getText().equals("exit")) {
				stopProgram();
			}
		});

		btnSend = new Button("send");
		btnSend.setPrefSize(60, 30);
		btnSend.setDisable(true);
		btnSend.setOnAction(e -> send(txtInput.getText()));

		bottom.setCenter(txtInput);
		bottom.setLeft(btnConn);
		bottom.setRight(btnSend);
		root.setBottom(bottom);

		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("");
		primaryStage.setOnCloseRequest(event -> stopProgram());
		primaryStage.show();
	}

	//
	public static void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}

	public static void main(String[] args) {
		launch(args);

	}

}
