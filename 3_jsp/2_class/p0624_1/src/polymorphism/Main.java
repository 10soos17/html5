package polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("어떤 TV를 이용하시겠습니까?");
		Scanner scn = new Scanner(System.in);
		String tvName = scn.nextLine();

		new User().watchingTV(tvName);

	}

}
