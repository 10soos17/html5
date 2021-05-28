package study12_arraylist_member;

public class MemberBean {
	String id;
	Integer pw;
	String name;

	public MemberBean() {
	}

	public MemberBean(String id, Integer pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getPw() {
		return pw;
	}

	public void setPw(Integer pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	@Override
	public String toString() {
		return "ID: " + this.id + "\n" + "PW: " + this.pw + "\n" + "Name: " + this.name+"\n";
	}

}
