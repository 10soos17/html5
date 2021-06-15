package study19_projMMS.member_modify.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import study19_projMMS.member_modify.vo.Member;
import study19_projMMS.member_modify.action.Action;
import study19_projMMS.member_modify.action.MemberListAction;
import study19_projMMS.member_modify.action.MemberAddAction;
import study19_projMMS.member_modify.action.MemberModifyAction;
import study19_projMMS.member_modify.action.MemberRemoveAction;
import study19_projMMS.member_modify.controller.MemberController;
import study19_projMMS.member_modify.dao.MemberDAO;
import study19_projMMS.member_modify.db.jdbcUtil;

//MemberUI(menu선택 받은후)-> (Action, Scanner 매개변로 받는)MemberController 호출 ->
//~Action 클래스들(Action interface상속한)들 호출 -> 
//~Action클래스 내에서(ConsoleUtil클래스(입력값받기)->
//					(결과값받아서)~Service클래스들 호출->
//                  (결과값받아서)ConsoleUtil클래스(결과값출력))
public class MemberUI extends Application {
	//// JavaFX UI 변수
	public static TextArea txtDisplay;
	public static TextField txtInput;
	public static Button btnConn, btnSend;
	public static Label label;

	// user input control 변수
	public static ArrayList<String> qList = new ArrayList<>(Arrays.asList("이름: ", "주소: ", "국가: ", "이메일: ", "나이: "));
	public static int qNum = 0;
	public static Member m;

	MemberController memberController = new MemberController();

