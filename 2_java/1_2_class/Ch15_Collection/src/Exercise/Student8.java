package Exercise;

public class Student8 {
	public int studentNum;
	public String name;

	public Student8(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return ((Integer) studentNum).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student8) {
			Student8 std = (Student8) obj;
			if (std.studentNum == this.studentNum) {
				return true;
			}
		}
		return false;
	}

}
