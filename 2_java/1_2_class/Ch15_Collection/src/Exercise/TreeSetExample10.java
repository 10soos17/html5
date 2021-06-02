package Exercise;

import java.util.TreeSet;

public class TreeSetExample10 {

	public static void main(String[] args) {
		TreeSet<Student10> ts = new TreeSet<Student10>();
		ts.add(new Student10("blue", 96));
		ts.add(new Student10("hong", 86));
		ts.add(new Student10("white", 92));

		Student10 std = ts.last();
		System.out.println("최고점수: " + std.score);
		System.out.println("최고점수를 받은 아이디: " + std.id);

	}

}
