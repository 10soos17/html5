package study05_member0;


public class SearchService0 {
	//Member0 member;
	Member0[] m = new Member0[5];

	public SearchService0() {

		m[0] = new Member0("홍길동", 167, 77, "대한민국");
		m[1] = new Member0("James", 187, 67, "미국");
		m[2] = new Member0("다나까", 166, 57, "일본");
		m[3] = new Member0("마윈", 177, 80, "중국");
		m[4] = new Member0("인도인", 199, 77, "인도");

	}

	boolean searchMember(String name) {// name: Scanner 입력
		boolean searchResult = false;
		for (int i = 0; i < m.length; i++)
			if (m[i].getName().equals(name)) {
				printInfo(m[i]);
				searchResult = true;
			}
		return searchResult;
	}

	// 찾은 배열 내용 출력
	private void printInfo(Member0 m) {
		System.out.println(m.getName() + "으로 찾은 결과");
		System.out.println("이름: " + m.getName());
		System.out.println("신장: " + m.getHeight());
		System.out.println("몸무게: " + m.getWeight());
		System.out.println("국가: " + m.getNation());
	}

}
