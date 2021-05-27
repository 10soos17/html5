package exercise;

public class ContainerExample {

	public static void main(String[] args) {
		Container<String> con1 = new Container<String>();
		con1.set("홍길동");
		String str = con1.get();
		
		Container<Integer> con2 = new Container<Integer>();
		con2.set(6);
		int value = con2.get();

	}

}
