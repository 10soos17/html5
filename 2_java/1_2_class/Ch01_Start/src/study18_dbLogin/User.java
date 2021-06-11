package study18_dbLogin;

public class User {

	String id;
	String password;
	String name;
	int age;
	String addr;
	String email;
	User user = null;
	
	//HashMap<String, User> userMap = new HashMap<>();
	
	public User(String id, String password, String name, int age, String addr, String email) { 
	
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.email = email;
		//userMap.put(this.id, this);
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
				"addr: "+this.addr+
				"email: "+this.email;
				
				
	}
}