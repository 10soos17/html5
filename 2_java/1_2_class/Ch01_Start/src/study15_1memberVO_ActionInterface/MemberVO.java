package study15_1memberVO_ActionInterface;

import java.util.HashMap;
import java.util.List;

public class MemberVO {
	private int age;
	private String name;
	private String tel;
	private String email;
	private String nation;

	public static HashMap<List, MemberVO> hMap = new HashMap<List, MemberVO>();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name + age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MemberVO) {
			MemberVO m = (MemberVO) obj;
			if (m.name.equals(this.name) && m.age == this.age) {
				return true;
			}

		}
		return false;
	}
	
	@Override
	public String toString() {

		return "이름: "+ this.name + "\n"+
				"나이: "+ this.age + "\n"+
				"이메일: "+ this.email + "\n"+
				"국가: "+ this.nation + "\n"+
				"전화번호: "+ this.tel;
	}
}
