package exerxise;

public class ex6 {

	public static void main(String[] args) {
		
		String star = "";
		for(int i=0; i<5;i++) {
			for(int j=0;j<i+1;j++) {
				star +="*";
			}
			System.out.println(star+"\n");
			star=" ";
		}

	}
	

}
