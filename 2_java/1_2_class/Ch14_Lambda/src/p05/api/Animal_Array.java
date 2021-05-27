package p05.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Animal_Array {

	public static void main(String[] args) {

		Animal a1 = new Animal("Dog", 4);
		Animal a2 = new Animal("Pig", 2);
		Animal a3 = new Animal("Snake", 8);

		// ArrayList<Animal> a = new ArrayList<Animal>();
		List<Animal> ak = new ArrayList<Animal>();
		ak.add(a1);
		ak.add(a2);
		ak.add(a3);

		System.out.println("입력순: " + ak);

//		@FunctionalInterface
//		public interface Comparator<T>
		// sort(List<T> list, Comparator<? super T> c)
		// Collections.sort(List<Animal> ak); 재정의 필요
		// System.out.println("정렬후3: " + ak);

		Collections.sort(ak, (a, b) -> a.age - b.age);// 오름차순 표현식
		System.out.println("정렬후1: " + ak);
		Collections.sort(ak, (a, b) -> b.age - a.age);// 내림차순 표현식
		System.out.println("정렬후2: " + ak);
	}
}
