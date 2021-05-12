package study05_member0;

public class Member0 {
	String name;
	int height;
	int weight;
	String nation;

	public Member0() {
		
	}
	public Member0(String name, int height, int weight, String nation) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.nation = nation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}

}
