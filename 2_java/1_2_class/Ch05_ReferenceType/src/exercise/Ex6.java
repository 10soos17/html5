package exercise;

public class Ex6 {

	public static void main(String[] args) {
		int[][] arr = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}

		};
		int[][] arr2 = new int[3][];
		
		System.out.println(arr.length);//3
		System.out.println(arr[0].length);//2
		System.out.println(arr[1].length);//3
		System.out.println(arr[2].length);//5
		
		for (int i = 0; i < arr.length; i++) {// 2행
			for (int j = 0; j < arr[i].length; j++) {//3열
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
				
			}
		}
	}

}
