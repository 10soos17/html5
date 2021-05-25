package exercise;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		//개발자가 만든 객체 비교시 
		HashMap<String, String> hashMap1 = new HashMap<String, String>();
		
		hashMap1.put(new String("1"), new String("95"));
		
		String score1 = hashMap1.get(new String("1"));
		System.out.println("1번 학생의 총점: "+ score1);
		
		System.out.println("------------------------");
		//내가 만든 동등객체 비교시 - hashcode(), equals() 메서드 오버라이드 
		HashMap<Student, String> hashMap2 = new HashMap<Student, String>();
		
		hashMap2.put(new Student("1"), new String("95"));
		
		String score2 = hashMap2.get(new Student("1"));
		System.out.println("1번 학생의 총점: "+ score2);

	}

}
