package study18_dbLogin.answer;

public class User {

	private String id;
	private String password;
	private String name;
	private int age;
	private String addr;
	private String email;
	private User user = null;

	// HashMap<String, User> userMap = new HashMap<>();
	
	public User() {
	}

	public User(String id, String password, String name, int age, String addr, String email) {

		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.email = email;
		// userMap.put(this.id, this);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof User) {
			User newUser = (User) obj;
			if (newUser.id.equals(this.id) && newUser.password.equals(this.password)) {

				return true;
			}
		}
		return false;
	}

	public String toString() {
		return "id: " + this.id + ", pw: " + this.password + ", name: " + this.name + ", age: " + this.age + ", addr: "
				+ this.addr + ", email: " + this.email;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}