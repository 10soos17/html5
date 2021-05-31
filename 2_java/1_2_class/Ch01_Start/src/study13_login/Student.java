package study13_login;

import java.util.HashMap;
import java.util.Scanner;

public class Student {

	String id;
	String pw;

	String name;
	int kor;
	int eng;
	int mat;

	int sum;
	double avg;

	boolean check;
	Integer number = 0;
	Integer runningNumber = 0;

	HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
	Scanner sc = new Scanner(System.in);

	// =================생성자
	public Student() {
	}

	public Student(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public Student(String id, String pw, String name, int kor, int eng, int mat) {
		this(id, pw);
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// =================재정의
	@Override
	public String toString() {

		return id;
	}

	@Override
	public int hashCode() {
		return (id).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (this.id.equals(std.id) && this.pw.equals(std.pw)) {
				return true;
			}
		}
		return false;
	}

	// =================make Id, Pw
	public boolean makeId() {
		System.out.println("*계정생성*");
		System.out.println("생성할 ID를 입력하세요.");
		this.id = sc.next();

		// 동일 id 존재 check
		check = checkId();
		while (!check) {
			System.out.println("다른 ID를 입력하세요.");
			this.id = sc.next();
			check = checkId();
		}

		// 동일 id 없으면 pw 입력받기
		System.out.println("PASSWORD를 설정하세요.");
		this.pw = sc.next();

		// HashMap에 저장
		hm.put(this.number, new Student(this.id, this.pw));
		System.out.println("계정이 생성되었습니다.");
		this.number += 1;

		return true;
	}

	// =================check Id
	public boolean checkId() {

		for (Integer i : hm.keySet()) {
			Student vals = hm.get(i);
			System.out.println(vals.id + ", " + vals.pw);
			if (this.id.equals(vals.id)) {
				System.out.println("ID가 존재합니다.");
				return false;
			}

		}
		return true;
	}

	// =================check Id, Pw
	public boolean checkIdPw() {

//		hm.put(0, new Student("ss", "11", "soo", 100, 90, 80));
//		hm.put(1, new Student("sss", "111", "soos", 100, 90, 80));

		System.out.println("*LOGIN");
		System.out.println("ID를 입력하세요.");
		this.id = sc.next();
		System.out.println("PASSWORD를 입력하세요.");
		this.pw = sc.next();

		for (Integer i : hm.keySet()) {
			Student vals = hm.get(i);
			System.out.println(vals.id);
			if (this.id.equals(vals.id) && this.pw.equals(vals.pw)) {
				System.out.println(vals.id + ", " + vals.pw);
				System.out.println("로그인 성공");
				this.runningNumber = i;
				return true;
			}

		}
		return false;
	}

	// =================input Info
	public void Info() {
		System.out.println("이름 입력");
		this.name = sc.next();
		System.out.println("국어 입력");
		this.kor = sc.nextInt();
		System.out.println("영어 입력");
		this.eng = sc.nextInt();
		System.out.println("수학 입력");
		this.mat = sc.nextInt();

		System.out.println(hm.get(this.runningNumber));
		hm.get(this.runningNumber).name = this.name;
		hm.get(this.runningNumber).kor = this.kor;
		hm.get(this.runningNumber).eng = this.eng;
		hm.get(this.runningNumber).mat = this.mat;

	}

	// =================총점
	public void getSum() {
		this.sum = hm.get(this.runningNumber).kor + hm.get(this.runningNumber).eng + hm.get(this.runningNumber).mat;
		System.out.println(this.sum);

	}

	// =================평균
	public void getAvg() {
		this.avg = sum / 3;
		System.out.println(this.avg);
	}
}