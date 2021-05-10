package p06.array;

public class ArrayInArrayEx1 {

	public static void main(String[] args) {
		// p.162
		int[][] mathScores = new int[2][3]; // 2행 3열(2,3)
		System.out.println(mathScores.length); // 2: 2개 배열 각각 3개 열이 들어있음
		System.out.println(mathScores[0].length); // 3: 첫번째 배열에 3개 열이 있다.
		System.out.println(mathScores[1].length); // 3: 두번째 배열에 3개 열이 있다.
		// p.163
		int[][] scores = new int[2][]; // 2행이면서 열이 정해지지 않음
		scores[0] = new int[2]; // 길이(갯수)
		scores[1] = new int[3]; // 길이(갯수)
		System.out.println(scores.length); // 2: 2개 배열 각각 3개 열이 들어있음
		System.out.println(scores[0].length); // 2: 첫번째 배열에 3개 열이 있다.
		System.out.println(scores[1].length); // 3: 두번째 배열에 3개 열이 있다.
		//p.164
		System.out.println("----------------------------------");
		for (int i = 0; i < mathScores.length; i++) {// 2행
			for (int j = 0; j < mathScores[i].length; j++) {// 3열
				System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);

			}
		}
		
		//
		System.out.println("----------------------------------");
		int[][] englishScores = new int[2][]; // 2행이면서 열이 정해지지 않음
		englishScores[0] = new int[2]; // 길이(갯수)
		englishScores[1] = new int[3]; // 길이(갯수)
		System.out.println(englishScores.length); // 2: 2개 배열 각각 3개 열이 들어있음
		System.out.println(englishScores[0].length); // 2: 첫번째 배열에 3개 열이 있다.
		System.out.println(englishScores[1].length); // 3: 두번째 배열에 3개 열이 있다.
		
		for (int i = 0; i < englishScores.length; i++) {// 2행
			for (int j = 0; j < englishScores[i].length; j++) {// 3열
				System.out.println("englishScores[" + i + "][" + j + "] = " + englishScores[i][j]);
				
			}
		}
		
		System.out.println("----------------------------------");
		int[][] javaScores = {
								{95,80},
								{92,96,80}
							};
		for (int i = 0; i < javaScores.length; i++) {// 2행
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println("javaScores[" + i + "][" + j + "] = " + javaScores[i][j]);
				
			}
		}
	}

}
