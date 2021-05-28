package p02.list;

public class Man2<T1,T2> {
	
	T1 name;
	T2 age;
	public Man2() {
		// TODO Auto-generated constructor stub
	}
	
	public Man2(T1 name, T2 age) {
		this.name = name;
		this.age = age;
	}
	
	public void add(T1 name, T2 age) {
		this.name = name;
		this.age = age;
	}

}
