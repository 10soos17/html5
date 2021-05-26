package p01.generic_basic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Generic_Yes {

	public static void main(String[] args) {
		// 0. 배열: 배열크기 결정, 자료가 순차적이고 중복적
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		// 1. Generic Yes: 타입별로 저장, 강제 형변환(Casting) 불필요, 컴파일시 강한 타입체크

		// ArrayList: 동적배열 크기, 자료가 순차적이고 중복적
		ArrayList a1 = new ArrayList();

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add(new String("홍길동1"));
		a2.add("홍길동2");
		a2.add(new String("홍길동3"));
		// .add(10);//불가

		for (int i = 0; i < a2.size(); i++) {
			System.out.println(a2.get(i));
		}

		System.out.println("--------------------------");
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(10);
		a3.add(new Integer(10));
		for (Integer i : a3) {
			System.out.println(i);
		}

		System.out.println("--------------------------");
		ArrayList<Phone> a4 = new ArrayList<Phone>();
		a4.add(new Phone());
		a4.add(new Phone("Original"));
		for(Phone p: a4) {
			System.out.println(p);
		}
	}

}
