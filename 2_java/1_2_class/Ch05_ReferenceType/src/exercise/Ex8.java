package exercise;

public class Ex8 {

	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		double avg = 0.0;

		int len = 0;

		for (int i = 0; i < array.length; i++) {
			len += array[i].length;
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}

		}
		avg = sum / len;

		System.out.println("sum: "+sum+", avg: "+avg);
	}

}
