package study19_projMMS.member_modify.action;

import java.util.Scanner;

//각 요청을 제어하는 Action 클래스 객체들을 공통적으로 접근할 수 있는 인터페이스 정의 
//user input 값 받아서 -> db처리 -> 결과물 출력 
public interface Action {
	
	void execute(Scanner sc) throws Exception;

}
