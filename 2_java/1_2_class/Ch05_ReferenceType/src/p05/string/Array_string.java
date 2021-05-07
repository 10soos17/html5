package p05.string;

import java.util.ArrayList;

import p01.reference.Point;

//Array([]): 같은 타입의 데이터를 대표가 되는 이름(배열이름)으로  Data를 저장하기 위한 공간
//			 하나의 이름으로 여러개의 값 저장(공간을 나누어서 번지수로 구분)
//			 한 가지 타입만 저장(단점)
//			 번지수는 0번 부터(index)
//			 크기를 동적으로 구성한 배열: ArrayList
//			 배열 객체 생성해서 사용
public class Array_string {

	public static void main(String[] args) {
		// 기본형 타입
		String a = "십";
		// 참조형 타입
		// Array 타입: 참조형 타입(주소값 저장)
		String[] a2 = new String[] {"십","이십","삼십"};// 배열 생성 후 초기값 저장

		System.out.println("---String 배열 생성------------------");
		// 배열의 형태
		// (1)
		String[] arr1 = {"십","이십","삼십"};
		System.out.println("배열의 크기: " + arr1.length);
		System.out.println("배열의 첫번째: " + arr1[0]); // index=0,1,2,....

		// (2)
		String arr2[] = new String[3];// 크기(갯수)
		arr2[0] = "십";
		arr2[1] = "이십";
		arr2[2] = "삼십";
		System.out.println(arr2[0]);

		// (3)
		String[] arr3 = new String[] {"십","이십","삼십"};
		System.out.println(arr3[0]);

		// 일반 for
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		// 향상된 for
		for (String i : arr3) {
			System.out.println(i);
	
		}
	
//		ArrayList<String> a1 = new ArrayList<String>(3);


	}

}
