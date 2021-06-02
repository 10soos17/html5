package Exercise;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample8 {

	public static void main(String[] args) {
		Set<Student8> set = new HashSet<Student8>();

		set.add(new Student8(1, "홍길동"));
		set.add(new Student8(2, "신용권"));
		set.add(new Student8(1, "조민우"));

		Iterator<Student8> it = set.iterator();
		while (it.hasNext()) {
			Student8 s = it.next();
			System.out.println(s.studentNum + ":" + s.name);
		}

	}

}
