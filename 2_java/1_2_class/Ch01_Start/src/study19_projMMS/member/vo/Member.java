package study19_projMMS.member.vo;

import java.util.Hashtable;

//2.회원 한 명의 정보를 저장하는 클래스 
public class Member {

	//public static ArrayList<Member> mList = new ArrayList<>(); 
	public static Hashtable<Integer,Member> mHash = new Hashtable<>();
	private int id;
	private String name;// 식별값
	private String addr;
	private String nation;
	private String email;
	private int age;

	public Member() {

	}

	public Member(String name, String addr, String nation, String email, int age) {

		this.name = name;
		this.addr = addr;
		this.nation = nation;
		this.email = email;
		this.age = age;
	}
	
	public Member(int id, String name, String addr, String nation, String email, int age) {
		this(name, addr, nation, email, age);
		this.id = id;
		
		//mList.add(this);
		mHash.put(id, this);
		System.out.println(this+"member");
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			if(m.id == this.id && m.name.equals(this.name) ) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return (this.id+this.name).hashCode();
	}
	@Override
	public String toString() {
		return "id: "+this.id+
				"\n"+"name: "+this.name+
				"\n"+"addr: "+this.addr+
				"\n"+"nation: "+this.nation+
				"\n"+"email: "+this.email+
				"\n"+"age: "+this.age;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
