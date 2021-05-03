package p04.binary;

public class Overflow {

	public static void main(String[] args) {
	
		//int x = (int) 10L;
		int x = 1000000;
		int y = 1000000;
		
		int z =  x*y;
		System.out.println(z); //-727379968: overflow
		
		//2.overflox 
		int x2 = 1000000;
		int y2 = 1000000;
		
		long z2 =  x2*y2;
		System.out.println(z2); //-727379968: overflow
		
		//3. 정상 연산 
		long x3 = 1000000;
		int y3 = 1000000;
		
		long z3 =  x3*y3;
		System.out.println(z3); //-727379968: overflow
		



	}

}
