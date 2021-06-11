package study19_proj_test.mms.member.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import study19_proj_test.mms.member.action.MemberListAction;
import study19_proj_test.mms.member.controller.MemberController;
import study19_proj_test.mms.member.svc.MemberListService;
import study19_proj_test.mms.member.util.ConsoleUtil;
import study19_proj_test.mms.member.vo.Member;

//1.DB 관련 공통 기능 클래스 
public class jdbcUtil {
	
	static Connection conn;

	
	static {
		// 클래스가 로딩될 때 단 한번 호출되는 영역
		// Class.forName : 특정 클래스를 메모리로 로딩하는 메소드

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6_g.jar가 해당 위치에 없습니다.");
		}

	}

	public static Connection getConnection() {
		// 디비 작업에 필요한 Connection 객체를 생성해 주는 메소드
		try {

			String url = "jdbc:oracle:thin:@localhost:1521:ee";
			conn = DriverManager.getConnection(url, "pjt19", "pjt19");
			System.out.println("Connection Success!");
			return conn;
		} catch (SQLException e) {
			System.out.println("주소및 id,pw가 다릅니다.");
		}
		return conn;
	}

	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {

		}

	}

	// transaction 처리 메소

	public static void transaction(Connection connect, String number) {
		ArrayList<Member> mList=new ArrayList<>();
		ConsoleUtil cu = new ConsoleUtil();

		switch (number) {

		case "1":
			System.out.println("svc1");


			break;
		case "2":
			System.out.println("svc2");

			break;
		case "3":
			System.out.println("svc3");
			MemberListService mls = new MemberListService();
			mList = mls.getMemberList(connect);
			System.out.println("svc3끝"+mList.size());
			cu.printMemberList(mList);
			System.out.println("print끝");
	
			

			break;
		case "4":
			System.out.println("svc4");

			break;

		}
		

	}

}
