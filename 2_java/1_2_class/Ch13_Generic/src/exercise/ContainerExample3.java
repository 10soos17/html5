package exercise;

public class ContainerExample3 {

	public static void main(String[] args) {
		Container3<String, String> con1 = new Container3<String, String>();
		con1.set("홍길동", "도적");

		String name1 = con1.getKey();
		String job = con1.getValue();

		System.out.println(name1 + job);

		Container3<String, Integer> con2 = new Container3<String, Integer>();
		con2.set("홍길동", 35);

		String name2 = con2.getKey();
		Integer age = con2.getValue();

		System.out.println(name2 + age);

	}

}
