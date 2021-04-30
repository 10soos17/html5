package p02.datatype;

public class DataTypeEx3 {

	public static void main(String[] args) {
		
		boolean stop = true;
		if(stop) {
			System.out.println("중지");

		}else {
			System.out.println("시작");
		}
		System.out.println("끝");
		
		//dangling else
		if(stop)
			System.out.println("중지");
		else
			System.out.println("시작");
		System.out.println("끝");

		if(stop)
			System.out.println("중지");
		
			System.out.println("시작");
			System.out.println("끝");
			if(stop)
				System.out.println("중지");
			else {
				System.out.println("시작");
				System.out.println("끝");
			}
	}

}
