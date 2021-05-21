package p03.object.finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter c = null;// 객체 생성 X
		for (int i = 1; i <= 50; i++) {
			c = new Counter(i);
			System.out.println(c.no);

			c = null;
			System.gc();// Garbage Collector: 객체 삭제
		}

	}

}
