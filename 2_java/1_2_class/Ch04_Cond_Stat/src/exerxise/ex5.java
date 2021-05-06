package exerxise;

public class ex5 {

	public static void main(String[] args) {
		

		int one = 0;
		int two = 0;
		while(one+two != 5) {

			one  = (int)(Math.random()*6 +1);
			two =(int)(Math.random()*6 + 1);

			
			System.out.println(one+", "+two);
		}
		

	}
	

}
