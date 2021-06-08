package study15_0memberVO_ActionInterface.answer;

//배열 크기(고정) => 배열크기 가변 
import java.util.Scanner;

public class MemberMain {
	
	static MemberVO[] members;// temp배열 변수

	public static void main(String[] args) {
		
		MemberService ms = new MemberService();
		Scanner sc = new Scanner(System.in);
		members = new MemberVO[0];//

		boolean isStop = false;
		int select;

		do {

			System.out.println("[다음 메뉴 중 하나를 입력하세요.]");
			System.out.println("1.회원 가입 2.회원 목록 보기 3. 회원 정보 수정 4. 회원 삭제 5. 종료");
			select = sc.nextInt();

			switch (select) {

			case 1:
				AddAction aa = new AddAction();
				ms.process(aa, sc);
				break;

			case 2:
				ListAction la = new ListAction();
				ms.process(la, sc);
				break;
			case 3:
				UpdateAction ua = new UpdateAction();
				ms.process(ua, sc);
				break;
			case 4:
				DeleteAction da = new DeleteAction();
				ms.process(da, sc);
				break;

			case 5:
				isStop = !isStop;

			}

		} while (!isStop);
	}

}
