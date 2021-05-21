package p07.string;

public class SplitEx {

	public static void main(String[] args) {
		String txt = "홍길동&알파고,베타고.김일동-최명호";
		String[] names = txt.split("&|,|\\.|-");

		for (String n : names) {
			System.out.println(n);
		}
	}

}
