package exercise;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";

		String[] arr = str.split(",");

		for (String s : arr) {
			System.out.println(s);
		}
		
		StringTokenizer st = new StringTokenizer(str,",",false);
		//StringTokenizer st = new StringTokenizer(str,",",true);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
