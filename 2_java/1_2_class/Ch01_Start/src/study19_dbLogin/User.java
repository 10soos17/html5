package study19_dbLogin;

import java.util.HashMap;

public class User {

//	create table member(
//			id varchar2(15),
//			password varchar2(10),
//			name varchar2(10),
//			age number,
//			gender varchar2(5),
//			email varchar2(30),
//			primary key(id)
//			)
	String id;
	String password;
	String name;
	int age;
	String gender;
	String email;
	User user = null;
	
	HashMap<String, User> userMap = new HashMap<>();
	
	public User(String id, String password, String name, int age, String gender, String email) { 
	
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		userMap.put(this.id, this);
	}

	@Override
		public boolean equals(Object obj) {
		if(obj instanceof User) {
			User newUser = (User)obj;
			if(newUser.id.equals(this.id) && newUser.password.equals(this.password)) {
				
				return true;
			}
		}
			return false;
		}
	
	public String toString() {
		return "id: "+this.id+
				"pw: "+this.password+
				"name: "+this.name+
				"age: "+this.age+
				"gender: "+this.gender+
				"email: "+this.email;
				
				
	}
}
