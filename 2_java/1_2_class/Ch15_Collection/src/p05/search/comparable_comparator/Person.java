package p05.search.comparable_comparator;

//Compare(오름차순, 내림차순): Comparable: 우리가 만든 클래스에 대한 객체 비교시 Comparable를 재정의해서 사용해야 비교 가능
//						    		 : 일반적인 정렬시 사용 
//	       				  Comparator: 특수한 정렬을 요할 때 사용  
public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 재정의해서 오름차순, 내림차순 조정해서 사용
	@Override
	public int compareTo(Person o) {
		if (this.age < o.age)
			return -1;
		else if (this.age == o.age)
			return 0;
		else
			return 1;
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}

}
