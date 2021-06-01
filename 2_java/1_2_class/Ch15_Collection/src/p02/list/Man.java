package p02.list;
//VO(value Object)= Bean = DTO(Data Transfer Object) = getter()/setter()
public class Man {
	String name;//홍길동,알파고
	int age;    //   20,   30
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
	
	public Man(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Man(int age) {
		this.age = age;
	}
	public Man(String name) {
		this.name = name;
	
	}
	
	
}
