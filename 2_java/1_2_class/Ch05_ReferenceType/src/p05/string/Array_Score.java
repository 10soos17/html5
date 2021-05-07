package p05.string;

public class Array_Score {

	public static void main(String[] args) {
		// 95,71,84,93,87
		int sum = 0;
		double avg = 0;
		int[] scores = { 95, 71, 84, 93, 87 };

		for (int i : scores) {
			sum += i;
		}
		avg = sum / scores.length;

		System.out.println("점수 총합; " + sum);
		System.out.println("점수 평균; " + avg);

		System.out.println("---메소드 호출을 통한 평균, 총점구하기----------------");
		Array_Score as = new Array_Score();
		int[] scores2 = { 95, 71, 84, 93, 87 };

		int sum2 = as.add(scores2);
		System.out.println("점수 총합2; " + sum2);

		double avg2 = as.avg(scores2);
		System.out.println("점수 평균2; " + avg2);

	}

	public int add(int[] scores) {
		int sum = 0;
		for (int i : scores) {
			sum += i;
		}

		return sum;
	}

	public double avg(int[] scores) {
		double avg = add(scores)/scores.length;

		return avg;
	}

}
