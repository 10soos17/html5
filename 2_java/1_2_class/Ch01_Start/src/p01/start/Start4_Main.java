package p01.start;

public class Start4_Main {
	//args에 주소값 
	public static void main(String[] args) {
		System.out.println("main");
		
		Start4.main(args);
		
		Start4_Main s5= new Start4_Main();
		double a = 10.0;
		int aa = 20;
		

		System.out.print(s5.add(a, aa));
		
		
	}
	
	double add(double a, int b) {
		double res = a + b;
		Start4 s4 = new Start4();
		
		s4.mul();
		Start4.mul2();
		
		return res;

	}

}
