package p02.generic_type;
//Generic 사용전 
public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObject(new String("홍길동"));
		
		Object name = box.getObject();
		System.out.println(name);

		String name2 = (String)box.getObject();//Casting
		System.out.println(name2);
		
		box.setObject(new Apple());
		Apple a = (Apple)box.getObject();//Casting
		System.out.println(a);
		
	}

}
