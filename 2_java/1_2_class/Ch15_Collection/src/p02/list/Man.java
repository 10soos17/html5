package p02.list;
//VO(value object) = Bean = DTO(Data Transfer Object) = getter()/setter()
public class Man {
	String name;//홍길동, 알파고
	int age;	//20, 30
	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
//	T1 name;
//	T2 age;
//	
//	public Man(T1 name, T2 age) {
//		this.name = name;
//		this.age = age;
//	}
//	
}
