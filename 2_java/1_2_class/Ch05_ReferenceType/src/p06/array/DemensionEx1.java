package p06.array;

public class DemensionEx1 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };//1차원
		System.out.println(arr[0]);
		arr[0] = arr[0] + arr[1];
		System.out.println(arr[0]);
		System.out.println(arr.length);
		System.out.println("--------------------------");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("===========================");
		int t[][] = new int[3][4];
		
		int table[][] = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
						};
		System.out.println(table[0][0]); //2차원
		System.out.println(table[0][1]); //2차원
		table[0][0] = table[0][0] + table[0][1];
		System.out.println(table[0][0]);
		
		System.out.println(table.length);
	
		for(int i=0;i<table.length;i++) {//행
			for(int j=0;j<table[i].length;j++) {//열
				System.out.printf("table[%d][%d] = %d%n",i,j,table[i][j]);
			}
		}
	}

}
