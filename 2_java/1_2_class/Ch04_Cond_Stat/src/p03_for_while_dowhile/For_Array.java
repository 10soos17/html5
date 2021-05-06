package p03_for_while_dowhile;

public class For_Array {

	public static void main(String[] args) {
		String str[] = { "홀길동1", "홀길동2", "홀길동3" };
		int arr[] = { 10, 20, 30, 40, 50 }; // 기본형 타입이지만 배열이기에 주소값

		System.out.println("-----------------일반 for문--------------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("배열 arr의 인덱스" + i + ": " + arr[i]);
		}

		/*
		 * System.out.println("------------------예외 발생 for문 -------------------");
		 * 
		 * for(int i=0; i <= arr.length;i++) { System.out.println(arr[i]); }
		 */

		System.out.println("------------------향상된 for문 -------------------");
		for (int s : arr) {
			System.out.println(s);
		}

	}

}
