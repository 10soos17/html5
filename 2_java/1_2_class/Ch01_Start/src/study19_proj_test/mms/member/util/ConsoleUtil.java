package study19_proj_test.mms.member.util;

import java.util.ArrayList;
import java.util.Scanner;

import study19_proj_test.mms.member.ui.MemberUI;
import study19_proj_test.mms.member.vo.Member;

//5. 사용자로부터의 입력을 콘솔에서 읽어 들이거나 콘솔로 메시지를 출력하는 역할을 하는 클래스 구현
public class ConsoleUtil {
	Member m;

	public Member getNewMember(Scanner sc) {
		//
		
		

		return m;
	}

	public void printAddSuccessMessage(Member newMember) {
		System.out.println(newMember.getName() + "회원 정보 추가 성공");
	}

	public void printAddFailMessage(Member newMember) {
		System.out.println(newMember.getName() + "회원 정보 추가 실패");
	}

	public void printMemberList(ArrayList<Member> memberList) {
		// size(): 컬렉션에 저장되어 있는 요소의 개수를 리턴하는 메소드
		String text;
		for(Member m : memberList) {
			text = m.toString();
			System.out.println(text);
			MemberUI.displayText(text);
		}
	}

	public String getName(String msgKind, Scanner sc) {
		//
		return "";
	}

	public Member getUpdateMember(Scanner sc, Member oldMember) {
		//
		return m;
	}

	public void printModifySuccessMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " 회원 정보 수정 성공.");
	}

	public void printModifyFailMessage(Member updateMember) {
		System.out.println(updateMember.getName() + " 회원 정보 수정 실패.");
	}

	public void printRemoveSuccessMessage(String name) {
		System.out.println(name + " 회원의 정보 삭제 성공.");
	}

	public void printRemoveFailMessage(String name) {
		System.out.println(name + " 회원의 정보 삭제 실패.");
	}
}
