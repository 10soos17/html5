package p01.variable;

public class VariableExample {

	public static void main(String[] args) {
		int value = 10;
		
		int result = value + 10;

		System.out.println(result);
		
		operate();
	}
	
	public static void operate(){
		int v1 = 15;
		int v2 = 100;
		
		if(v1 > 10) {
			//int v2 = v1 - 10;
			v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5; -> error
		System.out.println(v1 + '\n' + v2);
	}


}