	public static void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}

	public static void init_btnText(String sendText, String connText) {
		btnSend.setText(sendText);
		btnConn.setText(connText);
	}

	public static void init_QList() {
		MemberUI.qList = new ArrayList<>(Arrays.asList("이름: ", "주소: ", "국가: ", "이메일: ", "나이: "));
		MemberUI.qNum = 0;
		m = null;
		startProgram();
	}

	public static void stopProgram() {
		System.exit(0);
	}

	public static void main(String[] args) {
		launch(args);

	}

	public static void startProgram() {

		System.out.println("start");
		displayText("*********회원관리 프로그램*********");
		displayText("1.회원등록\n2.회원목록보기\n3.회원정보수정\n4.회원정보삭제\n5.프로그램종료\n");
		btnSend.setDisable(false);

	}

	public void inputProcess() {

		//MemberController memberController = new MemberController();
		Scanner sc = new Scanner(System.in);

		String text = txtInput.getText();
		String sendText = btnSend.getText();

		switch (sendText) {

		case "select":

			if (text.equals("1")) {

				displayText("[메뉴번호: 1]");
				txtInput.setText("");

				displayText("등록할 회원정보를 입력하세요.");
				displayText(qList.get(qNum));

				init_btnText("send","메뉴1");
				break;

			} else if (text.equals("2")) {

				displayText("[메뉴번호: 2]");
				txtInput.setText("");

				memberController.processRequest(new MemberListAction(), sc);
				init_btnText("send","메뉴2");
				break;
				
			} else if (text.equals("3")) {

				displayText("[메뉴번호: 3]");
				txtInput.setText("");

				displayText("수정할 회원정보를 입력하세요.");
				displayText(qList.get(qNum));

				init_btnText("send","메뉴3");
				break;
			} else if (text.equals("4")) {

				displayText("[메뉴번호: 4]");
				txtInput.setText("");

				displayText("삭제할 회원정보를 입력하세요.");
				displayText(qList.get(qNum));

				init_btnText("send","메뉴4");
				break;
			} else if (text.equals("5")) {
				System.out.println("프로그램종료");
				txtInput.setText("");
				stopProgram();
				break;
			}

		case "send":

			displayText(txtInput.getText());
			label.setText(txtInput.getText());

		}

	}

	public void inputQAProcess(String inputText) {

		MemberDAO memberdao = null;
		Scanner sc = new Scanner(System.in);

		Action action = null;
		// System.out.println("Label Text Changed");
		String menu = btnConn.getText();

		qList.set(qNum, inputText);
		qNum += 1;

		txtInput.setText("");

		if (menu.equals("메뉴1")) {

			if (qNum == 5) {

				m = new Member(qList.get(0), qList.get(1), qList.get(2), qList.get(3), Integer.parseInt(qList.get(4)));

				memberController.processRequest(new MemberAddAction(), sc);
				init_btnText("select", "exit");

			} else {
				displayText(qList.get(qNum));
			}

		} else if (menu.equals("메뉴3")) {

			if (qNum == 1) {
				memberdao = new MemberDAO(jdbcUtil.getConnection());
				m = memberdao.selectOldMember(qList.get(qNum - 1));

				qList = new ArrayList<>(Arrays.asList(m.getName(), "이전 주소: " + m.getAddr() + ", 수정할 주소: ",
						"이전 국가: " + m.getNation() + ", 수정할 국가: ", "이전 이메일: " + m.getEmail() + ", 수정할 이메일: ",
						"이전 나이: " + m.getAge() + ", 수정할 나이: "));

				if (m == null) {
					displayText(qList.get(qNum - 1) + "님의 회원 정보가 없습니다.");
					init_btnText("select", "exit");
					init_QList();
				} else {
					displayText(qList.get(qNum));
				}

			} else if (qNum == 5) {
				init_btnText("select", "exit");
				memberController.processRequest(new MemberModifyAction(), sc);
			} else {
				displayText(qList.get(qNum));
			}

		} else if (menu.equals("메뉴4") && qNum == 1) {
			memberdao = new MemberDAO(jdbcUtil.getConnection());
			m = memberdao.selectOldMember(qList.get(qNum - 1));

			if (m == null) {
				displayText(qList.get(qNum - 1) + "님의 회원 정보가 없습니다.");
				init_btnText("select", "exit");
				init_QList();
			} else {
				init_btnText("select", "exit");
				memberController.processRequest(new MemberRemoveAction(), sc);
			}

		}

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// ======layout 구조 : BorderPane 2개
		// 1. root : BorderPane(txtDisplay)
		// 2. bottom : BorderPane(txtInput,BtnConn,BtnSend)
		BorderPane root = new BorderPane();
		root.setPrefSize(300, 500);
		BorderPane bottom = new BorderPane();

		// ======txtDisplay
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));

		// ======txtInput
		txtInput = new TextField();
		txtInput.setPrefSize(60, 30);
		BorderPane.setMargin(txtInput, new Insets(0, 1, 1, 1));

		// ======label
		label = new Label("");
		label.setFont(new Font("Cambria", 11));
		label.setPrefSize(0, 0);
		BorderPane.setMargin(txtInput, new Insets(0, 0, 0, 0));
		// MemberUI.setAlignment(label, Pos.TOP_LEFT);

		// ======btnConn
		btnConn = new Button("start");
		btnConn.setPrefSize(60, 30);

		// ======btnSend
		btnSend = new Button("select");
		btnSend.setPrefSize(60, 30);
		btnSend.setDisable(true);

		// ======화면 배치 set
		bottom.setCenter(txtInput);
		bottom.setLeft(btnConn);
		bottom.setRight(btnSend);

		root.setCenter(txtDisplay);
		root.setTop(label);
		root.setBottom(bottom);

		Scene scene = new Scene(root);

		scene.getStylesheets().add(getClass().getResource("app.css").toString());

		primaryStage.setScene(scene);
		primaryStage.setTitle("mms_member");

		primaryStage.show();

		// =======================action==================================
		// ======btnConn action
		btnConn.setOnAction(e -> {
			if (btnConn.getText().equals("start"))
				startProgram();
			else if (btnConn.getText().equals("exit"))
				stopProgram();
		});
		// ======btnSend action
		btnSend.setOnAction(e -> inputProcess());

		// ======label action
		label.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> ov, String t, String t1) {
				inputQAProcess(t1);
			}
		});
		// ======stage action
		primaryStage.setOnCloseRequest(event -> stopProgram());

	}

}
