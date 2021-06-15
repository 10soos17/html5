package study19_projMMS.member.util;

import java.util.Enumeration;
import java.util.Hashtable;

import javafx.application.Platform;

import study19_projMMS.member.vo.Member;
import study19_projMMS.member.ui.MemberUI;


//5. 사용자로부터의 입력을 콘솔에서 읽어 들이거나 콘솔로 메시지를 출력하는 역할을 하는 클래스 구현
public class ConsoleUtil {
	Member m;

//	public Member getNewMember(Scanner sc) {
//		//
//
//		return m;
//	}
//	public String getName(String msgKind, Scanner sc) {
//		//
//		return "";
//	}
//
//	public Member getUpdateMember(Scanner sc, Member oldMember) {
//		//
//		return m;
//	}
	public void printAddSuccessMessage(Member newMember) {
		System.out.println(newMember.getName() + "회원 정보 추가 성공");
		MemberUI.displayText(newMember.getName() + "회원 정보 추가 성공");

		MemberUI.init_QList();

	}

	public void printAddFailMessage(Member newMember) {
		System.out.println(newMember.getName() + "회원 정보 추가 실패");
		MemberUI.displayText(newMember.getName() + "회원 정보 추가 실패");

		MemberUI.init_QList();
	}

	public void printMemberList(Hashtable<Integer, Member> mHash) {
		String text;

		Enumeration<Integer> e = ((Hashtable<Integer, Member>) mHash).keys();
		while (e.hasMoreElements()) {
			Integer key = e.nextElement();
			Member value = mHash.get(key);
			System.out.println("키2: " + key + ", 값: " + value);
			text = value.toString();
			MemberUI.displayText(text);
		}

		Platform.runLater(() -> {
			MemberUI.init_btnText("select","exit");

		});
		MemberUI.startProgram();
	}

	public void printModifySuccessMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " 회원 정보 수정 성공.");
		MemberUI.displayText(updateMember.getName() + " 회원 정보 수정 성공.");

		MemberUI.init_QList();
	}

	public void printModifyFailMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " 회원 정보 수정 실패.");
		MemberUI.displayText(updateMember.getName() + " 회원 정보 수정 실패.");

		MemberUI.init_QList();
	}

	public void printRemoveSuccessMessage(String name) {
		System.out.println(name + " 회원의 정보 삭제 성공.");
		MemberUI.displayText(name + " 회원의 정보 삭제 성공.");

		MemberUI.init_QList();
	}

	public void printRemoveFailMessage(String name) {
		System.out.println(name + " 회원의 정보 삭제 실패.");
		MemberUI.displayText(name + " 회원의 정보 삭제 실패.");

		MemberUI.init_QList();
	}
}
