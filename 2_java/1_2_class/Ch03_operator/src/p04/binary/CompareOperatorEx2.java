package p04.binary;

public class CompareOperatorEx2 {

	public static void main(String[] args) {
		
		int v2 = 1;
		//double v3  = 1; //자동형변환(promotion)
		
		double v3  = 1.0;
		System.out.println(v2 == v3); //1.0 == 1.0
		
		double v4  = 0.1d;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //1.0d == 1.0f : false
		System.out.println((float)v4 == v5); //1.0d == 1.0f : true
		System.out.println((int)v4*10 == (int)v5*10); //10 == 10 : true
		 
		
	}

}
