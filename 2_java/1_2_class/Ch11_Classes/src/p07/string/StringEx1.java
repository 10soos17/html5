package p07.string;

public class StringEx1 {

	public static void main(String[] args) {
		String str = "자바커피";
		String[] arr = str.split("");

		for (String s : arr) {
			System.out.println(s);

		}
		System.out.println("=======");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);

		}
		System.out.println("=======");
		for (int i = 0; i < str.length(); i++) {

			System.out.println(str.substring(i, i + 1));
		}
		System.out.println("====================================");

		String fullName = "Hello.java";
		String[] arr2 = new String[2];

		arr2[0] = fullName.split(".java")[0];
		arr2[1] = fullName.split("Hello")[1];

		System.out.println(arr2[0] + "\n" + arr2[1]);
		System.out.println("=======");
		// subString()
		System.out.println(fullName + "의 확장자를 제외한 이름은" + (fullName.substring(0, 5)));
		System.out.println(fullName + "의 확장자는" + (fullName.substring(6)));

		System.out.println("=======");
		// indexOf()
		int index = fullName.indexOf(".");
		String str1 = fullName.substring(0, index);
		String str2 = fullName.substring(index + 1);
		System.out.println(fullName + "의 확장자를 제외한 이름은" + (str1));
		System.out.println(fullName + "의 확장자는" + (str2));

	}

}
