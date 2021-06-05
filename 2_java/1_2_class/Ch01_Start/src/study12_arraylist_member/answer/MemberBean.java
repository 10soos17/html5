package study12_arraylist_member.answer;

//Bean = VO = DTO = getter()/setter(): MVC 
public class MemberBean {
	private String id;
	private String pw;
	private String name;

	public MemberBean() {
	}

	public MemberBean(String id, String pw, String name) {
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

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ID: " + this.id + "\n" + "PW: " + this.pw + "\n" + "Name: " + this.name + "\n";
	}

}
