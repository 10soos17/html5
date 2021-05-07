package p05.string;

public class Dog_Main {

	public static void main(String[] args) {

		Dog d = new Dog(); // 객체 생성
		Dog[] dg = new Dog[3]; // 배열 객체 생성
		dg[0] = new Dog("진돗개", "진도");
		dg[1] = new Dog("풍산개", "풍산");
		dg[2] = new Dog("워리", "불독");

		// 일반 for
		for (int i = 0; i < dg.length; i++) {
			System.out.println("reference: " + dg[i] + ", name: " + dg[i].name + ", kind: " + dg[i].kind);
			System.out.println(dg[i].toString());
		}

		// 향상된 for
		for (Dog i : dg) {
			System.out.println("reference: " + i + ", name: " + i.name + ", kind: " + i.kind);
			System.out.println(i.toString());
		}
	}

}
