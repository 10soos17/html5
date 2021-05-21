package p03.object.hashcode;

public class HashCodeEx1 {

	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		Name n1 = new Name("길동", "홍");
		Name n2 = new Name("길동", "홍");
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		if (n1.equals(n2))
			System.out.println("같음");
		else
			System.out.println("다름");

	}

}
