package study05_member;

import java.util.ArrayList;

public class SearchService {
	Member member;
	ArrayList<Member> m = new ArrayList<Member>();
	//Member[] m = new Member[5]; 
	
	public SearchService() {
		m.add(new Member("홍길동", 167, 77, "대한민국"));
		m.add(new Member("James", 187, 67, "미국"));
		m.add(new Member("다나까", 166, 57, "일본"));
		m.add(new Member("마윈", 177, 80, "중국"));
		m.add(new Member("인도인", 199, 77, "인도"));
		/*
		m[0] = new Member("홍길동", 167, 77, "대한민국");
		m[1] = new Member("James", 187, 67, "미국");
		m[2] = new Member("다나까", 166, 57, "일본");
		m[3] = new Member("마윈", 177, 80, "중국");
		m[4] = new Member("인도인", 199, 77, "인도");*/
		
	}
	
	boolean searchMember(String name) {
		boolean searchResult = false;
		
		for(Member p : m) {
			if(name.equals(p.name)) {
				searchResult = true;
				member = p;
				printInfo();
			}
		}

		return searchResult;
	}

	private void printInfo() {
		System.out.println(member.getName() + "으로 찾은 결과");
		System.out.println("이름: "+ member.getName());
		System.out.println("신장: "+ member.getHeight());
		System.out.println("몸무게: "+ member.getWeight());
		System.out.println("국가: "+ member.getNation());
	}

}
