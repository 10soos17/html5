package study19_projMMS.member_modify.util;

import java.util.ArrayList;

import javafx.application.Platform;
import study19_projMMS.member_modify.ui.MemberUI;
import study19_projMMS.member_modify.vo.Member;

//5. 사용자로부터의 입력을 콘솔에서 읽어 들이거나 콘솔로 메시지를 출력하는 역할을 하는 클래스 구현
public class ConsoleUtil {
	
//	public Member getNewMember(Scanner sc) {
//		displayText("등록할 회원 정보를 입력하세요.");
//		displayText("이름: ");
//
//		displayText("주소: ");
//		String addr = sc.next();
//
//		displayText("국가: ");
//		String nation = sc.next();
//
//		displayText("이메일: ");
//		String email = sc.next();
//
//		displayText("나이: ");
//		int age = sc.nextInt();
//
//		return new Member(name, addr, nation, email, age);
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

	public void printMemberList(ArrayList<Member> memberList) {
		System.out.println(memberList.toString());

		for (Member member : memberList) {
			MemberUI.displayText(member.toString());
		}
		Platform.runLater(() -> {
			MemberUI.init_btnText("select", "exit");

		});
		MemberUI.startProgram();
	}

//	public String getName(String msgKind, Scanner sc) {
//		displayText(msgKind + "회원이름을 입력하세요.");
//		displayText("회원이름: ");
//
//		return sc.next();
//	}

//	public Member getUpdateMember(Scanner sc, Member oldMember) {
//		System.out.println("수정할 회원 정보를 입력하세요.");
//
//		System.out.println("이전 주소: " + oldMember.getAddr());
//		System.out.println("수정할 주소: ");
//		String addr = sc.next();
//
//		System.out.println("이전 국가: " + oldMember.getNation());
//		System.out.println("국가: ");
//		String nation = sc.next();
//
//		System.out.println("이전 이메일: " + oldMember.getEmail());
//		System.out.println("이메일: ");
//		String email = sc.next();
//
//		System.out.println("이전 나이: " + oldMember.getAge());
//		System.out.println("나이: ");
//		int age = sc.nextInt();
//
//		return new Member(oldMember.getName(), addr, nation, email, age);
//	}

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
