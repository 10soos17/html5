package p01_basic;

public class StudentMain {

	public static void main(String[] args) {
		//저장/출력1-변수 : 홍길동1, 10
		Student st1 = new Student();
		
		st1.name = "홍길동1";
		st1.age = 10;
		System.out.println(st1.name +", "+ st1.age);
		
		//저장/출력2-생성 : 홍길동2, 20
		Student st2 = new Student("홍길동2", 20);
		
		System.out.println(st2.name +", "+st2.age);
		
		//저장/출력3-getter()/setter() : 홍길동3, 30
		Student st3 = new Student();
		
		st3.setName("홍길동3");
		st3.setAge(30);
		System.out.println(st3.getName()  +", "+ st3.getAge());
		
		//메소드 : 더하기 연산 (5, 6) 합계 출력 
		Student st4 = new Student("알파고",6);
		int result = st4.add(5, 6);
		System.out.println(result);
		
	}

}
