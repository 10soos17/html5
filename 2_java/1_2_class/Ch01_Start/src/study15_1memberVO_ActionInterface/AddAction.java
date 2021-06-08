package study15_1memberVO_ActionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddAction implements Action {
	MemberVO m;
	// HashMap<List, MemberVO> hMap;

//	public AddAction() {
//		hMap = new HashMap<List, MemberVO>();
//	}
	@Override
	public List getExecute(Scanner sc) {
		return null;
	}


	@Override
	public void execute(Scanner sc) {
		m = new MemberVO();
		System.out.println("등록할 회원의 정보를 입력하새요.");
		System.out.println("이름: ");
		m.setName(sc.next());
		System.out.println("나이: ");
		m.setAge(sc.nextInt());
		System.out.println("이메일: ");
		m.setEmail(sc.next());
		System.out.println("국가: ");
		m.setNation(sc.next());
		System.out.println("전화 번호: ");
		m.setTel(sc.next());

		
		addMember(m);

	}
	
	

	public void update(List key, Scanner sc) {
		System.out.println("add");
		m = MemberVO.hMap.get(key);
		System.out.println("나이: ");
		m.setAge(sc.nextInt());
		System.out.println("이메일: ");
		m.setEmail(sc.next());
		System.out.println("국가: ");
		m.setNation(sc.next());
		System.out.println("전화 번호: ");
		m.setTel(sc.next());
	}

	private void addMember(MemberVO member) {
		m.hMap.put(Arrays.asList(member.getName(), member.getAge()), member);
	}


}
