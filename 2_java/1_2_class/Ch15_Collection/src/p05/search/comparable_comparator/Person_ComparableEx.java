package p05.search.comparable_comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class Person_ComparableEx {

	public static void main(String[] args) {
		TreeSet<Person> ts;
		try {
			ts = new TreeSet<>();
			ts.add(new Person("홍길동", 5));
			ts.add(new Person("알파고", 25));
			ts.add(new Person("베타고", 51));
			ts.add(new Person("베타고", 51));
			
			System.out.println(ts);
			
			Iterator<Person> it =  ts.iterator();
			while(it.hasNext()) {
				Person person = it.next();
				System.out.println(person.name+" : "+person.age);
			}
			
		} catch (ClassCastException e) {
			System.out.println("우리가 만든 클래스는 비교시 재정의 해야 한다.Person 클래스에서 작성");
		} catch (Exception e) {

		}
        System.out.println("종료");
		

	}

}
