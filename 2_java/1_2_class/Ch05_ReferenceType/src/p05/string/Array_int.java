package p05.string;

import java.util.ArrayList;

import p01.reference.Point;

//Array([]): 같은 타입의 데이터를 대표가 되는 이름(배열이름)으로  Data를 저장하기 위한 공간
//			 하나의 이름으로 여러개의 값 저장(공간을 나누어서 번지수로 구분)
//			 한 가지 타입만 저장(단점)
//			 번지수는 0번 부터(index)
//			 크기를 동적으로 구성한 배열: ArrayList
//			 배열 객체 생성해서 사용
public class Array_int {

	public static void main(String[] args) {
		// 기본형 타입
		int a = 10;
		// 참조형 타입
		Point p1 = new Point();
		// Array 타입: 참조형 타입(주소값 저장)
		int[] a2 = new int[] { 10, 20 };// 배열 생성 후 초기값 저장
		Point[] p2 = new Point[1];// 갯수

		System.out.println("---int 배열 생성------------------");
		// 배열의 형태
		// (1)
		int[] arr1 = { 10, 20, 30 };
		System.out.println("배열의 크기: " + arr1.length);
		System.out.println("배열의 첫번째: " + arr1[0]); // index=0,1,2,....

		// (2)
		int arr2[] = new int[3];// 크기(갯수)
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		System.out.println(arr2[0]);

		// (3)
		int[] arr3 = new int[] { 10, 20, 30 };
		System.out.println(arr3[0]);

		// 일반 for
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		// 향상된 for
		for (int i : arr3) {
			System.out.println(i);
	
		}
	
//		ArrayList<String> a1 = new ArrayList<String>();

	}

}
