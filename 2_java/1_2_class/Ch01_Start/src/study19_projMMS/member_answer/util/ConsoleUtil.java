package study19_projMMS.member_answer.util;

import java.util.Scanner;
import java.util.ArrayList;

import study19_projMMS.member_answer.vo.Member;

//5. 사용자로부터의 입력을 콘솔에서 읽어 들이거나 콘솔로 메시지를 출력하는 역할을 하는 클래스 구현
public class ConsoleUtil {


	public Member getNewMember(Scanner sc) {
		System.out.println("등록할 회원 정보를 입력하세요.");
		System.out.println("이름: ");
		String name = sc.next();

		System.out.println("주소: ");
		String addr = sc.next();

		System.out.println("국가: ");
		String nation = sc.next();

		System.out.println("이메일: ");
		String email = sc.next();

		System.out.println("나이: ");
		int age = sc.nextInt();

		return new Member(name, addr, nation, email, age);
	}

	public void printAddSuccessMessage(Member newMember) {
		System.out.println(newMember.getName() + "회원 정보 추가 성공");

	}

	public void printAddFailMessage(Member newMember) {
		System.out.println(newMember.getName() + "회원 정보 추가 실패");

	}

	public void printMemberList(ArrayList<Member> memberList) {
		System.out.println(memberList.toString());
	}
	
	public String getName(String msgKind, Scanner sc) {
		System.out.println(msgKind + "회원이름을 입력하세요.");
		System.out.println("회원이름: ");

		return sc.next();
	}

	public Member getUpdateMember(Scanner sc, Member oldMember) {
		System.out.println("수정할 회원 정보를 입력하세요.");

		System.out.println("이전 주소: " + oldMember.getAddr());
		System.out.println("수정할 주소: ");
		String addr = sc.next();

		System.out.println("이전 국가: " + oldMember.getNation());
		System.out.println("국가: ");
		String nation = sc.next();

		System.out.println("이전 이메일: " + oldMember.getEmail());
		System.out.println("이메일: ");
		String email = sc.next();

		System.out.println("이전 나이: " + oldMember.getAge());
		System.out.println("나이: ");
		int age = sc.nextInt();

		return new Member(oldMember.getName(), addr, nation, email, age);
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
