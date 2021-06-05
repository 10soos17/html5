package study09_exception;

import java.util.Scanner;

public class Mem {

	String name;
	int ki;
	int we;
	int age;
	int tel;
	double c;// 비만도 측정 결과값

	Scanner sc = new Scanner(System.in);

	public Mem() {

	}

	public Mem(String name, int ki, int we, int age, int tel, double c) {
		this.name = name;
		this.ki = ki;
		this.we = we;
		this.age = age;
		this.tel = tel;
		this.c = c;

	}

	// 정보입력
	public void in() {
		System.out.println("이름? :");
		name = sc.next();
		System.out.println(name + "님의 키?");
		ki = sc.nextInt();
		System.out.println(name + "님의 몸무게?");
		we = sc.nextInt();
		System.out.println(name + "님의 나이?");
		age = sc.nextInt();
		System.out.println(name + "님의 전화번호?");
		tel = sc.nextInt();
		System.out.println(name + "------------------");
	}

	// 비만도 측정
	public double jung() {
		double b = (ki - 100) * 0.9;
		if (we > b) {
			System.out.println("과체중입니다.");
			c = (int) we - b;
		} else if (we < b) {
			System.out.println("저체중입니다.");
			c = (int) b - we;
		} else {
			System.out.println("표준체중입니다.");
		}
		return c;
	}

	// 입력된 정보 출력
	public void prn() {
		System.out.println("이름: " + name);
		System.out.println("키: " + ki);
		System.out.println("몸무게: " + we);
		System.out.println("나이: " + age);
		System.out.println("전화번호: " + tel);
		System.out.println("--------------------");
	}

}
